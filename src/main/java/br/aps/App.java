package br.aps;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Locale;

/**
 * Hello world!
 */
public final class App {

    public static Pilha pilha;
    public static Fila fila;
    public static Scanner scanner;
    public static StringTokenizer tokenizer;

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

        scanner = new Scanner(System.in).useLocale(new Locale("pt", "BR"));
        System.out.println("Bem vindo\n");
        System.out.println("Breve explicação sobre o sistema onde vc adiciona pessoas, adiciona brinquedos e depois da um brinquedo pra cada pessoa\n");

        int opt = 0;
        do{
            System.out.println("1 - Adicionar pessoas seila");
            System.out.println("2 - Adicionar brinquedos");
            System.out.println("3 - Listar pessoas");
            System.out.println("4 - Listar brinquedos");
            System.out.println("5 - Remover pessoas");
            System.out.println("6 - Remover brinquedos");
            System.out.println("7 - Entregar brinquedos (pega um brinquedo do final da pilha e da pra primeira pessoa da fila)");
            System.out.println("8 - Ajuda");
            System.out.println("9 - Sair");
            try{
                System.out.print("\n> ");
                opt = Integer.parseInt(scanner.nextLine());
            }catch(Exception erro){
                System.out.println("Por favor digite apenas numeros\n");
                opt = 0;
            }

            switch(opt){
                case 0:{break;}
                case 1:{
                    String nomePessoa = "";
                    System.out.println("Insira uma pessoa na fila");
                    System.out.println("Formato: <nomePessoa> ...");
                    System.out.print("\n> ");
                    try{
                        tokenizer = new StringTokenizer(scanner.nextLine());
                        nomePessoa = tokenizer.nextToken();
                        fila.push(new Pessoa(nomePessoa));
                        System.out.println(nomePessoa + "Adicionado(a) a fila");
                    }
                    catch(Exception erro){
                        System.out.println("Por favor digite apenas caracteres validos: AZ-az");
                    }
                    break;
                }
                case 2:{
                    String nomeBrinquedo = "";
                    System.out.println("Insira um brinquedo na pilha");
                    System.out.println("Formato: <nomeBrinquedo> ...");
                    System.out.print("\n> ");
                    try{
                        tokenizer = new StringTokenizer(scanner.nextLine());
                        nomeBrinquedo = tokenizer.nextToken();
                        fila.push(new Brinquedo(nomeBrinquedo));
                        System.out.println(nomeBrinquedo + "Adicionado(a) a pilha");
                    }
                    catch(Exception erro){
                        System.out.println("Por favor digite apenas caracteres validos: AZ-az");
                    }
                   

                    break;
                }
                case 3:{
                    System.out.println(fila.show());
                    break;
                }
                case 4:{
                    System.out.println(pilha.show());
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
                case 8:{
                    break;
                }
                case 9:{break;}
                default:{
                    System.out.println("Por favor digite apenas algumas das opções a cima\n");
                }
            }

            System.out.println();
        }while(opt != 9);
        System.out.println("Até logo");
    }

}
