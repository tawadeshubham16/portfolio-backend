package com.example.portfolio.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortfolioController {

    @GetMapping("/")
    public String getPortfolio() {
        return "Portfolio data";
    }
}
