package com.consultorioonline.dto.estado;

public class EstadoCitaResponse {

    private Long idEstadoCita;
    private String nombre;
    private String descripcion;
    private Integer estado;

    public EstadoCitaResponse() {
    }

    public Long getIdEstadoCita() { return idEstadoCita; }

    public void setIdEstadoCita(Long idEstadoCita) { this.idEstadoCita = idEstadoCita; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }

    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public Integer getEstado() { return estado; }

    public void setEstado(Integer estado) { this.estado = estado; }

}
