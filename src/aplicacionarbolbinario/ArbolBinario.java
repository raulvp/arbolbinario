
package aplicacionarbolbinario;

public class ArbolBinario {
    
    NodoArbol raiz;
    
    public ArbolBinario(){
        raiz = null;
    }
    
    //metodo para agregar un nodo
    public void agregarNodo(int d){
        NodoArbol nuevo = new NodoArbol(d);
        if(raiz==null){
            raiz = nuevo;
        }
        else{
            NodoArbol auxiliar = raiz;
            NodoArbol padre;
            
            while(true){
                padre = auxiliar; //valor de la raiz
                if(d<auxiliar.dato){
                    auxiliar = auxiliar.hijoIzq;
                    if(auxiliar==null){
                        padre.hijoIzq = nuevo;
                        return;//finalizar
                    }
                }else{
                    auxiliar = auxiliar.hijoDer;
                    if(auxiliar==null){
                        padre.hijoDer = nuevo;
                        return;
                    }
                }
            }
        }
    }
    
}
