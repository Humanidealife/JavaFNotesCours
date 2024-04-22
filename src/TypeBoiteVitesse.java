//Pour que les types de boîtes soient claire, on peut créer une classe avec seulement les 3 propriétés automatique, semiaotomatique et manuelle
//  plutôt que de noyer dans la classe Voitures avec d'autres propriétés existantes
//Pour utiliser le type énuméré, il fuat tout simplmeent remplacer le mot clé "class" par "enum"
//  "enum" indique que "TypeBoiteVitesse" est une énumération
//Dans ce cas-là, toutes les propriétés dans "TypeBoiteVitesse" vont devenir les valeurs de l'énumération "enum"
// et seul un nom est nécessaire, et les valeurs sont implicitement "int" et on ne les valorise pas nous-même
//  chacune des prorpiétés bénéficie automatiquement des valeurs dans l'odre  de 0, 1, 2 ...
//  il faut somplmeent ajouter des "," entre chaque éléments
public enum TypeBoiteVitesse {
    //"final" est le mot clé qui signifie que la valeur de cette propriété ne pourra jamais être modifiée.
    //  C'est-à-dire ici on définit des constances, dans ce cas-là, selon la convention, il faut nommer ces variables constantes tout en Majuscule
    AUTO,
    SEMI_AUTO,
    MANUELLE
}
