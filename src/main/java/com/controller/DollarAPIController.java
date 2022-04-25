package com.controller;

import com.service.IDollarService;
import com.model.dollar.Dollar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dolar")
public class DollarAPIController {

    @Autowired private IDollarService iDollarService;

    @GetMapping("/dolaroficial")
    public ResponseEntity<Dollar> getDolarOficial(){
        Dollar dollar = iDollarService.getDolarOficial();
        //return dollar.toString();
        return new ResponseEntity<Dollar>(dollar, HttpStatus.OK);
    }

    @GetMapping("/dolarblue")
    public String getDolarBlue(){
        Dollar dollar = iDollarService.getDolarBlue();
        return dollar.toString();
    }

    @GetMapping("/dolarbolsa")
    public String getDolarBolsa(){
        Dollar dollar = iDollarService.getDolarBolsa();
        return dollar.toString();
    }
}
