import java.util.Random;
import java.util.Scanner;

public class reto4 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Random juego = new Random();

        int maquina = juego.nextInt(3)+1, op, edad;
        String nombre; 

        System.out.println("Digite su nombre");
        nombre = leer.nextLine();

        System.out.println("Digite su edad");
        edad = leer.nextInt();

    if (edad>=18 && edad<100){

        System.out.println("Elija una opción: 1.tijeras 2.papel 3.piedra");
        op = leer.nextInt();
        if (op==1 && maquina==2 || op==2 && maquina==3 || op==3 && maquina==1){
            System.out.println(nombre+": "+op+" - Maquina: "+maquina+" felicidades GANO");
        } else if (op==2 && maquina==1 || op==3 && maquina==2 || op==1 && maquina==3) {
            System.out.println(nombre+": "+op+" - Maquina: "+maquina+" lo lamento PERDIO");
        }
        if (op==maquina){
            System.out.println(nombre+": "+op+" - Maquina: "+maquina+" ninguno de los dos gana EMPATE");
        }
    } else {
        System.out.println("Lo siento "+nombre+" no podra jugar");
    }

    leer.close();

    }

}
