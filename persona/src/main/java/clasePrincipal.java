import java.util.Scanner;

public class clasePrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese la dirección: ");
        String direccion = scanner.nextLine();

        System.out.print("Ingrese el teléfono: ");
        String telefono = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();

        scanner.nextLine(); 

        System.out.print("Ingrese el email: ");
        String email = scanner.nextLine();

        System.out.print("Ingrese el salario: ");
        double salario = scanner.nextDouble();

        scanner.nextLine(); 

        System.out.print("Ingrese el nombre del jefe inmediato: ");
        String jefeInmediato = scanner.nextLine();

        System.out.print("Ingrese los años de experiencia: ");
        int añosExperiencia = scanner.nextInt();


        hija empleado = new hija (nombre, apellido, direccion, telefono, edad, email, salario, jefeInmediato, añosExperiencia);

        
        empleado.imprimirDetalleEmpleado();

        scanner.close();
    }
}
