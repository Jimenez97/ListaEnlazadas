package Class;

/**
 * Created by abela on 23/10/2017.
 */
public class Nodo {

   Object valor;
   Nodo siguiente;


   public Nodo(Object valor){
   this.valor = valor;
   }

    public Nodo(Object valor,Nodo valo){
        this.siguiente = null;
        this.siguiente = valo;
    }

    public Object getValor() {
       return valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void enlazarSiguiente(Nodo n){
       siguiente = n;
    }
}
