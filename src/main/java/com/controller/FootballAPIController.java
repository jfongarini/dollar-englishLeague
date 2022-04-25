package com.controller;

import com.model.events.Event;
import com.model.football.Football;
import com.service.IFootballService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/football")
public class FootballAPIController {

    @Autowired private IFootballService iFootballService;

    @GetMapping("/eng")
    public String getEngLeague(){
        Football football = iFootballService.getEngLeague("4328", "2021-2022");
        return football.toString();
    }

    @GetMapping("/mc")
    public String getManCityEvents(){
        Event event = iFootballService.getManCityEvents("133613");
        return event.toString();
    }



}
