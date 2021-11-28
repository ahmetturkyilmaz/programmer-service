package com.fitness.programmer.repository.impl;

import com.fitness.programmer.exception.DailyProgramNotFoundException;
import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.DailyProgramDto;
import com.fitness.programmer.model.entity.DailyProgramEntity;
import com.fitness.programmer.model.enums.DayOfWeek;
import com.fitness.programmer.model.mapper.ProgrammerServiceMapper;
import com.fitness.programmer.repository.IDailyProgramRepository;
import com.fitness.programmer.repository.mongorepository.IDailyProgramRepositoryMongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.mongodb.core.query.Criteria.where;

@Repository
public class DailyProgramRepository implements IDailyProgramRepository {

    @Autowired
    private IDailyProgramRepositoryMongo dailyProgramRepositoryMongo;
    @Autowired
    ProgrammerServiceMapper mapper;
    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public List<DailyProgramDto> getDailyProgramsInWeek(String username, String totalProgramId, Integer weekNumber) {
        return mapper.entityToDtoDailyProgramEntityList(dailyProgramRepositoryMongo.findAllByWeek(username, totalProgramId, weekNumber));
    }

    @Override
    public List<DailyProgramDto> getAllDailyProgramsInTotalProgram(String username, String totalProgramId) {
        return mapper.entityToDtoDailyProgramEntityList(dailyProgramRepositoryMongo.findAllByTotalProgram(username, totalProgramId));
    }

    @Override
    public DailyProgramDto getOneInWeek(String totalProgramId, Integer weekNumber, DayOfWeek dayOfWeek, String username) throws DailyProgramNotFoundException {
        Optional<DailyProgramEntity> dailyProgramEntity = dailyProgramRepositoryMongo.getOneInWeek(username,totalProgramId,weekNumber,dayOfWeek);
        if (!dailyProgramEntity.isPresent()) {
            throw new DailyProgramNotFoundException();
        }


        return null;
    }

    @Override
    public DailyProgramDto getById(String id) throws RequestException {
        Optional<DailyProgramEntity> dailyProgramEntity = dailyProgramRepositoryMongo.findById(id);
        if (!dailyProgramEntity.isPresent()) {
            throw new DailyProgramNotFoundException();
        }
        return mapper.entityToDto(dailyProgramEntity.get());
    }

    @Override
    public DailyProgramDto postDailyProgram(DailyProgramDto dailyProgramDto) {
        DailyProgramEntity dailyProgramEntity = mapper.dtoToEntity(dailyProgramDto);
        return mapper.entityToDto(dailyProgramRepositoryMongo.save(dailyProgramEntity));
    }

    @Override
    public DailyProgramDto updateDailyProgram(DailyProgramDto dailyProgramDto) {
        DailyProgramEntity dailyProgramEntity = mapper.dtoToEntity(dailyProgramDto);
        return mapper.entityToDto(dailyProgramRepositoryMongo.save(dailyProgramEntity));
    }

    @Override
    public void deleteDailyProgram(String id) {
        dailyProgramRepositoryMongo.deleteById(id);
    }

    @Override
    public void deleteDailyProgramsByTotalProgramId(String totalProgramId) {
        Query query = new Query();
        query.addCriteria(where("totalProgramId").is(totalProgramId));

        mongoTemplate.findAllAndRemove(query, DailyProgramEntity.class);
    }
}
