package med.voll.api.domain.paciente;

public record DatosListadoPaciente(Long id, String nombre, String Email, String Identidad) {
    public DatosListadoPaciente(Paciente paciente){
        this(paciente.getId(), paciente.getNombre(), paciente.getEmail(), paciente.getIdentidad());
    }
}
