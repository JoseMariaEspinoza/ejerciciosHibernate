package com.corenetworks.EjerciciosHibernate24._9.repositorio;

import com.corenetworks.EjerciciosHibernate24._9.modelo.Telefono;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface ITelefonoRepo extends IGenericRepo<Telefono,Long> {
    @Query("SELECT t FROM Telefono t WHERE t.piloto.nombre = :nombre")
    Set<Telefono> findTelefonosByNombre(@Param("nombre") String nombre);
}
