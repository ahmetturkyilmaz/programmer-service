package com.fitness.programmer.repository;

import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.WeeklyProgramDto;

import java.util.List;

public interface IWeeklyProgramRepository {
    WeeklyProgramDto postWeeklyProgram(WeeklyProgramDto weeklyProgramDto);

    WeeklyProgramDto updateWeeklyProgram(WeeklyProgramDto weeklyProgramDto) throws RequestException;

    WeeklyProgramDto getById(String id) throws RequestException;

    void deleteWeeklyProgramById(String id);

    List<WeeklyProgramDto> getAllByTotalProgramId(String totalProgramId);
}
