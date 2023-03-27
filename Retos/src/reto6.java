import java.util.Scanner;

public class reto6 {
 
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        int vidas=5; 

        String palabra, deci;
        
        System.out.println("Bienvenido al juego de avivina la palabra, las palabras son frutas");
        System.out.println("Tiene "+vidas+" vidas para adivinar la palabra");

        do {
            System.out.println("Digite la palabra");
            palabra = leer.next();

            switch (palabra) {
                case "maracuya":
                    System.out.println("Felicidades adivino la palabra");
                break;
                case "cereza":
                System.out.println("Felicidades adivino la palabra");
                break;
                case "pera":
                System.out.println("Felicidades adivino la palabra");
                break;
                case "frambuesa":
                System.out.println("Felicidades adivino la palabra");
                break;
                case "fresa": 
                System.out.println("Felicidades adivino la palabra");
                break;
                case "banano":
                System.out.println("Felicidades adivino la palabra");
                break;
                case "arandano":
                System.out.println("Felicidades adivino la palabra");
                break;
                case "durazno":
                System.out.println("Felicidades adivino la palabra");
                break;
                default:
                System.out.println("No adivino la palabra");
                vidas = vidas-1;
                System.out.println("Tiene "+vidas+" vidas");
                break;
            }

        System.out.println("Desea volver a jugar? si/no");
        deci = leer.next();

        } while (deci.equalsIgnoreCase("si") && vidas>0);
    
            System.out.println("Hasta luego");
            System.out.println("Vidas= "+vidas);

        leer.close();

    }

}