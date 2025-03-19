package com.fiap.biblioteca.Repository;

import com.fiap.biblioteca.model.Livro;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {

    Page<Livro> findAll(Pageable pageable);
    Page<Livro> findByTituloContainingIgnoreCase(String titulo, Pageable pageable);

}
