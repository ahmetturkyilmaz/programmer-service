package com.fitness.programmer.service;

import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.DailyProgramDto;
import com.fitness.programmer.model.dto.DailyProgramGetRequest;

import java.util.List;

public interface IDailyProgramService {

    List<DailyProgramDto> getDailyProgramsByWeek(DailyProgramGetRequest getRequest, String username);

    List<DailyProgramDto> getDailyProgramsByTotalProgram(DailyProgramGetRequest getRequest, String username);

    DailyProgramDto getDailyProgramById(String id) throws RequestException;

    DailyProgramDto postDailyProgram(DailyProgramDto dailyProgramDto);

    DailyProgramDto updateDailyProgram(DailyProgramDto dailyProgramDto);

    void deleteDailyProgram(String id);

    void deleteDailyProgramsByTotalProgramId(String totalProgramId);

}
