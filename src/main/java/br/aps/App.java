package br.aps;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {

    public static Pilha pilha;
    public static Fila fila;
    public static Scanner scanner;

    public static void main(String[] args) {
        
        pilha = new Pilha();
        fila = new Fila();

        /*
            pilha.push(new Brinquedo("brinquedo7"));
            pilha.push(new Brinquedo("brinquedo4"));
            pilha.push(new Pessoa("Esta pessoa não entra na pilha"));
            pilha.push(new Brinquedo("brinquedo312"));




            fila.push(new Pessoa("pessoa1"));
            fila.push(new Brinquedo("Esse brinquedo n entra na fila"));
            fila.push(new Pessoa("pessoa2"));
            fila.push(new Pessoa("pessoa3"));


            System.out.println(pilha.show());
            pilha.pop();
            System.out.println(pilha.show());

            System.out.println(fila.show());
            fila.pop();
            System.out.println(fila.show());
        
    */

        scanner = new Scanner(System.in);
        System.out.println("Bem vindo\n");
        System.out.println("Breve explicação sobre o sistema onde vc adiciona pessoas, adiciona brinquedos e depois da um brinquedo pra cada pessoa\n");

        int opt = 0;
        do{
            System.out.println("1 - Adicionar pessoas seila");
            System.out.println("2 - Adicionar brinquedos");
            System.out.println("3 - Remover pessoas");
            System.out.println("4 - Remover brinquedos");
            System.out.println("5 - Entregar brinquedos (pega um brinquedo do final da pilha e da pra primeira pessoa da fila)");
            System.out.println("6 - Ajuda");
            System.out.println("7 - Sair");
            try{
                System.out.print("\n> ");
                opt = Integer.parseInt(scanner.nextLine());
            }catch(Exception erro){
                System.out.println("Por favor digite apenas numeros\n");
                opt = 0;
            }

            switch(opt){
                case 0:{
                    //Nao faz nada
                    break;
                }
                case 1:{
                    break;
                }
                case 2:{
                    break;
                }
                case 3:{
                    break;
                }
                case 4:{
                    break;
                }
                case 5:{
                    break;
                }
                case 6:{
                    break;
                }
                case 7:{
                    break;
                }
                default:{
                    System.out.println("Por favor digite apenas algumas das opções a cima\n");
                }
            }

            System.out.println();
        }while(opt != 7);
        System.out.println("Até logo");

    }
}
