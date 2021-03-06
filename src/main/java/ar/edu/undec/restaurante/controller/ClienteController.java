package ar.edu.undec.restaurante.controller;


import ar.edu.undec.restaurante.dto.ClienteDto;
import ar.edu.undec.restaurante.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/clientes")
    public ResponseEntity<?> getClientes(){
        return new ResponseEntity<>(clienteService.getClientes(), HttpStatus.OK);
    }
}
