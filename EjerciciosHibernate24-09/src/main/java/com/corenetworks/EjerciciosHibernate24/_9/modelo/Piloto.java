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
@Table(name = "piloto")
public class Piloto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPiloto;
    private String nombre;
    private int edad;

    @OneToOne
    @JoinColumn(name = "id_facturacion", nullable = false,
            foreignKey = @ForeignKey(name = "FK_piloto_facturacion"))
    private Facturacion facturacion;

    @OneToOne
    @JoinColumn(name = "id_nif", nullable = false,
            foreignKey = @ForeignKey(name = "FK_piloto_nif"))
    private Nif nif;

    @ManyToOne
    @JoinColumn(name = "id_escuderia", nullable = false,
            foreignKey = @ForeignKey(name = "FK_pilotos_escuderia"))
    private Escuderia escuderia;

    @OneToMany(mappedBy = "piloto",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.EAGER)
    private Set<Telefono> telefonos;

    @ManyToMany
    @JoinTable(name = "pilotos_temporadas",
            joinColumns = @JoinColumn(name = "id_piloto",
                    referencedColumnName = "idPiloto"),
            inverseJoinColumns = @JoinColumn(name = "id_temporada",
                    referencedColumnName = "idTemporada"))
    private Set<Temporada> temporadas;
}
