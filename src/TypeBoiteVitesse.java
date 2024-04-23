//Pour que les types de boîtes soient claire, on peut créer une classe avec seulement les 3 propriétés automatique, semiaotomatique et manuelle
//  plutôt que de noyer dans la classe Voitures avec d'autres propriétés existantes
//Pour utiliser le type énuméré, il fuat tout simplement remplacer le mot clé "class" par "enum"
//  "enum" indique que "TypeBoiteVitesse" est une énumération
//Dans ce cas-là, toutes les propriétés dans "TypeBoiteVitesse" vont devenir les valeurs de l'énumération "enum"
// et seul un nom est nécessaire, et les valeurs sont implicitement "int" et on ne les valorise pas nous-même
//  chacune des prorpiétés bénéficie automatiquement des valeurs dans l'ordre  de 0, 1, 2 ...
//  il faut somplmeent ajouter des "," entre chaque élément
public enum TypeBoiteVitesse {
    //"final" est le mot clé qui signifie que la valeur de cette propriété ne pourra jamais être modifiée.
    //  C'est-à-dire ici on définit des constances, dans ce cas-là, selon la convention, il faut nommer ces variables constantes tout en Majuscule

    //Il est possible de créer des formes plus complexes d'énumération en donnant un attribut au type, comme s'il s'agit d'une classe normale
    //Par exemple, si l'on veut donner à "TypeBoiteVitesse" un attribut sous forme de String qui indique
    //  explicitement de quoi l'énumération est constituée.
    AUTO("Automatique"),
    SEMI_AUTO("Semi-automatique"),
    MANUELLE("Manuelle");

    //On peut valoriser pour chacun des éléments, en l'occurrence, "AUTO", "SEMI_AUTO" et "MANUELLE",
    //   le nom du type de la boîte de manière explicite entre parenthèses
    //Ce qui va se passer, c'est que Java va essayer de trouver un constructeur qui est capable d'accueillir les String
    String nomTypeBoite;
    //Ajout d'un constructeur
    private TypeBoiteVitesse(String nomTypeBoiteChacun){
        this.nomTypeBoite = nomTypeBoiteChacun;
    }


}
