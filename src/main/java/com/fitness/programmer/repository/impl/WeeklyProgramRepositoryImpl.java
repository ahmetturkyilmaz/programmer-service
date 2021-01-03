package com.fitness.programmer.repository.impl;

import com.fitness.programmer.model.dto.WeeklyProgramDto;
import com.fitness.programmer.model.entity.WeeklyProgramEntity;
import com.fitness.programmer.model.mapper.ProgrammerServiceMapper;
import com.fitness.programmer.repository.IWeeklyProgramRepository;
import com.fitness.programmer.repository.sqlrepository.IWeeklyProgramRepositorySQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class WeeklyProgramRepositoryImpl implements IWeeklyProgramRepository {

    @Autowired
    IWeeklyProgramRepositorySQL weeklyProgramRepositorySQL;

    @Autowired
    ProgrammerServiceMapper mapper;

    @Override
    @Transactional
    public List<WeeklyProgramDto> getAllWeeklyProgramsByTotalProgramId(boolean isLazyLoading, Long totalProgramId) {
        List<WeeklyProgramEntity> storedEntities = weeklyProgramRepositorySQL.findByTotalProgramId(totalProgramId);
        if (!isLazyLoading) {
            storedEntities.forEach(WeeklyProgramEntity::getDailyProgram);
        }
        return mapper.entityToDtoWeeklyProgramEntityList(storedEntities);
    }
}
