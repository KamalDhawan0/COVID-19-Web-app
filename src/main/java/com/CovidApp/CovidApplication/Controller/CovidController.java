package com.CovidApp.CovidApplication.Controller;


import com.CovidApp.CovidApplication.Service.CovidDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/covid-data")
public class CovidController {

    @Autowired
    CovidDataService covidDataService;

    @GetMapping("/citywise/{city}")
    public String getCovidCases(@PathVariable  String city){
       Integer covidData = covidDataService.getCovidData(city);
        return "Covid Active Cases in "+city+"="+covidData;
    }
}
