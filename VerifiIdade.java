package ClassesTeste;

public class VerifiIdade {
	int idade;
	
	VerifiIdade(int Idade){
		idade = Idade;
	}
	
	String VerificaSituacao(){
		String situacao;
		if(idade>18) {
			situacao = "Habituado";
			return situacao;
		}
		else {
			situacao = "Não Habituado";
		}
		return situacao;
	}
	
}
