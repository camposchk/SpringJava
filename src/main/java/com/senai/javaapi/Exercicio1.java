package com.senai.javaapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import lombok.Getter;
import lombok.Setter;

public class Exercicio1 {
   public Exercicio1() 
   { 

   }
   
   public void exercicio1() 
   { 
    for (int i = 1000; i <= 1999; i++) {
        if (i % 11 == 5) {
            System.out.println(i);
        }
    }
   }

   public void exercicio2() 
   {
    int countImpares = 0;

    System.out.print("Números pares: ");

    for (int i = 0; i <= 1000; i++) {
        if (i % 2 == 0) {
            System.out.print(i + " ");
        } else {
            countImpares++;
        }
    }
    System.out.println();
    System.out.println("Quantidade de números ímpares: " + countImpares);
   }

   public void exercicio3() 
   {
    class Pessoa
    {
        @Getter @Setter String nome;
        @Getter @Setter int idade;
    }

    class Funcionario extends Pessoa
    {
        @Getter @Setter int RA;        
    }

    class Usuario extends Pessoa
    {
        @Getter @Setter String senha;        
    }

    Pessoa pessoa = new Pessoa();
    Funcionario func = new Funcionario();
    Usuario user = new Usuario();

    Pessoa pessoa2 = new Pessoa();
    Funcionario func2 = new Funcionario();
    Usuario user2 = new Usuario();

    pessoa.nome = "Carlos";
    pessoa.idade = 20;

    func.nome = "Luiz";
    func.RA = 2223;

    user.nome = "Nicole";
    user.senha = "abcd1234";

    pessoa2.nome = "Carlinho";
    pessoa2.idade = 17;

    func2.nome = "Luizinho";
    func2.RA = 2224;

    user2.nome = "Leticia";
    user2.senha = "abcd12345";

    System.out.println(pessoa.nome);
    System.out.println(pessoa.idade);

    System.out.println(func.nome);
    System.out.println(func.RA);

    System.out.println(user.nome);
    System.out.println(user.senha);

    System.out.println(pessoa2.nome);
    System.out.println(pessoa2.idade);

    System.out.println(func2.nome);
    System.out.println(func2.RA);

    System.out.println(user2.nome);
    System.out.println(user2.senha);
   }

   public void exercicio4() 
   {
    class Funcionario
    {
        @Getter @Setter String nome;
    }

    Funcionario[] funcs = new Funcionario[10];
    List<Funcionario> funcionarios = new ArrayList<Funcionario>();

    funcs[0] = new Funcionario();
    funcs[1] = new Funcionario();

    funcs[0].nome = "Ana";
    funcs[1].nome = "Nilton";

    funcionarios.add(funcs[0]);
    funcionarios.add(funcs[1]);

    for (Funcionario funcionario : funcionarios) {
        System.out.println(funcionario.nome);
    }
   }

   void exercicio5()
   {
    List<Integer> lista = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o tamanho da lista: ");
    int N = sc.nextInt();

    for (int i = 0; i < N; i++)
    {
        System.out.print("Digite um valor: ");
        lista.add(sc.nextInt());
    }

    System.out.println("O maior valor da lista é: " + Collections.max(lista));
   }

   void exercicio6()
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite uma frase: ");
    String frase = sc.nextLine();
    
    String[] palavras = frase.split(" ");
    
    if (palavras.length % 2 == 1) {
        System.out.println("A palavra do meio é: " + palavras[palavras.length / 2]);
    } else {
        System.out.println("As palavras do meio são: " + palavras[(palavras.length / 2) - 1] + " " + palavras[palavras.length / 2]);
    }
   }
}
