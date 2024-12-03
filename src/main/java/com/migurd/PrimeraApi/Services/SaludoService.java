package com.migurd.PrimeraApi.Services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.migurd.PrimeraApi.Models.Saludo;
import com.migurd.PrimeraApi.Repositories.SaludoRepo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class SaludoService {

    private final SaludoRepo saludoRepo;

    public List<Saludo> getAllSaludos() {
        return saludoRepo.findAll();
    }

    public Saludo getSaludoById(UUID id) {
        return saludoRepo.findById(id).orElse(null);
    }

    public Saludo createSaludo(Saludo saludo) {
        return saludoRepo.save(saludo);
    }

    public Saludo updateSaludo(UUID id, Saludo saludo) {
        Saludo saludoToUpdate = saludoRepo.findById(id).orElse(null);
        if (saludoToUpdate == null) {
            return null;
        }
        saludoToUpdate.setSaludo(saludo.getSaludo());
        return saludoRepo.save(saludoToUpdate);
    }

    public void deleteSaludo(UUID id) {
        saludoRepo.deleteById(id);
    }

}
