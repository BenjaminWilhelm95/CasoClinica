import java.util.ArrayList;
import java.util.List;

class EspecialidadMedica {
    private String nombre;
    private String ubicacion;
    private List<Medico> medicos;

    public EspecialidadMedica(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.medicos = new ArrayList<>();
    }

    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }
}
