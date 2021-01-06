package com.fitness.programmer.service.impl;

import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.DailyProgramDto;
import com.fitness.programmer.repository.IDailyProgramRepository;
import com.fitness.programmer.service.IDailyProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DailyProgramService implements IDailyProgramService {

    @Autowired
    IDailyProgramRepository dailyProgramRepository;

    @Override
    public List<DailyProgramDto> getDailyProgramsByWeeklyProgramId(boolean isLazyLoading, Long id) {
        return dailyProgramRepository.getDailyProgramsByWeeklyProgramId(isLazyLoading, id);

    }

    @Override
    public DailyProgramDto getDailyProgramById(Long id) {
        return dailyProgramRepository.getDailyProgramById(id);
    }

    @Override
    public Long postDailyProgram(DailyProgramDto dailyProgramDto) throws RequestException {
        return dailyProgramRepository.postDailyProgram(dailyProgramDto);
    }

    @Override
    public DailyProgramDto updateDailyProgram(DailyProgramDto dailyProgramDto) throws RequestException {
        return dailyProgramRepository.updateDailyProgram(dailyProgramDto);
    }
}
