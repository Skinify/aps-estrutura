package br.aps;

public class Pilha extends ListaAbstrata{
    
    @Override
    public boolean push(Object object){
        if(object.getClass().getSimpleName().equals("Brinquedo")){
            No newNode = new No(object);
            if(isEmpty()){
                referencial = newNode;
            }else{
                newNode.setNext(referencial);
                referencial = newNode;
            }
            qtdItens++;
            return true;
        }
        return false;
    }

    @Override
    public Brinquedo peek(){
        if(isEmpty()){
            return null;  
        } 
        return (Brinquedo) referencial.getObject();
    }

    @Override
    public String show(){
        String out = "";
        if(qtdItens == 0){
            return "Não há brinquedos na pilha";
        }
        No aux = referencial;

        while(aux != null){
            //out += ((Brinquedo) aux.getObject()).getNome() + ";" ; //MOSTRAR ORDEM DE SAIDA
            out = ((Brinquedo) aux.getObject()).getNome() + ";" + out ; //MOSTRAR ORDEM DE CHEGADA
            aux = aux.getNext();
        }
        out += "\nRestante: " + qtdItens;

        return out;
    }

}
