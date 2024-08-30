package com.bnex.storeapi.controller;

import com.bnex.storeapi.model.Produto;
import com.bnex.storeapi.service.ProdutoService;
import lombok.AllArgsConstructor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;
    private static final Logger logger = LoggerFactory.getLogger(ProdutoController.class);

    @GetMapping
    public List<Produto> getAllProdutos() {
        logger.info("Requisição para listar todos os produtos");
        return produtoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> getProdutoById(@PathVariable Long id) {
        logger.info("Requisição para obter produto com ID: {}", id);
        return produtoService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Produto createProduto(@RequestBody Produto produto) {
        logger.info("Requisição para criar um novo produto: {}", produto);
        return produtoService.save(produto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produto> updateProduto(@PathVariable Long id, @RequestBody Produto produtoDetails) {
        logger.info("Requisição para atualizar o produto com ID: {}", id);
        return produtoService.updateProduto(id, produtoDetails);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteProduto(@PathVariable Long id) {
        logger.info("Requisição para deletar o produto com ID: {}", id);
        return produtoService.deleteProduto(id);
    }
}
