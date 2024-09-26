package com.corenetworks.EjerciciosHibernate24._9.servicio.impl;

import com.corenetworks.EjerciciosHibernate24._9.modelo.Temporada;
import com.corenetworks.EjerciciosHibernate24._9.repositorio.IGenericRepo;
import com.corenetworks.EjerciciosHibernate24._9.repositorio.ITemporadaRepo;
import com.corenetworks.EjerciciosHibernate24._9.servicio.IServicioTemporada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioTemporada extends CRUDImpl<Temporada,Long> implements IServicioTemporada {
    @Autowired
    private ITemporadaRepo repo;
    @Override
    protected IGenericRepo<Temporada, Long> getRepo() {
        return repo;
    }
}
