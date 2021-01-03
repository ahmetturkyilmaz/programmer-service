package com.fitness.programmer.repository.sqlrepository;

import com.fitness.programmer.model.entity.WeeklyProgramEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IWeeklyProgramRepositorySQL extends JpaRepository<WeeklyProgramEntity, Long> {
    @Query("SELECT u FROM WeeklyProgramEntity u WHERE u.totalProgram.id  = ?1")
    List<WeeklyProgramEntity> findByTotalProgramId(Long id);
}
