package GestãoEscolar;

import java.util.Scanner;

public class turma {
	private String nome;
	private Disciplina disciplina;
	private Professor professor;
	private Aluno aluno;

	// Construtor da classe Turma
	public void Turma(String nome, Disciplina disciplina, Professor professor, Aluno aluno) {
		this.nome = nome;
		this.disciplina = disciplina;
		this.professor = professor;
		this.aluno = aluno;
	}

	// Getters Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	// Métodos para exibir as informações sobre as turmas
	public static void informacaoTurma() {
		System.out.println("NOME: 2B");
		System.out.println("PROFESSOR: Jorge Denis");
		System.out.println("DISCIPLINA: POO");
		System.out.println("PROFESSOR: André Gustavo");
		System.out.println("DISCIPLINA: Banco de Dados");
		System.out.println("ALUNOS: Brendo, Ruan, Carlos, Felipe, Vitor");
	}

	public static void informacaoTurma2() {
		System.out.println("NOME: 2A");
		System.out.println("PROFESSOR: Ivson Estavão");
		System.out.println("DISCIPLINA: Front-End");
		System.out.println("PROFESSOR: Aldo Mora");
		System.out.println("DISCIPLINA: Algoritmo");
		System.out.println("ALUNOS: Kaiky, Hebert, Lucio, Luan, Santhiago");
	}
}