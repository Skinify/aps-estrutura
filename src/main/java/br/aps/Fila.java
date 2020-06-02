package br.aps;

public class Fila extends ListaAbstrata{
    
    @Override
    public boolean push(Object object){
        if(object.getClass().getSimpleName().equals("Pessoa")){
            No newNode = new No(object);
            if(isEmpty()){
                referencial = newNode;
            }else{
                No aux = referencial;
                while(aux.getNext() != null){
                    aux = aux.getNext();
                }
                aux.setNext(newNode);
            }
            qtdItens++;
            return true;
        }
        return false;
    }

    @Override
    public Pessoa peek(){
        if(isEmpty()){
            return null;
        }

        return (Pessoa) referencial.getObject();
    }


    @Override
    public String show(){
        String out = "";
        if(qtdItens == 0){
            return "Não há pessoas na fila";
        }

        No aux = referencial;

        while(aux != null){
            out += ((Pessoa) aux.getObject()).getName() + ";" ;
            aux = aux.getNext();
        }
        out += "\nRestante: " + qtdItens;

        return out;
    }
    
}