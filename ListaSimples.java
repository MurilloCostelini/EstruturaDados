package lista;

public class ListaSimples {
    private No inicio;
    
    public ListaSimples() {
        this.inicio = null;
    }
    
    public boolean listaVazia() {
        return (this.inicio == null);
    }
      
    public boolean inserePrimeiroNo(double valor) {
        if (!listaVazia()) { return false; }
        No aux = new No(valor);
        this.inicio = aux;
        return true;        
    }
    
    public No localizaUltimo() {
        if (listaVazia()) return null;
        
        No aux = this.inicio;
        while (aux.getProx() != null) {
            aux = aux.getProx();
        }
        return aux;
    }
    
    public boolean insereFinalLista(double valor) {
        if (listaVazia()) {
            return inserePrimeiroNo(valor);
        }
        
        No aux = new No(valor);
        No ultimo = localizaUltimo();
        if (ultimo != null) {
            ultimo.setProx(aux);
        }
        return true;
    }

    public boolean insereInicioLista(double valor) {
        if (listaVazia()) {
            return inserePrimeiroNo(valor);
        }

        No aux = new No(valor);
        aux.setProx(this.inicio);
        this.inicio = aux;
        return true;
    }

    public int tamanhoLista() {
        if (listaVazia()) { return 0; }
        
        int tamanho = 0;
        No aux = this.inicio;
        while (aux != null) {
            tamanho++;
            aux = aux.getProx();
        }
        return tamanho;
    }

    public boolean insereMeioLista(double valor, int pos) {
        if ((pos < 1) || (pos >= tamanhoLista())) {
            return false;
        }
        No aux = this.inicio;
        for (int i = 0; i < pos - 1; i++) {
            aux = aux.getProx();
        }
       
        No aux1 = new No(valor);
        aux1.setProx(aux.getProx());
        aux.setProx(aux1);
        return true;
    }
        
    public String imprimir() {
        if (listaVazia()) return "Lista Vazia";
                
        No aux = this.inicio;
        String temp = " " + aux.getValor() + " ";
        while (aux.getProx() != null) {
            aux = aux.getProx();
            temp = temp + aux.getValor() + " ";
        }
        return temp;
    }
    
}
