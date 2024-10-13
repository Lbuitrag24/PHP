package com.example.demo.Controller;

import com.example.demo.Entity.Rol;
import com.example.demo.ServicesInterfaces.RolImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RolController {

    @Autowired
    private RolImpl rolserviceImplements;



    @GetMapping("/index")
    public String mostrarInicio(){
        return "index";
    }

    @GetMapping("/roles")
    public String mostrarRoles(Model model){
        List<Rol> roles = rolserviceImplements.listaRoles();
        model.addAttribute("roles", roles);
        return "roles";
    }
}

