package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos funcionários serão cadastrados?");
		int N = sc.nextInt();
		System.out.println();
		
		
		List<Funcionario> fun = new ArrayList<>();
		
		for (int i =0; i<N; i++) {
			System.out.println("Funcionário #" + (i+1) + ":");
			System.out.print("Id:");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome:");
			String nome = sc.nextLine();
			System.out.print("Salário:");
			double salario = sc.nextDouble();
			sc.nextLine();
			
			 Funcionario funcionario = new Funcionario(id, nome, salario);
	         fun.add(funcionario);	
	         System.out.println();
		}
		
		System.out.print("Informe o ID do funcionário que terá aumento salarial:");
		int idFuncionario = sc.nextInt();
		
		 Funcionario func = null;
		 
		 for (Funcionario f : fun) {
			 if (f.getId() == idFuncionario) {
				 func = f;
				 break;
			 }
		 }
		
		if (func != null) {
			System.out.print("Insira a porcentagem:");
			double porcentagem = sc.nextDouble();
			func.aumentarSalario(porcentagem);
			
		} else {
			System.out.println("Este ID não existe!");
		}
		System.out.println();
		System.out.println("Lista de funcionários:");
		for (Funcionario fu : fun) {
			System.out.println(fu);
		}	
		
		sc.close();

	}

}
