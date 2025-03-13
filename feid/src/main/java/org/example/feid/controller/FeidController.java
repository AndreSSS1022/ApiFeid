package org.example.feid.controller;


import org.example.feid.entity.FeidEntity;
import org.example.feid.service.FeidService;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/v1/feid")
public class FeidController {

    public final FeidService feidService;
    private int id;


    public FeidController(FeidService feidService) {
        this.feidService = feidService;
    }

    @GetMapping
    public List<FeidEntity> getAllFeid() {
        return feidService.getAllFeid();
    }




    @GetMapping("/{id}")
    public FeidEntity getOneFeid(@PathVariable int id) {
        return feidService.getFeidById(id);
    }



    @PostMapping
    public String postFeid() {

        return "Canción agregada " ;
    }

    @PutMapping
    public String updateFeid(){

        return"Actualizar un cancion";
    }

    @DeleteMapping
    public String deleteFeid(){

        return"Eliminar un cancion";
    }
}

