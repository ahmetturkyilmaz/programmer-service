package com.fitness.programmer.controller;

import com.fitness.programmer.configuration_handlers.JWTUtils;
import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.WeeklyProgramDto;
import com.fitness.programmer.service.IWeeklyProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programs")
public class WeeklyProgramController {
    @Autowired
    private IWeeklyProgramService weeklyProgramService;

    @Autowired
    JWTUtils jwtUtils;

    @GetMapping("weekly-program")
    private List<WeeklyProgramDto> getAllWeeklyProgramsByTotalProgramId(@PathVariable String totalProgramId) {
        return weeklyProgramService.getAllByTotalProgramId(totalProgramId);
    }

    @GetMapping("weekly-program/{id}")
    private WeeklyProgramDto getById(@PathVariable String id) throws RequestException {
        return weeklyProgramService.getById(id);
    }


    @PostMapping("weekly-program")
    private ResponseEntity<?> postWeeklyProgram(@RequestBody WeeklyProgramDto weeklyProgramDto) {
        WeeklyProgramDto storedProgram = weeklyProgramService.postWeeklyProgram(weeklyProgramDto);
        return ResponseEntity.ok().body(storedProgram);
    }

    @PutMapping("weekly-program")
    private ResponseEntity<?> putWeeklyProgram(@RequestBody WeeklyProgramDto weeklyProgramDto) throws RequestException {
        WeeklyProgramDto storedProgram = weeklyProgramService.updateWeeklyProgram(weeklyProgramDto);
        return ResponseEntity.ok().body(storedProgram);
    }

    @DeleteMapping("weekly-program/{id}")
    private ResponseEntity<?> deleteWeeklyProgramById(@PathVariable String id) throws RequestException {
        weeklyProgramService.deleteWeeklyProgramById(id);
        return ResponseEntity.ok(id);
    }

}
