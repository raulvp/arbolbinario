
package aplicacionarbolbinario;

public class NodoArbol {
    int dato;
    NodoArbol hijoIzq, hijoDer;
    
    public NodoArbol(int dato){
        this.dato = dato;
        hijoIzq = null;
        hijoDer = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoArbol getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(NodoArbol hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public NodoArbol getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(NodoArbol hijoDer) {
        this.hijoDer = hijoDer;
    }
    
    @Override
    public String toString(){
        return "El valor del nodo arbol es: "+ dato;
    }
}
