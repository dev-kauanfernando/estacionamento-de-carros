public class Estacionamento {
	private Carro[] estacionamento;
	private int vagasTotais;
	
	public Estacionamento(int vagasTotais) {
		estacionamento = new Carro[vagasTotais];
		this.vagasTotais = vagasTotais;
	}
	
	public void estacionarCarro(String placa, String modelo, int tempoEstacionado) {
		if (buscarCarro(placa) != -1) {
			System.out.println("Placa duplicada!");
			return;
		}
		
		for (int i = 0; i < estacionamento.length; i++) {
			if (estacionamento[i] == null) {
				estacionamento[i] = new Carro(placa, modelo, tempoEstacionado);
				System.out.println("Carro estacionado!");
				return;
			}
		}
		System.out.println("Estacionamento lotado!");
	}
	
	public void removerCarro(String placa) {
		int carroEncontrado = buscarCarro(placa);
		
		if (carroEncontrado == -1) {
			System.out.println("Carro nao encontrado...");
			return;
		}
		
		Carro carro = estacionamento[carroEncontrado];
		int valor = carro.getTempoEstacionado() * 5;
		estacionamento[carroEncontrado] = null;
		
		System.out.println("Carro " + carro.getModelo() + " foi removido");
		System.out.println("Valor a ser pago: R$ " + valor);
	}
	
	public void listarCarros() {
		for (Carro c : estacionamento) {
			if (c != null) {
				System.out.println(c);
			}
		}
	}
	
	public int buscarCarro(String placa) {
		for (int i = 0; i < estacionamento.length; i++) {
			if (estacionamento[i] != null && estacionamento[i].getPlaca().equalsIgnoreCase(placa)) {
				return i;
			}
		}
		return -1;
	}
}
