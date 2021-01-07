package com.fitness.programmer.controller;

import com.fitness.programmer.configuration_handlers.JWTUtils;
import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.TotalProgramDto;
import com.fitness.programmer.service.ITotalProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api/programs")
public class TotalProgramController {

    @Autowired
    ITotalProgramService totalProgramService;

    @Autowired
    JWTUtils jwtUtils;

    @GetMapping("/total-program")
    public List<TotalProgramDto> getAllTotalPrograms( HttpServletRequest httpServletRequest) {
        String username = jwtUtils.getUsernameByJWT(httpServletRequest.getHeader("Authorization").substring(7));
        return totalProgramService.getAllTotalPrograms( username);
    }

    @GetMapping("/total-program/{id}")
    public TotalProgramDto getTotalProgramById(@PathVariable String id) throws RequestException {
        return totalProgramService.getTotalProgramById(id);
    }

    @PostMapping("/total-program")
    public ResponseEntity<?> postTotalProgram(@RequestBody TotalProgramDto totalProgramDto) {
        String id = totalProgramService.postTotalProgram(totalProgramDto);
        return ResponseEntity.ok(id);
    }

    @PutMapping("/total-program")
    public ResponseEntity<?> updateTotalProgram(@RequestBody TotalProgramDto totalProgramDto) throws RequestException {
        String id = totalProgramService.updateTotalProgram(totalProgramDto);
        return ResponseEntity.ok(id);
    }
}
