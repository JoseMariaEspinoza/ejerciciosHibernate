package com.corenetworks.EjerciciosHibernate24._9.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "nif")
public class Nif {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idNif;
    private char letra;
    private long numero;

    public Nif(char letra, long numero) {
        this.letra = letra;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Nif{" +
                "idNif=" + idNif +
                ", letra=" + letra +
                ", numero=" + numero +
                '}';
    }

    public long getIdNif() {
        return idNif;
    }

    public void setIdNif(long idNif) {
        this.idNif = idNif;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }
}
