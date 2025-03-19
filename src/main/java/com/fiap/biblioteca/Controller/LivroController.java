package com.fiap.biblioteca.Controller;

import com.fiap.biblioteca.Service.LivroService;
import com.fiap.biblioteca.model.Livro;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public Page<Livro> listarLivros(
            @PageableDefault(sort = "id", direction = Sort.Direction.ASC, size = 10) Pageable pageable){
        return livroService.listarLivros(pageable);
    }

    @GetMapping("/livro")
    public Page<Livro> buscarPorTitulo(
            @RequestParam String titulo,
            @PageableDefault(sort = "titulo", direction = Sort.Direction.ASC, size = 10) Pageable pageable){
        return livroService.buscarPorTitulo(titulo, pageable);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Livro> buscarPorId(@PathVariable Long id){
            Livro livro = livroService.buscarPorId(id);
            return ResponseEntity.ok(livro);
    }

    @PostMapping
    public ResponseEntity<Livro> salvar(@Valid @RequestBody Livro livro){
        Livro livroParaSalvar = livroService.salvar(livro);
        return ResponseEntity.ok(livro);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Livro> atualizar(@PathVariable Long id, @Valid @RequestBody Livro livro){
        Livro livroAtualizado = livroService.atualizarLivro(id, livro);
        return ResponseEntity.ok(livroAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id){
        livroService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
