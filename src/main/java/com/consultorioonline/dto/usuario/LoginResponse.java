package com.consultorioonline.dto.usuario;

public class LoginResponse {
    private String token;
    private String correoElectronico;
    public LoginResponse() {}
    public LoginResponse(String token, String correoElectronico) { this.token = token; this.correoElectronico = correoElectronico; }
    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }
    public String getCorreoElectronico() { return correoElectronico; }
    public void setCorreoElectronico(String correoElectronico) { this.correoElectronico = correoElectronico; }
}
