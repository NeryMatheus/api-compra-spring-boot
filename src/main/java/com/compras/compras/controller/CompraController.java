package com.compras.compras.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compras.compras.repository.CompraRepository;
import com.compras.compras.model.Compra;

@RestController
@RequestMapping(value = "/api")
public class CompraController {
    
    @Autowired
    CompraRepository compraRepository;

    @GetMapping("/compras")
    public List<Compra> listAllCompras(){
        return compraRepository.findAll();
    }

    @GetMapping("compra/{id}")
    public Compra listCompraById (@PathVariable(value = "id") long id){
        return compraRepository.findById(id);
    }

    @PostMapping("/compra")
    public Compra saveCompras(@RequestBody Compra compra){
        return compraRepository.save(compra);
    }

    @DeleteMapping("/compra")
    public void deleteCompra (@RequestBody Compra compra) {
        compraRepository.delete(compra);
    }

    @PutMapping("/compra")
    public Compra putCompra (@RequestBody Compra compra){
        return compraRepository.save(compra);
    }
}
