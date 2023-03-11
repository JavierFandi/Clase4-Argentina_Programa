import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ejercicio2_a {

    public static void main(String[] args) {
        try{
            Scanner lector = new Scanner(new FileInputStream("File/file.txt"));
            Scanner sc = new Scanner(System.in);
            int num=0;
            int suma=0, multi=1;
            int opc=0, i=0;
            
            System.out.println("Los numeros del archivo son: ");
            
            while(lector.hasNext()){
                num=lector.nextInt();
                System.out.print(num+" ");
                i++;
                suma+=num;
                multi=multi*num;
            }
            
            System.out.println("\n1. Sumar los numeros");
            System.out.println("2. Multiplicar los numeros");
            System.out.print("Opcion: ");
            opc = sc.nextInt();
            
            while(lector.hasNext()){ 
                   
            }
            
            if(opc==1){
                System.out.println("\nSuma de los numeros: "+suma);
            }
            else{
                System.out.println("\nMultiplicacion de los numeros: "+multi);
            }
        }
        catch(FileNotFoundException e){
            System.err.println(e.getCause());
        }
    } 
}