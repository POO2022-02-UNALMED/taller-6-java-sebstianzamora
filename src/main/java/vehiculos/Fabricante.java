package vehiculos;
import java.util.ArrayList;
import vehiculos.Vehiculo;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private static ArrayList<Fabricante> listado = new ArrayList<>();
    private int totalVentas;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        listado.add(this);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public static ArrayList<Fabricante> getListado() {
        return listado;
    }


    public int getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(int totalVentas) {
        this.totalVentas = totalVentas;
    }
    
    
    public static Fabricante fabricaMayorVentas() {
        Fabricante fabMventas = listado.get(0);
        for (Fabricante v : listado) {
            if (v.getTotalVentas() > fabMventas.getTotalVentas()) {
		fabMventas = v;
            }
	}
        return fabMventas;
    }

}