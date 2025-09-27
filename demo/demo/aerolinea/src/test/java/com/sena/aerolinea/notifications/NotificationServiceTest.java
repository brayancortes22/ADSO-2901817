package com.sena.aerolinea.notifications;

import com.sena.aerolinea.notifications.entity.Notification;
import com.sena.aerolinea.notifications.repository.NotificationRepository;
import com.sena.aerolinea.notifications.service.NotificationService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.Optional;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class NotificationServiceTest {
    @Mock
    private NotificationRepository notificationRepository;

    @InjectMocks
    private NotificationService notificationService;

    public NotificationServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAll() {
        when(notificationRepository.findAll()).thenReturn(Collections.emptyList());
        List<Notification> notifications = notificationService.findAll();
        assertNotNull(notifications);
        assertEquals(0, notifications.size());
    }

    @Test
    void testSaveAndFindById() {
        Notification notification = new Notification();
        notification.setId(1L);
        notification.setMessage("Bienvenido");
        notification.setRecipient("usuario@correo.com");
        when(notificationRepository.save(any(Notification.class))).thenReturn(notification);
        when(notificationRepository.findById(1L)).thenReturn(Optional.of(notification));
        Notification saved = notificationService.save(notification);
        assertEquals("Bienvenido", saved.getMessage());
        Optional<Notification> found = notificationService.findById(1L);
        assertTrue(found.isPresent());
        assertEquals("usuario@correo.com", found.get().getRecipient());
    }

    @Test
    void testDeleteById() {
        doNothing().when(notificationRepository).deleteById(1L);
        notificationService.deleteById(1L);
        verify(notificationRepository, times(1)).deleteById(1L);
    }
}
