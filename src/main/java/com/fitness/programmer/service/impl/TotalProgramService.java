package com.fitness.programmer.service.impl;

import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.TotalProgramDto;
import com.fitness.programmer.repository.ITotalProgramRepository;
import com.fitness.programmer.service.ITotalProgramService;
import com.fitness.programmer.service.IWeeklyProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TotalProgramService implements ITotalProgramService {

    @Autowired
    ITotalProgramRepository totalProgramRepository;

    @Autowired
    IWeeklyProgramService weeklyProgramService;

    @Override
    public List<TotalProgramDto> getAllTotalPrograms(String username) {
        return totalProgramRepository.getAllTotalPrograms(username);
    }

    @Override
    public TotalProgramDto getTotalProgramById(String id) throws RequestException {
        return totalProgramRepository.getTotalProgramById(id);
    }

    @Override
    @Transactional
    public TotalProgramDto postTotalProgram(TotalProgramDto totalProgramDto) throws RequestException {
        //handleDBRefs(totalProgramDto, null);
        return totalProgramRepository.postTotalProgram(totalProgramDto);
    }

    @Override
    public String updateTotalProgramHandleDBRefs(TotalProgramDto totalProgramDto) throws RequestException {
        TotalProgramDto storedTotalProgram = getTotalProgramById(totalProgramDto.getId());
        //handleDBRefs(totalProgramDto, storedTotalProgram);
        return updateTotalProgram(totalProgramDto);
    }

    public String updateTotalProgram(TotalProgramDto totalProgramDto) throws RequestException {
        return totalProgramRepository.updateTotalProgram(totalProgramDto);
    }

    @Override
    public void updateTotalProgramWithDeletedWeeklyProgram(String id) throws RequestException {
        List<TotalProgramDto> totalProgramDto = totalProgramRepository.getTotalProgramByWeeklyProgramId(id);
        TotalProgramDto totalProgramToBeUpdated = totalProgramDto.get(0);
        totalProgramToBeUpdated.getWeeklyPrograms().removeIf(x -> x.getId().equals(id));
        updateTotalProgram(totalProgramToBeUpdated);
    }

   /* private void handleDBRefs(TotalProgramDto totalProgramDto, TotalProgramDto storedTotalProgram) throws RequestException {
        Set<String> newIdList = new HashSet<>();
        Set<String> storedIdList = new HashSet<>();
        if (!CollectionUtils.isEmpty(totalProgramDto.getWeeklyPrograms())) {
            for (WeeklyProgramDto weeklyProgramDto : totalProgramDto.getWeeklyPrograms()) {
                if (StringUtils.isEmpty(weeklyProgramDto.getId())) {
                    String id = weeklyProgramService.postWeeklyProgram(weeklyProgramDto).getId();
                    weeklyProgramDto.setId(id);
                }
            }
        }
        if (storedTotalProgram != null) {
            for (WeeklyProgramDto weeklyProgramDto : storedTotalProgram.getWeeklyPrograms()) {

                storedIdList.add(weeklyProgramDto.getId());
            }
        }


        if (!CollectionUtils.isEmpty(storedIdList)) {
            storedIdList.removeAll(newIdList);
            if (!CollectionUtils.isEmpty(storedIdList)) {
                for (String id : storedIdList) {
                    weeklyProgramService.deleteWeeklyProgramById(id);
                }
            }
        }
    }*/


}
