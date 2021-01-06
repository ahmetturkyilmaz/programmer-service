package com.fitness.programmer.repository.sqlrepository;

import com.fitness.programmer.model.entity.DailyProgramEntity;
import com.fitness.programmer.model.entity.WeeklyProgramEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IDailyProgramRepositorySQL extends JpaRepository<DailyProgramEntity, Long> {
    @Query("SELECT u FROM DailyProgramEntity u WHERE u.weeklyProgram.id  = ?1")
    List<DailyProgramEntity> findByDailyProgramId(Long id);
}
