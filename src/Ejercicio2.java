import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ejercicio2 {

    public static void main(String[] args) {
        try{
            Scanner lector = new Scanner(new FileInputStream("File/file.txt"));
            int num=0;
            int suma=0;
            
            System.out.println("Los numeros del archivo son: ");
            
            while(lector.hasNext()){
                num=lector.nextInt();
                System.out.print(num+" ");
                suma+=num;
            }
            System.out.println("\nSuma de los numeros: "+suma);
        }
        catch(FileNotFoundException e){
            System.err.println(e.getCause());
        }
    } 
}