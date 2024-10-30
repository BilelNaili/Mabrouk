#Author: your.email@your.domain.com
Feature: ChemisesBlousesPage

  Scenario: choisir un produit
    Given acceder a la page du Chemises & Blouses
    When utilisateur clique sur le produit "CHEMISE ILES"
    Then utilisateur sur la page "CHEMISE ILES"
