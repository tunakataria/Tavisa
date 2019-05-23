package com.tavisca.assignment.clients.googleClients;

import com.tavisca.assignment.domain.Place;
import com.tavisca.assignment.domain.PlacesResponse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class GoogleClientTest {

    GoogleClient objectUnderTest;

    @Mock
    RestTemplate restTemplate;

    PlacesResponse placesResponse = new PlacesResponse();

    @Before
    public void setUp() {
        initMocks(this);

        objectUnderTest = new GoogleClient(restTemplate);
        Place place = new Place();
        place.setName("Pune");

        List<Place> places = new ArrayList<>();
        places.add(place);

        placesResponse.setCandidates(places);
    }

    @Test
    public void findAPlace() {

        //Given
        when(restTemplate.getForObject(anyString(), any())).thenReturn(placesResponse);

        //When
        PlacesResponse response = objectUnderTest.findAPlace("Pune");

        //Then
        Assert.assertNotNull(response);
        Assert.assertTrue(response.getCandidates().get(0).getName().equals("Pune"));
    }
}