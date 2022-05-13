package com.leanmall.microservicios.app.usuarios.models.converters;

import com.leanmall.microservicios.app.usuarios.models.dto.AlumnosDTO;
import com.leanmall.microservicios.app.usuarios.models.entity.Alumnos;
import org.springframework.stereotype.Component;

@Component
public class AlumnosConverter {

    public Alumnos toEntity(AlumnosDTO alumnosDTO){
        Alumnos alumno = new Alumnos();
        alumno.setId(alumnosDTO.getId());
        alumno.setNombre(alumnosDTO.getNombre());
        alumno.setApellido(alumnosDTO.getApellido());
        alumno.setEmail(alumnosDTO.getEmail());
        alumno.setCreateAt(alumnosDTO.getCreateAt());
        return alumno;
    }

    public AlumnosDTO toDTO(Alumnos alumnos){
        AlumnosDTO alumnosDTO = new AlumnosDTO();
        alumnosDTO.setId(alumnos.getId());
        alumnosDTO.setNombre(alumnos.getNombre());
        alumnosDTO.setApellido(alumnos.getApellido());
        alumnosDTO.setEmail(alumnos.getEmail());
        alumnosDTO.setCreateAt(alumnos.getCreateAt());
        return alumnosDTO;
    }
}
