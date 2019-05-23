package com.tavisca.assignment.clients.googleClients;

import com.tavisca.assignment.domain.PlacesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class GoogleClient {

    public static final String GAPI_BASE_URL = "https://maps.googleapis.com/maps/api/place/findplacefromtext/json";
    private static final String GAPI_KEY = "AIzaSyDCCUVqrzmMur5fKVMqPcEa9YV6jVBGp8E";
    RestTemplate restTemplate;

    @Autowired
    public GoogleClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public PlacesResponse findAPlace(String input) {
        HttpEntity httpEntity = new HttpEntity(getDefaultHeaders());
        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.
                fromUriString(GAPI_BASE_URL).
                queryParam("input", input).
                queryParam("inputtype", "textquery").
                queryParam("fields", "photos,formatted_address,name,rating,opening_hours,geometry").
                queryParam("key", GAPI_KEY);

        PlacesResponse response = restTemplate.getForObject(uriComponentsBuilder.toUriString(), PlacesResponse.class);
        System.out.println(response);
        return response;
    }

    private HttpHeaders getDefaultHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.ACCEPT, MediaType.ALL_VALUE);
        return headers;

    }

}
