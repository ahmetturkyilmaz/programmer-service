package com.fitness.programmer.controller;

import com.fitness.programmer.configuration_handlers.JWTUtils;
import com.fitness.programmer.exception.RequestException;
import com.fitness.programmer.exception.UserNotAuthorizedException;
import com.fitness.programmer.model.dto.DailyProgramDto;
import com.fitness.programmer.model.dto.DailyProgramGetRequest;
import com.fitness.programmer.service.IDailyProgramService;
import com.fitness.programmer.service.ITotalProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/daily-program")

public class DailyProgramController extends BaseController {
    @Autowired
    private IDailyProgramService dailyProgramService;

    @Autowired
    ITotalProgramService totalProgramService;

    @Autowired
    JWTUtils jwtUtils;

    @GetMapping("/week")
    public List<DailyProgramDto> getDailyProgramsByWeek(HttpServletRequest httpServletRequest, DailyProgramGetRequest getRequest) throws UserNotAuthorizedException {
        String username = jwtUtils.getUsernameByJWT(httpServletRequest.getHeader("Authorization").substring(7));

        return dailyProgramService.getDailyProgramsByWeek(getRequest, username);

    }

    @GetMapping("/all")
    public List<DailyProgramDto> getAllDailyPrograms(HttpServletRequest httpServletRequest, DailyProgramGetRequest getRequest) throws UserNotAuthorizedException {
        String username = jwtUtils.getUsernameByJWT(httpServletRequest.getHeader("Authorization").substring(7));

        return dailyProgramService.getDailyProgramsByTotalProgram(getRequest, username);

    }

    @GetMapping("/{id}")
    public DailyProgramDto getDailyProgramById(@PathVariable String id) throws RequestException {
        return dailyProgramService.getDailyProgramById(id);
    }

    @PostMapping()
    public DailyProgramDto postDailyProgram(DailyProgramDto dailyProgramDto) {
        return dailyProgramService.postDailyProgram(dailyProgramDto);
    }

    @PutMapping()
    public DailyProgramDto putDailyProgram(DailyProgramDto dailyProgramDto) {
        return dailyProgramService.updateDailyProgram(dailyProgramDto);
    }

    @DeleteMapping("/{id}")
    public void deleteDailyProgramById(@PathVariable String id) {
        dailyProgramService.deleteDailyProgram(id);
    }

    @DeleteMapping("/all/{id}")
    public void deleteDailyProgramsTotalProgramId(@PathVariable String id) {
        dailyProgramService.deleteDailyProgramsByTotalProgramId(id);
    }
}
