public class Planeta {
    private String nombre;
    private int cantidadSatelites;
    private double masa;
    private double volumen; 
    private double diametro;  
    private double distanciaAlSol; 
    private boolean esObservable;

    public Planeta(String nombre, int cantidadSatellites, double masa, double volumen, double diametro,
                   double distanciaAlSol, boolean esObservable) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatellites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaAlSol = distanciaAlSol;
        this.esObservable = esObservable;
    }

    public void imprimirValores() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de satélites: " + cantidadSatelites);
        System.out.println("Masa: " + masa );
        System.out.println("Volumen: " + volumen );
        System.out.println("Diámetro: " + diametro );
        System.out.println("Distancia al Sol: " + distanciaAlSol );
        System.out.println("Es observable: " + (esObservable ? "Sí" : "No"));
    }

    public double calcularDensidad() {
        return masa / volumen;
    }


    public static void main(String[] args) {
       
        Planeta p1 = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, true);
        Planeta p2 = new Planeta("Júpiter", 1, 1.899E27, 1.4313E15, 139820, 750000000, true);

        p1.imprimirValores(); 
        System.out.println("Densidad de " + p1.nombre + ": " + p1.calcularDensidad());
        p2.imprimirValores();
        System.out.println("Densidad de " + p2.nombre + ": " + p2.calcularDensidad() );

       
    }
}
