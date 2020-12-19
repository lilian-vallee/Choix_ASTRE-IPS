# Choix_ASTRE-IPS
## Réalisé par Gallien FRESNAIS, David HENG et Lilian VALLEE

Développé avec Java Spring Boot avec les plugins suivants
- Base de données H2
- JPA (Java Persistance API)
- Thymeleaf (templates HTML)
- Webjars
  - Bootstrap CSS
  - jQuery
  - Chart.js

Design patterns employés
- MVC
- Singleton

Parsing du JSON pour avoir le Questionnaire des 3A puis insertion dans une base de données H2 en mémoire

## Pré-requis pour lancer l'exécutable
- [l'exécutable JAR](https://github.com/lilian-vallee/Choix_ASTRE-IPS/releases/download/v1.0/choixAstreIPS-v1.jar)
- Java JRE 11
- Le navigateur internet de votre choix

## Lancement de l'application
- Lancer l'exécutable Java
  - Méthode 1 : double-cliquer dessus (s'exécutera en arrière-plan)
  - Méthode 2 : le lancer via la console de commandes *java -jar choixAstreIPS-v1.jar*
- Ouvrir votre navigateur internet
- Taper dans la barre d'adresse : *localhost:8080*
