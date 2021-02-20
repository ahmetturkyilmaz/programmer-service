package com.fitness.programmer.repository.impl;

import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.WeeklyProgramDto;
import com.fitness.programmer.model.entity.WeeklyProgramEntity;
import com.fitness.programmer.model.mapper.ProgrammerServiceMapper;
import com.fitness.programmer.repository.IWeeklyProgramRepository;
import com.fitness.programmer.repository.mongorepository.IWeeklyProgramRepositoryMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public class WeeklyProgramRepository implements IWeeklyProgramRepository {

    @Autowired
    private IWeeklyProgramRepositoryMongo repository;

    @Autowired
    private ProgrammerServiceMapper mapper;

    @Override
    public List<WeeklyProgramDto> getAllByTotalProgramId(String totalProgramId) {
        List<WeeklyProgramEntity> weeklyProgramEntities = repository.findByTotalProgramId(totalProgramId);
        return mapper.entityToDtoWeeklyProgramEntityList(weeklyProgramEntities);
    }

    @Override
    public WeeklyProgramDto postWeeklyProgram(WeeklyProgramDto weeklyProgramDto) {
        WeeklyProgramEntity weeklyProgramEntity = mapper.dtoToEntity(weeklyProgramDto);
        weeklyProgramEntity.setCreatedAt(new Date().getTime());
        WeeklyProgramEntity storedEntity = repository.save(weeklyProgramEntity);
        return mapper.entityToDto(storedEntity);
    }

    @Override
    public WeeklyProgramDto updateWeeklyProgram(WeeklyProgramDto weeklyProgramDto) throws RequestException {
        WeeklyProgramDto storedProgram = getById(weeklyProgramDto.getId());
        WeeklyProgramEntity weeklyProgramEntity = mapper.dtoToEntity(weeklyProgramDto);
        weeklyProgramEntity.setVersion(storedProgram.getVersion());
        return null;
    }

    @Override
    public WeeklyProgramDto getById(String id) throws RequestException {
        Optional<WeeklyProgramEntity> weeklyProgramEntity = repository.findById(id);
        if (!weeklyProgramEntity.isPresent()) {
            throw new RequestException("weekly program is not found");
        }
        return mapper.entityToDto(weeklyProgramEntity.get());
    }

    @Override
    public void deleteWeeklyProgramById(String id) {
        repository.deleteById(id);
    }
}
