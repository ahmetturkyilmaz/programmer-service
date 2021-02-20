package com.fitness.programmer.repository.impl;

import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.MoveDto;
import com.fitness.programmer.model.entity.MoveEntity;
import com.fitness.programmer.model.mapper.ProgrammerServiceMapper;
import com.fitness.programmer.repository.IMoveRepository;
import com.fitness.programmer.repository.mongorepository.IMoveRepositoryMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public class MoveRepository implements IMoveRepository {

    @Autowired
    IMoveRepositoryMongo moveTypeRepositoryMongo;

    @Autowired
    ProgrammerServiceMapper mapper;

    @Override
    public List<MoveDto> findAll(String username) {
        List<MoveEntity> storedEntities = moveTypeRepositoryMongo.findAll(username);
        List<MoveDto> moveDtos = mapper.entityToDtoMoveEntityList(storedEntities);
        return moveDtos;
    }

    @Override
    public MoveDto findById(String id) throws RequestException {
        Optional<MoveEntity> storedEntity = moveTypeRepositoryMongo.findById(id);
        return storedEntity.map(moveEntity -> mapper.entityToDto(moveEntity)).orElse(null);
    }


    @Override
    public String updateMove(MoveDto moveDto) throws RequestException {
        MoveDto storedMove = findById(moveDto.getId());
        moveDto.setVersion(storedMove.getVersion());
        return moveTypeRepositoryMongo.save(mapper.dtoToEntity(moveDto)).getId();
    }

    @Override
    public MoveDto postMove(MoveDto moveDto) {
        MoveEntity entity = mapper.dtoToEntity(moveDto);
        entity.setCreatedAt(new Date().getTime());
        MoveEntity storedEntity = moveTypeRepositoryMongo.save(entity);
        return mapper.entityToDto(storedEntity);
    }

    @Override
    public String deleteMove(String id) {
        moveTypeRepositoryMongo.deleteById(id);
        return id;
    }
}
