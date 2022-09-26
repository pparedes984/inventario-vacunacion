package com.pparedes.inventariovacunacion.domain;

import java.sql.Date;

public class Empleado {

    private int id;
    private String cedula;
    private String nombres;
    private String apellidos;
    private String correo_electronico;
    private Date fecha_creacion;
    private Date fecha_nacimiento;
    private String dirección;
    private String telefono;
    private String estado_vacunacion;
    private Date fecha_modificacion;
    private String usuario;
    private String clave;
    private int vacuna_id;

    public Empleado(int id, String cedula, String nombres, String apellidos, String correo_electronico, Date fecha_creacion, Date fecha_nacimiento, String dirección, String telefono, String estado_vacunacion, Date fecha_modificacion, String usuario, String clave, int vacuna_id) {
        this.id = id;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo_electronico = correo_electronico;
        this.fecha_creacion = fecha_creacion;
        this.fecha_nacimiento = fecha_nacimiento;
        this.dirección = dirección;
        this.telefono = telefono;
        this.estado_vacunacion = estado_vacunacion;
        this.fecha_modificacion = fecha_modificacion;
        this.usuario = usuario;
        this.clave = clave;
        this.vacuna_id = vacuna_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado_vacunacion() {
        return estado_vacunacion;
    }

    public void setEstado_vacunacion(String estado_vacunacion) {
        this.estado_vacunacion = estado_vacunacion;
    }

    public Date getFecha_modificacion() {
        return fecha_modificacion;
    }

    public void setFecha_modificacion(Date fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getVacuna_id() {
        return vacuna_id;
    }

    public void setVacuna_id(int vacuna_id) {
        this.vacuna_id = vacuna_id;
    }

}
