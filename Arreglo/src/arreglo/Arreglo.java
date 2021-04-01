package arreglo;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.util.Arrays;
import java.time.*; // Este paquete contiene LocalDate, LocalTime y LocalDateTime.
import java.time.format.*;  // Este paquete contiene DateTimeFormatter.
import java.time.LocalDate;
import java.time.Period;



public class Arreglo {

    public Arreglo() {

    }

    public static void main(String[] args) {
        
        String s="hola pa cr";
        int c=0;
//        for (int x=0;x<s.length();x++)
//   System.out.println("Caracter " + x + ": " + s.charAt(x));
        String[] parts = new String[s.length()];
        
        parts[0]=s.split(" ")[1];
        for (int i = 0; i < parts.length; i++) {
            
        System.out.println(parts[i]);
        }
//        LocalTime ahora = LocalTime.now();
//        System.out.println(ahora);
        //System.out.println(hoy);
//       Period edad = Period.between(LocalDate.of(1987, 4, 8), LocalDate.now());
//        System.out.println(String.format("%d años",
//        edad.getYears()));
        

     
        
        
        

    }

}
