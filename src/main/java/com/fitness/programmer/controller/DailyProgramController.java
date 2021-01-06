package com.fitness.programmer.controller;

import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.DailyProgramDto;
import com.fitness.programmer.service.IDailyProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programs")
public class DailyProgramController {

    @Autowired
    IDailyProgramService dailyProgramService;

    @GetMapping("/daily-programs/weekly/{id}")
    public List<DailyProgramDto> getDailyProgramsByWeeklyProgramId(@RequestParam boolean isLazyLoading, @PathVariable Long id) {
        return dailyProgramService.getDailyProgramsByWeeklyProgramId(isLazyLoading, id);
    }

    @GetMapping("/daily-programs/{id}")
    public DailyProgramDto getDailyProgramById(@PathVariable Long id) {
        return dailyProgramService.getDailyProgramById(id);
    }

    @PostMapping("/daily-programs")
    public Long postDailyProgram(@RequestBody DailyProgramDto dailyProgramDto) throws RequestException {
        return dailyProgramService.postDailyProgram(dailyProgramDto);

    }

    @PutMapping("/daily-programs")
    public DailyProgramDto updateDailyProgram(@RequestBody DailyProgramDto dailyProgramDto) throws RequestException {
        return dailyProgramService.updateDailyProgram(dailyProgramDto);
    }
}
