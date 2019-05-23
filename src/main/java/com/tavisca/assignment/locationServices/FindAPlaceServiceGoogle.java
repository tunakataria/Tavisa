package com.tavisca.assignment.locationServices;


import com.tavisca.assignment.clients.googleClients.GoogleClient;
import com.tavisca.assignment.domain.PlacesResponse;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile(value = "Google")
public class FindAPlaceServiceGoogle implements FindAPlaceService<PlacesResponse> {


    GoogleClient googleClient;

    public FindAPlaceServiceGoogle(GoogleClient googleClient) {
        this.googleClient = googleClient;
    }

    @Override
    public PlacesResponse findAPlace(String placeName) {
        return googleClient.findAPlace(placeName);
    }
}
