package com.mycompany.cadaluno;

import java.util.ArrayList;

public class Aluno {
    float total;
    String nome, cpf, situacao = "Reprovado";
    ArrayList<Float> notaAluno = new ArrayList<>();

    public Aluno() {
    }
    
    public Aluno(String nome, String cpf){
        setNome(nome);
        setCpf(cpf);
    }

    void insereNotas(float nota){
        notaAluno.add(nota);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    void listar(){
        System.out.println("\nNome: " + this.nome);
        System.out.println("CPF: " + this.cpf);

        for (int i = 0; i < notaAluno.size(); i++) {
            System.out.println("Nota " + ( i + 1 ) + ": " + this.notaAluno.get(i));
        }
    }

    void mostraSituacao(){
        System.out.println("\nNome: " + this.nome);
        System.out.println("\nTotal: " + this.total);
        System.out.println("\nSituações: " + this.situacao);    
    }

    void calculaNotas(){
        for(float notaDaLista:notaAluno){
        total = total + notaDaLista;
        }
    
        if(total >= 70){
            this.situacao = "Aprovado"; 
        }else{
            this.situacao = "Reprovado";
        }   
    }

    public ArrayList<Float> getNotaAluno() {
        return notaAluno;
    }

    public void setNotaAluno(ArrayList<Float> notaAluno) {
        this.notaAluno = notaAluno;
    }
}

