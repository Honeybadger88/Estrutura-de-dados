package exercicioplayer;

public class No {
	private No anterior;
	private No proximo;
	private String elemento;
	
	//construtor
	public No(No anterior, No proximo, String string)
	{
		this.anterior=anterior;
		this.proximo=proximo;
		this.elemento=string;
	}

	//getter e setter
	public No getAnterior() {
		return anterior;
	}

	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}
}