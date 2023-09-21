package med.voll.api.domain.paciente;

public record DatosDetalladoPaciente(String nombre, String email, String telefono, String identidad) {
    public DatosDetalladoPaciente(Paciente paciente){
        this(paciente.getNombre(), paciente.getEmail(), paciente.getTelefono(), paciente.getIdentidad());
    }

}
