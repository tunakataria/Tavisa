package com.tavisca.assignment.domain;

import lombok.Data;

import java.util.List;

@Data
public class PlacesResponse {
    private List<Place> candidates;
    private String error_message;
    private String status;
}
