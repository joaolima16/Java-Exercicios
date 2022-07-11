package ClassesTeste;
import java.util.Scanner;
public class ProdutoTeste {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		Produto p = new Produto();
		p.produto = "Carrinho";
		System.out.println(p.produto);
	}
}
