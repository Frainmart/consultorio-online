package com.consultorioonline.dto.usuario;

public class UsuarioUpdateRequest {

    private Long rolId;
    private String correoElectronico;
    private Integer tipoDocumento;

    public UsuarioUpdateRequest() {
    }

    public Long getRolId() { return rolId; }

    public void setRolId(Long rolId) { this.rolId = rolId; }

    public String getCorreoElectronico() { return correoElectronico; }

    public void setCorreoElectronico(String correoElectronico) { this.correoElectronico = correoElectronico; }

    public Integer getTipoDocumento() { return tipoDocumento; }

    public void setTipoDocumento(Integer tipoDocumento) { this.tipoDocumento = tipoDocumento; }

}
