package com.tavisca.assignment.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "formatted_address",
        "geometry",
        "name",
        "opening_hours",
        "photos",
        "rating"
})

@Data
public class Place {

    @JsonProperty("formatted_address")
    private String formattedAddress;
    @JsonProperty("geometry")
    private Geometry geometry;
    @JsonProperty("name")
    private String name;
    @JsonProperty("opening_hours")
    private OpeningHours openingHours;
    @JsonProperty("photos")
    private List<Photo> photos = null;
    @JsonProperty("rating")
    private Double rating;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


}
