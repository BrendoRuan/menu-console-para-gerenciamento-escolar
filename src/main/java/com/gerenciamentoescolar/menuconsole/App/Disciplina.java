package GestãoEscolar;

public class Disciplina {
	private String nome;
	private int nota;

	static Disciplina disc = new Disciplina("POO.", 7);

	// Construtor da classe Disciplina
	public Disciplina(String nome, int nota) {
		this.nome = nome;
		this.nota = nota;
	}

	// getters e setters
	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	// Métodos para exibir as informações sobre as disciplinas
	public static void informacaoDisciplina() {
		System.out.println("PROFESSOR: Jorge Denis.");
		System.out.println("DISCIPLINA: " + disc.getNota());
		System.out.println("MÉDIA NOTA: " + disc.getNota());
	}

	public static void informacaoDisciplina2() {
		System.out.println("PROFESSOR: André Gustavo");
		System.out.println("DISCIPLINA: Banco de Dados");
		System.out.println("MÉDIA NOTA: 8");
	}

	public static void informacaoDisciplina3() {
		System.out.println("PROFESSOR: Ivson Gustavo");
		System.out.println("DISCIPLINA: Front-End");
		System.out.println("MÉDIA NOTA: 6.5");
	}

	public static void informacaoDisciplina4() {
		System.out.println("PROFESSOR: Aldo Moura");
		System.out.println("DISCIPLINA: Algoritmo");
		System.out.println("MÉDIA NOTA: 7.5");
	}
}