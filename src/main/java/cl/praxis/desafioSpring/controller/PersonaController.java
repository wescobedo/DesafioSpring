package cl.praxis.desafioSpring.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import cl.praxis.desafioSpring.model.Persona;

@RestController
public class PersonaController {

    @GetMapping("/Waldo/Escobedo")
    public Persona getPersona() {
        Persona persona = new Persona("Waldo", "Escobedo", 60);
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Apellido: "+persona.getApellido());
        System.out.println("Edad: "+persona.getEdad());

        return persona;
    }

    @GetMapping("/saludo")
    public String getSaludo() {
        return "¡Hola! Bienvenido al desafio Spring Boot.";
    }
}


