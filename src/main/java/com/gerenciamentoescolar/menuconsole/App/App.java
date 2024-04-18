package GestãoEscolar;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);

		// Variáveis para armazenar informações sobre professores, alunos, turmas e disciplinas
		String nomePf;
		String nomePfidade;
		String nomePftele;
		String nomePfende;
		String nomePfcpf;
		String nomePfrg;
		String nomePfcadastro;

		int menuAdd;

		String nomeAln;
		String nomeAlnidade;
		String nomeAlntele;
		String nomeAlnende;
		String nomeAlncpf;
		String nomeAlnrg;
		String nomeAlnmatricula;

		int i;

		String nomeTurma;

		int num;

		String nomeDisciplina;

		int num2;
		//

		// Exibe o menu principal
		menu.menduPrincipal();

		// Loop principal do Programa
		do {
			// Scanner para entrar no menu Adicionar ou Exibir
			i = Sc.nextInt();
			// Loop do menu Adicionar
			if (i == 1) {
				// Exibir o menu adicionar
				menu.menuAdd();
				// Scanner para entrar em Professor, Aluno, Turma e Disciplina
				menuAdd = Sc.nextInt();

				// Estrutura de repetição para adicionar professor
				switch (menuAdd) {
				case 1:
					System.out.println("Nome do Professor: ");
					nomePf = Sc.next();

					System.out.println("Idade do Professor: ");
					nomePfidade = Sc.next();

					System.out.println("Telefone do Professor: ");
					nomePftele = Sc.next();

					System.out.println("Endereço do Professor: ");
					nomePfende = Sc.next();

					System.out.println("CPF do Professor: ");
					nomePfcpf = Sc.next();

					System.out.println("Rg do Professor: ");
					nomePfrg = Sc.next();

					System.out.println("Cadastro do Professor: ");
					nomePfcadastro = Sc.next();

					System.out.println("Informações adidicionadas: " + " \nNOME: " + nomePf + " \nIDADE: " + nomePfidade
							+ " \nTELEFONE: " + nomePftele + " \nENDEREÇO: " + nomePfende + " \nCPF: " + nomePfcpf
							+ " \nRG: " + nomePfrg + " \nCADASTRO: " + nomePfcadastro);
					break;
				// Estrutura de repetição para adicionar aluno
				case 2:
					System.out.println("Nome do Aluno: ");
					nomeAln = Sc.next();

					System.out.println("Idade do Aluno: ");
					nomeAlnidade = Sc.next();

					System.out.println("Telefone do Aluno: ");
					nomeAlntele = Sc.next();

					System.out.println("Endereço do Aluno: ");
					nomeAlnende = Sc.next();

					System.out.println("CPF do Aluno: ");
					nomeAlncpf = Sc.next();

					System.out.println("RG do Aluno: ");
					nomeAlnrg = Sc.next();

					System.out.println("Matricula do Aluno: ");
					nomeAlnmatricula = Sc.next();

					System.out.println("Informações adidicionadas: " + " \nNOME: " + nomeAln + " \nIDADE: "
							+ nomeAlnidade + " \nTELEFONE: " + nomeAlntele + " \nENDEREÇO: " + nomeAlnende + " \nCPF: "
							+ nomeAlncpf + " \nRG: " + nomeAlnrg + " \nMATRICULA: " + nomeAlnmatricula);
					break;
				// Estrutura de repetição para adicionar turma
				case 3:
					System.out.println("Nome da Turma: ");
					nomeTurma = Sc.next();

					System.out.println("Informações adidicionadas: " + " \nNOME: " + nomeTurma);
					break;
				// Estrutura de repetição para adicionar disciplina
				case 4:
					System.out.println("Nome da Disciplina: ");
					nomeDisciplina = Sc.next();

					System.out.println("Informações adidicionadas: " + " \nNOME: " + nomeDisciplina);
					break;
				default:
					// Mensagem de default para escolhar errada
					System.out.println("Escolha inválida. Tente novamente.");
				}
				// Exibe o menu principal
				menu.menduPrincipal();
			} else if (i == 2) {
				// Loop do menu exibir
				do {
					// Exibe o menu exibir
					menu.menuExibir();
					// Scanner para entrar em Professor, Aluno, Turma e Disciplina
					num = Sc.nextInt();

					switch (num) {
					case 1:
						// Exibe o menu Professor
						menu.menuProfessor();
						// Exibe os professores
						num2 = Sc.nextInt();

						if (num2 == 1) {
							Professor.informacaoProfessor();
						} else if (num2 == 2) {
							Professor.informacaoProfessor2();
						} else if (num2 == 3) {
							Professor.informacaoProfessor3();
						} else if (num2 == 4) {
							Professor.informacaoProfessor4();
						}
						break;
					case 2:
						// Exibe o menu Aluno
						menu.menuAluno();
						// Exibe os alunos
						num2 = Sc.nextInt();

						if (num2 == 1) {
							Aluno.informacaoAluno();
						} else if (num2 == 2) {
							Aluno.informacaoAluno2();
						} else if (num2 == 3) {
							Aluno.informacaoAluno3();
						} else if (num2 == 4) {
							Aluno.informacaoAluno4();
						} else if (num2 == 5) {
							Aluno.informacaoAluno5();
						} else if (num2 == 6) {
							Aluno.informacaoAluno6();
						} else if (num2 == 7) {
							Aluno.informacaoAluno7();
						} else if (num2 == 8) {
							Aluno.informacaoAluno8();
						} else if (num2 == 9) {
							Aluno.informacaoAluno9();
						} else if (num2 == 10) {
							Aluno.informacaoAluno10();
						}
						break;
					case 3:
						// Exibe o menu Turma
						menu.menuTurma();
						// Exibe as turmas
						num2 = Sc.nextInt();
						if (num2 == 1) {
							turma.informacaoTurma();
						} else if (num2 == 2) {
							turma.informacaoTurma2();
						}
						break;
					case 4:
						// Exibe o menu Discplina
						menu.menuDisciplina();
						// Exibe as Disciplina
						num2 = Sc.nextInt();

						if (num2 == 1) {
							Disciplina.informacaoDisciplina();
						} else if (num2 == 2) {
							Disciplina.informacaoDisciplina2();
						} else if (num2 == 3) {
							Disciplina.informacaoDisciplina3();
						} else if (num2 == 4) {
							Disciplina.informacaoDisciplina4();
						}
						break;
					default:
						// Mensagem de default para escolhar errada
						System.out.println("Escolha inválida. Tente novamente.");
					}

				} while (num != 5);
				// Exibe o menu Principal
				menu.menduPrincipal();
			}

		} while (i != 5);
		// Mensagem de encerramento do sistema
		System.out.println("Sistema Encerrado!");
	}
}