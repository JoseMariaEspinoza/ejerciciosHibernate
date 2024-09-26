package com.corenetworks.EjerciciosHibernate24._9.servicio.impl;

import com.corenetworks.EjerciciosHibernate24._9.modelo.Piloto;
import com.corenetworks.EjerciciosHibernate24._9.repositorio.IGenericRepo;
import com.corenetworks.EjerciciosHibernate24._9.repositorio.IPilotoRepo;
import com.corenetworks.EjerciciosHibernate24._9.servicio.IServicioPiloto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioPiloto extends CRUDImpl<Piloto,Long> implements IServicioPiloto {
    @Autowired
    private IPilotoRepo repo;
    @Override
    protected IGenericRepo<Piloto, Long> getRepo() {
        return repo;
    }

    @Override
    public List<Piloto> findByTemporada() {
        return List.of();
    }
}
