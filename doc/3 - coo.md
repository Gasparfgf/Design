# 🌟 Approche Orientée Objet (OO)

L'approche Orientée Objet est une méthode de conception logicielle qui repose sur la notion d'objets et de classes.
Elle permet de modéliser un système en fonction des objets du monde réel et de leurs interactions.

## 🔍 Objets et Classes

👉 Une classe est un modèle ou un plan permettant de créer des objets. Elle définit les propriétés (attributs) et comportements (méthodes).

👉 Un objet est une instance d’une classe, c’est-à-dire un élément concret basé sur ce modèle.

💡 **Exemple :**
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

💡 **Exemple :** Un utilisateur utilise une voiture sans connaître le fonctionnement interne du moteur.

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

💡 **Exemple :** On ne peut pas modifier directement la vitesse d'une voiture, mais on peut l’accélérer avec une méthode.
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

💡 **Exemple :**
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

💡 **Exemple :**
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

💡 **Exemple :** Un Professeur peut enseigner plusieurs Matières.
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

### Association
👉 L'association est une relation entre deux classes distinctes qui permet à leurs objets d'interagir.
C'est la relation la plus basique entre les objets, et elle peut prendre plusieurs formes (unidirectionnelle, bidirectionnelle, etc.).

💡 **Exemple :**
- Un professeur enseigne une matière.
- Une voiture a un conducteur.
- Un client passe une commande.

🔹 **Association Unidirectionnelle :** Une seule classe connaît l'existence de l'autre.

💡 **Exemple :** Un professeur enseigne une matière, mais la matière ne connaît pas son professeur.
```java
class Matiere {
    String nom;

    public Matiere(String nom) {
        this.nom = nom;
    }
}

class Professeur {
    String nom;
    Matiere matiere; // Le professeur connaît la matière

    public Professeur(String nom, Matiere matiere) {
        this.nom = nom;
        this.matiere = matiere;
    }

    public void enseigner() {
        System.out.println(nom + " enseigne " + matiere.nom);
    }
}

public class Main {
    public static void main(String[] args) {
        Matiere math = new Matiere("Mathématiques");
        Professeur prof = new Professeur("Mr Dupont", math);
        prof.enseigner(); // "Mr Dupont enseigne Mathématiques"
    }
}

```
📌 Ici, seul Professeur connaît Matiere, mais Matiere ne connaît pas Professeur.

🔹 **Association Bidirectionnelle :** Les deux classes connaissent l'existence l'une de l'autre.

💡 **Exemple :** Un professeur enseigne une matière, et une matière connaît son professeur.
```java
class Professeur {
    String nom;
    Matiere matiere;

    public Professeur(String nom) {
        this.nom = nom;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }
}

class Matiere {
    String nom;
    Professeur professeur;

    public Matiere(String nom) {
        this.nom = nom;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }
}

public class Main {
    public static void main(String[] args) {
        Professeur prof = new Professeur("Mr Dupont");
        Matiere math = new Matiere("Mathématiques");

        prof.setMatiere(math);
        math.setProfesseur(prof);

        System.out.println(prof.nom + " enseigne " + prof.matiere.nom);
        System.out.println(math.nom + " est enseignée par " + math.professeur.nom);
    }
}

```
📌 Ici, les deux objets ont une référence l'un vers l'autre, donc la relation est bidirectionnelle.

#### 🔹 Multiplicité d'Association

Une association peut être de type :
- Un-à-un (1:1) → Une personne a un seul passeport.
- Un-à-plusieurs (1:N) → Un professeur enseigne plusieurs matières.
- Plusieurs-à-plusieurs (M:N) → Un étudiant suit plusieurs cours et un cours est suivi par plusieurs étudiants.

1️⃣ **Un-à-Un (1:1)**
```java
class Passeport {
    String numero;
    Personne proprietaire;

    public Passeport(String numero) {
        this.numero = numero;
    }
}

class Personne {
    String nom;
    Passeport passeport;

    public Personne(String nom, Passeport passeport) {
        this.nom = nom;
        this.passeport = passeport;
        passeport.proprietaire = this; // Association bidirectionnelle
    }
}

```
📌 Une personne a un seul passeport et un passeport appartient à une seule personne.

2️⃣ **Un-à-Plusieurs (1:N)**
```java
import java.util.List;
import java.util.ArrayList;

class Professeur {
    String nom;
    List<Matiere> matieres = new ArrayList<>();

    public Professeur(String nom) {
        this.nom = nom;
    }

    public void ajouterMatiere(Matiere matiere) {
        matieres.add(matiere);
    }
}

class Matiere {
    String nom;

    public Matiere(String nom) {
        this.nom = nom;
    }
}

```
📌 Un professeur enseigne plusieurs matières, mais chaque matière n'a qu'un professeur.

3️⃣ **Plusieurs-à-Plusieurs (M:N)**
```java
import java.util.ArrayList;
import java.util.List;

class Etudiant {
    String nom;
    List<Cours> coursInscrits = new ArrayList<>();

    public Etudiant(String nom) {
        this.nom = nom;
    }

    public void ajouterCours(Cours cours) {
        coursInscrits.add(cours);
        cours.etudiants.add(this);
    }
}

class Cours {
    String nom;
    List<Etudiant> etudiants = new ArrayList<>();

    public Cours(String nom) {
        this.nom = nom;
    }
}

public class Main {
    public static void main(String[] args) {
        Etudiant alice = new Etudiant("Alice");
        Cours math = new Cours("Mathématiques");
        alice.ajouterCours(math);

        System.out.println(alice.nom + " suit le cours : " + math.nom);
        System.out.println("Le cours " + math.nom + " est suivi par : " + math.etudiants.get(0).nom);
    }
}

```
📌 Un étudiant peut suivre plusieurs cours et un cours peut être suivi par plusieurs étudiants.

### Différence entre Association, Agrégation et Composition
|      Type       | Définition                                                                                | Exemple                             |
|:---------------:|:------------------------------------------------------------------------------------------|:------------------------------------|
| **Association** | Une classe est liée à une autre sans dépendance forte | Un professeur enseigne une matière. |
| **Agrégation**  | Une classe contient une autre classe, mais elles peuvent exister indépendamment | Une voiture a un moteur (le moteur peut être retiré). |
| **Composition** | Une classe contient une autre classe, mais elle ne peut pas exister sans elle | Un cœur fait partie d'un humain (un cœur ne peut pas exister seul). |

### Diagramme de Classes UML
👉 Un diagramme de classes UML est un modèle graphique utilisé en conception orientée objet pour représenter les classes, leurs attributs, leurs méthodes et leurs relations.

C'est un outil clé pour :
- Modéliser une application avant son développement
- Faciliter la compréhension du code
- Améliorer la communication entre les développeurs

#### Structure d’une Classe en UML
Une classe est représentée sous forme d'un rectangle divisé en trois parties :

| Classe                                   | Nom de la classe            |
|------------------------------------------|-----------------------------|
| - attribut1: Type<br>- attribut2: Type   | Attributs (avec visibilité) |
| + methode1(): Type<br>+ methode2(): Type | Méthodes (avec visibilité)  |
📌 **Notations des visibilités :**
- "+" → Public
- "-" → Privé
- "#" → Protégé
