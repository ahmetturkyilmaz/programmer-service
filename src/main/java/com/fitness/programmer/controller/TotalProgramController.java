package com.fitness.programmer.controller;

import com.fitness.programmer.configuration_handlers.JWTUtils;
import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.ProgramCreateRequestDto;
import com.fitness.programmer.model.dto.TotalProgramDto;
import com.fitness.programmer.service.ITotalProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/total-program")
public class TotalProgramController extends BaseController {

    @Autowired
    ITotalProgramService totalProgramService;

    @Autowired
    JWTUtils jwtUtils;

    @GetMapping
    public List<TotalProgramDto> getAllTotalPrograms(HttpServletRequest httpServletRequest) throws RequestException {
        String username = jwtUtils.getUsernameByJWT(httpServletRequest.getHeader("Authorization").substring(7));
        return totalProgramService.getAllTotalPrograms(username);
    }

    @GetMapping("/{id}")
    public TotalProgramDto getTotalProgramById(@PathVariable String id) throws RequestException {
        return totalProgramService.getTotalProgramById(id);
    }

    @PostMapping
    public ResponseEntity<?> postOneWeekTotalProgram(@RequestBody ProgramCreateRequestDto requestDto) throws RequestException {
        TotalProgramDto storedTotalProgram = totalProgramService.postTotalProgram(requestDto);
        return ResponseEntity.ok().body(storedTotalProgram);
    }

    @PutMapping
    public ResponseEntity<?> updateTotalProgram(@RequestBody TotalProgramDto totalProgramDto) throws RequestException {
        String id = totalProgramService.updateTotalProgramHandleDBRefs(totalProgramDto);
        return ResponseEntity.ok(id);
    }
}
