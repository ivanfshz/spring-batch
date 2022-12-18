package com.spring.batch.reports.controller;

import com.spring.batch.reports.client.CountriesRestClient;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/countries")
public class CountryController {

    private static final Logger logger = LoggerFactory.getLogger(CountryController.class);

    private final CountriesRestClient countriesRestClient;

    @GetMapping("/lan/{lan}")
    public List countriesByLanguage(@PathVariable(value = "lan") String lan) {
        List result = countriesRestClient.getCountriesByLanguage(lan);
        logger.info("result: {}", result);
        return result;
    }
}