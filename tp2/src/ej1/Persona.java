package ej1;

public abstract class Persona {
    protected String nombre , apellido , dni , estadoCivil ;
    private int ageIncorporacion , tipo;

    public Persona(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getAgeIncorporacion() {
        return ageIncorporacion;
    }

    public void setAgeIncorporacion(int ageIncorporacion) {
        this.ageIncorporacion = ageIncorporacion;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}



