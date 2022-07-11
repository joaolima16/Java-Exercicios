package ClassesTeste;

public class AreaCirc {
	double raio;
	double pi;
	AreaCirc(double raioInicial){
		pi = 3.14;
	}
	double Area(){
		return pi * Math.pow(raio, 2);
	}
}
