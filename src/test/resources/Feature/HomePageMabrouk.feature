#Author: Bilel/eval CSI 2024
Feature: page d accueil mabrouk

  Scenario: Verification des menu de la page d acceuil
    Given utilisateur accede a la page d accueil Mabrouk
    When utilisateur survole la souris sur le menu "Femme" et clique sur le sous menu "Chemises & Blouses"
    Then utilisateur se redirige vers la page "Chemises & Blouses"
