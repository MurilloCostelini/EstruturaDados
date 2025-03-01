package code;

import lista.*;

public class code {
    public static void main(String[] args) {
        
        ListaSimples ls = new ListaSimples();
        ls.inserePrimeiroNo(15);
        
        System.out.println("Tamanho da lista: " + ls.tamanhoLista());
        System.out.println("Lista: " + ls.imprimir());
    }
}
