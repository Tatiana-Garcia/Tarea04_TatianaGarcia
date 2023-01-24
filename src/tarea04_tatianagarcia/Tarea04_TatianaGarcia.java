
package tarea04_tatianagarcia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tarea04_TatianaGarcia {
    /**
     * 
     * @author Tatiana 
     */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        /**
         * Elabore un programa que dado dos conjuntos(dos ArrayList) 
         * de enteros de tamaño m y tamaño n (con numeros cualquiera), 
         * devuelva los numeros impares de la interseccion de ambos 
         * conjuntos e imprimalos ordenadamente descendente
         */
        
        ArrayList<Integer>lista=new ArrayList();
        ArrayList<Integer>lista2 = new ArrayList();
        
        System.out.println("Ingrese una cadena de numeros separados por ',': ");
        String cadena = leer.next();
        
        System.out.println("Ingrese una cadena de numeros separados por ',': ");
        String cadena2 = leer.next();
        
        
        String array[]= cadena.split(",");
        String array2[]=cadena2.split(",");
        
        //Metodos para asignar enteros a los arraylist de las cadenas con tokens
        for (int i = 0; i < array.length; i++) {
            lista.add(Integer.valueOf(array[i]));
        }
        for (int i = 0; i < array2.length; i++) {
            lista2.add(Integer.valueOf(array2[i]));
        }
        
        ArrayList<Integer>interseccion=new ArrayList();
        //Metodo para la interseccion 
        if(lista.size()<lista2.size()){
            for (int i = 0; i < lista.size(); i++) {
                for (int j = 0; j < lista2.size(); j++) {
                    if(lista2.get(j).equals(lista.get(i))){
                        interseccion.add(lista2.get(j));
                        break;
                    }
                }
            }
        }else{
            for (int i = 0; i < lista2.size(); i++) {
                for (int j = 0; j < lista.size(); j++) {
                    if(lista.get(j).equals(lista2.get(i))){
                        interseccion.add(lista.get(j));
                        break;
                    }
                }
            }
        }
        
        Collections.sort(interseccion,Collections.reverseOrder());//Ordena de manera descendente la arraylist
        
        //Elimina los pares de la ArrayList
        for (int i = 0; i < interseccion.size(); i++) {
            if(interseccion.get(i)%2==0){
                interseccion.remove(i);
            }
        }
        System.out.println("\nInterseccion de impares en orden descendente : ");
        for (int i = 0; i < interseccion.size(); i++) {
            System.out.print(interseccion.get(i)+" ");
        }System.out.println("");
    }
    
}
