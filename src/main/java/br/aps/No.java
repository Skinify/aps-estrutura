package br.aps;

public class No {
    private No next;
    private Object objeto;

    public No(Object objeto){
        this.objeto = objeto;
        next = null;
    }

    public No getNext(){
        return next;
    }

    public void setNext(No next){
        this.next = next;
    }

    public Object getObject(){
        return this.objeto;
    }

}
