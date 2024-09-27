package com.corenetworks.EjerciciosHibernate24._9.repositorio;

import com.corenetworks.EjerciciosHibernate24._9.modelo.Escuderia;
import com.corenetworks.EjerciciosHibernate24._9.modelo.Piloto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface IEscuderiaRepo extends IGenericRepo<Escuderia,Long> {
}
