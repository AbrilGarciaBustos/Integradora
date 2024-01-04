package mx.edu.utez.ExamenDiagnostico.service;

import mx.edu.utez.ExamenDiagnostico.model.dto.DtoPersona;
import mx.edu.utez.ExamenDiagnostico.model.entity.BeanPersona;

import java.util.List;

public interface IPersona {

BeanPersona save (DtoPersona persona);

BeanPersona findById(Integer id);
 List<BeanPersona> findAll();
 void delete (BeanPersona persona);

}
