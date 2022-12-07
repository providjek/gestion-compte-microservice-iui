package com.iui.gestioncomptemicroserviceiui.controllers;

import com.iui.gestioncomptemicroserviceiui.entities.Utilisateur;
import com.iui.gestioncomptemicroserviceiui.services.UtiisateurService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class UtilisateurController {
UtiisateurService utiisateurService;

@PostMapping("/create")
public Utilisateur saveUtilisateur(@RequestBody Utilisateur utilisateur){

    return  utiisateurService.saveUtilisateur(utilisateur);
}

@GetMapping("/all")
public List<Utilisateur> getAllUtilisateur(){
    return  utiisateurService.getAllUtilisateur();
}

@GetMapping("/{id}")
public Utilisateur getUtilisateur(@PathVariable(name = "id") Long id){
    return   utiisateurService.getUtilisateur(id);
}

@PatchMapping("/update")
public  Utilisateur updateUtisateur(@RequestBody Utilisateur utilisateur){
    return utiisateurService.updateUtilisateur(utilisateur);
}

@DeleteMapping("/delete/{id}")
public void  deleteUtilisateur(@PathVariable(name = "id") Long id){
    utiisateurService.deleteUtilisateur(id);
}

}

