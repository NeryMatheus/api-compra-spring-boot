package com.compras.compras.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compras.compras.repository.CompraRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import com.compras.compras.model.Compra;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API Compras")
@CrossOrigin(origins = "*") // Libera todos os domínios
public class CompraController {
    
    @Autowired
    CompraRepository compraRepository;

    @GetMapping("/compras")
    @ApiOperation(value = "Retorna uma lista de compras")
    public List<Compra> listAllCompras(){
        return compraRepository.findAll();
    }

    @GetMapping("/compra/{id}")
    @ApiOperation(value = "Retorna uma compras po Id")
    public Compra listCompraById (@PathVariable(value = "id") long id){
        return compraRepository.findById(id);
    }

    @PostMapping("/compra")
    @ApiOperation(value = "Este método salva uma compra")
    public Compra saveCompras(@RequestBody Compra compra){
        return compraRepository.save(compra);
    }

    @DeleteMapping("/compra")
    @ApiOperation(value = "Este método deleta uma compra")
    public void deleteCompra (@RequestBody Compra compra) {
        compraRepository.delete(compra);
    }

    @PutMapping("/compra")
    @ApiOperation(value = "Este método atualiza uma compra")
    public Compra putCompra (@RequestBody Compra compra){
        return compraRepository.save(compra);
    }
}
