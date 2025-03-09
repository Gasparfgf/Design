# 🌟 Conception Logicielle

La conception logicielle est l’ensemble des techniques et méthodologies utilisées pour concevoir une architecture logicielle robuste, évolutive et maintenable. C’est une étape clé du cycle de vie du développement logiciel, qui intervient après l’analyse des besoins et avant l’implémentation.

## La Qualité d'un Logiciel

🎯 Un <u>logiciel de qualité</u> doit respecter plusieurs critères :

|      Critères      | Explication                                                                           |
|:------------------:|:--------------------------------------------------------------------------------------|
|   **Fiabilité**    | Il doit fonctionner **sans bugs** et être **robuste** face aux erreurs.               |
|  **Performance**   | Il doit être **rapide et optimisé** en termes de consommation mémoire et CPU.         |
|    **Sécurité**    | Il doit être **protégé contre les failles** (ex. injections SQL, XSS, etc.).          |
|  **Scalabilité**   | Il doit pouvoir **supporter une montée en charge** sans perte de performances.        |
| **Maintenabilité** | Il doit être **facile à modifier** et à comprendre pour les développeurs futurs.      |
| **Extensibilité**  | Il doit pouvoir **s’adapter facilement** à de nouvelles fonctionnalités.              |
|  **Portabilité**   | Il doit être **compatible sur plusieurs plateformes** (Windows, Linux, mobile, etc.). |

🛠️ Les principes **SOLID**, **DRY (Don't Repeat Yourself)** et **KISS (Keep It Simple, Stupid)** permettent d'améliorer la qualité du logiciel.

## 🚀 L'Approche d'une Conception Logicielle

Il existe plusieurs approches de conception logicielle, selon le type et l’objectif du logiciel.

1️⃣ **Approche Modulaire :**
- Découpe le logiciel en modules indépendants.
- Permet une meilleure réutilisation et testabilité.

**Exemple :** Un site e-commerce avec un module de paiement, un module utilisateur, un module produit, etc.

2️⃣ **Approche Orientée Objet (OO) :**
- Basée sur les objets et classes (abstraction, encapsulation, héritage, polymorphisme).
- Favorise la réutilisabilité et l'organisation du code.

3️⃣ **Approche en Architecture en Couches (Layered Architecture) :**
- Sépare l’application en plusieurs couches (ex. Modèle - Vue - Contrôleur (MVC)).
- Facilite la maintenance et la compréhension du code.

**Exemple :** Une application web avec couche de présentation (UI), couche métier, couche d’accès aux données.

4️⃣ **Approche Basée sur les Microservices :**
- Divise l’application en petits services indépendants qui communiquent entre eux via des API.
- Améliore la scalabilité et la tolérance aux pannes.

**Exemple :** Netflix utilise une architecture microservices.

**ATT :** Choisir la bonne approche dépend du projet et de ses exigences.

## Couplage

Le couplage représente le degré de dépendance entre deux composants d'un logiciel.
<br>Un fort couplage signifie que les composants sont très liés entre eux, ce qui rend le code difficile à modifier.

### 🎯 Types de Couplage

1️⃣ **Couplage Fort (Tightly Coupled) :**
- Les classes dépendent trop les unes des autres.
- Difficile à modifier : un changement dans une classe peut impacter plusieurs autres.

**❌ Exemple mauvais :**
```java
class Order {
    private Payment payment;

    public Order() {
        this.payment = new Payment(); // Couplage fort, car Order crée l'instance de Payment
    }

    public void processOrder() {
        payment.process();
    }
}

class Payment {
    public void process() {
        System.out.println("Paiement en cours...");
    }
}

```
**📌 Problème :** Si on veut ajouter un autre mode de paiement (PayPal, Stripe), on doit modifier Order.

2️⃣ **Couplage Faible (Loosely Coupled) :**
- Les classes sont indépendantes et interagissent via des interfaces ou l’injection de dépendances.
- Facile à modifier et à tester.

**✅ Exemple bon :**
```java
interface Payment {
    void process();
}

class CreditCardPayment implements Payment {
    public void process() {
        System.out.println("Paiement par carte en cours...");
    }
}

class Order {
    private Payment payment;

    public Order(Payment payment) { // Injection de dépendance
        this.payment = payment;
    }

    public void processOrder() {
        payment.process();
    }
}

// Utilisation
public class Main {
    public static void main(String[] args) {
        Payment paymentMethod = new CreditCardPayment();
        Order order = new Order(paymentMethod);
        order.processOrder();
    }
}

```
📌 On peut ajouter d'autres types de paiement sans changer Order.
