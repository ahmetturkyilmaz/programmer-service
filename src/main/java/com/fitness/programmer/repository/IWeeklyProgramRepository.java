package com.fitness.programmer.repository;

import com.fitness.programmer.model.dto.WeeklyProgramDto;

import java.util.List;

public interface IWeeklyProgramRepository {
    List<WeeklyProgramDto> getAllWeeklyProgramsByTotalProgramId(boolean isLazyLoading, Long totalProgramId);
}
