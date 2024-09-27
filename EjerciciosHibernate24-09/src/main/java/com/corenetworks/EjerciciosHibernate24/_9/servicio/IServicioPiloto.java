package com.corenetworks.EjerciciosHibernate24._9.servicio;

import com.corenetworks.EjerciciosHibernate24._9.modelo.Piloto;
import com.corenetworks.EjerciciosHibernate24._9.modelo.Telefono;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

public interface IServicioPiloto extends ICRUD<Piloto,Long> {
    Set<Piloto> findPilotosByIdEscuderia(Long id);
    Set<Piloto> findPilotosByPaisNotLike(String pais);
    Set<Piloto> findPilotosBySueldoGreaterThan(Integer importe);
    Set<Piloto> findPilotosBySueldoBetween(Integer valor1,Integer valor2);
    Set<Piloto> findPilotosByIdTemporada(Long idTemporada);
}
