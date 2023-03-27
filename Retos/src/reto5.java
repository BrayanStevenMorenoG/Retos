import java.util.Random;
import java.util.Scanner;

public class reto5 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Random juego = new Random();

        int op, vid=3;
        String nombre, deci;

        System.out.println("Digite su nombre");
        nombre = leer.nextLine();

        System.out.println("Hola "+nombre+" este es el juego de piedra papel y tijera");
        System.out.println("Tiene "+vid+" vidas");
        
        do {

        System.out.println("Elija una opción: 1.tijeras 2.papel 3. piedra");
        op = leer.nextInt();
        int maquina = juego.nextInt(3)+1;

            if (op==1 && maquina==2 || op==2 && maquina==3 || op==3 && maquina==1){
                System.out.println(nombre+": "+op+" - Maquina: "+maquina+" felicidades GANO");
            } else if (op==2 && maquina==1 || op==3 && maquina==2 || op==1 && maquina==3) {
                System.out.println(nombre+": "+op+" - Maquina: "+maquina+" lo lamento PERDIO");
                vid = vid-1;
            }
            if (op==maquina){
                System.out.println(nombre+": "+op+" - Maquina: "+maquina+" ninguno de los dos gana EMPATE");
            }
        
        System.out.println("Desea volver a jugar? si-no");
        deci = leer.next();

        } while (deci.equalsIgnoreCase("Si") && vid>0);

        System.out.println("Hasta luego");
        System.out.println("Vidas= "+vid);
 
        leer.close();
    }

}
