package com.fitness.programmer.repository;

import com.fitness.programmer.exception.DayNotFoundException;
import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.DailyProgramDto;

import java.util.List;

public interface IDailyProgramRepository {
    List<DailyProgramDto> getDailyProgramsByWeeklyProgramId(boolean isLazyLoading, Long id);

    DailyProgramDto getDailyProgramById(Long id);

    Long postDailyProgram(DailyProgramDto dailyProgramDto) throws DayNotFoundException, RequestException;

    DailyProgramDto updateDailyProgram(DailyProgramDto dailyProgramDto) throws RequestException;
}
