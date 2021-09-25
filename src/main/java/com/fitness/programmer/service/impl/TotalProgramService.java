package com.fitness.programmer.service.impl;

import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.model.dto.DailyProgramDto;
import com.fitness.programmer.model.dto.ProgramCreateRequestDto;
import com.fitness.programmer.model.dto.TotalProgramDto;
import com.fitness.programmer.model.dto.WeeklyProgramDto;
import com.fitness.programmer.model.enums.DayOfWeek;
import com.fitness.programmer.repository.ITotalProgramRepository;
import com.fitness.programmer.service.ITotalProgramService;
import com.fitness.programmer.service.IWeeklyProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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
        }
        newTotalProgram.setWeeklyPrograms(weeklyProgramList);
        return totalProgramRepository.postTotalProgram(newTotalProgram);
    }

    public static WeeklyProgramDto defineWeeklyProgram(int numbOfWeek) {
        WeeklyProgramDto weeklyProgramDto = new WeeklyProgramDto();
        weeklyProgramDto.setWeekNumber(numbOfWeek);

        List<DailyProgramDto> dailyProgramList = new ArrayList<>();

        DailyProgramDto dailyProgramDtoMonday = new DailyProgramDto();
        dailyProgramDtoMonday.setDayOfWeek(DayOfWeek.MONDAY);
        dailyProgramList.add(dailyProgramDtoMonday);

        DailyProgramDto dailyProgramTuesday = new DailyProgramDto();
        dailyProgramTuesday.setDayOfWeek(DayOfWeek.TUESDAY);
        dailyProgramList.add(dailyProgramTuesday);

        DailyProgramDto dailyProgramDtoWednesday = new DailyProgramDto();
        dailyProgramDtoWednesday.setDayOfWeek(DayOfWeek.WEDNESDAY);
        dailyProgramList.add(dailyProgramDtoWednesday);

        DailyProgramDto dailyProgramDtoThursday = new DailyProgramDto();
        dailyProgramDtoThursday.setDayOfWeek(DayOfWeek.THURSDAY);
        dailyProgramList.add(dailyProgramDtoThursday);

        DailyProgramDto dailyProgramDtoFriday = new DailyProgramDto();
        dailyProgramDtoFriday.setDayOfWeek(DayOfWeek.FRIDAY);
        dailyProgramList.add(dailyProgramDtoFriday);

        DailyProgramDto dailyProgramDtoSaturday = new DailyProgramDto();
        dailyProgramDtoSaturday.setDayOfWeek(DayOfWeek.SATURDAY);
        dailyProgramList.add(dailyProgramDtoSaturday);

        DailyProgramDto dailyProgramSunday = new DailyProgramDto();
        dailyProgramSunday.setDayOfWeek(DayOfWeek.SUNDAY);
        dailyProgramList.add(dailyProgramSunday);

        weeklyProgramDto.setDailyPrograms(dailyProgramList);
        return weeklyProgramDto;
    }

    @Override
    public String updateTotalProgramHandleDBRefs(TotalProgramDto totalProgramDto) throws RequestException {
        return updateTotalProgram(totalProgramDto);
    }

    public String updateTotalProgram(TotalProgramDto totalProgramDto) throws RequestException {
        return totalProgramRepository.updateTotalProgram(totalProgramDto);
    }


}
