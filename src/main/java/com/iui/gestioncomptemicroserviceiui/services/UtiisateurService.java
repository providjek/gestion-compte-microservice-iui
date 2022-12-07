package com.iui.gestioncomptemicroserviceiui.services;

import com.iui.gestioncomptemicroserviceiui.entities.Utilisateur;

import java.util.List;

public interface UtiisateurService {

    Utilisateur saveUtilisateur(Utilisateur utilisateur);
    List<Utilisateur> getAllUtilisateur();
    Utilisateur getUtilisateur(Long id);

    Utilisateur updateUtilisateur(Utilisateur utilisateur);

    void deleteUtilisateur(Long id);
}
