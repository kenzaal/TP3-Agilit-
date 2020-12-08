#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: US_000 Ajout d'objets dans une pièce

En tant que habitant du manoir
Je veux ajouter des objets dans une pièce
Afin de la remplir et de pouvoir vérifier le nombre total d’objets
  

  @tag1
  Scenario: calcul automatique du nombre total d'objets
    Given une pièce 
    And avec un nombre d'objets <objActuel>
    When on ajoute <val> objets
    Then le nombre d'objets total de la pièce <nbObjets> doit etre calculé 
    
     	| objActuel   | val   | nbObjets  |
      | 2           |     5 | 7         |
      | 4           |     7 | 11        |
   

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
