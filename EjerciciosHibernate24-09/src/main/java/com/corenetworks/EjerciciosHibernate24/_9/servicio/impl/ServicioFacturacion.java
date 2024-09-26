package com.corenetworks.EjerciciosHibernate24._9.servicio.impl;

import com.corenetworks.EjerciciosHibernate24._9.modelo.Facturacion;
import com.corenetworks.EjerciciosHibernate24._9.repositorio.IFacturacionRepo;
import com.corenetworks.EjerciciosHibernate24._9.repositorio.IGenericRepo;
import com.corenetworks.EjerciciosHibernate24._9.servicio.IServicioFacturacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioFacturacion extends CRUDImpl<Facturacion,Long> implements IServicioFacturacion {
    @Autowired
    private IFacturacionRepo repo;
    @Override
    protected IGenericRepo<Facturacion, Long> getRepo() {
        return repo;
    }
}
