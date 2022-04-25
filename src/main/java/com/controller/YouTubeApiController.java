package com.controller;

import com.model.youtube.YTVideo;
import com.model.youtube.YouTube;
import com.service.IYouTubeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/youtube")
public class YouTubeApiController {

    private String q;

    @Autowired private IYouTubeService iYouTubeService;

    @GetMapping("/")
    public String getYouTube(){

        this.q = "highlights Man City 0-0 Sporting CP";
        YTVideo ytVideo = new YTVideo(this.q);
        YouTube youTube = iYouTubeService.getYoutube(ytVideo);
        return "https://www.youtube.com/watch?v="+youTube.getItems().get(0).getId().getVideoId().toString();
    }


}
