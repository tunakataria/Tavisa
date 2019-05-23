package com.tavisca.assignment.locationServices;


import org.springframework.stereotype.Service;

@Service
public interface FindAPlaceService<T> {

    T findAPlace(String location);


}
