package reset_cwi.modulo3;

public class Aula10_refatorada {
	
	static void verificaAposentadoria (String nome, String[] colaboradores, int[] idades, int[] temposDeTrabalho) {
		
		boolean colaborador = false;
		int idade = 0;
		int tempoTrabalho = 0;
		
		//Verifica se o colaborador existe no sistema
		for(int i = 0; i < colaboradores.length; i++) {
			if(nome == colaboradores[i]) {
				colaborador = true;
				idade = idades[i];
				tempoTrabalho = temposDeTrabalho[i];
			}
		}
		
		//Verifica se o colaborador está apto para se aposentar
		if(colaborador) {
			
			boolean porIdade = (idade >= 65);
			boolean porTempoDeTrabalho = (tempoTrabalho >= 30);
			boolean porIdadeComTempoDeTrabalho = (idade >= 60 && tempoTrabalho >= 25);
		
			if(porIdade || porTempoDeTrabalho || porIdadeComTempoDeTrabalho) {
				System.out.println("Parabéns, já pode sair de férias eternas");
			}else {
				System.out.println("Infelizmente, ainda falta um tempo");
			}
		}else {
			System.out.println("Colaborador inválido");
		}
	}
	
		public static void main(String args[]) {
		
		String[] colaboradores = {"Rhoger", "Cléverson", "Gleysberto", "Nádio", "Rosiméri", "Regislane", "Agripino", "Wellison"};
		int[] idades           = {      69,          66,           58,      61,         60,          64,         59,         55};
		int[] temposDeTrabalho = {      31,          29,           30,      26,         25,          24,         26,         29};

		verificaAposentadoria("Rhoger", colaboradores, idades, temposDeTrabalho);
		
		}
}
