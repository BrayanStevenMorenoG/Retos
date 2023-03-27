import java.util.Random;
import java.util.Scanner;

public class reto8 {
    
    public static void main(String[] args) {
         
        Scanner leer = new Scanner(System.in);
        Random dados = new Random();

        int vidas=3;
        String deci;

        System.out.println("Bienvenido al juego de los dados, quien saque el numero mas grande gana");
        System.out.println("Tiene "+vidas+" vidas");
        System.out.println("Desea jugar? si-no");
        deci = leer.next();
        
        while (deci.equalsIgnoreCase("si") && vidas>0) {

            System.out.println("Lanzo el dado");

            int usuario = dados.nextInt(6)+1;
            int maquina = dados.nextInt(6)+1;
    
            if (maquina>usuario) {
                System.out.println("usted saco el número: "+usuario);
                System.out.println("La maquina saco el número: "+maquina);
                System.out.println("La maquina gana");
                vidas = vidas-1;
                System.out.println("Le quedan "+vidas+" vidas");
            } else if (maquina<usuario){
                System.out.println("usted saco el número: "+usuario);
                System.out.println("La maquina saco el número: "+maquina);
                System.out.println("Usted gano");
                System.out.println("Le quedan "+vidas+" vidas");
            } else if (maquina==usuario){
                System.out.println("usted saco el número: "+usuario);
                System.out.println("La maquina saco el número: "+maquina);
                System.out.println("Empate");
                System.out.println("Le quedan "+vidas+" vidas");
            }
            System.out.println("Desea volver a jugar? si-no");
            deci = leer.next();
        }

        System.out.println("hasta luego");
        System.out.println("Vidas= "+vidas);

    
        leer.close();
    }

}

