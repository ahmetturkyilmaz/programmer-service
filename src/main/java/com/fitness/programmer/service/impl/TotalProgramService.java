package com.fitness.programmer.service.impl;

import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.TotalProgramDto;
import com.fitness.programmer.repository.ITotalProgramRepository;
import com.fitness.programmer.service.ITotalProgramService;
import com.fitness.programmer.service.IWeeklyProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TotalProgramService implements ITotalProgramService {

    @Autowired
    ITotalProgramRepository totalProgramRepository;

    @Autowired
    IWeeklyProgramService weeklyProgramService;

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
        return totalProgramRepository.postTotalProgram(totalProgramDto);
    }

    @Override
    public String updateTotalProgramHandleDBRefs(TotalProgramDto totalProgramDto) throws RequestException {
        return updateTotalProgram(totalProgramDto);
    }

    public String updateTotalProgram(TotalProgramDto totalProgramDto) throws RequestException {
        return totalProgramRepository.updateTotalProgram(totalProgramDto);
    }





}
