package proyecto.voluntariado;

public class InformacionPersonal {
    private String genero;
    private String fechaNacimiento;
    private String correo;
    private int numero;
    private String region;
    private String comuna;

    public InformacionPersonal(String genero, String fechaNacimiento, String correo, int numero) {
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.numero = numero;
    }

    public String getGenero() {
        return genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    public void setFechaNacimiento(String fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }

    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }
}
