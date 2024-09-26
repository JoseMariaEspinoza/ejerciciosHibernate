package com.corenetworks.EjerciciosHibernate24._9.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "nif")
public class Nif {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idNif;
    private char letra;
    private long numero;
}
