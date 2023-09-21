package med.voll.api.domain.consulta.validaciones;

import jakarta.validation.ValidationException;
import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.DatosAgendarConsulta;

public class MedicoConConsulta {

    private ConsultaRepository repository;

    public void validar(DatosAgendarConsulta datos) {

        if (datos.idMedico()==null)
            return;

        var medicoConConsulta = repository.existByMedicoIdAndDate(datos.idMedico(), datos.fecha());

        if (medicoConConsulta){
            throw new ValidationException("este medico ya tiene una consulta en ese horario");

        }
    }
}
