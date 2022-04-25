package com.service;

import com.model.football.Table;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatsFootballService {

    //crear estadisticas de quien gano mas partidos, quien mas partidos ganados. etc

    public Table getMostDraws(List<Table> tableList){
        Table winner = new Table();
        int record = 0;
        for (Table team:tableList) {
            if (Integer.parseInt(team.getIntDraw()) > record){
                record = Integer.parseInt(team.getIntDraw());
                winner = team;
            }
        }
        return winner;
    }

    public Table getMostGoalsAgainst(List<Table> tableList){
        Table winner = new Table();
        int record = 0;
        for (Table team:tableList) {
            if (Integer.parseInt(team.getIntGoalsAgainst()) > record){
                record = Integer.parseInt(team.getIntGoalsAgainst());
                winner = team;
            }
        }
        return winner;
    }

    public Table getMostGoalsFor(List<Table> tableList){
        Table winner = new Table();
        int record = 0;
        for (Table team:tableList) {
            if (Integer.parseInt(team.getIntGoalsFor()) > record){
                record = Integer.parseInt(team.getIntGoalsFor());
                winner = team;
            }
        }
        return winner;
    }

}
