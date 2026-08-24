public class membresiaSocio {

    String nombreSocio;
    int numeroSocio;
    String plan;
    double cuota;
    boolean pago;
    boolean habilitado;

    membresiaSocio(int numero, String nombre, String plan, double cuota, boolean pago) {

        numeroSocio = numero;
        nombreSocio = nombre;
        this.plan = plan;
        this.cuota = cuota;
        this.pago = pago;
        habilitado = pago;

    }

    void registrarPago() {

        pago = true;

        System.out.println(nombreSocio + " ha pagado la cuota.");

    }

    void verificarPago() {

        if (pago) {

            habilitado = true;
            System.out.println(nombreSocio + " está al día y puede ingresar.");

        } else {

            habilitado = false;
            System.out.println(nombreSocio + " no está al día y no puede ingresar.");

        }
    }

    void cambiarPlan(String nuevoPlan) {

        plan = nuevoPlan;

        System.out.println(nombreSocio + " cambió al plan " + plan);

    }

    void mostrarEstado() {

        System.out.println("Socio: " + nombreSocio);
        System.out.println("Numero: " + numeroSocio);
        System.out.println("Plan: " + plan);
        System.out.println("Cuota: $" + cuota);
        System.out.println("Pago: " + pago);
        System.out.println("Habilitado: " + habilitado);
        System.out.println("");

    }

    public static void main(String[] args) {

        membresiaSocio socio1 = new membresiaSocio(
            1, "Mateo", "Basico", 10000, true
        );

        membresiaSocio socio2 = new membresiaSocio(
            2, "Juan", "Premium", 15000, false
        );

        membresiaSocio socio3 = new membresiaSocio(
            3, "juanjo", "Basico", 10000, false
        );

        socio1.verificarPago();

        socio2.registrarPago();
        socio2.verificarPago();

        socio3.cambiarPlan("Premium");
        socio3.registrarPago();
        socio3.verificarPago();

        System.out.println("ESTADO FINAL");
        System.out.println("");

        socio1.mostrarEstado();
        socio2.mostrarEstado();
        socio3.mostrarEstado();

    }
}