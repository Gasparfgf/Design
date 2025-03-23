package org.example.dry.exo1;

/*
* Problème : le code ci-dessous contient une répétition de logique pour calculer l'aire de différentes formes géométriques.
*  Refactorisez-le en respectant le principe DRY.
*
* 🔹 Objectif : Identifier une possible généralisation pour éviter la répétition.
* */

public class Geometry {
    public static double areaOfRectangle(double width, double height) {
        return width * height;
    }

    public static double areaOfTriangle(double base, double height) {
        return (base * height) / 2;
    }

    public static double areaOfSquare(double side) {
        return side * side;
    }
}
