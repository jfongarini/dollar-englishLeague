package com.service;

import com.model.youtube.YTVideo;
import com.model.youtube.YouTube;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class YouTubeServiceImpl implements IYouTubeService{

    private static final String URL="https://www.googleapis.com/youtube/v3/search?part={part}&q={q}&channelId={channelId}&maxResults={maxResults}&key={key}";

    @Autowired
    ConnectionService connectionService;

    @Override
    public YouTube getYoutube(YTVideo ytVideo) {
        Map<String, String> urlParams = new HashMap<>();
        urlParams.put("part", ytVideo.getPART());
        urlParams.put("q",ytVideo.getQ());
        urlParams.put("channelId",ytVideo.getCHANNELID());
        urlParams.put("maxResults",ytVideo.getMAXRESULTS());
        urlParams.put("key",ytVideo.getKEY());

        YouTube tube = new YouTube();

        return (YouTube) connectionService.getData(tube,URL,urlParams);

    }
}
