package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;

@Service
public class ConnectionService {

    @Autowired
    private RestTemplate restTemplate;

    public Object getData(Object obj, String URL, Map<String,String> urlParams){
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(URL);
        return restTemplate.getForObject(builder.buildAndExpand(urlParams).toUri(), obj.getClass());
    }
}
