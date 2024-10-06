package proyecto.voluntariado;

import java.util.ArrayList;
import java.util.List;

public class Personas {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String rut;
    private List<InformacionPersonal> informacionPersonalList;
    private Resto resto;

    public Personas(String nombre, String primerApellido, String segundoApellido, String rut) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.rut = rut;
        this.informacionPersonalList = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public String getRut() {
        return rut;
    }

    public List<InformacionPersonal> getInformacionPersonalList() {
        return informacionPersonalList;
    }

    public void agregarInformacionPersonal(String genero, String fechaNacimiento, String correo, int numero) {
        this.informacionPersonalList.add(new InformacionPersonal(genero, fechaNacimiento, correo, numero));
    }
    
       public void setResto(Resto resto) {
        this.resto = resto;
    }

    public Resto getResto() {
        return resto;
    }
}
