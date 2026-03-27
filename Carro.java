public class Carro {
	private String placa;
	private String modelo;
	private int tempoEstacionado;
	
	public Carro(String placa, String modelo, int tempoEstacionado) {
		this.placa = placa;
		this.modelo = modelo;
		this.tempoEstacionado = tempoEstacionado;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getTempoEstacionado() {
		return tempoEstacionado;
	}
	
	public void setTempoEstacionado(int tempoEstacionado) {
		this.tempoEstacionado = tempoEstacionado;
	}
	
	@Override
	public String toString() {
		return "Modelo: " + modelo + " Placa: " + placa + " Tempo: " + tempoEstacionado + " h";
	}
}
