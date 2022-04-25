package com.service;

import com.model.dollar.Dollar;
import org.springframework.stereotype.Service;

@Service
public interface IDollarService {
    public Dollar getDolarOficial();
    public Dollar getDolarBlue();
    public Dollar getDolarBolsa();
}
