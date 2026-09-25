package com.consultorioonline.security;

import com.consultorioonline.entity.Usuario;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class UserDetailsImpl implements UserDetails {

    private final Long idUsuario;
    private final String correoElectronico;
    private final String contrasenaHash;
    private final Collection<? extends GrantedAuthority> authorities;

    public UserDetailsImpl(Usuario usuario) {
        this.idUsuario = usuario.getIdUsuario();
        this.correoElectronico = usuario.getCorreoElectronico();
        this.contrasenaHash = usuario.getContrasenaHash();
        String rol = usuario.getRol() != null ? usuario.getRol().getNombre() : "USUARIO";
        this.authorities = List.of(new SimpleGrantedAuthority("ROLE_" + rol.toUpperCase()));
    }

    public Long getIdUsuario() { return idUsuario; }

    @Override public Collection<? extends GrantedAuthority> getAuthorities() { return authorities; }
    @Override public String getPassword() { return contrasenaHash; }
    @Override public String getUsername() { return correoElectronico; }
    @Override public boolean isAccountNonExpired() { return true; }
    @Override public boolean isAccountNonLocked() { return true; }
    @Override public boolean isCredentialsNonExpired() { return true; }
    @Override public boolean isEnabled() { return true; }
}
