package com.tavisca.assignment.controllers;


import com.tavisca.assignment.domain.PlacesResponse;
import com.tavisca.assignment.locationServices.FindAPlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/app/V1"})
public class FindAPlaceController {

    FindAPlaceService findAPlaceService;

    @Autowired
    public FindAPlaceController(FindAPlaceService findAPlaceService) {
        this.findAPlaceService = findAPlaceService;
    }

    @RequestMapping({"/searchPlace/{input}"})
    public ResponseEntity<PlacesResponse> searchAPlace(@PathVariable String input) {
        return new ResponseEntity<>((PlacesResponse) findAPlaceService.findAPlace(input), HttpStatus.OK);
    }

}
