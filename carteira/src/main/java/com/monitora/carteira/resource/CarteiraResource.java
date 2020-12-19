package com.monitora.carteira.resource;

import com.monitora.carteira.entities.Carteira;
import com.monitora.carteira.repositories.CarteiraRepository;
import com.monitora.carteira.services.CarteiraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/carteiras")
public class CarteiraResource {

    @Autowired
    private CarteiraRepository repository;

    @Autowired
    private CarteiraService carteiraService;

    @GetMapping
    public ResponseEntity<List<Carteira>> findAll() {
        List<Carteira> list = repository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Carteira> findById(@PathVariable("id") Long id) {
        Carteira obj = repository.findById(id).get();
        return ResponseEntity.ok(obj);
    }

    @GetMapping(value = "/teste/{id}")
    public ResponseEntity<Carteira> busca(@PathVariable("id") Long id) {
        Carteira obj = carteiraService.getCarteira(id);
        return ResponseEntity.ok(obj);
    }
}
