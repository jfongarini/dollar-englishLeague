package com.service;

import com.model.events.Event;
import com.model.football.Football;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FootballServiceImpl implements IFootballService{

    private static final String URL_LEAGUE = "https://www.thesportsdb.com/api/v1/json/2/lookuptable.php?l={league}&s={season}";
    private static final String URL_LAST_MATCH = "https://www.thesportsdb.com/api/v1/json/2/eventslast.php?id={id}";

    private Map<String, String> urlParams = new HashMap<>();

    @Autowired
    ConnectionService connectionService;

    @Override
    public Football getEngLeague(String league, String season) {
        this.urlParams.put("league",league);
        this.urlParams.put("season",season);

        Football football = new Football();
        return (Football) connectionService.getData(football,URL_LEAGUE,urlParams);
    }

    @Override
    public Event getManCityEvents(String id) {
        this.urlParams.put("id",id);

        Event event = new Event();
        return (Event) connectionService.getData(event,URL_LAST_MATCH,urlParams);
    }
}
