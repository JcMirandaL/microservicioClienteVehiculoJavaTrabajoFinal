package com.taller.ms_clientes_vehiculos.dto;

import java.time.LocalDate;

public record ClienteResponseDTO(
        Integer id,
        String nombre,
        String cedula,
        String telefono,
        String correo,
        String direccion,
        LocalDate fechaCreacion
) {}
