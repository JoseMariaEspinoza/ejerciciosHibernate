package com.corenetworks.EjerciciosHibernate24._9.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "escuderia")
public class Escuderia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEscuderia;
    private String nombre;
    private String pais;

    @OneToMany(mappedBy = "escuderia", cascade = CascadeType.ALL,
            orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Piloto> pilotos = new HashSet<>();

    public Escuderia(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Escuderia{" +
                "idEscuderia=" + idEscuderia +
                ", nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", pilotos=" + pilotos +
                '}';
    }

    public long getIdEscuderia() {
        return idEscuderia;
    }

    public void setIdEscuderia(long idEscuderia) {
        this.idEscuderia = idEscuderia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Set<Piloto> getPilotos() {
        return pilotos;
    }

    public void setPilotos(Piloto piloto) {
        this.pilotos.add(piloto);
    }
}
