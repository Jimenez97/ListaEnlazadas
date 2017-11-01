package Class;

/**
 * Created by abela on 23/10/2017.
 */
public class SimpleList {

   Nodo cabeza;
   int size;


   public SimpleList(){
       cabeza = null;
   }

   public boolean isEmpty(){
     return (cabeza == null)?true:false;
   }

   public void addPrimero(Object obj){

       if(cabeza == null){

           cabeza = new Nodo(obj);

       }else {

           Nodo temp = cabeza;
           Nodo nuevo = new Nodo(obj);
           nuevo.enlazarSiguiente(temp);
           cabeza = nuevo;
       }
       size++;
   }

   public void showList(){

       Nodo recorrer = cabeza;

       while(recorrer != null){
           System.out.print("["+recorrer.valor);
           System.out.print("]->");
           recorrer = recorrer.siguiente;
       }
   }

   public Object search(int index){

       Nodo temporal = cabeza;
       int contador = 0;

        while (contador < index) {

            temporal = temporal.getSiguiente();
            contador++;
        }
       return temporal.getValor();
   }

   public void delete3(int indice){
       if(indice == 0){

           cabeza = cabeza.getSiguiente();
       }
       else {
           int contador = 0;
           Nodo temporal = cabeza;
           while (contador<indice-1){
               temporal = temporal.getSiguiente();
               contador++;
           }
           temporal.enlazarSiguiente(temporal.getSiguiente().getSiguiente());
       }
       size--;
   }

   public void delete(Object valor){

       try {

           Nodo temporal = cabeza;

           if (temporal.getValor().toString().equals(valor.toString())) {
               cabeza = cabeza.getSiguiente();
           } else {
               while (temporal != null) {

                   if (temporal.getSiguiente().getValor().toString().equals(valor.toString())) {

                       temporal.enlazarSiguiente(temporal.getSiguiente().getSiguiente());
                       size--;
                       break;
                   }
                   temporal = temporal.getSiguiente();
               }

           }
       }
       catch (Exception ex){
           System.out.println("Este valor no existe en la lista.");
       }
    }

    public void BuscarValor(Object valor){

try {

    Nodo temporal = cabeza;
    int contador = 1;

    if (temporal.getValor().toString().equals(valor.toString())) {
        int contadorL = 0;
        contador++;
        System.out.println("El valor fue encontrado en el índice:" + (contadorL));

    } else {
        while (temporal != null) {

            if (temporal.getSiguiente().getValor().toString().equals(valor.toString())) {

                System.out.println("el valor fue encontrado en la índice: " + (contador));
                break;
            }
            contador++;
            temporal = temporal.getSiguiente();

        }
    }
}
catch (Exception ex){

    System.out.println("El valor no fue encontrado");

}

    }

   public int size(){
       return size;
   }

    public boolean Validacion(String cadena) {
        int n;

        try {
            n = Integer.parseInt(cadena);
            return true;
        } catch (Exception e) {

            return false;
        }
    }

    public boolean Validacion2(int numero) {
        String n;

        try {
            n = String.valueOf(numero);
            return false;
        } catch (Exception e) {

            return true;
        }
    }

}
