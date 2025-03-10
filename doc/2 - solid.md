# Qualité Logiciel - SOLID
Le principe SOLID est un ensemble de cinq principes fondamentaux de conception logicielle qui facilitent la maintenance, l'extensibilité et la compréhension du code.

## 🔍 S - Single Responsibility Principle (SRP) / Principe de Responsabilité Unique
👉 Une classe ne doit avoir qu'une seule responsabilité, c'est-à-dire une seule raison de changer.

✅ Cela améliore la modularité et réduit le couplage.

**Exemple :**

❌ **Mauvaise pratique :** Une classe fait trop de choses (gère les données et l'affichage)
```java
class Report {
    public void generateReport() {
        System.out.println("Génération du rapport...");
    }

    public void printReport() {
        System.out.println("Impression du rapport...");
    }
}

```
✅ **Bonne pratique :** Séparation des responsabilités
```java
class Report {
    public void generateReport() {
        System.out.println("Génération du rapport...");
    }
}

class ReportPrinter {
    public void printReport(Report report) {
        System.out.println("Impression du rapport...");
    }
}

```
📌 Pourquoi ? Chaque classe a une seule responsabilité : Report génère le rapport, ReportPrinter gère l'impression.

## 🔍 O - Open/Closed Principle (OCP) / Principe Ouvert/Fermé
👉 Une entité (classe, module, fonction) doit être ouverte à l'extension mais fermée à la modification.

✅ On peut ajouter de nouvelles fonctionnalités sans modifier le code existant, par exemple avec l'héritage ou le polymorphisme.

**Exemple :**

❌ **Mauvaise pratique :** On modifie la classe existante pour ajouter un nouveau type de paiement
```java
class Payment {
    public void pay(String type) {
        if (type.equals("credit")) {
            System.out.println("Paiement par carte de crédit...");
        } else if (type.equals("paypal")) {
            System.out.println("Paiement via PayPal...");
        }
    }
}

```
✅ **Bonne pratique :** Utilisation du polymorphisme pour permettre l'extension
```java
interface Payment {
    void pay();
}

class CreditCardPayment implements Payment {
    public void pay() {
        System.out.println("Paiement par carte de crédit...");
    }
}

class PayPalPayment implements Payment {
    public void pay() {
        System.out.println("Paiement via PayPal...");
    }
}

class PaymentProcessor {
    public void processPayment(Payment payment) {
        payment.pay();
    }
}

```
📌 Pourquoi ? On peut ajouter un nouveau mode de paiement sans modifier le code existant.

## 🔍 L - Liskov Substitution Principle (LSP) / Principe de Substitution de Liskov
👉 Une classe dérivée doit pouvoir être utilisée comme substitut de sa classe parente sans altérer le comportement du programme.

✅ Cela garantit que l’héritage ne brise pas les fonctionnalités attendues.

**Exemple :**

❌ **Mauvaise pratique :** Une sous-classe change le comportement de la classe mère
```java
class Rectangle {
    protected int width, height;
    
    public void setWidth(int width) { this.width = width; }
    public void setHeight(int height) { this.height = height; }
    
    public int getArea() { return width * height; }
}

class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;  // Problème : la hauteur est modifiée aussi !
    }

    @Override
    public void setHeight(int height) {
        this.width = height;
        this.height = height;
    }
}

```
❌ Ici, Square casse le comportement attendu de Rectangle, ce qui peut causer des bugs.

✅ **Bonne pratique :** Utilisation d’une hiérarchie plus cohérente
```java
interface Shape {
    int getArea();
}

class Rectangle implements Shape {
    protected int width, height;
    
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() { return width * height; }
}

class Square implements Shape {
    private int side;
    
    public Square(int side) {
        this.side = side;
    }

    public int getArea() { return side * side; }
}

```
📌 Pourquoi ? Rectangle et Square implémentent Shape sans casser le comportement.

## 🔍 I - Interface Segregation Principle (ISP) / Principe de Ségrégation des Interfaces
👉 Une classe ne doit pas être forcée d’implémenter des interfaces qu’elle n’utilise pas.

✅ Il vaut mieux créer plusieurs interfaces spécifiques plutôt qu'une seule interface massive.

**Exemple :**

❌ **Mauvaise pratique :** Une interface trop large
```java
interface Worker {
    void work();
    void eat();
}

class Developer implements Worker {
    public void work() {
        System.out.println("Développe du code...");
    }

    public void eat() {
        throw new UnsupportedOperationException("Les développeurs ne mangent pas ici !");
    }
}

```
❌ Developer est obligé d’implémenter eat(), même si cela ne fait pas de sens.

✅ **Bonne pratique :** Séparer les interfaces
```java
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Developer implements Workable {
    public void work() {
        System.out.println("Développe du code...");
    }
}

class OfficeWorker implements Workable, Eatable {
    public void work() {
        System.out.println("Travaille au bureau...");
    }

    public void eat() {
        System.out.println("Prend une pause déjeuner...");
    }
}

```
📌 Pourquoi ? Chaque classe n’implémente que les interfaces dont elle a besoin.

## 🔍 D - Dependency Inversion Principle (DIP) / Principe d'Inversion des Dépendances
👉 Les modules de haut niveau ne doivent pas dépendre des modules de bas niveau, mais tous doivent dépendre d’abstractions (interfaces).

✅ Cela permet de découpler les composants et de faciliter la maintenance.

❌ **Mauvaise pratique :** Dépendance directe sur une implémentation spécifique
```java
class MySQLDatabase {
    public void connect() {
        System.out.println("Connexion à MySQL...");
    }
}

class Application {
    private MySQLDatabase database = new MySQLDatabase();

    public void start() {
        database.connect();
    }
}

```
❌ Si on veut utiliser une autre base de données, on doit modifier Application.

✅ **Bonne pratique :** Utilisation d’une abstraction (interface)
```java
interface Database {
    void connect();
}

class MySQLDatabase implements Database {
    public void connect() {
        System.out.println("Connexion à MySQL...");
    }
}

class PostgreSQLDatabase implements Database {
    public void connect() {
        System.out.println("Connexion à PostgreSQL...");
    }
}

class Application {
    private Database database;

    public Application(Database database) {
        this.database = database;
    }

    public void start() {
        database.connect();
    }
}

```
📌 Pourquoi ? On peut changer facilement la base de données en injectant une autre implémentation.

En appliquant ces principes, on améliore la qualité du code en rendant les systèmes plus robustes, flexibles et faciles à maintenir.