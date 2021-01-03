package com.fitness.programmer.service.impl;

import com.fitness.programmer.controller.WeeklyProgramController;
import com.fitness.programmer.model.dto.WeeklyProgramDto;
import com.fitness.programmer.repository.IWeeklyProgramRepository;
import com.fitness.programmer.service.IWeeklyProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeeklyProgramService implements IWeeklyProgramService {
    @Autowired
    IWeeklyProgramRepository weeklyProgramRepository;
    @Override
    public List<WeeklyProgramDto> getAllWeeklyProgramsByTotalProgramId(boolean isLazyLoading, Long totalProgramId) {
        return weeklyProgramRepository.getAllWeeklyProgramsByTotalProgramId(isLazyLoading,totalProgramId);
    }
}
