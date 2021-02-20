package com.fitness.programmer.controller;

import com.fitness.programmer.configuration_handlers.JWTUtils;
import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.MoveDto;
import com.fitness.programmer.service.IMoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api/programs")
public class MoveController {

    @Autowired
    IMoveService moveService;

    @Autowired
    JWTUtils jwtUtils;

    @GetMapping("/move")
    public List<MoveDto> getAllMoves(HttpServletRequest httpServletRequest) {
        String username = jwtUtils.getUsernameByJWT(httpServletRequest.getHeader("Authorization").substring(7));
        return moveService.getMoves(username);
    }

    @GetMapping("/move/{id}")
    public MoveDto getMoveById(@PathVariable String id) throws RequestException {
        return moveService.getMoveById(id);
    }

    @PostMapping("/move")
    public ResponseEntity<?> postMove(@RequestBody MoveDto moveDto) {
        MoveDto storedMove = moveService.postMove(moveDto);
        return ResponseEntity.ok().body(storedMove);
    }

    @PutMapping("/move")
    public ResponseEntity<?> updateMove(@RequestBody MoveDto moveDto) throws RequestException {
        String id = moveService.updateMove(moveDto);
        return ResponseEntity.ok(id);
    }

    @DeleteMapping("/move/{id}")
    public ResponseEntity<?> deleteMove(@PathVariable String id) throws RequestException {
        String storedId = moveService.deleteMove(id);
        return ResponseEntity.ok(storedId);
    }
}
