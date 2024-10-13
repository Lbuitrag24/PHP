package com.example.demo.Controller;

import com.example.demo.Entity.Empleado;
import com.example.demo.Entity.Rol;
import com.example.demo.ServicesInterfaces.EmpleadoImpl;
import com.example.demo.ServicesInterfaces.RolImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EmpleadoController {

    @Autowired
    private EmpleadoImpl empleadoServiceImplements;

    @Autowired
    private RolImpl rolServiceImplements;

    @GetMapping("/empleados")
    public String mostrarEmpleados(Model model){
        List<Empleado> empleados = empleadoServiceImplements.listaEmpleados();
        model.addAttribute("empleados", empleados);
        return"listaEmpleados";
    }

    @GetMapping("/empleados/nuevoEmpleados")
    public String formEmpleado(ModelMap model){
        List<Rol> roles = rolServiceImplements.listaRoles();
        model.addAttribute("empleados", new Empleado());
        return "nuevoEmpleado";
    }


}
