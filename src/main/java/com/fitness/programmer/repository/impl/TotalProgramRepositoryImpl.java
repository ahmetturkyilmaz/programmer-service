package com.fitness.programmer.repository.impl;

import com.fitness.programmer.model.dto.TotalProgramDto;
import com.fitness.programmer.model.entity.TotalProgramEntity;
import com.fitness.programmer.model.mapper.ProgrammerServiceMapper;
import com.fitness.programmer.repository.ITotalProgramRepository;
import com.fitness.programmer.repository.sqlrepository.ITotalProgramRepositorySQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public class TotalProgramRepositoryImpl implements ITotalProgramRepository {
    @Autowired
    private ITotalProgramRepositorySQL totalProgramRepositorySQL;
    @Autowired
    ProgrammerServiceMapper mapper;

    @Override
    @Transactional
    public List<TotalProgramDto> getAllTotalPrograms(boolean isLazyLoading, String username) {
        List<TotalProgramEntity> totalProgramEntities = totalProgramRepositorySQL.findByUsername(username);
        if (!isLazyLoading) {
            for (TotalProgramEntity totalProgramEntity : totalProgramEntities) {
                totalProgramEntity.getWeeklyPrograms();
            }
        }
        return mapper.entityToDto(totalProgramEntities);
    }

    @Override
    public TotalProgramDto getTotalProgramById(Long id) {
        Optional<TotalProgramEntity> totalProgramEntity = totalProgramRepositorySQL.findById(id);
        return totalProgramEntity.map(programEntity -> mapper.entityToDto(programEntity)).orElse(null);
    }

    @Override
    public Long postTotalProgram(TotalProgramDto totalProgramDto) {
        TotalProgramEntity totalProgramEntity = mapper.dtoToEntity(totalProgramDto);
        totalProgramEntity.setCreatedAt(new Date().getTime());
        TotalProgramEntity storedEntity = totalProgramRepositorySQL.save(totalProgramEntity);

        return storedEntity.getId();
    }

    @Override
    public Long updateTotalProgram(TotalProgramDto totalProgramDto) {
        return null;
    }

}
