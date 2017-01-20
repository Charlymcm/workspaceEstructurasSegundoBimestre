package deberListasDoblementeEnlazadas;

public class Lista {
	private Nodo inicio;
	private Nodo p;

	public Lista() {
		super();
		inicio= null;
	}

	public boolean estaVacia(){
		return inicio == null;
	}

	public synchronized void insertarAlInicio(Libro libro){		//Inserta al inicio de la lista
		if(estaVacia()) 
			inicio = p = new Nodo(libro);
		else
			inicio = new Nodo(libro, inicio);
	}

	public  boolean estaVac�a(){
		return inicio == null;
	}	

	public void insertarAlFinal(Libro libro) {					//Inserta al final de la lista
		if (estaVac�a())
			inicio = p = new Nodo(libro);
		else
			p = p.enlace = new Nodo(libro);
	}

	public void buscar(int posicion){
		Nodo aux= inicio;
		int cont=1;

		if(posicion<1 || posicion>=100){
			System.out.println("Posicion NO encontrada");
		}

		else{
			while(aux!=null){
				if (posicion ==  cont){
					System.out.println("el elemento es : "+aux.getInformacion()  +": en la posicion "+ posicion);
					aux=null;
				}

				else{                 
					aux=aux.getEnlace();
					cont++;
				}
			}
		}
	}


	public void Buscar(String busqueda){
		Nodo aux = inicio;

		if(!busqueda.equals(aux.getInformacion())){
			while(aux!=null){
				if (busqueda.equals(aux.getInformacion())){
					System.out.println("El elemento SI se encuentra en la lista");
					aux=null;
				}
				else{                 
					aux=aux.getEnlace();
				}
			}
		}
	else{
		System.out.println("Nombre NO encontrado");}
	}

	public void Eliminar(int posicion){

	}

	/*

	public Nodo buscarLista(Elemento destino)
	{
		 Nodo indice;
		 for (indice = primero; indice!= null; indice = indice.enlace)
			 if (destino == indice.dato)	 // (destino.equals(indice.dato))
				 return indice;			
		 return null;
	}*/





	public void crearEnOrden(Libro libro){

		Nodo nuevo= new Nodo(libro);
		if(estaVacia()){
			inicio= nuevo;
		}
		else if( nuevo.getInformacion().getNombreLibro().compareTo(inicio.getInformacion().getNombreLibro())<0){
			nuevo.enlace= inicio;
			inicio= nuevo;
		}
		else{
			Nodo p= inicio.enlace; 
			Nodo q= inicio; 
			while(p!=null){
				if(nuevo.getInformacion().getNombreLibro().compareTo(p.getInformacion().getNombreLibro())<0)
					break;
				q=p;
				p=p.enlace;	 
			}
			nuevo.enlace= q.enlace;
			q.enlace= nuevo;

		}


	}


	@Override
	public synchronized String toString()
	{
		String salida = "";
		if (estaVacia())
		{
			salida= "Lista vacia";

			return salida;
		}
		else
		{
			salida="\n la lista de libros es:";

			Nodo p=inicio;
			while(p!=null)
			{
				salida+=p.informacion.toString();
				p=p.enlace;

			}
			return salida;
		}
	}

}