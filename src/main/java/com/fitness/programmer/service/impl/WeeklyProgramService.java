package com.fitness.programmer.service.impl;

import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.WeeklyProgramDto;
import com.fitness.programmer.repository.IWeeklyProgramRepository;
import com.fitness.programmer.service.IMoveService;
import com.fitness.programmer.service.IWeeklyProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class WeeklyProgramService implements IWeeklyProgramService {

    @Autowired
    IMoveService moveService;

    @Autowired
    IWeeklyProgramRepository weeklyProgramRepository;

    @Override
    public List<WeeklyProgramDto> getAllByTotalProgramId(String totalProgramId) {
        List<WeeklyProgramDto> weeklyPrograms = weeklyProgramRepository.getAllByTotalProgramId(totalProgramId);
        if (!CollectionUtils.isEmpty(weeklyPrograms)) {
            return null;
        }
        if (weeklyPrograms.size() > 1) {
            Collections.sort(weeklyPrograms, Comparator.comparingInt(WeeklyProgramDto::getWeekNumber));
        }
        return weeklyPrograms;
    }

    @Override
    public WeeklyProgramDto getById(String id) throws RequestException {
        return weeklyProgramRepository.getById(id);
    }

    @Override
    public WeeklyProgramDto postWeeklyProgram(WeeklyProgramDto weeklyProgramDto) {
        return weeklyProgramRepository.postWeeklyProgram(weeklyProgramDto);
    }

    @Override
    public void deleteWeeklyProgramById(String id) throws RequestException {
        weeklyProgramRepository.deleteWeeklyProgramById(id);
    }

    @Override
    public WeeklyProgramDto updateWeeklyProgram(WeeklyProgramDto weeklyProgramDto) throws RequestException {
        return weeklyProgramRepository.updateWeeklyProgram(weeklyProgramDto);
    }
}
