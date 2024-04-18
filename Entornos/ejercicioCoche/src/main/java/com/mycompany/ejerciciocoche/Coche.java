/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciocoche;

/**
 *
 * @author Nocturno
 * @Version 1.0
 */
public class Coche {
    //atributos
    private String matricula;
    private String color;
    private String marca;
    private String modelo;
    private int caballos;
    private int velocidadActual;
    private boolean motorGripado = false;
    
    //constructor 

    /**
     *
     * @param _marca la maca del coche
     * @param _modelo el modelo de los coches
     * @param _velocidadActual la velocidad que lleva el coche actualmente
     */
    public Coche(String _marca, String _modelo, int _velocidadActual){
        marca = _marca;
        modelo = _modelo;
        velocidadActual = _velocidadActual;
    }
    
    /**
     *
     */
    public Coche(){
        
    }
    
    //metodos

    /**
     *
     * @return devuelve la matriucla del vehiculo
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     *
     * @param matricula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     *
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @return
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    /**
     *
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     *
     * @return
     */
    public int getCaballos() {
        return caballos;
    }

    /**
     *
     * @param caballos
     */
    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    /**
     *
     * @return
     */
    public int getVelocidadActual() {
        return velocidadActual;
    }

    /**
     *
     * @param velocidadActual
     */
    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    
    //mis metodos propios

    /**
     *
     * @param velocidad
     */
    public void acelerar(int velocidad){
        this.velocidadActual += velocidad;
    }
    
    /**
     *
     * @param velocidad
     */
    public void frenar(int velocidad){
        this.velocidadActual -= velocidad;
    }
    
    /**
     *
     */
    public void motorGripado(){
       motorGripado = true;
    }
    
    
    
}
