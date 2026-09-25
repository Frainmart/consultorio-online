package com.consultorioonline.dto.usuario;

public class UsuarioRequest {

    private Long rolId;
    private String correoElectronico;
    private String contrasena;
    private Integer tipoDocumento;

    public UsuarioRequest() {
    }

    public Long getRolId() { return rolId; }

    public void setRolId(Long rolId) { this.rolId = rolId; }

    public String getCorreoElectronico() { return correoElectronico; }

    public void setCorreoElectronico(String correoElectronico) { this.correoElectronico = correoElectronico; }

    public String getContrasena() { return contrasena; }

    public void setContrasena(String contrasena) { this.contrasena = contrasena; }

    public Integer getTipoDocumento() { return tipoDocumento; }

    public void setTipoDocumento(Integer tipoDocumento) { this.tipoDocumento = tipoDocumento; }

}
