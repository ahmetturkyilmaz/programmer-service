package com.fitness.programmer.service.impl;

import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.TotalProgramDto;
import com.fitness.programmer.repository.ITotalProgramRepository;
import com.fitness.programmer.service.ITotalProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TotalProgramService implements ITotalProgramService {

    @Autowired
    ITotalProgramRepository totalProgramRepository;

    @Override
    public List<TotalProgramDto> getAllTotalPrograms( String username) {
        return totalProgramRepository.getAllTotalPrograms(username);
    }

    @Override
    public TotalProgramDto getTotalProgramById(String id) throws RequestException {
        return totalProgramRepository.getTotalProgramById(id);
    }

    @Override
    public TotalProgramDto postTotalProgram(TotalProgramDto totalProgramDto) {
        return totalProgramRepository.postTotalProgram(totalProgramDto);
    }

    @Override
    public String updateTotalProgram(TotalProgramDto totalProgramDto) throws RequestException {
        return totalProgramRepository.updateTotalProgram(totalProgramDto);
    }


}
