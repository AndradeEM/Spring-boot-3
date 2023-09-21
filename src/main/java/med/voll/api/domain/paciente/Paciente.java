package med.voll.api.domain.paciente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name= "pacientes")
@Entity(name= "Paciente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Boolean activo;
    private Long id;
    private String nombre;
    private String email;
    private String identidad;
    private String telefono;
    private String urbanizacion;
    private String distrito;
    private String CP;
    private String complemento;
    private String numero;
    private String provincia;
    private String ciudad;

    public Paciente(DatosRegistroPaciente datosRegistroPaciente){
        this.activo = true;
        this.nombre = datosRegistroPaciente.nombre();
        this.email = datosRegistroPaciente.email();
        this.identidad = datosRegistroPaciente.identidad();
        this.telefono = datosRegistroPaciente.telefono();
        this.urbanizacion = datosRegistroPaciente.urbanizacion();
        this.distrito = datosRegistroPaciente.distrito();
        this.CP = datosRegistroPaciente.CP();
        this.complemento = datosRegistroPaciente.complemento();
        this.numero = datosRegistroPaciente.numero();
        this.provincia = datosRegistroPaciente.provincia();
        this.ciudad = datosRegistroPaciente.ciudad();
    }

    public void actualizarInformacion(DatosActualizacionPaciente datos) {
        if (datos.nombre() != null)
            this.nombre = datos.nombre();

        if (datos.telefono() != null)
            this.telefono = datos.telefono();

    }

    public void desactivarPaciente() {
        this.activo = false;
    }
}
