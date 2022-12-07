package com.iui.gestioncomptemicroserviceiui.services;

import com.iui.gestioncomptemicroserviceiui.entities.Utilisateur;
import com.iui.gestioncomptemicroserviceiui.repositories.UtilisateurRepository;
import com.iui.gestioncomptemicroserviceiui.services.UtiisateurService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Service
@Transactional
public class UtilisateurServiceImpl implements UtiisateurService {
    UtilisateurRepository utilisateurRepository;

    @Override
    public Utilisateur saveUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public List<Utilisateur> getAllUtilisateur() {
        return utilisateurRepository.findAll();
    }

    @Override
    public Utilisateur getUtilisateur(Long id) {
        return  utilisateurRepository.findById(id).get();
    }

    @Override
    public Utilisateur updateUtilisateur(Utilisateur utilisateur) {


        return  utilisateurRepository.save(utilisateur);
    }

    @Override
    public void deleteUtilisateur(Long id) {
        utilisateurRepository.deleteById(id);
    }
}
