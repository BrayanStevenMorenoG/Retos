import java.util.Random;
import java.util.Scanner;

public class reto3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Random moneda = new Random();

        int juego = moneda.nextInt(2)+1, op, edad;
        String nombre;

        System.out.println("Digite su nombre");
        nombre = leer.nextLine();
        System.out.println("Digite su edad");
        edad = leer.nextInt();

    if (edad>=18 && edad<100){
        System.out.println("Elija una opción: 1.cara 2.sello");
        op = leer.nextInt();
        if (op==juego){
            System.out.println("Felicidades "+nombre+" GANO :D");
        } else {
            System.out.println("Lo lamento "+nombre+" no gano, mas suerte para la proxima :(");
        }}
    else {
        System.out.println("Lo siento"+nombre+"no podra jugar");
    }
        leer.close();

    }
    }    
