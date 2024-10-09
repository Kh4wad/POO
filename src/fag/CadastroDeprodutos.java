package fag;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import objeto.fag.Produto;



public class CadastroDeprodutos {
	public  static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Produto>Objeto = new ArrayList<Produto>();
int N = 0;
int J = 1;
int T = 1;
for(J=T; J!=3; T--) {
if(N!=3) {
System.out.println("Escolha uma das opções: 1 - adicionar produto, 2 - para mostrar os produtos e 3 - para sair ");
N = 0;
N = scanner.nextInt();
int P = N;
if(P!=3) {
if(N == 1) {
	System.out.println("Quantos produtos quer adicionar ?");
	int A = 0;
    A = scanner.nextInt();

	for(int i = A; i>0; i--) {
	System.out.println("Coloque o nome do produto");
	String nome = scanner.next();
	
	System.out.println("Coloque o preco");
	Double preco = scanner.nextDouble();
	
	System.out.println("Coloque a quantidade");
	int quantidade = scanner.nextInt();
	
	Produto produto = new Produto(nome,preco,quantidade);
	Objeto.add(produto);
	}
}else if(N == 2) {
	if(Objeto.isEmpty()) {
		System.out.println("Não contém nada na lista");
	}else {
		for(Produto Lista : Objeto ) {
			System.out.println(Lista);
		}
	}
}
	
	N=0;
}else if(N == 3) {
	System.out.println("Você saiu");
T=3;

}
}
	}
	}
}

	
	