
package aplicacionarbolbinario;

import javax.swing.JOptionPane;


public class AplicacionArbolBinario {

    
    public static void main(String[] args) {
        int opcion=0;
        int elemento;
        ArbolBinario arbol = new ArbolBinario();
        
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un nodo \n"
                        +"2. Recorrido InOrden \n"
                        +"3. Recorrido PreOrden \n"
                        +"4. Recorrido PostOrden \n"
                        +"5. Salir \n"
                        +"Elegir una opcion.......","Arbol Binario",JOptionPane.QUESTION_MESSAGE));
                switch(opcion){
                    case 1: elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Ingrese un valor para el nodo", "Agregando Nodo",JOptionPane.QUESTION_MESSAGE));
                            
                    arbol.agregarNodo(elemento);
                    break;
                    case 2:
                        if(!arbol.estaVacio()){
                            arbol.inOrden(arbol.raiz);
                        }else{
                            JOptionPane.showMessageDialog(null,"TU arbol esta vacio","Debes llenar el mismo"
                            ,JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if(!arbol.estaVacio()){
                            arbol.preOrden(arbol.raiz);
                        }else{
                            JOptionPane.showMessageDialog(null,"TU arbol esta vacio","Debes llenar el mismo"
                            ,JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if(!arbol.estaVacio()){
                            arbol.postOrden(arbol.raiz);
                        }else{
                            JOptionPane.showMessageDialog(null,"TU arbol esta vacio","Debes llenar el mismo"
                            ,JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5: JOptionPane.showMessageDialog(null,"Aplicacion finalizada","Cerrando"
                            ,JOptionPane.INFORMATION_MESSAGE);
                    break;
                    default: JOptionPane.showMessageDialog(null,"Cuidado"+JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null,"Error"+n.getMessage());
            }
        
        }while(opcion!=5);
        
    }
    
}
