package br.com.jm.backend.portifolio.controller;


import br.com.jm.backend.portifolio.model.ContatoModel;
import br.com.jm.backend.portifolio.services.IServiceContato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerContato {

    @Autowired
    private IServiceContato service;

    @PostMapping("/api/contatos")
    @CrossOrigin(origins = "*")
    public ResponseEntity <ContatoModel> salvarContato(@RequestBody ContatoModel novo) {
        ContatoModel res =  service.salvarContato(novo);
        if (res != null) {
            return ResponseEntity.status(201).body(res);
        }
        return ResponseEntity.badRequest().build();
    }

    @GetMapping("/ativado")
    @CrossOrigin(origins = "*")
    public String isAtivado() {
        return "Ativado";
    }
}
