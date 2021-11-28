package com.fitness.programmer.service.impl;

import com.fitness.programmer.exception.DailyProgramNotFoundException;
import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.DailyProgramDto;
import com.fitness.programmer.model.enums.DayOfWeek;
import com.fitness.programmer.repository.IDailyProgramRepository;
import com.fitness.programmer.service.IDailyProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DailyProgramService implements IDailyProgramService {
    @Autowired
    private IDailyProgramRepository dailyProgramRepository;

    @Override
    public DailyProgramDto getOneInWeek(String totalProgramId, Integer weekNumber, DayOfWeek dayOfWeek, String username) throws DailyProgramNotFoundException {
        return dailyProgramRepository.getOneInWeek(totalProgramId, weekNumber, dayOfWeek, username);
    }

    @Override
    public List<DailyProgramDto> getDailyProgramsByWeek(String totalProgramId, Integer weekNumb, String username) {
        return dailyProgramRepository.getDailyProgramsInWeek(username, totalProgramId, weekNumb);
    }

    @Override
    public List<DailyProgramDto> getDailyProgramsByTotalProgram(String totalProgramId, String username) {
        return dailyProgramRepository.getAllDailyProgramsInTotalProgram(username, totalProgramId);
    }

    @Override
    public DailyProgramDto getDailyProgramById(String id) throws RequestException {
        return dailyProgramRepository.getById(id);
    }

    @Override
    public DailyProgramDto postDailyProgram(DailyProgramDto dailyProgramDto) {
        return dailyProgramRepository.postDailyProgram(dailyProgramDto);
    }

    @Override
    public DailyProgramDto updateDailyProgram(DailyProgramDto dailyProgramDto) {
        return dailyProgramRepository.updateDailyProgram(dailyProgramDto);
    }

    @Override
    public void deleteDailyProgram(String id) {
        dailyProgramRepository.deleteDailyProgram(id);
    }

    @Override
    public void deleteDailyProgramsByTotalProgramId(String totalProgramId) {
        dailyProgramRepository.deleteDailyProgramsByTotalProgramId(totalProgramId);
    }
}
