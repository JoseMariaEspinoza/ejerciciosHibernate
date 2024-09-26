package com.corenetworks.EjerciciosHibernate24._9.servicio.impl;

import com.corenetworks.EjerciciosHibernate24._9.modelo.Escuderia;
import com.corenetworks.EjerciciosHibernate24._9.repositorio.IEscuderiaRepo;
import com.corenetworks.EjerciciosHibernate24._9.repositorio.IGenericRepo;
import com.corenetworks.EjerciciosHibernate24._9.servicio.IServicioEscuderia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioEscuderia extends CRUDImpl<Escuderia,Long> implements IServicioEscuderia {
    @Autowired
    private IEscuderiaRepo repo;
    @Override
    protected IGenericRepo<Escuderia, Long> getRepo() {
        return repo;
    }
}
