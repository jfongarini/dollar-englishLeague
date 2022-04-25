package com.service;

import com.model.events.Event;
import com.model.football.Football;
import org.springframework.stereotype.Service;

@Service
public interface IFootballService {
    public Football getEngLeague(String league,String season);
    public Event getManCityEvents(String id);
}
