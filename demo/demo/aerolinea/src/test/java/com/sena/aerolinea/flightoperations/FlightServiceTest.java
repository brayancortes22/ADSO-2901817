package com.sena.aerolinea.flightoperations;

import com.sena.aerolinea.flightoperations.entity.Flight;
import com.sena.aerolinea.flightoperations.repository.FlightRepository;
import com.sena.aerolinea.flightoperations.service.FlightService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Optional;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class FlightServiceTest {
    @Mock
    private FlightRepository flightRepository;

    @InjectMocks
    private FlightService flightService;

    public FlightServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAll() {
        when(flightRepository.findAll()).thenReturn(Collections.emptyList());
        List<Flight> flights = flightService.findAll();
        assertNotNull(flights);
        assertEquals(0, flights.size());
    }

    @Test
    void testSaveAndFindById() {
        Flight flight = new Flight();
        flight.setId(1L);
        flight.setCode("F123");
        flight.setOrigin("BOG");
        flight.setDestination("MDE");
        when(flightRepository.save(any(Flight.class))).thenReturn(flight);
        when(flightRepository.findById(1L)).thenReturn(Optional.of(flight));
        Flight saved = flightService.save(flight);
        assertEquals("F123", saved.getCode());
        Optional<Flight> found = flightService.findById(1L);
        assertTrue(found.isPresent());
        assertEquals("MDE", found.get().getDestination());
    }

    @Test
    void testDeleteById() {
        doNothing().when(flightRepository).deleteById(1L);
        flightService.deleteById(1L);
        verify(flightRepository, times(1)).deleteById(1L);
    }
}
