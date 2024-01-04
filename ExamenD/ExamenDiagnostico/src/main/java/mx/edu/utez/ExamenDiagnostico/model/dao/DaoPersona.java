package mx.edu.utez.ExamenDiagnostico.model.dao;

import mx.edu.utez.ExamenDiagnostico.model.entity.BeanPersona;
import org.springframework.data.repository.CrudRepository;

public interface DaoPersona extends CrudRepository<BeanPersona, Integer> {

}
