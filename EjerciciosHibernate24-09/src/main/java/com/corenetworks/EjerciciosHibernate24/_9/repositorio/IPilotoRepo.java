package com.corenetworks.EjerciciosHibernate24._9.repositorio;

import com.corenetworks.EjerciciosHibernate24._9.modelo.Piloto;
import com.corenetworks.EjerciciosHibernate24._9.modelo.Telefono;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface IPilotoRepo extends IGenericRepo<Piloto,Long> {
    @Query("SELECT p FROM Piloto p WHERE p.escuderia.idEscuderia = :id")
    Set<Piloto> findPilotosByIdEscuderia(@Param("id") Long id);

    @Query("SELECT p FROM Piloto p WHERE p.escuderia.pais NOT LIKE :pais")
    Set<Piloto> findPilotosByPaisNotLike(@Param("pais") String pais);

    @Query("SELECT p FROM Piloto p WHERE p.facturacion.sueldo > :importe")
    Set<Piloto> findPilotosBySueldoGreaterThan(@Param("importe") Integer importe);

    @Query("SELECT p FROM Piloto p WHERE p.facturacion.sueldo BETWEEN :valor1 AND :valor2")
    Set<Piloto> findPilotosBySueldoBetween(@Param("valor1") Integer valor1, @Param("valor2") Integer valor2);

    @Query("SELECT p FROM Piloto p JOIN p.temporadas t WHERE t.idTemporada = :idTemporada")
    Set<Piloto> findPilotosByIdTemporada(@Param("idTemporada") Long idTemporada);


}
