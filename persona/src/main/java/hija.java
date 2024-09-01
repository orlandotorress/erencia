public class hija extends Padre {
    private String nombreCargo;
    private double salario;
    private String jefeInmediato;
    private int añosExperiencia;

    
    public hija(String nombre, String apellido, String direccion, String telefono, int edad, String email, double salario, String jefeInmediato, int añosExperiencia) {
        super(nombre, apellido, direccion, telefono, edad, email);
        this.salario = salario;
        this.jefeInmediato = jefeInmediato;
        this.añosExperiencia = añosExperiencia;
        this.nombreCargo = calcularCargo(); 
    }

    
    public String getNombreCargo() {
        return nombreCargo;
    }

    public double getSalario() {
        return salario;
    }

    public String getJefeInmediato() {
        return jefeInmediato;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    
    public void setSalario(double salario) {
        this.salario = salario;
        this.nombreCargo = calcularCargo(); 
    }

    public void setJefeInmediato(String jefeInmediato) {
        this.jefeInmediato = jefeInmediato;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
        this.nombreCargo = calcularCargo(); 
    }

    
    private String calcularCargo() {
        if (salario >= 5000000 && añosExperiencia >= 5 && (getEdad() >= 25 && getEdad() <= 45)) {
            return "Senior";
        } else if (salario >= 900000 && salario <= 1200000 && añosExperiencia >= 1 && añosExperiencia <= 2 && (getEdad() >= 18 && getEdad() <= 22)) {
            return "Junior";
        } else {
            return "Sin cargo definido";
        }
    }

    
    public void imprimirDetalleEmpleado() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Teléfono: " + getTelefono());
        System.out.println("Edad: " + getEdad());
        System.out.println("Email: " + getEmail());
        System.out.println("Salario: " + salario);
        System.out.println("Jefe Inmediato: " + jefeInmediato);
        System.out.println("Años de Experiencia: " + añosExperiencia);
        System.out.println("Cargo: " + nombreCargo);
    }
}
