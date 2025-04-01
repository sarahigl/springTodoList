# Spring Todo Application

## Description
Spring Todo est une application backend de gestion de tâches (Todo List) développée avec Spring Boot. Elle fournit une API RESTful pour la gestion des tâches et des catégories. Cette application ne contient pas d'interface utilisateur (frontend) et est conçue pour être utilisée comme un service backend.

## Technologies Utilisées
- Java 17
- Spring Boot 3.4.2
- Spring Data JPA
- MySQL
- Spring Security (OAuth2)
- Lombok

## Structure du Projet
```
src/main/java/com/springtodo/springtodo/
├── controller/     # Contrôleurs REST
├── model/         # Entités JPA
├── service/       # Logique métier
├── repository/    # Interfaces d'accès aux données
├── configuration/ # Configuration Spring
└── dto/           # Objets de transfert de données
```

## Fonctionnalités
- API RESTful pour la gestion des catégories (CRUD)
- API RESTful pour la gestion des tâches (CRUD)
- Sécurité avec OAuth2
- Persistance des données avec MySQL

## Prérequis
- Java 17 ou supérieur
- Maven
- MySQL

## Configuration
1. Assurez-vous que MySQL est installé et en cours d'exécution
2. Configurez la base de données dans `application.properties`
3. Exécutez l'application avec Maven :
```bash
mvn spring-boot:run
```

## API Endpoints
### Catégories
- GET `/categories` - Liste toutes les catégories
- POST `/addCategory` - Ajoute une nouvelle catégorie
- GET `/category/{id}` - Récupère une catégorie par son ID

## Développement
Le projet utilise :
- Lombok pour réduire le boilerplate code
- Spring Data JPA pour la persistance
- Spring Security pour l'authentification


## Licence
Ce projet est sous licence MIT. 