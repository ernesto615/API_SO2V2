package com.example.SO2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class DummyController {

    @GetMapping("/")
    public Map<String, String> Hola() {
        Map<String, String> respuesta = new HashMap<>();
        respuesta.put("mensaje", "Hola Mundo");
        respuesta.put("estado", "Datos Dummy");

        return respuesta;
    }
}