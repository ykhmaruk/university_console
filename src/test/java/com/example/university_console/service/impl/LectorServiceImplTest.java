package com.example.university_console.service.impl;

import com.example.university_console.entity.Lector;
import com.example.university_console.repository.LectorRepository;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class LectorServiceImplTest {
    @InjectMocks
    private LectorServiceImpl lectorService;
    @Mock
    private LectorRepository lectorRepository;

    @Test
    void testGetNamesByTemplate_Ok() {
        String template = "Black";
        List<Lector> lectors = new ArrayList<>();
        Lector black = new Lector();
        black.setFullName("Black Dilan");
        lectors.add(black);
        Lector alice = new Lector();
        alice.setFullName("Alice Black");
        lectors.add(alice);
        Mockito.when(lectorRepository.findAllByFullNameContainingIgnoreCase(template)).thenReturn(lectors);

        List<String> result = lectorService.getNamesByTemplate(template);

        assertEquals(2, result.size());
        assertEquals(black.getFullName(), result.get(0));
        assertEquals(alice.getFullName(), result.get(1));
    }

    @Test
    void testGetNamesByTemplateNoMatches() {
        String template = "Smith";
        List<Lector> lectors = new ArrayList<>();
        Mockito.when(lectorRepository.findAllByFullNameContainingIgnoreCase(template)).thenReturn(lectors);

        List<String> result = lectorService.getNamesByTemplate(template);

        assertEquals(0, result.size());
    }
}