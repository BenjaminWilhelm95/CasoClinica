import java.util.ArrayList;
import java.util.List;

class ClinicaMedica {
    private String nombre;
    private List<String> direcciones;
    private String tipo;
    private List<Medico> medicos;
    private List<Administrativo> administrativos;

    public ClinicaMedica(String nombre, List<String> direcciones, String tipo) {
        this.nombre = nombre;
        this.direcciones = direcciones;
        this.tipo = tipo;
        this.medicos = new ArrayList<>();
        this.administrativos = new ArrayList<>();
    }

    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void agregarAdministrativo(Administrativo administrativo) {
        administrativos.add(administrativo);
    }

    public List<Medico> obtenerMedicos() {
        return medicos;
    }

    public List<Administrativo> obtenerAdministrativos() {
        return administrativos;
    }

    public List<Medico> obtenerMedicosEspecialidad(String nombreEspecialidad) {
        List<Medico> medicosEspecialidad = new ArrayList<>();
        for (Medico medico : medicos) {
            if (medico.getEspecialidad().getNombre().equals(nombreEspecialidad)) {
                medicosEspecialidad.add(medico);
            }
        }
        return medicosEspecialidad;
    }

    public Administrativo obtenerAdministrativoEspecialidad(String nombreEspecialidad, String nombreAdministrativo, String rutAdministrativo) {
        for (Administrativo administrativo : administrativos) {
            if (administrativo.getNombre().equals(nombreAdministrativo) && administrativo.getRut().equals(rutAdministrativo)) {
                return administrativo;
            }
        }
        return null;
    }
}
