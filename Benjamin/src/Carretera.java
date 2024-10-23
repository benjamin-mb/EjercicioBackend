public class Carretera extends ProyectoInfraestructura{

    private int numeroCarriles; // Número de carriles

    // Constructor
    public Carretera(int areaDeConstruccion, int numeroTrabajadores, String nombreProyecto,
                     String ciudadProyecto, String fechaInicio, String fechaEntrega,
                     int presupuesto, int costo, String tipo, int numeroCarriles) {
        super(areaDeConstruccion, numeroTrabajadores, nombreProyecto, ciudadProyecto,
                fechaInicio, fechaEntrega, presupuesto, costo, tipo);

        this.numeroCarriles = numeroCarriles;
    }

    @Override
    public String obtenerInformacionProyecto() {
        return super.obtenerInformacionProyecto() +
                ", Número de carriles: " + numeroCarriles;
    }
}
