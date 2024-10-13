package com.example.demo.Services;

import com.example.demo.Entity.Empleado;
import com.example.demo.Repository.EmpleadoRepository;
import com.example.demo.ServicesInterfaces.EmpleadoImpl;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class EmpleadoServices implements EmpleadoImpl {

     @Autowired
     private EmpleadoRepository empleadoRepository;


     @Override
     public List<Empleado> listaEmpleados() {
         return null;
     }

     @Override
     public Optional<Empleado> listaEmpleadosById(Long id) {
         return Optional.empty();
     }

     @Override
     public int save(Empleado e) {
         int resp = 0;
         Empleado empleado = empleadoRepository.save(e);
         if (!empleado.equals(null)){
             resp = 1;
         }
         return resp;
     }

     @Override
     public void delete(Long id){
         empleadoRepository.deleteById(id);

     }

}
