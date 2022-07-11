package ClassesTeste;
import java.util.Scanner;
public class VerifiIdadeTeste {
	
	public static void main(String[] args) {
		System.out.println("Digite a sua idade");
		Scanner Data = new Scanner(System.in);
		VerifiIdade a1 = new VerifiIdade(Data.nextInt());
		System.out.println(a1.VerificaSituacao());
	}
	
}
