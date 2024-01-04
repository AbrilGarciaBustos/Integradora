package mx.edu.utez.ExamenDiagnostico.controller;

import jakarta.persistence.criteria.CriteriaBuilder;
import mx.edu.utez.ExamenDiagnostico.model.dto.DtoPersona;
import mx.edu.utez.ExamenDiagnostico.model.entity.BeanPersona;
import mx.edu.utez.ExamenDiagnostico.service.IPersona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/persona")
public class ControllerPersona {
    @Autowired
    private IPersona personaService;
     @GetMapping("/")
    public List<BeanPersona> getPersona(){return personaService.findAll();}

    @GetMapping("/")
    public BeanPersona showById(@PathVariable Integer id){return personaService.findById(id);}

    @PostMapping("/")
    public DtoPersona create (@RequestBody DtoPersona dtoPersona){
         BeanPersona personaSave = personaService.save(dtoPersona);
         return DtoPersona.builder()
                 .id(personaSave.getId())
                 .nombre(personaSave.getNombre())
                 .apellidos(personaSave.getApellidos())
                 .fecha(personaSave.getFecha())
                 .curp(personaSave.getCurp()).build();
    }
    @PutMapping("/")
    public DtoPersona update (@RequestBody DtoPersona dtoPersona){
         BeanPersona personaUpdate = personaService.save(dtoPersona);
         return  DtoPersona.builder()
                 .id(personaUpdate.getId())
                 .nombre(personaUpdate.getNombre())
                 .apellidos(personaUpdate.getApellidos())
                 .fecha(personaUpdate.getFecha())
                 .curp(personaUpdate.getCurp()).build();
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        BeanPersona persona = personaService.findById(id);
        personaService.delete(persona);
    }



}
