package com.example.demo.ServicesInterfaces;

import com.example.demo.Entity.Rol;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface RolImpl {

    public List<Rol> listaRoles();
    public Optional<Rol> listarRolesById(Long id);
    public int save(Rol r);
    public void delete(Long id);
}
