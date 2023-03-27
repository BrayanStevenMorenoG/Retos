import java.util.Scanner;

public class reto2 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        int peso, meses, dosis=0; 
        String nom, doc, eps; 

        System.out.println("Por favor digite el nombre de su bebé");
        nom = leer.nextLine();

        System.out.println("En cual eps se encuentra su bebé?");
        eps = leer.nextLine();

        System.out.println("Cual es es el nombre de su médico");
        doc = leer.nextLine(); 

        System.out.println("Por favor digite el peso de su bebé");
        peso = leer.nextInt();

        System.out.println("Por favor digite los meses que tiene su bebé");
        meses = leer.nextInt(); 

        dosis = peso + 15 / meses * 15 * 10;


        System.out.println("El nombre del bebé es: "+nom);
        System.out.println("La eps del bebé es: "+eps);
        System.out.println("El nombre del doctor que los atendera es: "+doc);
        System.out.println("La dosis a aplicar es: "+dosis);

        leer.close();

    }

}
