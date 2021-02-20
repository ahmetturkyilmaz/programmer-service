package com.fitness.programmer.repository.mongorepository;

import com.fitness.programmer.model.entity.WeeklyProgramEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface IWeeklyProgramRepositoryMongo extends MongoRepository<WeeklyProgramEntity, String> {
    @Query("{totalProgramId:?0}")
    List<WeeklyProgramEntity> findByTotalProgramId(String totalProgramId);
}
