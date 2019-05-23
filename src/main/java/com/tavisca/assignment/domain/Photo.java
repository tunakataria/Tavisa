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
        "height",
        "html_attributions",
        "photo_reference",
        "width"
})

@Data
public class Photo {

    @JsonProperty("height")
    private Integer height;
    @JsonProperty("html_attributions")
    private List<String> htmlAttributions = null;
    @JsonProperty("photo_reference")
    private String photoReference;
    @JsonProperty("width")
    private Integer width;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
