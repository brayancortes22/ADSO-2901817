package com.sena.aerolinea.geolocation;

import com.sena.aerolinea.geolocation.entity.City;
import com.sena.aerolinea.geolocation.repository.CityRepository;
import com.sena.aerolinea.geolocation.service.CityService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Optional;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CityServiceTest {
    @Mock
    private CityRepository cityRepository;

    @InjectMocks
    private CityService cityService;

    public CityServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAll() {
        when(cityRepository.findAll()).thenReturn(Collections.emptyList());
        List<City> cities = cityService.findAll();
        assertNotNull(cities);
        assertEquals(0, cities.size());
    }

    @Test
    void testSaveAndFindById() {
        City city = new City();
        city.setId(1L);
        city.setName("Bogotá");
        city.setState("Cundinamarca");
        when(cityRepository.save(any(City.class))).thenReturn(city);
        when(cityRepository.findById(1L)).thenReturn(Optional.of(city));
        City saved = cityService.save(city);
        assertEquals("Bogotá", saved.getName());
        Optional<City> found = cityService.findById(1L);
        assertTrue(found.isPresent());
        assertEquals("Cundinamarca", found.get().getState());
    }

    @Test
    void testDeleteById() {
        doNothing().when(cityRepository).deleteById(1L);
        cityService.deleteById(1L);
        verify(cityRepository, times(1)).deleteById(1L);
    }
}
