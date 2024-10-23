public class ProyectoInfraestructura {
    private int areaDeConstruccion;
    private int numeroTrabajadores;
    private String nombreProyecto;
    private String ciudadProyecto;
    private String fechaInicio;
    private String fechaEntrega;
    private int presupuesto;
    private int costo;

    private String tipo;


    // Constructor
    public ProyectoInfraestructura(int areaDeConstruccion, int numeroTrabajadores, String nombreProyecto, String ciudadProyecto,
                                   String fechaInicio, String fechaEntrega, int presupuesto, int costo,String tipo) {
        this.areaDeConstruccion = areaDeConstruccion;
        this.numeroTrabajadores = numeroTrabajadores;
        this.nombreProyecto = nombreProyecto;
        this.ciudadProyecto = ciudadProyecto;
        this.fechaInicio = fechaInicio;
        this.fechaEntrega = fechaEntrega;
        this.presupuesto = presupuesto;
        this.costo = costo;
        this.tipo=tipo;


    }

    // Métodos get
    public int getAreaDeConstruccion() {
        return areaDeConstruccion;
    }

    public int getNumeroTrabajadores() {
        return numeroTrabajadores;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public String getCiudadProyecto() {
        return ciudadProyecto;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public int getCosto() {
        return costo;
    }

    public String getTipo(){
        return tipo;
    }



    // Métodos set
    public void setAreaDeConstruccion(int areaDeConstruccion) {
        this.areaDeConstruccion = areaDeConstruccion;
    }

    public void setNumeroTrabajadores(int numeroTrabajadores) {
        this.numeroTrabajadores = numeroTrabajadores;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public void setCiudadProyecto(String ciudadProyecto) {
        this.ciudadProyecto = ciudadProyecto;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



    //metodos

    public int encontrarUsodeDinero(int costo, int presupuesto){
        if (costo>presupuesto){
            System.out.println("no hay suficiente presupuesto, ñe presto plata al 20%");
        }
        int dineroSobrante = costo - presupuesto;
        return dineroSobrante;
    }

    public String obtenerInformacionProyecto() {
        return "El proyecto '" + nombreProyecto + "' en " + ciudadProyecto +
                " tiene un costo de " + costo + ", tipo: " + tipo +
                ", presupuesto: " + presupuesto + ", área: " + areaDeConstruccion + "m²" +
                ", trabajadores: " + numeroTrabajadores + ", fechas: inicio - " + fechaInicio + ", entrega - " + fechaEntrega;
    }

    public void informacionProyecto(String tipo) {
        System.out.println("El proyecto es de tipo: " + tipo);
    }

}


