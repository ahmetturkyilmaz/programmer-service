package com.fitness.programmer.controller;

import com.fitness.programmer.JWTUtils;
import com.fitness.programmer.model.dto.WeeklyProgramDto;
import com.fitness.programmer.service.IWeeklyProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api/programs")
public class WeeklyProgramController {

    @Autowired
    IWeeklyProgramService weeklyProgramService;
    @Autowired
    JWTUtils jwtUtils;

    @GetMapping("/weekly-programs/{totalProgramId}")
    public List<WeeklyProgramDto> getAllWeeklyProgramsByTotalProgramId(@RequestParam boolean isLazyLoading, @PathVariable Long totalProgramId, HttpServletRequest httpServletRequest) {
        return weeklyProgramService.getAllWeeklyProgramsByTotalProgramId(isLazyLoading, totalProgramId);
    }
}
