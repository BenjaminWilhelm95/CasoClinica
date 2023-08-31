abstract class Trabajador {
    private String tituloProfesional;
    private String nombre;
    private String direccion;
    private String estadoCivil;
    protected String rut;
    private String horarioTrabajo;

    public Trabajador(String tituloProfesional, String nombre, String direccion, String estadoCivil, String rut, String horarioTrabajo) {
        this.tituloProfesional = tituloProfesional;
        this.nombre = nombre;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.rut = rut;
        this.horarioTrabajo = horarioTrabajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public abstract String getTipo();
}
