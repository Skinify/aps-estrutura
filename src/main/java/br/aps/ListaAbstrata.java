package br.aps;

public abstract class ListaAbstrata {

    protected No referencial = null;
    protected int qtdItens = 0;
    public abstract boolean push(Object object);
    public abstract Object peek();
    public abstract String show();

    public No pop(){
        if(isEmpty()){
            return null;
        }
        No aux = referencial;

        referencial = referencial.getNext();
        qtdItens--;
        return aux;
    }

    public boolean isEmpty(){
        return referencial == null;
    }
    
}