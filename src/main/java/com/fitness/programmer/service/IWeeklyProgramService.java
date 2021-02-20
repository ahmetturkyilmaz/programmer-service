package com.fitness.programmer.service;

import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.WeeklyProgramDto;

import java.util.List;

public interface IWeeklyProgramService {

    WeeklyProgramDto postWeeklyProgram(WeeklyProgramDto weeklyProgramDto);


    WeeklyProgramDto updateWeeklyProgram(WeeklyProgramDto weeklyProgramDto) throws RequestException;

    List<WeeklyProgramDto> getAllByTotalProgramId(String totalProgramId);

    WeeklyProgramDto getById(String id) throws RequestException;

    void deleteWeeklyProgramById(String id) throws RequestException;
}
