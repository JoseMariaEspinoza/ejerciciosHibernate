package com.corenetworks.EjerciciosHibernate24._9.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "telefono")
public class Telefono {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTelefono;

    private long numero;

    @ManyToOne
    @JoinColumn(name = "id_piloto", nullable = false,
            foreignKey = @ForeignKey(name = "FK_telefonos_piloto"))
    private Piloto piloto;

    public Telefono(long numero) {
       this.numero = numero;
    }

    @Override
    public String toString() {
        return "\nTelefono{" +
                "idTelefono=" + idTelefono +
                ", numero=" + numero +
                "}\n";
    }

    public long getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(long idTelefono) {
        this.idTelefono = idTelefono;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }
}
