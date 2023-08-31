import java.util.List;

class Medico extends Trabajador {
    private String especializacion;
    private String horarioAtencion;
    private List<String> pacientesAsignados;
    private EspecialidadMedica especialidad;

    public Medico(String tituloProfesional, String nombre, String direccion, String estadoCivil, String rut, String horarioTrabajo,
                  String especializacion, String horarioAtencion, List<String> pacientesAsignados, EspecialidadMedica especialidad) {
        super(tituloProfesional, nombre, direccion, estadoCivil, rut, horarioTrabajo);
        this.especializacion = especializacion;
        this.horarioAtencion = horarioAtencion;
        this.pacientesAsignados = pacientesAsignados;
        this.especialidad = especialidad;
    }

    @Override
    public String getTipo() {
        return "Médico";
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public String getHorarioAtencion() {
        return horarioAtencion;
    }

    public List<String> getPacientesAsignados() {
        return pacientesAsignados;
    }

    public EspecialidadMedica getEspecialidad() {
        return especialidad;
    }
}
