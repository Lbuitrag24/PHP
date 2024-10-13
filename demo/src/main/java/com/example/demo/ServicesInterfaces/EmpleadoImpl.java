package com.example.demo.ServicesInterfaces;

import com.example.demo.Entity.Empleado;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmpleadoImpl {

    public List<Empleado> listaEmpleados();
    public Optional<Empleado> listaEmpleadosById(Long id);
    public int save(Empleado e);
    public void delete(Long id);

}
