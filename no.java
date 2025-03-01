package lista;

public class No {
    private double valor;
    private No prox;
    
    public No(double valor) {
        this.valor = valor;
        this.prox = null;
    } 
    
    public double getValor() { return valor; }
    
    public void setValor(double valor) { this.valor = valor; }
    
    public No getProx() { return prox; }
    
    public void setProx(No prox) { this.prox = prox; }
}
