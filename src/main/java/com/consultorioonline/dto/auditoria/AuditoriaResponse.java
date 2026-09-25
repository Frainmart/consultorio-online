package com.consultorioonline.dto.auditoria;

import java.time.LocalDateTime;

public class AuditoriaResponse {

    private Long idAuditoria;
    private Long usuarioId;
    private LocalDateTime fechaHora;
    private String accion;
    private String entidad;
    private String identificadorRegistro;
    private String descripcion;
    private String direccionIp;

    public AuditoriaResponse() {
    }

    public Long getIdAuditoria() { return idAuditoria; }

    public void setIdAuditoria(Long idAuditoria) { this.idAuditoria = idAuditoria; }

    public Long getUsuarioId() { return usuarioId; }

    public void setUsuarioId(Long usuarioId) { this.usuarioId = usuarioId; }

    public LocalDateTime getFechaHora() { return fechaHora; }

    public void setFechaHora(LocalDateTime fechaHora) { this.fechaHora = fechaHora; }

    public String getAccion() { return accion; }

    public void setAccion(String accion) { this.accion = accion; }

    public String getEntidad() { return entidad; }

    public void setEntidad(String entidad) { this.entidad = entidad; }

    public String getIdentificadorRegistro() { return identificadorRegistro; }

    public void setIdentificadorRegistro(String identificadorRegistro) { this.identificadorRegistro = identificadorRegistro; }

    public String getDescripcion() { return descripcion; }

    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getDireccionIp() { return direccionIp; }

    public void setDireccionIp(String direccionIp) { this.direccionIp = direccionIp; }

}
