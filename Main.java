package com.mycompany.cadaluno;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opc, qntNotas;
        float nota = 0;
        String nome, cpf;
        Sala novaSala = new Sala();
        Aluno novoAluno = new Aluno();
        Scanner teclado; 

        //construção do teclado
        teclado = new Scanner(System.in);
        
        do{
            System.out.println("\n-------------");
            System.out.println("MENU");
            System.out.println("-------------");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Inserir aluno");
            System.out.println("2 - Listar aluno");
            System.out.println("3 - Situações");
            System.out.println("0 - Sair");
            
            opc = teclado.nextInt();
            teclado.nextLine();
            
            switch(opc){
            
                case 1:
                    System.out.println("\nNoome: ");
                    nome = teclado.nextLine();                
                    System.out.println("\nCPF: ");
                    cpf = teclado.nextLine();    

                    novoAluno = new Aluno(nome, cpf);

                    System.out.println("\nQuantas notas?");                
                    qntNotas = teclado.nextInt();
                    
                    for (int i = 0; i < qntNotas; i++) {
                        System.out.println("\nNota " + i);
                        nota = teclado.nextFloat();
                        novoAluno.insereNotas(nota); 
                    }
                    
                    novaSala.insereAluno(novoAluno);

                    break;
            
                case 2:
                    novaSala.listarAlunos();            
                    break;

                case 3:
                    novaSala.listarSituacoes();
                    break;

                default:
                    System.out.println("\nOpção inválida. Escolha uma das alternativas do menu.");

            }

        }while(opc != 0);   
    }
}
