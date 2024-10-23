public class Fabrica extends ProyectoInfraestructura{
    private String tipoIndustria;
    private int cantidadSecciones;

    // Constructor
    public Fabrica(int areaDeConstruccion, int numeroTrabajadores, String nombreProyecto,
                   String ciudadProyecto, String fechaInicio, String fechaEntrega,
                   int presupuesto, int costo, String tipo, String tipoIndustria,
                   int cantidadSecciones) {
        super(areaDeConstruccion, numeroTrabajadores, nombreProyecto, ciudadProyecto,
                fechaInicio, fechaEntrega, presupuesto, costo, tipo);
        this.tipoIndustria = tipoIndustria;
        this.cantidadSecciones = cantidadSecciones;
    }

    @Override
    public String obtenerInformacionProyecto() {
        return super.obtenerInformacionProyecto() + ", Tipo de industria: " + tipoIndustria +
                ", Cantidad de secciones: " + cantidadSecciones;
    }
}
