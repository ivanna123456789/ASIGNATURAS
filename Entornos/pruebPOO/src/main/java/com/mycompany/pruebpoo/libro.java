package com.mycompany.pruebpoo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nocturno
 */
public class libro {
    //atributos normalmente privados 
    private int ISBN;
    private String titulo;
    private String autor;
    private int numPag;
    
    //constructores
    public libro(int _ISBN, String _titulo, String _autor, int _numPag){
        ISBN = _ISBN;
        titulo = _titulo;
        autor = _autor;
        numPag = _numPag;
    };
    
    public libro(){};

    //metodos
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }
    
    
    public String toString(){
        return "El libro " + titulo + " con ISBN " + ISBN 
                + " creado por el autor " + autor 
                + " tiene " + numPag + " paginas";
    }
    
}
