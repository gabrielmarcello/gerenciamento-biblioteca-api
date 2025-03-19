package com.fiap.biblioteca.Exceptions;

public class LivroNaoEncontradoException extends RuntimeException{

    public LivroNaoEncontradoException(String message){
        super(message);
    }

}
