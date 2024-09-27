package com.corenetworks.EjerciciosHibernate24._9.servicio.impl;

import com.corenetworks.EjerciciosHibernate24._9.modelo.Piloto;
import com.corenetworks.EjerciciosHibernate24._9.modelo.Telefono;
import com.corenetworks.EjerciciosHibernate24._9.repositorio.IGenericRepo;
import com.corenetworks.EjerciciosHibernate24._9.repositorio.IPilotoRepo;
import com.corenetworks.EjerciciosHibernate24._9.servicio.IServicioPiloto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class ServicioPiloto extends CRUDImpl<Piloto,Long> implements IServicioPiloto {
    @Autowired
    private IPilotoRepo repo;

    @Override
    protected IGenericRepo<Piloto, Long> getRepo() {
        return repo;
    }

    @Override
    public Set<Piloto> findPilotosByIdEscuderia(Long id) {
        return repo.findPilotosByIdEscuderia(id);
    }

    @Override
    public Set<Piloto> findPilotosByPaisNotLike(String pais) {
        return repo.findPilotosByPaisNotLike(pais);
    }

    @Override
    public Set<Piloto> findPilotosBySueldoGreaterThan(Integer importe) {
        return repo.findPilotosBySueldoGreaterThan(importe);
    }

    @Override
    public Set<Piloto> findPilotosBySueldoBetween(Integer valor1, Integer valor2) {
        return repo.findPilotosBySueldoBetween(valor1,valor2);
    }

    @Override
    public Set<Piloto> findPilotosByIdTemporada(Long idTemporada) {
        return repo.findPilotosByIdTemporada(idTemporada);
    }
}
