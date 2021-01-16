package com.fitness.programmer.service.impl;

import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.MoveDto;
import com.fitness.programmer.repository.IMoveRepository;
import com.fitness.programmer.service.IMoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoveService implements IMoveService {

    @Autowired
    IMoveRepository moveRepository;

    @Override
    public List<MoveDto> getMoves(String username) {
        return moveRepository.findAll(username);
    }

    @Override
    public MoveDto getMoveById(String id) throws RequestException {
        return moveRepository.findById(id);
    }

    @Override
    public String updateMove(MoveDto moveDto) throws RequestException {
        return moveRepository.updateMove(moveDto);
    }

    @Override
    public MoveDto postMove(MoveDto moveDto) {
        return moveRepository.postMove(moveDto);
    }

    @Override
    public String deleteMove(String id) {
        return moveRepository.deleteMove(id);
    }
}
