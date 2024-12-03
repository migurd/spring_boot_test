package com.migurd.PrimeraApi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.migurd.PrimeraApi.Models.Saludo;

import java.util.UUID;

public interface SaludoRepo extends JpaRepository<Saludo, UUID> {
}
