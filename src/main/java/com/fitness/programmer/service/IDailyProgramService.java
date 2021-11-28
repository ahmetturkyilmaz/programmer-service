package com.fitness.programmer.service;

import com.fitness.programmer.exception.DailyProgramNotFoundException;
import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.DailyProgramDto;
import com.fitness.programmer.model.dto.DailyProgramGetRequest;
import com.fitness.programmer.model.enums.DayOfWeek;

import java.util.List;

public interface IDailyProgramService {

    List<DailyProgramDto> getDailyProgramsByWeek(String totalProgramId,Integer weekNumb, String username);

    List<DailyProgramDto> getDailyProgramsByTotalProgram(String totalProgramId, String username);

    DailyProgramDto getDailyProgramById(String id) throws RequestException;

    DailyProgramDto postDailyProgram(DailyProgramDto dailyProgramDto);

    DailyProgramDto updateDailyProgram(DailyProgramDto dailyProgramDto);

    void deleteDailyProgram(String id);

    void deleteDailyProgramsByTotalProgramId(String totalProgramId);

    DailyProgramDto getOneInWeek(String totalProgramId, Integer weekNumber, DayOfWeek dayOfWeek, String username) throws DailyProgramNotFoundException;
}
