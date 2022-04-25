package com.service;

import com.model.youtube.YTVideo;
import com.model.youtube.YouTube;
import org.springframework.stereotype.Service;

@Service
public interface IYouTubeService {

    public YouTube getYoutube(YTVideo ytVideo);

}
