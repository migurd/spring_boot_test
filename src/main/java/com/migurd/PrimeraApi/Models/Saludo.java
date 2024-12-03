package com.migurd.PrimeraApi.Models;

import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "saludo")
public class Saludo {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;
    private String saludo;
}
