package ifpr.pgua.tads;

public class Pilha {

    private Object[] elementos = new Object[5];
    private int tamanhoPilha = 0;

    public Boolean estaVazia() {
        return (this.tamanhoPilha== 0);
    }

    public int tamanho() {
        return this.tamanhoPilha;
    }

    public void empilhar(Object elemento) {
        this.elementos[this.tamanhoPilha] = elemento;
        this.tamanhoPilha ++;
    }

    public Object topo() {
        return this.elementos[this.tamanhoPilha-1];
    }

    public Object desempilhar() {
        Object ultimoElemento = topo();
        this.tamanhoPilha--;
        return ultimoElemento;
    }
}
