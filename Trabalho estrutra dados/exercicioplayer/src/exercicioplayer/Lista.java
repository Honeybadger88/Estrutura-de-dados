package exercicioplayer;

public class Lista {
	//atributos da classe
	private No inicio;
	private No fim;
	
	//construtor
	public Lista()
	{
		inicio=null;
		fim=null;
	}
	
	// metodos da classe
	
	// inserir o elemento em um novo Nó
	public void insere(String elemento){
		No caixa = new No(inicio,null,elemento);
		if (inicio==null)//se lista estiver vazia
			inicio = fim = caixa;
		else{
			fim.setProximo(caixa);
			fim = caixa;
		}
	}
	
	public void exibeLista()
	{
		No aux;
		aux=inicio;
		if (inicio == null) {
            System.out.println("Nada a exibir - a lista está vazia!");
        } else {
			while (aux!=null)
			{
				System.out.print(aux.getElemento() + " ");
				aux=aux.getProximo();
			}
        }
		System.out.println();
	}
	
	
	
	public No atual() {
		No aux;
		aux = inicio;
		System.out.print(aux.getElemento());
		return aux;

	}


	public No proximo(No nodo) {
		No aux = nodo;
		if (aux == null) {
			return null;
		}else {
		System.out.print(aux.getProximo().getElemento());
		return aux.getProximo();}
	}

	public No anterior(No nodo) {
		No aux = nodo;
		System.out.println(aux.getAnterior().getElemento());
		return aux.getAnterior();

	}
	
}
