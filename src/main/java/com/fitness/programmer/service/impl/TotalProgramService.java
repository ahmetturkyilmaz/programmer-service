package com.fitness.programmer.service.impl;

import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.DailyProgramDto;
import com.fitness.programmer.model.dto.MoveDto;
import com.fitness.programmer.model.dto.TotalProgramDto;
import com.fitness.programmer.model.dto.WeeklyProgramDto;
import com.fitness.programmer.repository.ITotalProgramRepository;
import com.fitness.programmer.service.IMoveService;
import com.fitness.programmer.service.ITotalProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class TotalProgramService implements ITotalProgramService {

    @Autowired
    ITotalProgramRepository totalProgramRepository;

    @Autowired
    IMoveService moveService;

    @Override
    public List<TotalProgramDto> getAllTotalPrograms(String username) {
        return totalProgramRepository.getAllTotalPrograms(username);
    }

    @Override
    public TotalProgramDto getTotalProgramById(String id) throws RequestException {
        return totalProgramRepository.getTotalProgramById(id);
    }

    @Override
    @Transactional
    public TotalProgramDto postTotalProgram(TotalProgramDto totalProgramDto) throws RequestException {
        if (!CollectionUtils.isEmpty(totalProgramDto.getWeeklyPrograms())) {
            for (WeeklyProgramDto weeklyProgramDto : totalProgramDto.getWeeklyPrograms()) {
                if (!CollectionUtils.isEmpty(weeklyProgramDto.getDailyPrograms()))
                    for (DailyProgramDto dailyProgramDto : weeklyProgramDto.getDailyPrograms()) {
                        if (!CollectionUtils.isEmpty(dailyProgramDto.getMoveSet())) {
                            for (MoveDto moveDto : dailyProgramDto.getMoveSet()) {
                                if (StringUtils.isEmpty(moveDto.getId())) {
                                    String id = moveService.postMove(moveDto).getId();
                                    moveDto.setId(id);
                                }
                            }
                        }
                    }
            }
        }
        return totalProgramRepository.postTotalProgram(totalProgramDto);
    }

    @Override
    public String updateTotalProgram(TotalProgramDto totalProgramDto) throws RequestException {
        return totalProgramRepository.updateTotalProgram(totalProgramDto);
    }


}
