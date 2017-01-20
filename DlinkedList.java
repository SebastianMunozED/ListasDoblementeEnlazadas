
public class DlinkedList {
	
	protected Nodo head;
	protected long size;
	
	public DlinkedList(){
		head=null;
		size=0;		
	}
	
	public boolean EstaVacio(){
		return (head==null && size==0);
	}
	
	public void insertarInicio(Nodo n){
        if(EstaVacio()){
        	head=n;
        	size=1;
        }
        else{
        	n.setSiguiente(head);
            head.setAnterior(n);
            head=n;
            size= size +1;
        }
        }
	
	
	public void insertarFinal(Nodo n){
        if(EstaVacio()){
        	head = n;
        	size= 1;
        }
        else{
        	Nodo aux = head;
        	while(aux.getSiguiente() != null){
        		aux = aux.getSiguiente();
        	}
        	aux.setSiguiente(n);
        	n.setAnterior(aux);
        	size++;
        }
        }
	
	
		public Nodo BuscarNodo(String clave){
        if (!EstaVacio()){
                   Nodo aux = head;
                   while (aux != null){
                               if (clave.equalsIgnoreCase(aux.getDato())){
                                           return aux;
                                           }else{
                                                       aux = aux.getSiguiente();
                                           }
                               }
                   }
        return null;
        }
		
		public int BuscarIndice(String clave){
			int indice=1;
	        if (!EstaVacio()){
	                   Nodo aux = head;
	                   while (aux != null){
	                	   			
	                               if (clave.equalsIgnoreCase(aux.getDato())){
	                                           return indice;
	                                           }else{
	                                                       aux = aux.getSiguiente();
	                                                       indice++;
	                                           }
	                               }
	                   }
	        return 0;
	        }
		
	
	
	
	public void eliminarNodo(String clave){
        if (!EstaVacio()){
                   Nodo aux = head;
                   Nodo ant = null;
                   while (aux != null){
                               if (clave.equalsIgnoreCase(aux.getDato())){
                                           if (ant == null){
                                                       head = head.getSiguiente();
                                                       aux.setSiguiente(null);
                                                       aux= head;
                                           }else {
                                                       ant.setSiguiente(aux.getSiguiente());
                                                       aux.setSiguiente(null);
                                                       aux = ant.getSiguiente();
                                           }   
                                           size--;
                                           }else{
                                                       ant = aux;
                                                       aux = aux.getSiguiente();
                                           }
                               }
                   }
        }
	
	public String ImprimirReves(){
		String lista="";
		Nodo aux=head;
		while(aux.getSiguiente()!=null){
			aux=aux.getSiguiente();
		}
		lista+=aux.getDato()+"\n";
		while(aux.getAnterior()!=null){
			lista+=aux.getAnterior().getDato()+"\n";
			aux=aux.getAnterior();
		}
		lista+="Tamanio de Lista: "+size;
		return lista;	
	}
	
	@Override
	public String toString() {
		String lista="";
		Nodo aux=head;
		lista+=aux.getDato()+"\n";
		while(aux.getSiguiente()!=null){
			lista+=aux.getSiguiente().getDato()+"\n";
			aux=aux.getSiguiente();
		}	
		lista+="Tamanio de Lista: "+size;
		return lista;
	}

}
