package com.consultorioonline.dto.especialidad;

public class EspecialidadResponse {

    private Long idEspecialidad;
    private String nombre;
    private String descripcion;
    private Integer estado;

    public EspecialidadResponse() {
    }

    public Long getIdEspecialidad() { return idEspecialidad; }

    public void setIdEspecialidad(Long idEspecialidad) { this.idEspecialidad = idEspecialidad; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }

    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public Integer getEstado() { return estado; }

    public void setEstado(Integer estado) { this.estado = estado; }

}
