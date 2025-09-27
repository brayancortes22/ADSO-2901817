package com.sena.aerolinea.passengersservices;

import com.sena.aerolinea.passengersservices.entity.Passenger;
import com.sena.aerolinea.passengersservices.repository.PassengerRepository;
import com.sena.aerolinea.passengersservices.service.PassengerService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Optional;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PassengerServiceTest {
    @Mock
    private PassengerRepository passengerRepository;

    @InjectMocks
    private PassengerService passengerService;

    public PassengerServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAll() {
        when(passengerRepository.findAll()).thenReturn(Collections.emptyList());
        List<Passenger> passengers = passengerService.findAll();
        assertNotNull(passengers);
        assertEquals(0, passengers.size());
    }

    @Test
    void testSaveAndFindById() {
        Passenger passenger = new Passenger();
        passenger.setId(1L);
        passenger.setFirstName("Ana");
        passenger.setLastName("Gómez");
        passenger.setDocumentNumber("123456789");
        when(passengerRepository.save(any(Passenger.class))).thenReturn(passenger);
        when(passengerRepository.findById(1L)).thenReturn(Optional.of(passenger));
        Passenger saved = passengerService.save(passenger);
        assertEquals("Ana", saved.getFirstName());
        Optional<Passenger> found = passengerService.findById(1L);
        assertTrue(found.isPresent());
        assertEquals("123456789", found.get().getDocumentNumber());
    }

    @Test
    void testDeleteById() {
        doNothing().when(passengerRepository).deleteById(1L);
        passengerService.deleteById(1L);
        verify(passengerRepository, times(1)).deleteById(1L);
    }
}
