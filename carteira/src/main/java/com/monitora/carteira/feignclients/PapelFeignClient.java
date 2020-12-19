package com.monitora.carteira.feignclients;

import com.monitora.carteira.entities.Papel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "papel", url = "localhost:8101", path = "/papeis")
public interface PapelFeignClient {

    @GetMapping(value = "/{id}")
    ResponseEntity<Papel> findById(@PathVariable("id") Long id);
}
