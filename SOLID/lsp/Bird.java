/***
 * La classe Bird possède une méthode fly(), mais on veut ajouter une classe Penguin, qui ne peut pas voler.
 * Refactorise ce code pour éviter de violer le principe de substitution de Liskov.
 *
 * ✅ Objectif : Assure-toi que Penguin ne casse pas le comportement attendu.
 */
class Bird {
    public void fly() {
        System.out.println("L'oiseau vole !");
    }
}

class Sparrow extends Bird { }

class Penguin extends Bird { }
