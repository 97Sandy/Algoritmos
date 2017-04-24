/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Diccionario;

/**
 *
 * @author Sandy
 */
public class NodoArbol <T> {
    public T dato;
    public NodoArbol <T> der;
    public NodoArbol <T> izq;
    public NodoArbol <T> med;
     
     NodoArbol () {
    	 dato = null;
    	 der = null;
    	 izq = null;
         med=null;
     }
     
     NodoArbol(T d) {
    	 dato = d;
    	 der = null;
    	 izq = null;
         med=null;
     }
    
    
}
