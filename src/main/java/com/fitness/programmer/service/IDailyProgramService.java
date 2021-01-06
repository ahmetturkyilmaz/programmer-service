package com.fitness.programmer.service;

import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.DailyProgramDto;

import java.util.List;

public interface IDailyProgramService {
    List<DailyProgramDto> getDailyProgramsByWeeklyProgramId(boolean isLazyLoading, Long id);

    DailyProgramDto getDailyProgramById(Long id);

    Long postDailyProgram(DailyProgramDto dailyProgramDto) throws RequestException;

    DailyProgramDto updateDailyProgram(DailyProgramDto dailyProgramDto) throws RequestException;
}
