package com.consultorioonline.dto.medicamento;

public class MedicamentoRequest {

    private String nombre;
    private String principioActivo;
    private String presentacion;
    private String concentracion;
    private String unidadMedida;
    private Integer estado;

    public MedicamentoRequest() {
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPrincipioActivo() { return principioActivo; }

    public void setPrincipioActivo(String principioActivo) { this.principioActivo = principioActivo; }

    public String getPresentacion() { return presentacion; }

    public void setPresentacion(String presentacion) { this.presentacion = presentacion; }

    public String getConcentracion() { return concentracion; }

    public void setConcentracion(String concentracion) { this.concentracion = concentracion; }

    public String getUnidadMedida() { return unidadMedida; }

    public void setUnidadMedida(String unidadMedida) { this.unidadMedida = unidadMedida; }

    public Integer getEstado() { return estado; }

    public void setEstado(Integer estado) { this.estado = estado; }

}
