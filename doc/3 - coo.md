# 🌟 Approche Orientée Objet (OO)

L'approche Orientée Objet est une méthode de conception logicielle qui repose sur la notion d'objets et de classes.
Elle permet de modéliser un système en fonction des objets du monde réel et de leurs interactions.

## Objets et Classes

👉 Une classe est un modèle ou un plan permettant de créer des objets. Elle définit les propriétés (attributs) et comportements (méthodes).

👉 Un objet est une instance d’une classe, c’est-à-dire un élément concret basé sur ce modèle.

**Exemple :**
```java
class Voiture {
    String marque;
    int vitesse;

    void accelerer() {
        vitesse += 10;
        System.out.println("Vitesse actuelle : " + vitesse + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Voiture maVoiture = new Voiture(); // Création d'un objet
        maVoiture.marque = "Toyota";
        maVoiture.vitesse = 50;
        maVoiture.accelerer();
    }
}

```
### Abstraction

👉 Cacher les détails complexes et ne montrer que les fonctionnalités essentielles.

**Exemple :** Un utilisateur utilise une voiture sans connaître le fonctionnement interne du moteur.

Les classes abstraites et interfaces permettent d’implémenter l’abstraction.
```java
abstract class Animal {
    abstract void faireDuBruit(); // Méthode abstraite (pas d'implémentation)
}

class Chien extends Animal {
    @Override
    void faireDuBruit() {
        System.out.println("Le chien aboie !");
    }
}

```
### Encapsulation
👉 Cacher les données et contrôler leur accès via des getters et setters.

**Exemple :** On ne peut pas modifier directement la vitesse d'une voiture, mais on peut l’accélérer avec une méthode.
```java
class Voiture {
private int vitesse;

    public int getVitesse() { // Getter
        return vitesse;
    }

    public void setVitesse(int vitesse) { // Setter
        if (vitesse >= 0) {
            this.vitesse = vitesse;
        }
    }
}

```
✅ **Avantages :**
- Protège les données sensibles.
- Empêche l'accès non contrôlé.

### Modularité
👉 Diviser un programme en plusieurs modules réutilisables.

**Exemple :**
```java
class Moteur {
    void demarrer() {
        System.out.println("Le moteur démarre !");
    }
}

class Voiture {
    Moteur moteur = new Moteur();
    
    void rouler() {
        moteur.demarrer();
        System.out.println("La voiture roule !");
    }
}

```
✅ **Avantages :**
- Facilite la réutilisation du code.
- Permet une meilleure organisation du programme.

### Héritage
👉 Permet de réutiliser et d'étendre le code d'une classe existante.

**Exemple :**
```java
class Animal {
    void manger() {
        System.out.println("Cet animal mange.");
    }
}

class Chien extends Animal { // Chien hérite de Animal
    void aboyer() {
        System.out.println("Le chien aboie !");
    }
}

public class Main {
    public static void main(String[] args) {
        Chien chien = new Chien();
        chien.manger(); // Hérité de Animal
        chien.aboyer();
    }
}

```
✅ **Avantages :**
- Évite la duplication du code.
- Facilite l’évolution du logiciel.

### Polymorphisme
👉 Un même code peut fonctionner avec plusieurs types d’objets.

1️⃣ **Polymorphisme de substitution (héritage) :**
```java
class Animal {
    void faireDuBruit() {
        System.out.println("Un animal fait du bruit !");
    }
}

class Chat extends Animal {
    @Override
    void faireDuBruit() {
        System.out.println("Le chat miaule !");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Chat(); // Polymorphisme
        animal.faireDuBruit(); // "Le chat miaule !"
    }
}

```
2️⃣ **Polymorphisme d’interface :**
```java
interface Animal {
    void faireDuBruit();
}

class Chat implements Animal {
    public void faireDuBruit() {
        System.out.println("Le chat miaule !");
    }
}

```
### Surcharge (Overloading)
👉 Une méthode peut avoir plusieurs versions avec des paramètres différents.
```java
class Addition {
    int somme(int a, int b) {
        return a + b;
    }

    int somme(int a, int b, int c) { // Surcharge
        return a + b + c;
    }
}

```
### Généricité (Generics)
👉 Permet de créer des classes et méthodes génériques pour manipuler différents types de données.
```java
class Boite<T> { // T est un type générique
    private T objet;

    public void setObjet(T objet) {
        this.objet = objet;
    }

    public T getObjet() {
        return objet;
    }
}

public class Main {
    public static void main(String[] args) {
        Boite<String> boite = new Boite<>();
        boite.setObjet("Bonjour");
        System.out.println(boite.getObjet()); // "Bonjour"
    }
}

```
## Relations entre Classes

### Association
👉 Une classe est liée à une autre sans dépendance forte.

**Exemple :** Un Professeur peut enseigner plusieurs Matières.
```java
class Professeur {
    String nom;
}

class Matiere {
    String nom;
    Professeur professeur;
}

```
### Agrégation → Composition
👉 Une classe contient une autre classe, mais elles peuvent exister indépendamment.

Composition : Une dépendance forte où la sous-classe ne peut exister sans la classe principale.

**Agrégation (faible dépendance) :**
```java
class Moteur {
    void demarrer() {
        System.out.println("Moteur démarré !");
    }
}

class Voiture {
    Moteur moteur;

    Voiture(Moteur moteur) { // Injection de dépendance
        this.moteur = moteur;
    }
}

```
📌 Le moteur peut exister sans la voiture.

**Composition (forte dépendance) :**
```java
class Cœur {
    void battre() {
        System.out.println("Le cœur bat.");
    }
}

class Humain {
    private Cœur cœur = new Cœur(); // La destruction d'Humain entraîne celle de Cœur
}

```
📌 Le cœur ne peut pas exister sans l’humain.
