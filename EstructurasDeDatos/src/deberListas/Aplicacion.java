package deberListas;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		String preg_nodo = null;
		String preg_lista1 = null, preg_lista2 = null, preg_lista3 = null, preg_lista4 = null;

		Lista lista_1 = new Lista();

		do{
			preg_nodo = JOptionPane.showInputDialog("Ingrese la opci�n que prefiera:\n1. Ingresar un nodo nuevo\n2. Eliminar un nodo\n3. Buscar en la lista\n4. Recorrer la lista\n5. Imprimir lista\n6. Salir");
			if(preg_nodo.equals("1")){
				preg_lista1 = JOptionPane.showInputDialog("1. Si desea ingresar un elemento\n2. Si desea imprimir la lista");
				if(preg_lista1.equals("1")){
					preg_lista2 = JOptionPane.showInputDialog("Ingrese el elemento:");
					Nodo preg_lista_nodo = new Nodo(preg_lista2,null);
					lista_1.AddFirst(preg_lista_nodo);
				}
				else{
					System.out.println(lista_1.imprimir());
				}	
			}

			else if(preg_nodo.equals("2")){
				preg_lista3 = JOptionPane.showInputDialog("1. Si desea eliminar un elemento\n2. Si desea imprimir la lista");
				if(preg_lista3.equals("1")){
					lista_1.RemoveFirst();
				}
				else{
					System.out.println(lista_1.imprimir());
				}	
			}

			else if(preg_nodo.equals("3")){
				preg_lista4 = JOptionPane.showInputDialog("1. Si desea buscar un elemento\n2. Si desea imprimir la lista");
				if(preg_lista4.equals("1")){
					//lista_1.Buscar(Integer.toString(preg_lista4));
				}
				else{
					System.out.println(lista_1.imprimir());
				}	

			}

			else if(preg_nodo.equals("4")){
				//implementar recorrer la lista
			}

			if(preg_nodo.equals("5")){
				System.out.println(lista_1.imprimir());
			}

			if(preg_nodo.equals("6")){
				
			}
		}

		while((!(preg_nodo.equals("6"))||(!preg_nodo.equals("5"))));

		return;

	}
}
