package objetos;

/* IMPORTANTE: ESTA CLASSE TERÁ SEUS OBJETOS ORDENADOS, 
/* LOGO É OBRIGATÓRIO IMPLEMENTAR A INTERFACE COMPARABLE*/

public class Carro implements Comparable<Carro> {
	
	//PASSO 2.4.1 - CRIE OS ATRIBUTOS RETORNADOS NO SERVLET;
	private String placa;
	private String montadora;
	private String modelo;
	private String ano;
	private String[] opcionais;
	
	//PASSO 2.4.1 - IMPLEMENTE SEUS GETTERS AND SETTERS (MENU SOURCE (ALT+SHIFT+S) --> GENERATE GETTERS AND SETTERS)
	
	// PASSO 2.4.2 - CRIE O CONSTRUTOR DA CLASSE, RECEBENDO SEUS PARÂMETROS
	public Carro(String pl, String mn, String md, String an, String[] opc){
		setPlaca(pl);
		setMontadora(mn);
		setModelo(md);
		setAno(an);
		setOpcionais(opc); //PERCEBA QUE ESTE ATRIBUTO É PEGO COMO ARRAY
	}
	
	// PASSO 2.4.3 - (OBRIGATÓRIO) IMPLEMENTE O MÉTODO DA INTERFACE COMPARABLE
	@Override
	public int compareTo(Carro outro) {
		/*NO CASO ABAIXO, ESTOU COMPARANDO POR MONTADORA, 
		JÁ QUE É POR ISSO QUE ORDENAREI NO ARQUIVO DE RESPOSTA */
		return montadora.compareTo(outro.montadora);
	}
	
//2.4.1
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa.toUpperCase();
	}

	public String getMontadora() {
		return montadora;
	}

	public void setMontadora(String montadora) {
		this.montadora = montadora.toUpperCase();
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo.toUpperCase();
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano.toUpperCase();
	}

	public String[] getOpcionais() {
		return opcionais;
	}

	public void setOpcionais(String[] opcionais) {
		this.opcionais = opcionais;
	}
	
}
