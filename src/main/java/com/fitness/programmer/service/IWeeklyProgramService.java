package com.fitness.programmer.service;

import com.fitness.programmer.controller.WeeklyProgramController;
import com.fitness.programmer.model.dto.WeeklyProgramDto;

import java.util.List;

public interface IWeeklyProgramService {
    List<WeeklyProgramDto> getAllWeeklyProgramsByTotalProgramId(boolean isLazyLoading, Long totalProgramId);
}
