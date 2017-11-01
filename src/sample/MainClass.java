package sample;
import Class.SimpleList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        SimpleList lista = new SimpleList();
        Scanner sc = new Scanner(System.in);

        String n;
        do {
            System.out.println();
            System.out.println("MENU");
            System.out.println("(1)Insertar");
            System.out.println("(2)Mostrar");
            System.out.println("(3)Buscar");
            System.out.println("(4)Eliminar");
            System.out.println("(5)Contar");
            System.out.println("(6)Terminar");
            System.out.println("Teclea el número de opción que deseas que se ejecute...");
            n = sc.next();

            boolean vali = lista.Validacion(n);
            if (vali!= false) {
                switch (n) {
                    case "1":
                        System.out.println("Teclee la cantidad de elementos que se van a insertar a la lista enlazada...");
                        String insertar = sc.next();
                        boolean valida = lista.Validacion(insertar);
                        if(valida!= false){
                            int ancho = Integer.parseInt(insertar);
                        for (int i = 0; i < ancho; i++) {
                            System.out.println("Ingresa valor [" + (i + 1) + "]");
                            Object valor = sc.next();
                            lista.addPrimero(valor);
                        }}
                        else {
                            System.out.println("Error ¡Debes ingresar la cantidad de números.");
                        }
                        break;

                    case "2":
                        if (lista.isEmpty()) {
                            System.out.println("No se puede mostrar nada por que la lista está vacia");
                        } else {
                            lista.showList();
                        }
                        break;

                    case "3":
                        if (lista.isEmpty()) {
                            System.out.println("La lista está vacia, no se puede Buscar.");
                        } else {
                        /*
                        System.out.println(" Buscar Índice");
                        int indice = sc.nextInt();
                        System.out.println("El valor del índice " + indice + " es: " + lista.search(indice));*/

                            System.out.print("Ingrese el valor que desee buscar -->");
                            Object valor = sc.next();
                            lista.BuscarValor(valor);
                        }
                        break;

                    case "4":
                        if (lista.isEmpty()) {
                            System.out.println("La lista está vacia, no se puede eliminar");
                        } else {
                            System.out.println(" Ingrese el valor que desea Eliminar");
                            Object Eliminar = sc.next();
                            lista.delete(Eliminar);
                        }
                        break;

                    case "5":
                        if (lista.isEmpty()) {
                            System.out.println("La lista esta vacia");
                        } else {
                            System.out.println("Total de elementos: " + lista.size());
                        }
                        break;

                    case "6":
                        System.out.println("(6)Terminar");
                        break;

                    default:
                        System.out.print("Esta opción no existe...");
                }
            }
        else {
                System.out.println("¡Error! Debes ingresar el número opción.");
            }}
         while (n != "6");
    }
}