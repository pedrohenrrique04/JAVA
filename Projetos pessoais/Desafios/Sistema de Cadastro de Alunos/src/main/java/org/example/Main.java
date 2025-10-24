package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[100];
        Scanner scanner = new Scanner(System.in);
        int i;
        int matricula = 0;

        do {
            System.out.println("1 - Cadastrar aluno\n" +
                    "2 - Listar alunos\n" +
                    "3 - Buscar aluno por matrícula\n" +
                    "4 - Mostrar média geral da turma\n" +
                    "5 - Sair\n" +
                    "Escolha uma opção: ");
            i = scanner.nextInt();
            scanner.nextLine();
            switch (i){
                case 1:
                    alunos[matricula] = new Aluno();
                    System.out.println("Digite o nome do aluno: ");
                    String nome = scanner.nextLine();
                    alunos[matricula].setNome(nome);

                    System.out.println("A matricula desse aluno e: " + matricula);

                    System.out.println("Nota do aluno: ");
                    int nota = scanner.nextInt();
                    alunos[matricula].setNota(nota);

                    matricula++;
                    System.out.println(alunos[0].toString());
                    System.out.println(matricula);
                    break;

                case 2:
                    break;
            }

        }while (i != 5);
}}