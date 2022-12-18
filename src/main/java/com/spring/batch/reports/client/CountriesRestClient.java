package com.spring.batch.reports.client;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class CountriesRestClient {
    
    private final RestTemplate restTemplate;
    public List getCountriesByLanguage(final String language) {

        Object[] countries = restTemplate.getForObject("https://restcountries.com/v2/lang/{language}",
                                                       Object[].class,
                                                       language);
         return Arrays.asList(countries);

    }
}