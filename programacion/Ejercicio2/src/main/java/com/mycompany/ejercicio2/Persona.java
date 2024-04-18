/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author Nocturno
 */
public class Persona {
    //VARIABLES
    private final char SEXO_DEF = 'H';
    private final int SOBREPESO = 1;
    private final int INFESO = -1;
     private final int PESOIDEAL = 0;
     
    //atributos
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;
    
    //constructores
    public Persona(){
        this.nombre = "";
        this.edad = 0;
        this.sexo = SEXO_DEF;
        this.peso = 0;
        this.altura = 0;
    }
    
    public Persona(String _nombre, int _edad, char _sexo){
        this.nombre = _nombre;
        this.edad = _edad;
        this.sexo = _sexo;
        this.peso = 0;
        this.altura = 0;
        comprobarSexo();
    }
    
    public Persona(String _nombre, int _edad, char _sexo, double _peso, double _altura){
        this.nombre = _nombre;
        this.edad = _edad;
        this.sexo = _sexo;
        this.peso = _peso;
        this.altura = _altura;
        generarDNI();
        comprobarSexo();
    }
    
    
    //metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public char getSexo() {
        return sexo;
    }
    
    public char getSEXO_DEF() {
        return SEXO_DEF;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public boolean esMayorDeEdad(){
        boolean res;
        
        if(edad>=18){
            res = true;
        }
        else{
            res = false;
        }
        
        return res;
    }
    
    @Override
    public String toString(){
        return "--Información--\n"
                + "nombre: " + nombre
                + "\nEdad: " + edad 
                + "\nDNI: " + generarDNI()
                + "\nSexo: " + sexo 
                + "\nPeso: " + peso
                + "\nAltura: " + altura
                + "\nMayor de edad: " + esMayorDeEdad()
                + "\nIMC: " + calcularIMC();
    }
    
    public String generarDNI(){
        final int divisor = 23;
        DNI = "";
        for(int i = 0; i < 8; i++){
            DNI +=((int)Math.floor(Math.random()*10));
            
        }
        
        
        int res = Integer.parseInt(DNI)%divisor;
       
        DNI += generaLetra(res);
        
        return DNI;
        
    }
    
    public char generaLetra(int res){
        char letra[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
            'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        return letra[res];
    }
    
    public int calcularIMC(){
        int resultado;
        double IMC;
        IMC = peso/Math.pow(altura, 2);
        
        if(IMC<20){
            resultado = INFESO;
        }
        else if(IMC>=20 || IMC<=25){
            resultado = PESOIDEAL;
        }
        else{
            resultado = SOBREPESO;
        }
        
        return resultado;
    }
    
    public char comprobarSexo(){
        switch (sexo) {
            case 'H':
            case 'h':
                return 'H';
            case 'M':
            case 'm':
                return 'M';
            default:
                return SEXO_DEF;
        }
    }
    
    
}
