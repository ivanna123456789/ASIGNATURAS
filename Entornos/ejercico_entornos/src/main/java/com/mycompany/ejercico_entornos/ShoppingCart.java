/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercico_entornos;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Ivanna Ariza
 */
public class ShoppingCart {
    private ArrayList<Product> items;

    /**
     * Constructor
     */
    public ShoppingCart() {
        items = new ArrayList<Product>();
    }

    /**
     * Returns the balance o precio total.
     * @return Balance.
     */
    public double getBalance() {
        Iterator<Product> i = items.iterator();
        double balance = 0.00;
        while (i.hasNext()) {
            Product p = (Product)i.next();
            balance = balance + p.getPrice();
        }

        return balance;
    }
    
    /**
     * Añade un producto a la lista
     * @param p Product.
     */
    public void addItem(Product p) {
        items.add(p);
    }
    
    /**
     * Elimina un producto específico de la lista de la compra. Si no lo encuentra, lanzo excepcion.
     * @param p Product.
     * @throws ProductNotFoundException creada más abajo.
     */
    public void removeItem(Product p) throws ProductNotFoundException {
        if (!items.remove(p)) {
            throw new ProductNotFoundException();
        }
    }

    /**
     * Devuelve el total de productos o items.
     * @return Item count.
     */
    public int getItemCount() {
        return items.size();
    }
    
    /**
     * Vacía la cesta de la compra.
     */
    public void empty() {
        items = new ArrayList<Product>();
    }

    /**
     * Indica si el carro está vacío.
     * @return true si el carro está vacío;
     *     false en cualquier otro caso (otherwise).
     */
    public boolean isEmpty() {
        return (items.size() == 0);
    }

    public class ProductNotFoundException extends Exception {	
            public ProductNotFoundException() {
                    super();
            }
    }
}
