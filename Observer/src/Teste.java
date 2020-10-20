
public class Teste {
	public static void main(String[] args) {
		
		SeInscreveu seinscreveu = new SeInscreveu();
		
		Observer obj1 = new Inscritos("Maria");
		
		seinscreveu.registro(obj1);

		obj1.setSujeito(seinscreveu);
		
		obj1.atualiza();
		
		
		seinscreveu.postMessage("no canal maethe");
	}

}
