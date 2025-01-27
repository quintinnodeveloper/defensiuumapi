package br.com.quintinno.defensiuumapi.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.quintinno.defensiuumapi.entity.CredencialEntity;
import br.com.quintinno.defensiuumapi.service.CredencialService;


@RestController
@RequestMapping("/credencial")
public class CredencialController {

    private CredencialService credencialService;

    public CredencialController(CredencialService credencialService) {
        this.credencialService = credencialService;
    }

    @PostMapping
    public ResponseEntity<CredencialEntity> create(@RequestBody CredencialEntity credencialEntity) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.credencialService.create(credencialEntity));
    }

    @GetMapping
    public ResponseEntity<List<CredencialEntity>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(this.credencialService.findAll());
    }

}
