package com.example.demo.Repository;

import com.example.demo.Entity.Empleado;
import org.springframework.data.repository.CrudRepository;

public interface EmpleadoRepository  extends CrudRepository<Empleado, Long> {

}
