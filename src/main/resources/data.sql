CREATE TABLE IF NOT EXISTS livros (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    autor VARCHAR(255) NOT NULL,
    ano_fabricacao INT NOT NULL,
    isbn VARCHAR(20) NOT NULL,
    disponivel BOOLEAN NOT NULL
);

INSERT INTO livros (titulo, autor, ano_fabricacao, isbn, disponivel) VALUES
     ('A Hora da Estrela', 'Clarice Lispector', 1977, '9788535914999', TRUE),
     ('O Idiota', 'Fiódor Dostoiévski', 1869, '9788535902508', TRUE),
     ('O Processo', 'Franz Kafka', 1914, '9788535912162', FALSE),
     ('O Alquimista', 'Paulo Coelho', 1988, '9788576651661', TRUE),
     ('Ensaio sobre a cegueira', 'José Saramago', 1995, '9788535913138', TRUE);
