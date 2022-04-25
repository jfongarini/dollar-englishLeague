package com.service;

import com.model.dollar.Dollar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DollarServiceImpl implements IDollarService {

    private static final String URL_OFICIAL = "https://api-dolar-argentina.herokuapp.com/api/dolaroficial";
    private static final String URL_BLUE = "https://api-dolar-argentina.herokuapp.com/api/dolarblue";
    private static final String URL_BOLSA = "https://api-dolar-argentina.herokuapp.com/api/dolarbolsa";

    private Map<String, String> urlParams = new HashMap<>();
    private Dollar dollar = new Dollar();

    @Autowired
    ConnectionService connectionService;

    @Override
    public Dollar getDolarOficial() {
        return (Dollar) connectionService.getData(this.dollar,URL_OFICIAL,this.urlParams);
    }

    @Override
    public Dollar getDolarBlue() {
        return (Dollar) connectionService.getData(this.dollar,URL_BLUE,this.urlParams);
    }

    @Override
    public Dollar getDolarBolsa() {
        return (Dollar) connectionService.getData(this.dollar,URL_BOLSA,this.urlParams);
    }
}
