package com.migurd.PrimeraApi.Controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.migurd.PrimeraApi.Models.Saludo;
import com.migurd.PrimeraApi.Services.SaludoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/saludo/v1")
@RequiredArgsConstructor
@Validated
public class SaludoController {

    private final SaludoService saludoService;

    @GetMapping("/test")
    public String test() {
        return "Hello, World!";
    }

    @GetMapping("/")
    public ResponseEntity<List<Saludo>> getAllSaludos() {
        return ResponseEntity.ok().body(saludoService.getAllSaludos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Saludo> getSaludoById(@PathVariable UUID id) {
        return ResponseEntity.ok().body(saludoService.getSaludoById(id));
    }

    @PostMapping("/")
    public ResponseEntity<Saludo> createSaludo(@RequestBody Saludo saludo) {
        return ResponseEntity.ok().body(saludoService.createSaludo(saludo));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Saludo> updateSaludo(@PathVariable UUID id, @RequestBody Saludo saludo) {
        return ResponseEntity.ok().body(saludoService.updateSaludo(id, saludo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSaludo(@PathVariable UUID id) {
        saludoService.deleteSaludo(id);
        return ResponseEntity.ok().build();
    }
}
