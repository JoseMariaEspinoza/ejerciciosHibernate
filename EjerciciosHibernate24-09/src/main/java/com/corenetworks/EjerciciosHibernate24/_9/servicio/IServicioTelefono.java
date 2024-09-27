package com.corenetworks.EjerciciosHibernate24._9.servicio;

import com.corenetworks.EjerciciosHibernate24._9.modelo.Telefono;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface IServicioTelefono extends ICRUD<Telefono,Long> {
    Set<Telefono> findTelefonosByNombre(String nombre);
}
