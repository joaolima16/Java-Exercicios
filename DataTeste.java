package ClassesTeste;
import java.util.Scanner;
public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data();
		Scanner dadosD1 = new Scanner(System.in);
		System.out.println("Digite A data de nascimento do primeiro usuário:");
		String data = d1.DateFormated(12,"Agosto", 2015);
		System.out.println(data);
		
		
	}
}
