/**
 * L'interface Worker oblige tous les travailleurs à implémenter work() et eat(), mais certains travailleurs (comme les robots) ne mangent pas.
 * Modifie le code pour suivre ISP.
 * 
 * ✅ Objectif : Crée des interfaces plus spécifiques.
 * */
interface Worker {
    void work();
    void eat();
}