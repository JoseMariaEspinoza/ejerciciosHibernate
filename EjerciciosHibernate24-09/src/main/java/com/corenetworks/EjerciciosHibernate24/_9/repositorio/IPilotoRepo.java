package com.corenetworks.EjerciciosHibernate24._9.repositorio;

import com.corenetworks.EjerciciosHibernate24._9.modelo.Piloto;

import java.util.List;

public interface IPilotoRepo<T,ID> extends IGenericRepo<T,ID> {
    List<Piloto> findByTemporada(String Temporada);
}
