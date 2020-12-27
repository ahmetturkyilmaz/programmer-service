package com.fitness.programmer.controller;

import com.fitness.programmer.JWTUtils;
import com.fitness.programmer.model.dto.TotalProgramDto;
import com.fitness.programmer.service.ITotalProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api/total-programs")
public class TotalProgramController {

    @Autowired
    ITotalProgramService totalProgramService;

    @Autowired
    JWTUtils jwtUtils;

    @GetMapping("/total-program")
    public List<TotalProgramDto> getAllTotalPrograms(@RequestParam boolean isLazyLoading, HttpServletRequest httpServletRequest) {
        String username = jwtUtils.getUsernameByJWT(httpServletRequest.getHeader("Authorization"));
        return totalProgramService.getAllTotalPrograms(isLazyLoading, username);
    }

    @GetMapping("/total-program/{id}")
    public TotalProgramDto getTotalProgramById(@PathVariable Long id) {
        return totalProgramService.getTotalProgramById(id);
    }

    @PostMapping("/total-program")
    public ResponseEntity<?> postTotalProgram(@RequestBody TotalProgramDto totalProgramDto) {
        Long id = totalProgramService.postTotalProgram(totalProgramDto);
        return ResponseEntity.ok(id);
    }
}
