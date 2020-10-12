package com.example.hotelview.controller;

import com.example.hotelview.model.Booking;
import com.example.hotelview.model.CaseSupport;
import com.example.hotelview.model.Deal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class ViewController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(path = "/bookings")
    public List<Booking> getbookings() {
        ResponseEntity<Booking[]> response = restTemplate.getForEntity("http://localhost:8081/bookings",
                Booking[].class);
        Booking[] bookings = response.getBody();
        return Arrays.asList(bookings);
    }

    @GetMapping(path = "/deals")
    public List<Deal> getDeals() {
        ResponseEntity<Deal[]> response = restTemplate.getForEntity("http://localhost:8082/deals",
                Deal[].class);
        Deal[] deals = response.getBody();
        return Arrays.asList(deals);
    }

    @GetMapping(path = "/cases")
    public List<CaseSupport> getCases() {
        ResponseEntity<CaseSupport[]> response = restTemplate.getForEntity("http://localhost:8083/cases",
                CaseSupport[].class);
        CaseSupport[] cases = response.getBody();
        return Arrays.asList(cases);
    }
}