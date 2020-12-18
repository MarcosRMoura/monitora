package com.monitora.papel.resource;

import com.monitora.papel.entities.Papel;
import com.monitora.papel.repositories.PapelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/papeis")
public class PapelResource {

    @Autowired
    private PapelRepository repository;

    @GetMapping
    public ResponseEntity<List<Papel>> findAll() {
        List<Papel> list = repository.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Papel> findById(@PathVariable("id") Long id) {
        Papel obj = repository.findById(id).get();
        return ResponseEntity.ok(obj);
    }
}
