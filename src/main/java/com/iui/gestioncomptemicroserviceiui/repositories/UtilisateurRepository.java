package com.iui.gestioncomptemicroserviceiui.repositories;

import com.iui.gestioncomptemicroserviceiui.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
}
