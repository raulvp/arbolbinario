
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
                        +"2. Salir \n"
                        +"Elegir una opcion.......","Arbol Binario"));
                switch(opcion){
                    case 1: elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Ingrese un valor para el nodo", "Agregando Nodo",JOptionPane.QUESTION_MESSAGE));
                            
                    arbol.agregarNodo(elemento);
                    break;
                    
                    case 2: JOptionPane.showMessageDialog(null,"Aplicacion finalizada","Cerrando"
                            ,JOptionPane.INFORMATION_MESSAGE);
                    default: JOptionPane.showMessageDialog(null,"Cuidado"+JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null,"Error"+n.getMessage());
            }
        
        }while(opcion!=2);
        
    }
    
}
