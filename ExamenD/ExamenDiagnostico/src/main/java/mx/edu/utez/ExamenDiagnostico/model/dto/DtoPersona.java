package mx.edu.utez.ExamenDiagnostico.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Data
public class DtoPersona {
    private Integer id;
    private String nombre;
    private String apellidos;
    private String fecha;
    private  String curp;
}
