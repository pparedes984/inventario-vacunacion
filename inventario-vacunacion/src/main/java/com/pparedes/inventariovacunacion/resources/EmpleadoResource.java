package com.pparedes.inventariovacunacion.resources;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.Map;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoResource {

    @PostMapping("/register")
    public String registerEmpleado(@RequestBody Map<Object, Object> empleadoMap) {
        String cedula = (String) empleadoMap.get("cedula");
        String nombres = (String) empleadoMap.get("nombres");
        String apellidos = (String) empleadoMap.get("apellidos");
        String correo_electronico = (String) empleadoMap.get("correo_electronico");
        long millis=System.currentTimeMillis();
        Date fecha_creacion = new Date(millis);

        return cedula + ", " + nombres + ", " + apellidos + ", " + correo_electronico + ", " + fecha_creacion;


    }
}
