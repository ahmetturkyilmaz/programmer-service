package com.fitness.programmer.service.impl;

import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.ProgramCreateRequestDto;
import com.fitness.programmer.model.dto.TotalProgramDto;
import com.fitness.programmer.model.dto.WeeklyProgramDto;
import com.fitness.programmer.repository.ITotalProgramRepository;
import com.fitness.programmer.service.ITotalProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class TotalProgramService implements ITotalProgramService {

    @Autowired
    ITotalProgramRepository totalProgramRepository;

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
    public TotalProgramDto postTotalProgram(ProgramCreateRequestDto createRequestDto) throws RequestException {
        TotalProgramDto newTotalProgram = new TotalProgramDto();
        newTotalProgram.setProgramName(createRequestDto.getNameOfProgram());
        List<WeeklyProgramDto> weeklyProgramList = new ArrayList<>();
        switch (createRequestDto.getNumberOfWeeks()) {
            case 1:
                weeklyProgramList.add(defineWeeklyProgram(1));
                break;
            case 2:
                weeklyProgramList.add(defineWeeklyProgram(1));
                weeklyProgramList.add(defineWeeklyProgram(2));
                break;
            case 3:
                weeklyProgramList.add(defineWeeklyProgram(1));
                weeklyProgramList.add(defineWeeklyProgram(2));
                weeklyProgramList.add(defineWeeklyProgram(3));
                break;
            case 4:
                weeklyProgramList.add(defineWeeklyProgram(1));
                weeklyProgramList.add(defineWeeklyProgram(2));
                weeklyProgramList.add(defineWeeklyProgram(3));
                weeklyProgramList.add(defineWeeklyProgram(4));
                break;
            case 5:
                weeklyProgramList.add(defineWeeklyProgram(1));
                weeklyProgramList.add(defineWeeklyProgram(2));
                weeklyProgramList.add(defineWeeklyProgram(3));
                weeklyProgramList.add(defineWeeklyProgram(4));
                weeklyProgramList.add(defineWeeklyProgram(5));
                break;
            case 6:
                weeklyProgramList.add(defineWeeklyProgram(1));
                weeklyProgramList.add(defineWeeklyProgram(2));
                weeklyProgramList.add(defineWeeklyProgram(3));
                weeklyProgramList.add(defineWeeklyProgram(4));
                weeklyProgramList.add(defineWeeklyProgram(5));
                weeklyProgramList.add(defineWeeklyProgram(6));

                break;
        }
        newTotalProgram.setWeeklyPrograms(weeklyProgramList);
        newTotalProgram.setCreatedBy(createRequestDto.getCreatedBy());
        return totalProgramRepository.postTotalProgram(newTotalProgram);
    }

    public static WeeklyProgramDto defineWeeklyProgram(int numbOfWeek) {
        WeeklyProgramDto weeklyProgramDto = new WeeklyProgramDto();
        weeklyProgramDto.setWeekNumber(numbOfWeek);

/*        List<DailyProgramDto> dailyProgramList = new ArrayList<>();

        dailyProgramList.add(defineDailyProgram(DayOfWeek.MONDAY));
        dailyProgramList.add(defineDailyProgram(DayOfWeek.TUESDAY));
        dailyProgramList.add(defineDailyProgram(DayOfWeek.WEDNESDAY));
        dailyProgramList.add(defineDailyProgram(DayOfWeek.THURSDAY));
        dailyProgramList.add(defineDailyProgram(DayOfWeek.FRIDAY));
        dailyProgramList.add(defineDailyProgram(DayOfWeek.SATURDAY));
        dailyProgramList.add(defineDailyProgram(DayOfWeek.SUNDAY));

        weeklyProgramDto.setDailyPrograms(dailyProgramList);*/
        return weeklyProgramDto;
    }

/*
   public static DailyProgramDto defineDailyProgram(DayOfWeek dayOfWeek) {
        DailyProgramDto dailyProgramDto = new DailyProgramDto();
        List<MoveDto> moveDtos = new ArrayList<>();
        dailyProgramDto.setMoveSet(moveDtos);
        dailyProgramDto.setDayOfWeek(dayOfWeek);
        return dailyProgramDto;
    }
*/

    @Override
    public String updateTotalProgramHandleDBRefs(TotalProgramDto totalProgramDto) throws RequestException {
        return updateTotalProgram(totalProgramDto);
    }

    public String updateTotalProgram(TotalProgramDto totalProgramDto) throws RequestException {
        return totalProgramRepository.updateTotalProgram(totalProgramDto);
    }


}
