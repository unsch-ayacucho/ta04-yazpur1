package Ejercicio01;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);        
        /*Haciendo el llamado a la clase random para generar números aleatorios
        creando un objeto con el nombre aleatorio*/
        Random aleatorio = new Random();
        //declaramos un arreglo a entero
        int lista[][];
        //instanciamos el arreglo de enteros
        lista = new int[6][10];
        //Utilizo el bucle for para generan 100 numeros
        for(int i=0;i<6;i++){
            for(int j=0;j<10;j++){                
                lista[i][j]=aleatorio.nextInt(1001);//Pongo 1001 para generar del 0 al 1000
        }                           
    }
        //extraemos el valor de la matriz
        System.out.println("El valor del posición mínima es: "+lista[0][0]); 
        System.out.println("El valor del posición maxima es: "+lista[5][9]);
    }
}   

