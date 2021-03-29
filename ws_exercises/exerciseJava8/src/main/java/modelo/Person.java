package modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@EqualsAndHashCode
@RequiredArgsConstructor
public class Persona {
    private String dni;
    private String nombre;
    private String apellido;
    private LocalDateTime fechaNacimiento;



}
