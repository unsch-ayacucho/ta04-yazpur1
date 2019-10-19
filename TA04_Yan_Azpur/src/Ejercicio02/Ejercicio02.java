
package Ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        //Lamada al metodo Scanner
        Scanner entrada = new Scanner(System.in);
        //Declaración de arreglo a entero
        int numeros[][],cont=0;
        //instanciamos el arreglo de enteros
        numeros = new int[4][5];
        //Utilizo el bucle for
        for(int i=0;i<4;i++){//número de filas
            for(int j=0;j<5;j++){//número de columnas
                System.out.print("Ingrese numero en la posición ["+i+"]["+j+"]: ");
                int Numero = entrada.nextInt();//Llamos al metodo Scanner
                //inicializamos el arreglo(agregamos elementos)
                numeros[i][j]=Numero; 
                //Con cumulador sumados los valores de la matriz
                cont=cont+numeros[i][j];
        }             
        }
        System.out.println("La suma de filas y columnas es: "+cont); 
    }
    
}
