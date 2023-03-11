import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Ejercicio1_b {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num1=0;
        int num2=0;
        int num3=0;
        int opc=0;
        
        System.out.println("Ingrese el primer numero: ");
        num1=sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2=sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        num3=sc.nextInt();
        
        System.out.println("\nSeleccione como los quiere ordenar: ");
        System.out.println("1. Ascendente");
        System.out.println("2. Decreciente");
        System.out.print("Opcion: ");
        opc=sc.nextInt();
        
        ordenar(num1, num2, num3, opc);
        mostrar(ordenar(num1, num2, num3, opc));
    }
    
    public static int[]ordenar(int num1, int num2, int num3, int opc){
    
        int array[] = new int[]{num1, num2, num3};
        
        if(opc==1){
            Arrays.sort(array);
            
            return array;
        }
        else{
            
            Integer array1[] = new Integer[]{num1, num2, num3};
            Arrays.sort(array1, Collections.reverseOrder());
            
            for(int i=0; i<3; i++){
                array[i] = array1[i];
            }
            
            return array;
        }
    }
    
    public static void mostrar(int array[]){
    
        System.out.println("Valores Ordenados:");
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}