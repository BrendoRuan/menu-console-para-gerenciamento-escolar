package GestãoEscolar;

import java.util.Scanner;

public class Aluno extends Pessoa {
	private static String matricula;

	// Instâncias dos Aluno
	static Aluno aluno = new Aluno("Brendo", "19", "81 98888-7777", "Rua A2", "987.235.235-90", "87.346.457", "A001");
	static Aluno aluno2 = new Aluno("Ruan", "18", "81 93388-6677", "Rua f3", "673.078.563-90", "90.837.987", "A002");
	static Aluno aluno3 = new Aluno("Carlos", "17", "81 99876-5432", "Rua B2", "345.678.901-23", "34.567.891", "A003");
	static Aluno aluno4 = new Aluno("Felipe", "18", "81 98765-4321", "Rua C3", "456.789.012-34", "45.678.901", "A004");
	static Aluno aluno5 = new Aluno("Vitor", "18", "81 91234-5678", "Rua D5", "567.890.123-45", "56.789.011", "A005");
	static Aluno aluno6 = new Aluno("Kaiky", "17", "81 99876-5432", "Rua T4", "678.901.234-56", "67.890.121", "A006");
	static Aluno aluno7 = new Aluno("Hebert", "18", "81 91234-5678", "Rua Z1", "789.012.345-67", "78.901.231", "A007");
	static Aluno aluno8 = new Aluno("Lucio", "18", "81 99876-5432", "Rua F10", "890.123.456-78", "89.012.341", "A008");
	static Aluno aluno9 = new Aluno("Luan", "19", "81 98765-4321", "Rua K8", "901.234.567-89", "90.123.451", "A009");
	static Aluno aluno10 = new Aluno("Santhiago", "21", "81 99876-5432", "Rua P1", "012.345.678-90", "01.234.561",
			"A0010");

	// Construtores da classe Aluno
	public Aluno(String nome, String idade, String telefone, String endereco, String cpf, String rg, String matricula) {
		super(nome, idade, telefone, endereco, cpf, rg);
		this.matricula = matricula;
	}

	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome() {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCPF() {
		return cpf;
	}

	public void setCPF(String cpf) {
		this.cpf = cpf;
	}

	public String getRG() {
		return rg;
	}

	public void setRG(String rg) {
		this.rg = rg;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String scanner) {
		this.matricula = matricula;
	}

	// Métodos para exibir as informações sobre os alunos
	public static void informacaoAluno() {
		System.out.println("NOME: " + aluno.getNome());
		System.out.println("IDADE: " + aluno.getIdade());
		System.out.println("TELEFONE: " + aluno.getTelefone());
		System.out.println("ENDEREÇO" + aluno.getEndereco());
		System.out.println("CPF: " + aluno.getCPF());
		System.out.println("RG: " + aluno.getRG());
		System.out.println("MATRICULA: " + aluno.getMatricula());
	}

	public static void informacaoAluno2() {
		System.out.println("NOME: " + aluno2.getNome());
		System.out.println("IDADE: " + aluno2.getIdade());
		System.out.println("TELEFONE: " + aluno2.getTelefone());
		System.out.println("ENDEREÇO" + aluno2.getEndereco());
		System.out.println("CPF: " + aluno2.getCPF());
		System.out.println("RG: " + aluno2.getRG());
		System.out.println("MATRICULA: " + aluno2.getMatricula());
	}

	public static void informacaoAluno3() {
		System.out.println("NOME: " + aluno3.getNome());
		System.out.println("IDADE: " + aluno3.getIdade());
		System.out.println("TELEFONE: " + aluno3.getTelefone());
		System.out.println("ENDEREÇO" + aluno3.getEndereco());
		System.out.println("CPF: " + aluno3.getCPF());
		System.out.println("RG: " + aluno3.getRG());
		System.out.println("MATRICULA: " + aluno3.getMatricula());
	}

	public static void informacaoAluno4() {
		System.out.println("NOME: " + aluno4.getNome());
		System.out.println("IDADE: " + aluno4.getIdade());
		System.out.println("TELEFONE: " + aluno4.getTelefone());
		System.out.println("ENDEREÇO" + aluno4.getEndereco());
		System.out.println("CPF: " + aluno4.getCPF());
		System.out.println("RG: " + aluno4.getRG());
		System.out.println("MATRICULA: " + aluno4.getMatricula());
	}

	public static void informacaoAluno5() {
		System.out.println("NOME: " + aluno5.getNome());
		System.out.println("IDADE: " + aluno5.getIdade());
		System.out.println("TELEFONE: " + aluno5.getTelefone());
		System.out.println("ENDEREÇO" + aluno5.getEndereco());
		System.out.println("CPF: " + aluno5.getCPF());
		System.out.println("RG: " + aluno5.getRG());
		System.out.println("MATRICULA: " + aluno5.getMatricula());
	}

	public static void informacaoAluno6() {
		System.out.println("NOME: " + aluno6.getNome());
		System.out.println("IDADE: " + aluno6.getIdade());
		System.out.println("TELEFONE: " + aluno6.getTelefone());
		System.out.println("ENDEREÇO" + aluno6.getEndereco());
		System.out.println("CPF: " + aluno6.getCPF());
		System.out.println("RG: " + aluno6.getRG());
		System.out.println("MATRICULA: " + aluno6.getMatricula());
	}

	public static void informacaoAluno7() {
		System.out.println("NOME: " + aluno7.getNome());
		System.out.println("IDADE: " + aluno7.getIdade());
		System.out.println("TELEFONE: " + aluno7.getTelefone());
		System.out.println("ENDEREÇO" + aluno7.getEndereco());
		System.out.println("CPF: " + aluno7.getCPF());
		System.out.println("RG: " + aluno7.getRG());
		System.out.println("MATRICULA: " + aluno7.getMatricula());
	}

	public static void informacaoAluno8() {
		System.out.println("NOME: " + aluno8.getNome());
		System.out.println("IDADE: " + aluno8.getIdade());
		System.out.println("TELEFONE: " + aluno8.getTelefone());
		System.out.println("ENDEREÇO" + aluno8.getEndereco());
		System.out.println("CPF: " + aluno8.getCPF());
		System.out.println("RG: " + aluno8.getRG());
		System.out.println("MATRICULA: " + aluno8.getMatricula());
	}

	public static void informacaoAluno9() {
		System.out.println("NOME: " + aluno9.getNome());
		System.out.println("IDADE: " + aluno9.getIdade());
		System.out.println("TELEFONE: " + aluno9.getTelefone());
		System.out.println("ENDEREÇO" + aluno9.getEndereco());
		System.out.println("CPF: " + aluno9.getCPF());
		System.out.println("RG: " + aluno9.getRG());
		System.out.println("MATRICULA: " + aluno9.getMatricula());
	}

	public static void informacaoAluno10() {
		System.out.println("NOME: " + aluno10.getNome());
		System.out.println("IDADE: " + aluno10.getIdade());
		System.out.println("TELEFONE: " + aluno10.getTelefone());
		System.out.println("ENDEREÇO" + aluno10.getEndereco());
		System.out.println("CPF: " + aluno10.getCPF());
		System.out.println("RG: " + aluno10.getRG());
		System.out.println("MATRICULA: " + aluno10.getMatricula());
	}
}