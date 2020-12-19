package com.monitora.carteira.services;

import com.monitora.carteira.entities.Carteira;
import com.monitora.carteira.entities.Papel;
import com.monitora.carteira.feignclients.PapelFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarteiraService {

    @Autowired
    private PapelFeignClient papelFeignClient;

    public Carteira getCarteira(long papelId) {
        Papel papel = papelFeignClient.findById(papelId).getBody();
        return new Carteira(papel.getSigla(), 1000.0);
    }
}
