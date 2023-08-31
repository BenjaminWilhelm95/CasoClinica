import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EspecialidadMedica pediatria = new EspecialidadMedica("Pediatría", "Latitud1 / Longitud1");
        EspecialidadMedica cirugia = new EspecialidadMedica("Cirugía", "Latitud2 / Longitud2");

        Medico medico1 = new Medico("Médico", "Juan Pérez", "Dirección1", "Soltero", "123456789", "8:00 - 16:00",
                "Pediatría", "9:00 - 13:00", new ArrayList<>(), pediatria);
        Medico medico2 = new Medico("Médico", "Ana López", "Dirección2", "Casado", "987654321", "9:00 - 17:00",
                "Cirugía", "10:00 - 15:00", new ArrayList<>(), cirugia);

        pediatria.agregarMedico(medico1);
        cirugia.agregarMedico(medico2);

        Administrativo admin1 = new Administrativo("Administrativo", "María Rodríguez", "Dirección3", "Casado", "567890123", "8:30 - 17:30", "maria@example.com");
        Administrativo admin2 = new Administrativo("Administrativo", "Carlos Gómez", "Dirección4", "Soltero", "456789012", "9:00 - 18:00", "carlos@example.com");

        List<String> direccionesClinica = new ArrayList<>();
        direccionesClinica.add("Dirección5");
        ClinicaMedica clinica = new ClinicaMedica("Clínica SaludTotal", direccionesClinica, "Privada");

        clinica.agregarMedico(medico1);
        clinica.agregarMedico(medico2);
        clinica.agregarAdministrativo(admin1);
        clinica.agregarAdministrativo(admin2);

        List<Medico> todosLosMedicos = clinica.obtenerMedicos();
        System.out.println("Todos los médicos de la clínica:");
        for (Medico medico : todosLosMedicos) {
            System.out.println("- " + medico.getNombre());
        }

        List<Administrativo> todosLosAdministrativos = clinica.obtenerAdministrativos();
        System.out.println("\nTodos los administrativos de la clínica:");
        for (Administrativo administrativo : todosLosAdministrativos) {
            System.out.println("- " + administrativo.getNombre());
        }

        List<Medico> medicosPediatra = clinica.obtenerMedicosEspecialidad("Pediatría");
        System.out.println("\nMédicos de la especialidad de Pediatría:");
        for (Medico medico : medicosPediatra) {
            System.out.println("- " + medico.getNombre());
        }

        Administrativo adminEspecialidad = clinica.obtenerAdministrativoEspecialidad("Cirugía", "Carlos Gómez", "456789012");
        if (adminEspecialidad != null) {
            System.out.println("\nAdministrativo de la especialidad de Cirugía:");
            System.out.println("- " + adminEspecialidad.getNombre());
        } else {
            System.out.println("\nNo se encontró un administrativo en la especialidad de Cirugía con los datos proporcionados.");
        }
    }
}