package com.sena.aerolinea.aircraftmanagement;

import com.sena.aerolinea.aircraftmanagement.entity.Aircraft;
import com.sena.aerolinea.aircraftmanagement.repository.AircraftRepository;
import com.sena.aerolinea.aircraftmanagement.service.AircraftService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Optional;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AircraftServiceTest {
    @Mock
    private AircraftRepository aircraftRepository;

    @InjectMocks
    private AircraftService aircraftService;

    public AircraftServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAll() {
        when(aircraftRepository.findAll()).thenReturn(Collections.emptyList());
        List<Aircraft> aircrafts = aircraftService.findAll();
        assertNotNull(aircrafts);
        assertEquals(0, aircrafts.size());
    }

    @Test
    void testSaveAndFindById() {
        Aircraft aircraft = new Aircraft();
        aircraft.setId(1L);
        aircraft.setModel("Boeing 737");
        aircraft.setRegistration("N12345");
        aircraft.setCapacity(180);
        when(aircraftRepository.save(any(Aircraft.class))).thenReturn(aircraft);
        when(aircraftRepository.findById(1L)).thenReturn(Optional.of(aircraft));
        Aircraft saved = aircraftService.save(aircraft);
        assertEquals("Boeing 737", saved.getModel());
        Optional<Aircraft> found = aircraftService.findById(1L);
        assertTrue(found.isPresent());
        assertEquals(180, found.get().getCapacity());
    }

    @Test
    void testDeleteById() {
        doNothing().when(aircraftRepository).deleteById(1L);
        aircraftService.deleteById(1L);
        verify(aircraftRepository, times(1)).deleteById(1L);
    }
}
