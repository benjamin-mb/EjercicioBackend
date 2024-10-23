
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Carretera carretera =  new Carretera(80,60, "Carretera el mocho",
                "titiribi", "08/12/2025", "08/07/2026",
        80000000, 67000000, "movilidad", 2);
    Fabrica fabrica = new Fabrica(5, 70, "NOEL FABRICA TERCERO",
                "Medellin", "22/10/2024", "1/03/2025",
                100000000, 10000000,"fabrica de galletas", "alimento",
                4);

        System.out.println(carretera.obtenerInformacionProyecto());
        System.out.println(carretera.encontrarUsodeDinero(67000000,80000000));

        System.out.println(fabrica.obtenerInformacionProyecto());
        System.out.println(fabrica.encontrarUsodeDinero(10000000,100000000));

    }


}