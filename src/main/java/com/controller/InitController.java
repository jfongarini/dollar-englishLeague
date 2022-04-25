package com.controller;

import com.model.dollar.Dollar;
import com.model.events.Result;
import com.model.football.Table;
import com.model.youtube.YTVideo;
import com.model.youtube.YouTube;
import com.service.IDollarService;
import com.service.IFootballService;
import com.service.IYouTubeService;
import com.service.StatsFootballService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@Slf4j
public class InitController {

    @Autowired
    private IDollarService iDollarService;

    @Autowired
    private IFootballService iFootballService;

    @Autowired
    private StatsFootballService statsService;

    @Autowired
    private IYouTubeService iYouTubeService;

    @GetMapping("/")
    public String init(Model model) {

        //Dollar
        Dollar dollarOficial = iDollarService.getDolarOficial();
        Dollar dollarBlue = iDollarService.getDolarBlue();
        Dollar dollarBolsa = iDollarService.getDolarBolsa();

        model.addAttribute("dollarOficial", dollarOficial);
        model.addAttribute("dollarBlue", dollarBlue);
        model.addAttribute("dollarBolsa", dollarBolsa);

        return "index";
    }

    @GetMapping("/epl")
    public String epl(Model model) {

        //Table List
        List<Table> tableList = iFootballService.getEngLeague("4328", "2021-2022").getTable();
        //log.info(tableList.get(0).getIntRank());
        model.addAttribute("tableList", tableList);

        //Stats
        Table mostDraws = statsService.getMostDraws(tableList);
        model.addAttribute("mostDrawsTeam", mostDraws.getStrTeam());
        model.addAttribute("mostDrawsNumber", mostDraws.getIntDraw());
        model.addAttribute("mostDrawsIcon",mostDraws.getStrTeamBadge());

        Table mostAgainst = statsService.getMostGoalsAgainst(tableList);
        model.addAttribute("mostAgainstTeam", mostAgainst.getStrTeam());
        model.addAttribute("mostAgainstNumber", mostAgainst.getIntGoalsAgainst());
        model.addAttribute("mostAgainstIcon",mostAgainst.getStrTeamBadge());

        Table mostFor = statsService.getMostGoalsFor(tableList);
        model.addAttribute("mostForTeam", mostFor.getStrTeam());
        model.addAttribute("mostForNumber", mostFor.getIntGoalsFor());
        model.addAttribute("mostForIcon",mostFor.getStrTeamBadge());


        return "epl";
    }

    @GetMapping("/mc")
    public String mc(Model model) {

        //Result List
        List<Result> resultList = iFootballService.getManCityEvents("133613").getResults();
        for (Result resul:resultList){
            if (!resul.getStrVideo().isEmpty()) {
                String video = resul.getStrVideo();
                String[] parts = video.split("=");
                resul.setStrVideo(parts[1]);
            }
        }
        model.addAttribute("resultList",resultList);

        return "mc";
    }

}
