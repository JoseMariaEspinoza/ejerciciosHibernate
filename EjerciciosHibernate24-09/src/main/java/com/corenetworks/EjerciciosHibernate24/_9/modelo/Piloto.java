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
@Table(name = "piloto")
public class Piloto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPiloto;
    private String nombre;
    private int edad;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_facturacion", nullable = false,
            foreignKey = @ForeignKey(name = "FK_piloto_facturacion"))
    private Facturacion facturacion;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_nif", nullable = false,
            foreignKey = @ForeignKey(name = "FK_piloto_nif"))
    private Nif nif;

    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinColumn(name = "id_escuderia", nullable = false,
            foreignKey = @ForeignKey(name = "FK_pilotos_escuderia"))
    private Escuderia escuderia;

    @OneToMany(mappedBy = "piloto", cascade = CascadeType.ALL,
            orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<Telefono> telefonos = new HashSet<>();

    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST,
            CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinTable(name = "pilotos_temporadas",
            joinColumns = @JoinColumn(name = "id_piloto", referencedColumnName = "idPiloto"),
            inverseJoinColumns = @JoinColumn(name = "id_temporada", referencedColumnName = "idTemporada"))
    private Set<Temporada> temporadas = new HashSet<>();

    public Piloto(String nombre, int edad, Facturacion facturacion, Nif nif, Escuderia escuderia) {
        this.nombre = nombre;
        this.edad = edad;
        this.facturacion = facturacion;
        this.nif = nif;
        this.escuderia = escuderia;
    }

    @Override
    public String toString() {
        return "\nPiloto{" +
                "idPiloto=" + idPiloto +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", facturacion=" + facturacion +
                ", nif=" + nif +
                ", telefonos=" + telefonos +
                ", temporadas=" + temporadas +
                "}\n";
    }

    public long getIdPiloto() {
        return idPiloto;
    }

    public void setIdPiloto(long idPiloto) {
        this.idPiloto = idPiloto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Facturacion getFacturacion() {
        return facturacion;
    }

    public void setFacturacion(Facturacion facturacion) {
        this.facturacion = facturacion;
    }

    public Nif getNif() {
        return nif;
    }

    public void setNif(Nif nif) {
        this.nif = nif;
    }

    public Escuderia getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(Escuderia escuderia) {
        this.escuderia = escuderia;
    }

    public Set<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(Telefono telefono) {
        this.telefonos.add(telefono);
    }

    public Set<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Temporada temporada) {
        this.temporadas.add(temporada);
    }
}
