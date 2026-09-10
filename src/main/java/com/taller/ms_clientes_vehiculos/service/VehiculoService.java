package com.taller.ms_clientes_vehiculos.service;

import com.taller.ms_clientes_vehiculos.mapper.VehiculoMapper;
import com.taller.ms_clientes_vehiculos.repository.VehiculoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service//para que spring lo reconozca como un servicio
@RequiredArgsConstructor//para inyecciones sin constructor(x medio de spring)
public class VehiculoService {

    private final VehiculoRepository vehiculoRepository;
    private final VehiculoMapper vehiculoMapper;



}
