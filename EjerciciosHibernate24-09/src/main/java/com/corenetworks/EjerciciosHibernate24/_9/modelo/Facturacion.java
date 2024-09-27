package com.corenetworks.EjerciciosHibernate24._9.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "facturacion")
public class Facturacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFacturacion;
    private int sueldo;
    private int privacidad;

    @OneToOne(mappedBy = "facturacion", cascade = CascadeType.ALL,
            orphanRemoval = true, fetch = FetchType.EAGER)
    private Piloto piloto;

    public Facturacion(int sueldo, int privacidad) {
        this.sueldo = sueldo;
        this.privacidad = privacidad;
    }

    @Override
    public String toString() {
        return "Facturacion{" +
                "idFacturacion=" + idFacturacion +
                ", sueldo=" + sueldo +
                ", privacidad=" + privacidad +
                '}';
    }

    public long getIdFacturacion() {
        return idFacturacion;
    }

    public void setIdFacturacion(long idFacturacion) {
        this.idFacturacion = idFacturacion;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getPrivacidad() {
        return privacidad;
    }

    public void setPrivacidad(int privacidad) {
        this.privacidad = privacidad;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }
}
