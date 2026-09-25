package com.consultorioonline.dto.diagnostico;

public class DiagnosticoRequest {

    private String codigo;
    private String nombre;
    private String descripcion;
    private Integer estado;

    public DiagnosticoRequest() {
    }

    public String getCodigo() { return codigo; }

    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }

    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public Integer getEstado() { return estado; }

    public void setEstado(Integer estado) { this.estado = estado; }

}
