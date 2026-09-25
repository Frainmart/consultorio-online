package com.consultorioonline.dto.profesional;

import java.time.LocalDateTime;

public class ProfesionalResponse {

    private Long idProfesional;
    private Long usuarioId;
    private String tipoDocumento;
    private String numeroDocumento;
    private String nombres;
    private String apellidos;
    private String registroProfesional;
    private String telefono;
    private Integer estado;
    private LocalDateTime fechaRegistro;

    public ProfesionalResponse() {
    }

    public Long getIdProfesional() { return idProfesional; }

    public void setIdProfesional(Long idProfesional) { this.idProfesional = idProfesional; }

    public Long getUsuarioId() { return usuarioId; }

    public void setUsuarioId(Long usuarioId) { this.usuarioId = usuarioId; }

    public String getTipoDocumento() { return tipoDocumento; }

    public void setTipoDocumento(String tipoDocumento) { this.tipoDocumento = tipoDocumento; }

    public String getNumeroDocumento() { return numeroDocumento; }

    public void setNumeroDocumento(String numeroDocumento) { this.numeroDocumento = numeroDocumento; }

    public String getNombres() { return nombres; }

    public void setNombres(String nombres) { this.nombres = nombres; }

    public String getApellidos() { return apellidos; }

    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public String getRegistroProfesional() { return registroProfesional; }

    public void setRegistroProfesional(String registroProfesional) { this.registroProfesional = registroProfesional; }

    public String getTelefono() { return telefono; }

    public void setTelefono(String telefono) { this.telefono = telefono; }

    public Integer getEstado() { return estado; }

    public void setEstado(Integer estado) { this.estado = estado; }

    public LocalDateTime getFechaRegistro() { return fechaRegistro; }

    public void setFechaRegistro(LocalDateTime fechaRegistro) { this.fechaRegistro = fechaRegistro; }

}
