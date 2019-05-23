package com.tavisca.assignment.locationServices;

import com.tavisca.assignment.domain.Place;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile(value = "4Square")
public class FindAPlace4Square implements FindAPlaceService {
    @Override
    public Place findAPlace(String location) {
        return null;
    }
}
