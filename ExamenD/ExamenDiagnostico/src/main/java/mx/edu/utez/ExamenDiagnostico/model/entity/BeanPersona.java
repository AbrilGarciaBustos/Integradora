package mx.edu.utez.ExamenDiagnostico.model.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Data
@Entity
@Table(name ="persona")
public class BeanPersona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre", nullable = false)
    private  String nombre;

    @Column(name = "apellidos", nullable = false)
    private String apellidos;

    @Column(name = "fecha", nullable = false)
    private String fecha;

    @Column(name = "curp", nullable = false)
    private String curp;
}








