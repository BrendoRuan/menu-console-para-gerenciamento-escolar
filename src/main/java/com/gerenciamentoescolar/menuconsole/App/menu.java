package GestãoEscolar;

import java.util.Scanner;

public class menu {

	Scanner Sc = new Scanner(System.in);

	// Método para exibir o menu principal
	public static void menduPrincipal() {
		System.out.println("1 - Menu Adicionar");
		System.out.println("2 - Menu Exibir");
		System.out.println("5 - Encerrar o Sistema");
		System.out.print("Escolha: ");
	}

	// Método para exibir o menu adicionar
	public static void menuAdd() {
		System.out.println("\nEscolha o que deseja adicionar:");
		System.out.println("1 - Adicionar informações da Professor");
		System.out.println("2 - Adicionar informações do Aluno");
		System.out.println("3 - Adicionar informações do Turma");
		System.out.println("4 - Adicionar informações da Disciplina");
		System.out.println("5 - Voltar ao menu principal");
		System.out.print("Escolha: ");
	}

	// Método para exibir o menu exibir
	public static void menuExibir() {
		System.out.println("\nEscolha o que deseja exibir:");
		System.out.println("1 - Exibir informações da Professor");
		System.out.println("2 - Exibir informações do Aluno");
		System.out.println("3 - Exibir informações do Turma");
		System.out.println("4 - Exibir informações da Disciplina");
		System.out.println("5 - Voltar para o Menu Principal");
		System.out.print("Escolha: ");
	}

	// Método para exibir o menu exibir professor
	public static void menuProfessor() {
		System.out.println("Escolha o Professor: ");
		System.out.println("1 - Jorge Denis");
		System.out.println("2 - André Gustavo");
		System.out.println("3 - Ivson Estevão");
		System.out.println("4 - Aldo Moura");
	}

	// Método para exibir o menu exibir aluno
	public static void menuAluno() {
		System.out.println("Escolha o Aluno: ");
		System.out.println("1 - Brendo");
		System.out.println("2 - Ruan");
		System.out.println("3 - Carlos");
		System.out.println("4 - Felipe");
		System.out.println("5 - Vitor");
		System.out.println("6 - Kaiky");
		System.out.println("7 - Hebert");
		System.out.println("8 - Lucio");
		System.out.println("9 - Luan");
		System.out.println("10 - Santhiago");
	}

	// Método para exibir o menu exibir turma
	public static void menuTurma() {
		System.out.println("Escolha a Turma: ");
		System.out.println("1 - 2B");
		System.out.println("2 - 2A");
	}

	// Método para exibir o menu exibir disciplina
	public static void menuDisciplina() {
		System.out.println("Escolha a Disciplina: ");
		System.out.println("1 - POO");
		System.out.println("2 - Banco de Dados");
		System.out.println("3 - Front-End");
		System.out.println("4 - Algoritmo");
	}
}