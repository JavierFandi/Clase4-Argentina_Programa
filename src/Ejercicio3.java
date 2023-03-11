import java.util.Scanner;
import java.io.*;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        String palabra = "";
        int desplazamiento = 0;
        
        menu(palabra, desplazamiento); 
    }
    
    public static String codificar(String palabra, int desplazamiento){
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<palabra.length(); i++){
            char c = palabra.charAt(i);
            if(Character.isLetter(c)){
                c = (char) (c+desplazamiento);
                if(c>122){
                    int dif = (int) c - 122;
                    c = (char) (96+dif);
                }
            }
            if(Character.isSpaceChar(c)){
                c = (char) (96+desplazamiento);
            }
            
            sb.append(c);
        }
        
        return sb.toString();
    }
    
    public static String decodificar(String palabra, int desplazamiento){
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<palabra.length(); i++){
            char c = palabra.charAt(i);
            if(Character.isLetter(c)){
                c = (char) (c-desplazamiento+desplazamiento);
            }
            if(Character.isSpaceChar(c)){
                c = (char) (95);
            }
            
            sb.append(c);
        }
        
        return sb.toString();
    }
    
    public static void crearArchivoEntrada(String palabra){
        try{
            File f = new File("ArchivoEntrada.txt");
            PrintWriter writer = new PrintWriter(f);
            
            writer.println("Palabra sin codificar: ");
            writer.println(palabra);
            writer.close();
            
            System.out.println("Se creo correctamente el archivo");
        }
        catch(FileNotFoundException e){
            System.err.println(e.getCause());
        }
    }
    
    public static void crearArchivoSalida(String palabra, int desplazamiento, int opc){
        try{
            File f2 = new File("ArchivoSalida.txt");
            
            PrintWriter writer = new PrintWriter(f2);
            
            if(opc==1){
                writer.println("Palabra Codificada: ");
                writer.println(codificar(palabra, desplazamiento)); 
            }
            else{
                writer.println("\nPalabra Decodificada: ");
                writer.println(decodificar(palabra, desplazamiento));  
            }
            
            writer.close();
            System.out.println("Se creo correctamente el archivo");
        }
        catch(FileNotFoundException e){
            System.err.println(e.getCause());
        }
    }
    
    public static void menu(String palabra, int desplazamiento){
        Scanner sc = new Scanner(System.in);
        int opc=0;
        

        System.out.print("Ingrese la palabra a codificar: ");
        palabra = sc.nextLine();
        System.out.print("Ingrese el valor del desplazamiento: ");
        desplazamiento = sc.nextInt();
        
        crearArchivoEntrada(palabra);

        System.out.println("\nMenu");
        System.out.println("1.Codificar");
        System.out.println("2.Decodificar");
        System.out.print("Opcion: ");
        opc=sc.nextInt();
        
        crearArchivoSalida(palabra, desplazamiento, opc);
    }
}
