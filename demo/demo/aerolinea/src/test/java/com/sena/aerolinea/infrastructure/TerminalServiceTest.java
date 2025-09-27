package com.sena.aerolinea.infrastructure;

import com.sena.aerolinea.infrastructure.entity.Terminal;
import com.sena.aerolinea.infrastructure.repository.TerminalRepository;
import com.sena.aerolinea.infrastructure.service.TerminalService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Optional;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class TerminalServiceTest {
    @Mock
    private TerminalRepository terminalRepository;

    @InjectMocks
    private TerminalService terminalService;

    public TerminalServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAll() {
        when(terminalRepository.findAll()).thenReturn(Collections.emptyList());
        List<Terminal> terminals = terminalService.findAll();
        assertNotNull(terminals);
        assertEquals(0, terminals.size());
    }

    @Test
    void testSaveAndFindById() {
        Terminal terminal = new Terminal();
        terminal.setId(1L);
        terminal.setName("Terminal 1");
        terminal.setLocation("Zona A");
        when(terminalRepository.save(any(Terminal.class))).thenReturn(terminal);
        when(terminalRepository.findById(1L)).thenReturn(Optional.of(terminal));
        Terminal saved = terminalService.save(terminal);
        assertEquals("Terminal 1", saved.getName());
        Optional<Terminal> found = terminalService.findById(1L);
        assertTrue(found.isPresent());
        assertEquals("Zona A", found.get().getLocation());
    }

    @Test
    void testDeleteById() {
        doNothing().when(terminalRepository).deleteById(1L);
        terminalService.deleteById(1L);
        verify(terminalRepository, times(1)).deleteById(1L);
    }
}
