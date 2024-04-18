package GestãoEscolar;

import java.util.Scanner;

public class Professor extends Pessoa{

	private static String cadastro;

	Scanner scanner = new Scanner(System.in);

	// Instâncias dos professores
	static Professor professor = new Professor("Jorge Denis", "32", "81 99788-6354", "Rua K", "123.456.789-01",
			"12.348.567", "P001");
	static Professor professor3 = new Professor("Ivson Estevão", "33", "81 91234-5678", "Rua m", "345.678.901-23",
			"34.567.891", "P003");
	static Professor professor4 = new Professor("Aldo Moura", "40", "81 98765-4321", "Rua N", "456.789.012-34",
			"45.678.901", "P004");

	// Construtores da classe Aluno   
	public Professor(String nome, String idade, String telefone, String endereco, String cpf, String rg,
			String cadastro) {
		super(nome, idade, telefone, endereco, cpf, rg);
		this.cadastro = cadastro;
	}

	//Getters e Setters
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

	public String getCadastro() {
		return cadastro;
	}

	public void setCadastro(String cadastro) {
		this.cadastro = cadastro;
	}

    // Métodos para exibir as informações sobre os professores
	public static void informacaoProfessor() {

		System.out.println("NOME: " + professor.getNome());
		System.out.println("IDADE: " + professor.getIdade());
		System.out.println("TELEFONE: " + professor.getTelefone());
		System.out.println("ENDEREÇO: " + professor.getEndereco());
		System.out.println("CPF: " + professor.getCPF());
		System.out.println("RG: " + professor.getRG());
		System.out.println("CADASTRO: " + professor.getCadastro());
	}
	public static void informacaoProfessor2() {
		System.out.println("NOME: André Gustavo");
		System.out.println("IDADE: 52");
		System.out.println("TELEFONE: 81 98755-9163");
		System.out.println("ENDEREÇO: Rua L");
		System.out.println("CPF: 235.463.357-90");
		System.out.println("RG: 32.684.622");
		System.out.println("CADASTRO: P002");
	}
	public static void informacaoProfessor3() {
		System.out.println("NOME: " + professor3.getNome());
		System.out.println("IDADE: " + professor3.getIdade());
		System.out.println("TELEFONE: " + professor3.getTelefone());
		System.out.println("ENDEREÇO: " + professor3.getEndereco());
		System.out.println("CPF: " + professor3.getCPF());
		System.out.println("RG: " + professor3.getRG());
		System.out.println("CADASTRO: " + professor3.getCadastro());
	}
	public static void informacaoProfessor4() {

		System.out.println("NOME: " + professor4.getNome());
		System.out.println("IDADE: " + professor4.getIdade());
		System.out.println("TELEFONE: " + professor4.getTelefone());
		System.out.println("ENDEREÇO: " + professor4.getEndereco());
		System.out.println("CPF: " + professor4.getCPF());
		System.out.println("RG: " + professor4.getRG());
		System.out.println("CADASTRO: " + professor4.getCadastro());
	}
}