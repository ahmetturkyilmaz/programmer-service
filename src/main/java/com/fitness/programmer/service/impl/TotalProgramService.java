package com.fitness.programmer.service.impl;

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
    public List<TotalProgramDto> getAllTotalPrograms(boolean isLazyLoading, String username) {
        return totalProgramRepository.getAllTotalPrograms(isLazyLoading,username);
    }

    @Override
    public TotalProgramDto getTotalProgramById(Long id) {
        return totalProgramRepository.getTotalProgramById(id);
    }

    @Override
    public Long postTotalProgram(TotalProgramDto totalProgramDto) {
        return totalProgramRepository.postTotalProgram(totalProgramDto);
    }

    @Override
    public Long updateTotalProgram(TotalProgramDto totalProgramDto) {
        return totalProgramRepository.updateTotalProgram(totalProgramDto);
    }


}
