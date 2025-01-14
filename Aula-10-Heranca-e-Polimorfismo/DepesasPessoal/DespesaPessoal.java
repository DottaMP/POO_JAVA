package DepesasPessoal;
import java.time.LocalDate;
import java.util.ArrayList;

public class DespesaPessoal {
	private String cpf;
	ArrayList<Despesa> despesas;
	
	DespesaPessoal (String cpf) {
		this.cpf = cpf;
		despesas = new ArrayList<Despesa>();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public ArrayList<Despesa> getDespesas() {
		return despesas;
	}

	public void setDespesas(ArrayList<Despesa> despesas) {
		this.despesas = despesas;
	}

	@Override
	public String toString() {
		return "DespesaPessoal [cpf=" + cpf + ", despesas=" + despesas + "]";
	}

	public double getTotal() { //fazer somat�rio da lista de despesas
		double total=0;
		for (Despesa despesa: despesas) 
			total += despesa.getValor();
		return total;
	}

	public double getTotal(int mes, int ano) {
		double total=0;
		for (Despesa despesa: despesas) {
			if (mes == despesa.getData().getMonthValue() && ano == despesa.getData().getYear())
				total += despesa.getValor();
		}
		return total;
	}
	
	public double getTotal(LocalDate data) {
		double total=0;
		for (Despesa despesa: despesas) {
			if (despesa.getData().equals(data)) //equals para compara��o de de valores de objetos
				total += despesa.getValor();
		}
		return total;
	}

	public void imprime() {
		System.out.println("\n---------------------------------------------------------------");
		System.out.println("Despesas CPF: "+this.cpf);
		System.out.println("---------------------------------------------------------------");
		for (Despesa despesa: despesas) {
			System.out.println(despesa.getData()+", "+ despesa.getDescDespesa() + ", "+despesa.getValor());
		}		
		System.out.println("---------------------------------------------------------------");
		System.out.println("Total: "+this.getTotal());
	}
	
	public void imprime(int mes, int ano) {
		System.out.println("\n---------------------------------------------------------------");
		System.out.println("Despesas CPF: "+this.cpf +" - Total "+mes+"/"+ano);
		System.out.println("---------------------------------------------------------------");
		for (Despesa despesa: despesas) {
			if (mes == despesa.getData().getMonthValue() && ano == despesa.getData().getYear())
				System.out.println(despesa.getData()+", "+ despesa.getDescDespesa() + ", "+despesa.getValor());
		}		
		System.out.println("---------------------------------------------------------------");
		System.out.println("Total: "+this.getTotal(mes, ano));
	}	
	public void imprime(LocalDate data) {
		System.out.println("\n---------------------------------------------------------------");
		System.out.println("Despesas CPF: "+this.cpf +" - Total "+data);
		System.out.println("---------------------------------------------------------------");
		for (Despesa despesa: despesas) {
			if (despesa.getData().equals(data))
				System.out.println(despesa.getData()+", "+ despesa.getDescDespesa() + ", "+despesa.getValor());
		}		
		System.out.println("---------------------------------------------------------------");
		System.out.println("Total: "+this.getTotal(data));		
	}
	
}