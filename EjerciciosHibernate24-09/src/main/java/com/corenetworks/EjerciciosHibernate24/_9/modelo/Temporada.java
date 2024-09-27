package com.corenetworks.EjerciciosHibernate24._9.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "temporada")
public class Temporada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTemporada;
    private int inicio;
    private int fin;

    @ManyToMany(mappedBy = "temporadas", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Piloto> pilotos = new HashSet<>();

    public Temporada(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    public String toString() {
        return "Temporada{" +
                "idTemporada=" + idTemporada +
                ", inicio=" + inicio +
                ", fin=" + fin +
                '}';
    }

    public long getIdTemporada() {
        return idTemporada;
    }

    public void setIdTemporada(long idTemporada) {
        this.idTemporada = idTemporada;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public Set<Piloto> getPilotos() {
        return pilotos;
    }

    public void setPilotos(Piloto piloto) {
        this.pilotos.add(piloto);
    }
}
