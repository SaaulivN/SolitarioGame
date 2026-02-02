public class Main {
    public static void main(String[] args) {
        Coleccion miColeccion = new Coleccion();

        miColeccion.agregarInstrumento(new Instrumento("Inventario de Ansiedad de Beck", "Beck", true, 95, 105, 1988, Tipo.ANSIEDAD, Forma.CUESTIONARIO));
        miColeccion.agregarInstrumento(new Instrumento("Escala de Estres Percibido", "Cohen", false, 85, 101, 1983, Tipo.ESTRES, Forma.ESCALA));
        miColeccion.agregarInstrumento(new Instrumento("Test de Estres Laboral", "Beck", true, 90, 110, 2005, Tipo.ESTRES, Forma.TEST));
        miColeccion.agregarInstrumento(new Instrumento("Escala de Salud Mental", "Smith", true, 80, 102, 2010, Tipo.AMBAS, Forma.ESCALA));

        System.out.println("=== SISTEMA DE PRUEBA SALUD MENTAL ===");

        System.out.println("\n[1] BUSCANDO POR AUTOR: 'Beck'");
        miColeccion.buscarPorAutor("Beck");

        System.out.println("\n[2] BUSCANDO POR TIPO: ESTRES");
        miColeccion.buscarPorTipo(Tipo.ESTRES);

        System.out.println("\n[3] BUSCANDO POR FORMA: ESCALA");
        miColeccion.buscarPorForma(Forma.ESCALA);

        System.out.println("\n[4] MOSTRANDO SOLO VALIDADOS");
        miColeccion.mostrarValidados();

        System.out.println("\n[5] ORDENANDO POR CLAVE");
        miColeccion.ordenarPorClave();
        miColeccion.getInstrumentos().forEach(System.out::println);

        System.out.println("\n[6] ORDENANDO POR AUTOR");
        miColeccion.ordenarPorAutor();
        miColeccion.getInstrumentos().forEach(System.out::println);

        System.out.println("\n[7] ELIMINANDO INSTRUMENTO CON CLAVE 101");
        boolean eliminado = miColeccion.eliminarPorClave(101);
        if (eliminado) {
            System.out.println("Confirmación: El elemento fue borrado.");
        }

        System.out.println("\n[8] LISTA FINAL DESPUÉS DE ELIMINAR:");
        miColeccion.getInstrumentos().forEach(System.out::println);
    }
}
