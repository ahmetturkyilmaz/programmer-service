package com.fitness.programmer.repository.mongorepository;

import com.fitness.programmer.model.entity.DailyProgramEntity;
import com.fitness.programmer.model.enums.DayOfWeek;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface IDailyProgramRepositoryMongo extends MongoRepository<DailyProgramEntity, String> {

    @Query("{createdBy:?0, totalProgramId: ?1 , weekNumber: ?2 }")
    List<DailyProgramEntity> findAllByWeek(String createdBy, String totalProgramId, Integer weekNumber);

    @Query("{createdBy:?0, totalProgramId: ?1}")
    List<DailyProgramEntity> findAllByTotalProgram(String createdBy, String totalProgramId);

    @Query("{createdBy:?0, totalProgramId: ?1, weekNumber: ?2, dayOfWeek: ?3}")
    Optional<DailyProgramEntity> getOneInWeek(String username, String totalProgramId, Integer weekNumber, DayOfWeek dayOfWeek);
}
