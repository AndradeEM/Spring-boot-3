package med.voll.api.domain.paciente;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DatosRegistroPaciente(
        @NotBlank
        String nombre,
        @NotBlank
        @Email
        String email,
        @NotBlank
        @NotBlank @Pattern(regexp = "\\d{3,6}")
        String identidad,
        @NotBlank
        String telefono,
        @NotBlank
        String urbanizacion,
        @NotBlank
        String distrito,
        @NotBlank
        String CP,
        @NotBlank
        String complemento,
        @NotBlank
        String numero,
        @NotBlank
        String provincia,
        @NotBlank
        String ciudad

) {

}
