package br.aps;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Locale;

/**
 * Teste 
 */
public final class App {

    public static Pilha pilha;
    public static Fila fila;
    public static Scanner scanner;
    public static StringTokenizer tokenizer;

    public static void main(String[] args) {
        
        scanner = new Scanner(System.in).useLocale(new Locale("pt", "BR"));
        pilha = new Pilha();
        fila = new Fila();

        for(int cont = 0; cont < 10; cont++){
            pilha.push(new Brinquedo("Brinquedo - "+ cont));
        }

        System.out.println("Bem vindo\n");

        int opt = 0;
        do{
            System.out.println("1 - Adicionar pessoas na fila");
            System.out.println("2 - Adicionar brinquedos na pilha");
            System.out.println("3 - Listar pessoas na fila");
            System.out.println("4 - Listar brinquedos na pilha");
            System.out.println("5 - Atender pessoa");
            System.out.println("6 - Sair");
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
                    int idadePessoa;
                    System.out.println("Insira uma pessoa na fila");
                    System.out.println("Formato: <nomePessoa> <idadePessoa>");
                    System.out.print("\n> ");
                    try{
                        tokenizer = new StringTokenizer(scanner.nextLine());
                        nomePessoa = tokenizer.nextToken();
                        idadePessoa = Integer.parseInt(tokenizer.nextToken());
                        if(idadePessoa >= 18){
                            int crianca = 2;
                            do{
                                System.out.println("Há uma criança como acompanhante ?");
                                System.out.println("0 - Não");
                                System.out.println("1 - Sim");
                                try{
                                    crianca = Integer.parseInt(scanner.nextLine());
                                    switch(crianca){
                                        case 0:{
                                            fila.push(new Pessoa(nomePessoa, idadePessoa));
                                            System.out.println(nomePessoa + "Adicionado(a) a fila");
                                            break;
                                        }
                                        case 1:{
                                            System.out.println("Por favor insira os dados do acompanhante");
                                            System.out.println("Formato: <nomePessoa> <idadePessoa>");
                                                tokenizer = new StringTokenizer(scanner.nextLine());
                                                String nomeAcompanhante = tokenizer.nextToken();
                                                int idadeAcompanhante = Integer.parseInt(tokenizer.nextToken());
                                                if(idadeAcompanhante <= 12){
                                                    fila.push(new Pessoa(nomePessoa, idadePessoa, new Pessoa(nomeAcompanhante, idadeAcompanhante)));
                                                    System.out.println("Acompanhante adicionado");
                                                }else{
                                                    fila.push(new Pessoa(nomePessoa, idadePessoa));
                                                }
                                                System.out.println(nomePessoa + "Adicionado(a) a fila");
                                            break;
                                        }
                                        default:{
                                            System.out.println("Selecione uma opção");
                                        }
                                    }
                                }
                                catch(Exception erro){
                                    System.out.println("Por favor digite apenas caracteres validos: AZ-az");
                                }
                            }while(crianca != 0 && crianca !=1);
                        }else{
                            System.out.println("Apenas de maiores ");
                        }
                    }
                    catch(Exception erro){
                        System.out.println("Por favor digite apenas caracteres validos: AZ-az");
                    }
                    break;
                }
                case 2:{
                    String nomeBrinquedo = "";
                    System.out.println("Insira um brinquedo na pilha");
                    System.out.println("Formato: <nomeBrinquedo>");
                    System.out.print("\n> ");
                    try{
                        tokenizer = new StringTokenizer(scanner.nextLine());
                        nomeBrinquedo = tokenizer.nextToken();
                        pilha.push(new Brinquedo(nomeBrinquedo));
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
                    if(!fila.isEmpty()){
                        Pessoa pessoa = (Pessoa) fila.pop().getObject();
                            if(pessoa.getAcompanhante() != null){
                                if(!pilha.isEmpty()){
                                    pilha.pop();
                                }else{
                                    System.out.println("A pilha de brinquedos esta vazia");
                                }
                            }
                    }else{
                        System.out.println("A fila esta vazia");
                    }
                    break;
                }
                case 6:{
                    break;
                }
                default:{
                    System.out.println("Por favor digite apenas algumas das opções a cima\n");
                }
            }

            System.out.println();
        }while(opt != 6);
        System.out.println("Até logo");
        
    }

}
