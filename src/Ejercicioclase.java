import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicioclase {
    public static void main(String[] args) throws Exception {
        
    String dato = JOptionPane.showInputDialog("¿De que tamaño quieres tu arreglo?"); 
    int n = Integer.parseInt(dato); 
    Integer arreglo [] = new Integer[n];
    
    for (int i = 0; i < n; i++) {
        int num; 
        num = (int)Math.round(Math.random()*100); 
        arreglo[i] = num; 
        System.out.println("Los datos que tienes son: " + arreglo[i]);
        System.out.println("_________________________");
        
    }
    {
    Arrays.sort(arreglo);
    for (int s : arreglo) 
    System.out.println("Tus datos de menor a mayor son: " +s);
    System.out.println("_________________________"); }
        {
    Arrays.sort(arreglo, Collections.reverseOrder());
    for (int s : arreglo) 
    System.out.println("Tus datos de mayor a menor son: " +s);
    System.out.println("_________________________");        
}            
}
}
        
            
            
        
        



        


        
        

        






    

