package com.fiap.biblioteca.Service;

import com.fiap.biblioteca.Exceptions.LivroNaoEncontradoException;
import com.fiap.biblioteca.Repository.LivroRepository;
import com.fiap.biblioteca.model.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public Page<Livro> listarLivros(Pageable pageable){
        return livroRepository.findAll(pageable);
    }

    public Livro buscarPorId(Long id) {
        return livroRepository.findById(id).orElseThrow(() -> new LivroNaoEncontradoException("Livro não encontrado com ID: " + id));
    }

    public Page<Livro> buscarPorTitulo(String titulo, Pageable pageable){
        return livroRepository.findByTituloContainingIgnoreCase(titulo, pageable);
    }

    public Livro salvar(Livro livro){
        return livroRepository.save(livro);
    }

    public Livro atualizarLivro(Long id, Livro livroAtualizado){
        Livro livro = buscarPorId(id);
        livro.setTitulo(livroAtualizado.getTitulo());
        livro.setAutor(livroAtualizado.getAutor());
        livro.setAnoFabricacao(livroAtualizado.getAnoFabricacao());
        livro.setIsbn(livroAtualizado.getIsbn());
        livro.setDisponivel(livroAtualizado.isDisponivel());
        return livroRepository.save(livro);
    }

    public void deletar(Long id){
        Livro livro = buscarPorId(id);
        livroRepository.delete(livro);
    }

}
