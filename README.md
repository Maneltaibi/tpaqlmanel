# TP0 - Tests Unitaires JUnit 5

## Classes testées et corrigées

| Classe         | Erreur corrigée                   | Couverture des tests                       |
|----------------|-----------------------------------|--------------------------------------------|
| Person         |  Aucune erreur                   | Cas normaux, limites (âge), chaînes vides |
| Stack          |  Aucune erreur                   | Vide, plein, taille, exceptions           |
| Fibonacci      |  Message exception amélioré      | n=0,1,>1 et cas négatif                    |
| Prime          |  Aucune erreur                   | Primes, non-primes, limites, négatifs     |
| Factorial      |  Message exception amélioré      | 0!, 1!, >1, négatifs                       |
| BankAccount    |  Ajout : test `amount < 0` dans `transfer()` | Dépôt, retrait, virement, intérêts, erreurs |
| Matrix         |  Aucune erreur                   | get/set, addition, produit, transposition |

## Prérequis

- Java 8+
- JUnit 5
- Maven (ou IntelliJ)

## Exécution
```bash
mvn test
