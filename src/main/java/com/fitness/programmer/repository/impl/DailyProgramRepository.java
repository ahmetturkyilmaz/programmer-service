package com.fitness.programmer.repository.impl;

import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.DailyProgramDto;
import com.fitness.programmer.model.entity.DailyProgramEntity;
import com.fitness.programmer.model.mapper.ProgrammerServiceMapper;
import com.fitness.programmer.repository.IDailyProgramRepository;
import com.fitness.programmer.repository.sqlrepository.IDailyProgramRepositorySQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Repository
public class DailyProgramRepository implements IDailyProgramRepository {

    @Autowired
    ProgrammerServiceMapper mapper;

    @Autowired
    IDailyProgramRepositorySQL dailyProgramRepositorySQL;

    @Override
    public List<DailyProgramDto> getDailyProgramsByWeeklyProgramId(boolean isLazyLoading, Long id) {
        List<DailyProgramEntity> dailyProgramEntities = dailyProgramRepositorySQL.findByDailyProgramId(id);
        if (!isLazyLoading) {
            dailyProgramEntities.forEach(DailyProgramEntity::getMoveSet);
        }
        return mapper.entityToDtoDailyProgramEntityList(dailyProgramEntities);
    }

    @Override
    public DailyProgramDto getDailyProgramById(Long id) {
        Optional<DailyProgramEntity> dailyProgramEntity = dailyProgramRepositorySQL.findById(id);
        if (!dailyProgramEntity.isPresent()) {
            throw new EntityNotFoundException();
        }
        return mapper.entityToDto(dailyProgramEntity.get());
    }

    @Override
    public Long postDailyProgram(DailyProgramDto dailyProgramDto) throws RequestException {
        DailyProgramEntity dailyProgramEntity = mapper.dtoToEntity(dailyProgramDto);
        DailyProgramEntity storedEntity = dailyProgramRepositorySQL.save(dailyProgramEntity);

        return storedEntity.getId();
    }

    @Override
    public DailyProgramDto updateDailyProgram(DailyProgramDto dailyProgramDto) throws RequestException {
        DailyProgramEntity dailyProgramEntity = mapper.dtoToEntity(dailyProgramDto);
        DailyProgramEntity storedEntity = dailyProgramRepositorySQL.save(dailyProgramEntity);

        return mapper.entityToDto(storedEntity);
    }
}
