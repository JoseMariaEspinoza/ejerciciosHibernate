package com.corenetworks.EjerciciosHibernate24._9.repositorio;

import com.corenetworks.EjerciciosHibernate24._9.modelo.Piloto;
import com.corenetworks.EjerciciosHibernate24._9.modelo.Temporada;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface ITemporadaRepo extends IGenericRepo<Temporada,Long>{
}
