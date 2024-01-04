package mx.edu.utez.ExamenDiagnostico.service.impl;

import org.springframework.transaction.annotation.Transactional;
import lombok.AllArgsConstructor;
import mx.edu.utez.ExamenDiagnostico.model.dao.DaoPersona;
import mx.edu.utez.ExamenDiagnostico.model.dto.DtoPersona;
import mx.edu.utez.ExamenDiagnostico.model.entity.BeanPersona;
import mx.edu.utez.ExamenDiagnostico.service.IPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ImplPersona  implements IPersona {

    private final DaoPersona daoPersona;

    @Override
    @Transactional
    public BeanPersona save(DtoPersona dtoPersona) {
        BeanPersona persona = BeanPersona.builder()
                .id(dtoPersona.getId())
                .nombre(dtoPersona.getNombre())
                .apellidos(dtoPersona.getApellidos())
                .fecha(dtoPersona.getFecha())
                .curp(dtoPersona.getCurp()).build();
        return daoPersona.save(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public BeanPersona findById(Integer id) {
        return daoPersona.findById(id).orElse(null);
    }

    @Override
    public List<BeanPersona> findAll() {
        return (List<BeanPersona>) daoPersona.findAll();
    }

    @Override
    public void delete(BeanPersona persona) {
        daoPersona.delete(persona);
    }

}




