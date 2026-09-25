package com.consultorioonline.dto.usuario;

import java.time.LocalDateTime;

public class UsuarioResponse {

    private Long idUsuario;
    private Long rolId;
    private String correoElectronico;
    private Integer tipoDocumento;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaActualizacion;

    public UsuarioResponse() {
    }

    public Long getIdUsuario() { return idUsuario; }

    public void setIdUsuario(Long idUsuario) { this.idUsuario = idUsuario; }

    public Long getRolId() { return rolId; }

    public void setRolId(Long rolId) { this.rolId = rolId; }

    public String getCorreoElectronico() { return correoElectronico; }

    public void setCorreoElectronico(String correoElectronico) { this.correoElectronico = correoElectronico; }

    public Integer getTipoDocumento() { return tipoDocumento; }

    public void setTipoDocumento(Integer tipoDocumento) { this.tipoDocumento = tipoDocumento; }

    public LocalDateTime getFechaCreacion() { return fechaCreacion; }

    public void setFechaCreacion(LocalDateTime fechaCreacion) { this.fechaCreacion = fechaCreacion; }

    public LocalDateTime getFechaActualizacion() { return fechaActualizacion; }

    public void setFechaActualizacion(LocalDateTime fechaActualizacion) { this.fechaActualizacion = fechaActualizacion; }

}
