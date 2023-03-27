import java.util.Scanner;

public class reto1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double TemHor=350, TemHor2; 
        String elec;

        System.out.println("Su horno tiene la temperatura de 350°C, ¿cual temperatura desea consultar? fahrenheit-Kelvin");

        elec = leer.nextLine();

        switch (elec){

            case "fahrenheit":
            TemHor2 = TemHor + 32;
            System.out.println("Su horno necesita "+TemHor2+" grados fahrenheit");
            break; 

            case "kelvin":
            TemHor2 = TemHor + 273.15;
            System.out.println("Su horno necesita "+TemHor2+" grados kelvin");
            break;

        }

        leer.close();
        
    }
    
}