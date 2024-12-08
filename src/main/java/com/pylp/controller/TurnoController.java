package com.pylp.controller;

import com.pylp.service.FirebaseService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/turnos")
public class TurnoController {

    private final FirebaseService firebaseService;

    public TurnoController(FirebaseService firebaseService) {
        this.firebaseService = firebaseService;
    }

    @PostMapping("/crear")
    public String crearTurno(@RequestBody Map<String, Object> turno) {
        String path = "turnos/" + turno.get("id");
        firebaseService.saveData(path, turno);
        return "Turno creado correctamente.";
    }

    @GetMapping("/{id}")
    public Object obtenerTurno(@PathVariable String id) {
        return firebaseService.getData("turnos/" + id);
    }
}
