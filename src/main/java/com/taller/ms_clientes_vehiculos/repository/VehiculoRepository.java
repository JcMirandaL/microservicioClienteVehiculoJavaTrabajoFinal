package com.taller.ms_clientes_vehiculos.repository;

import com.taller.ms_clientes_vehiculos.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {


}
