
public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nodo a = new Nodo("casa");
		Nodo b = new Nodo("a la");
		Nodo c = new Nodo("Vete");

		DlinkedList lista1 = new DlinkedList();
		
		lista1.insertarInicio(a);
		
		System.out.println(lista1);
		
		lista1.insertarFinal(b);
		lista1.insertarInicio(c);
		
		System.out.println(lista1);
		
		//lista1.eliminarNodo("casa");
		System.out.println(lista1);
		
		System.out.println("Dato encontrado "+ lista1.BuscarNodo("vete"));
		System.out.println("Dato encontrado "+ lista1.BuscarIndice("vete"));
		
	}

	
	
}
