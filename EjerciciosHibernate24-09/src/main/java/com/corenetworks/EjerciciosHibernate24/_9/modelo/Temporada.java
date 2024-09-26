package com.corenetworks.EjerciciosHibernate24._9.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "temporada")
public class Temporada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTemporada;
    private int inicio;
    int fin;

    @ManyToMany(mappedBy = "temporadas",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    Set<Piloto> pilotos;
}
