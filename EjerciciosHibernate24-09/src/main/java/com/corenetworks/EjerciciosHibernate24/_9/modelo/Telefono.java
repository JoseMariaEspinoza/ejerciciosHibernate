package com.corenetworks.EjerciciosHibernate24._9.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
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
}
