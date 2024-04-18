/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurassh;

/**
 *
 * @author Nocturno
 */
public class Coleccion {
    //atributos
    private String nombreColeccion;
    private Figura listaFiguras[] = new Figura[5];
    private boolean coleccionLlena;
    
    //constructor
    public Coleccion(String _nombreColeccion){
        nombreColeccion = _nombreColeccion;
        
    }
    
    //metodos
    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }
    
    
    public void añadirFigura(Figura fig){  /* 1 1 1 1 1   */
        for(int i=0;i<listaFiguras.length;i++){
            if(listaFiguras[i]==null){
                listaFiguras[i] = fig;
                System.out.println("Figura añadida!");
                coleccionLlena=false;
                break;
            }else if(listaFiguras[i].getCodigo() == fig.getCodigo()){
                System.out.println("No puedes volver a introducir esta figura");
                coleccionLlena=false;
                break;
            }else {
                coleccionLlena=true;
            }     
        }
        if(coleccionLlena){
            System.out.println("La coleccion esta llena, no se pueden añadir mas");
        }
            
    }
    
    public void subirPrecio(double cantidad, String id){
        for(int i=0;i<listaFiguras.length;i++){
            if(listaFiguras[i].getCodigo().equals(id)){
                listaFiguras[i].setPrecio(cantidad);
            }
        }
    }
    
    @Override
    public String toString(){
        String listado = "";
        for(int i=0;i<listaFiguras.length;i++){
            if(listaFiguras[i]!=null){
                listado = listado + "\n" + listaFiguras[i].toString();
            }
        }
        return "Listado de todas las figuras: \n" + listado;
    }
    
    public String conCapa(){
        String capasi = "";
        for(int i=0;i<listaFiguras.length;i++){
           if(listaFiguras[i].getSuperheroe().isCapa()==true){
               capasi = capasi +"\n"+ listaFiguras[i].getSuperheroe().getNombre() + "\n";
           } 
        }
        return "Heroes que tienen capa: \n" + capasi;
    }
    
    public Figura masValioso(){
        double precio = 0;
       Figura shMasValioso = null;
        for(int i =0; i<listaFiguras.length; i++){
            if(listaFiguras[i].getPrecio()> precio){
               precio =  listaFiguras[i].getPrecio();
               shMasValioso = listaFiguras[i];
            }
        }
        return shMasValioso;
    }
    
    
    public double getValorColeccion(){
        double precio = 0;
        for(int i=0; i<listaFiguras.length; i++){
            precio += listaFiguras[i].getPrecio();
        }
        return precio;
    }
    
    public double getVolumenColeccion(){
        double valor = 0;
        for(int i=0; i<listaFiguras.length; i++){
            valor += listaFiguras[i].getDimensiones().getVolumen();
        }
        return valor + 200 ;
    }
}
