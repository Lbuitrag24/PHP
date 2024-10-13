package com.example.demo.Services;

import com.example.demo.Entity.Empleado;
import com.example.demo.Entity.Rol;
import com.example.demo.Repository.RolRepository;
import com.example.demo.ServicesInterfaces.RolImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class RolServices implements RolImpl {

    @Autowired
    private RolRepository rolRepository;


    @Override
    public List<Rol> listaRoles() {
        return (List<Rol>) rolRepository.findAll();
    }

    @Override
    public Optional<Rol> listarRolesById(Long id) {
        return (Optional<Rol>) rolRepository.findById(id);
    }

    @Override
    public int save(Rol r) {
        int resp = 0;
        Rol rol = rolRepository.save(r);
        if (!rol.equals(null)){
            resp = 1;
        }
        return resp;
    }

    @Override
    public void delete(Long id){
        rolRepository.deleteById(id);

    }

}


