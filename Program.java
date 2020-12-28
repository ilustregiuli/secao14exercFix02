package secao14exercFix02;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> contribuinte = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int pagantes = sc.nextInt();
		
		for(int i = 1; i < pagantes; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)?");
			char op = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double renda = sc.nextDouble();
			if(op == 'i') {
				System.out.print("Health expenditures: ");
				double gastosMed = sc.nextDouble();
				contribuinte.add(new PessoaFisica(name,renda,gastosMed));
			} else if(op == 'c') {
				System.out.println("Number of employees: ");
				int numEmp = sc.nextInt();
				contribuinte.add(new PessoaJuridica(name,renda,numEmp));
			}
		}
		
		System.out.println("TAXES PAID: ");
		for(Contribuinte contrib : contribuinte ) {
			System.out.println(contrib.getNome() + ": $" + contrib.calcularImposto());
		}
		
		
		
		sc.close();

	}

}
