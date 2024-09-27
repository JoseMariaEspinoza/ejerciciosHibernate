package com.corenetworks.EjerciciosHibernate24._9.servicio.impl;

import com.corenetworks.EjerciciosHibernate24._9.modelo.Telefono;
import com.corenetworks.EjerciciosHibernate24._9.repositorio.IGenericRepo;
import com.corenetworks.EjerciciosHibernate24._9.repositorio.ITelefonoRepo;
import com.corenetworks.EjerciciosHibernate24._9.servicio.IServicioTelefono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ServicioTelefono extends CRUDImpl<Telefono,Long> implements IServicioTelefono {
    @Autowired
    private ITelefonoRepo repo;
    @Override
    protected IGenericRepo<Telefono, Long> getRepo() {
        return repo;
    }

    @Override
    public Set<Telefono> findTelefonosByNombre(String nombre) {
        return repo.findTelefonosByNombre(nombre);
    }
}
