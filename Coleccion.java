
import java.util.ArrayList;

public class Coleccion {
    private ArrayList<Instrumento> instrumentos;

    public Coleccion() {
        this.instrumentos = new ArrayList<>();
    }

    public void agregarInstrumento(Instrumento instrumento) {
        instrumentos.add(instrumento);
    }

    public ArrayList<Instrumento> getInstrumentos() {
        return instrumentos;
    }

    public boolean eliminarPorClave (int clave) {
        for (int i = 0; i < instrumentos.size(); i++) {
            if (instrumentos.get(i).getClave() == clave) {
                instrumentos.remove(i);
                System.out.println("Instrumento eliminado con exito.");
                return true;
            }
        }
        return false;
    }

    public void buscarPorAutor (String autor) {
        boolean encontrado = false;
        for (int i = 0; i < instrumentos.size(); i++) {
            if (instrumentos.get(i).getAutor().equalsIgnoreCase(autor)) {
                System.out.println(instrumentos.get(i).toString());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron instrumentos del autor: " + autor);
        }
    }

    public void buscarPorTipo (Tipo tipo) {
        boolean encontrado = false;
        for (int i = 0; i < instrumentos.size(); i++) {
            if (instrumentos.get(i).getTipo() == tipo) {
                System.out.println(instrumentos.get(i).toString());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron instrumentos del tipo: " + tipo);
        }
    }

    public void buscarPorForma (Forma forma) {
        boolean encontrado = false;
        for (int i = 0; i < instrumentos.size(); i++) {
            if (instrumentos.get(i).getForma() == forma) {
                System.out.println(instrumentos.get(i).toString());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron instrumentos de la forma: " + forma);
        }
    }

    public void mostrarValidados() {
        boolean encontrado = false;
        for (int i = 0; i < instrumentos.size(); i++) {
            if (instrumentos.get(i).isValidado()) {
                System.out.println(instrumentos.get(i).toString());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron instrumentos validados.");
        }
    }

    public void ordenarPorClave() {
        instrumentos.sort((i1, i2) -> Integer.compare(i1.getClave(), i2.getClave()));
    }

    public void ordenarPorAutor() {
        instrumentos.sort((i1, i2) -> i1.getAutor().compareTo(i2.getAutor()));
    }


}
