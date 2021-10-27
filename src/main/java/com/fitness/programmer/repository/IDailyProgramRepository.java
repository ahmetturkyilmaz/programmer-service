package com.fitness.programmer.repository;

import com.fitness.programmer.exception.DailyProgramNotFoundException;
import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.DailyProgramDto;

import java.util.List;

public interface IDailyProgramRepository {


    List<DailyProgramDto> getDailyProgramsInWeek(String username, String totalProgramId, Integer weekNumber);

    List<DailyProgramDto> getAllDailyProgramsInTotalProgram(String username, String totalProgramId);

    DailyProgramDto getById(String id) throws DailyProgramNotFoundException, RequestException;

    DailyProgramDto postDailyProgram(DailyProgramDto dailyProgramDto);

    DailyProgramDto updateDailyProgram(DailyProgramDto dailyProgramDto);

    void deleteDailyProgram(String id);

    void deleteDailyProgramsByTotalProgramId(String totalProgramId);

}
