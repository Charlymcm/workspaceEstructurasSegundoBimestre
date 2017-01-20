package deberListas;

public class Lista {
	protected static Nodo head;
	protected static Nodo tail;
	protected long size;

	public Lista() {
		head = null;
		size= 0; 
	}
	
	public void AddFirst(Nodo v)
	{
		v.setNext(head);
		head  = v;
		size  = size + 1;
	}
	
	public void RemoveFirst()
	{
		Nodo t;
		if (head == null)
			System.out.println("Error la lista esta vac�a");
		t = head;
		head = head.getNext();
		head = head.getNext();
		t.setNext( null);
		size = size-1;
	}

	public Nodo Buscar (int posicion) {
		Nodo indice;
		int i;
		if(posicion<0){
			return null;
		}
		indice = head;
		for( i=1 ; (i<posicion) && (indice != null); i++){
			indice = indice.getNext();
			return indice;
		}
		return indice;
	}
	
	public String imprimir(){
		Nodo auxiliar = head;
		int i = 0;
		String list = null;
		
		while(auxiliar != null){
			list+="\n"+i+ auxiliar.getElement();
			auxiliar = auxiliar.getNext();
			i++;
		}
		
		return list;
	
	}
	
	/*public Nodo recorrer(){ 
		for (int x = 0 ; x < size; x++ ){
			
		}
		return null;
		
	}
	*/
	
	/*public void AddLast(Node v)
	{
		v.setNext(null);
		tail.setNext(v);
		tail=v;
		size =size+1;
	}*/

}