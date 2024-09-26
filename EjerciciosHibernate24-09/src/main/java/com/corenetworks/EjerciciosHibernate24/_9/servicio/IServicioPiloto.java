package com.corenetworks.EjerciciosHibernate24._9.servicio;

import com.corenetworks.EjerciciosHibernate24._9.modelo.Piloto;

import java.util.List;

public interface IServicioPiloto extends ICRUD<Piloto,Long> {
    List<Piloto> findByTemporada();
}
