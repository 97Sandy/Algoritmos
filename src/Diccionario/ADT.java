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
public class ADT <T extends Comparable <? super T>> {
    // Unico atributo del ABB -> su raiz
    private NodoArbol <T> raiz;
    
    // Verifica si el arbol esta vacio o no	
    public boolean isEmpty() {
	return this.raiz== null;
    }
        
    // Metodo que inserta un nuevo nodo en el ABB en forma recursiva
	public void insertaADTrecursivo (T dato) {
          if (this.raiz==null){
              this.raiz=new NodoArbol<T> (dato);
          }
          else{
            insertaADTUtil(raiz, dato);
	}}
	
	
// Metodo de utileria para apoyar al metodo de insercion recursivo
    private void insertaADTUtil (NodoArbol <T> nodo, T dato) {	
        
	int  i= nodo.dato.compareTo(dato);
            //eldato esta  en el árbol
             if (i==0){
               return;    
            }
                
            if (i>0){
                if (nodo.izq==null){
                    nodo.izq= new NodoArbol<T> (dato);
                }
                
                else {
                    insertaADTUtil(nodo.izq, dato);
                    }
                
                }
            else{
                if (nodo.der==null){
                     nodo.der= new NodoArbol<T> (dato);
                }
                    
                else {
                    insertaADTUtil(nodo.der, dato);
                    }
                }
    }
        
        
    
}
