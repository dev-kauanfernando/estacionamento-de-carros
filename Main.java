public class Main {
	public static void main(String[] args) {
		Estacionamento e = new Estacionamento(10);
		
		for (int i = 0; i < 11; i++) {
			e.estacionarCarro("P " + i, "M " + i, 5);
		}
		
		System.out.println("Carro buscado: " + e.buscarCarro("P 0"));
		
		System.out.println("\n--- Carros no estacionamento ---");
		e.listarCarros();
		
		System.out.println("\n--- Removendo carro P 5 ---");
		e.removerCarro("P 5");
		
		System.out.println("\n--- Carros atualizados ---");
		e.listarCarros();
	}
}
