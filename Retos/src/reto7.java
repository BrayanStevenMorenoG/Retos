import java.util.Scanner;


public class reto7 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        String nombres, apellidos, tipDoc, sex, email, deci, op, res;
        int numDoc, telefono;

        System.out.println("Bienvenido, este es un formlario para registro de usuarios");

        do {

            System.out.println("Digite nombre completo");
            nombres = leer.next();

            System.out.println("Digite apellidos");
            apellidos = leer.next();

            System.out.println("Cual es su tipo de documento = T.I / Cedula / Cedula de extranjeria");
            tipDoc = leer.next();

            System.out.println("Digite su numero de documento");
            numDoc = leer.nextInt();
            
            System.out.println("Digite su sexo = Masculino / Femenino");
            sex = leer.next();

            System.out.println("Digite su telefono");
            telefono = leer.nextInt();

            System.out.println("Digite su e-mail");
            email = leer.next();

            System.out.println("Enviar = si / no");
            op = leer.next();

            if (op.equalsIgnoreCase("si")) {
                System.out.println("Enviado.");
                System.out.println("El formulario se envio correctamente");
                System.out.println("Desea ver sus repuestas? si / no");
                res = leer.next();
                if (res.equalsIgnoreCase("si")) {
                    System.out.println("Sus nombres son: "+nombres);
                    System.out.println("Sus apellidos son: "+apellidos);
                    System.out.println("Su tipo de documento es: "+tipDoc);
                    System.out.println("Su numero de documento es: "+numDoc);
                    System.out.println("Su sexo es: "+sex);
                    System.out.println("Su número de telefono es: "+telefono);
                    System.out.println("Su e-mail es: "+email);
                }
            } else {
                System.out.println("ok");
            }

            System.out.println("Desea registrar otro usuario? si / no");
            deci = leer.next();
            
        } while (deci.equalsIgnoreCase("si"));


        leer.close();
    }

}
