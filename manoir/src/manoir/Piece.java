package manoir;
/**
 * Décrivez votre classe Piece ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */


public class Piece
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String nom;
    private int nb_objets;
    private Fenetre fenetre;

    /**
     * Constructeur d'objets de classe piece
     */
    public Piece(String nom, int nbr)
    {
        // initialisation des variables d'instance
        this.nom = nom;
        this.nb_objets = nbr;
        this.fenetre= new Fenetre();
    }

    public String get_nom()
    {
        return this.nom;
    }
    
    public int get_nb_objets()
    {
        return this.nb_objets;
    }
    
    
    
    
    public void set_nom(String new_nom )
    {
        this.nom = new_nom;
    }
    
    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public String description()
    {
        // Insérez votre code ici
        return "Cette pièce est un/une "+ this.nom + " elle contient "+ this.nb_objets + " objets et une fenetre qui est actuellement  " + this.fenetre.etat();
    }
    
    //ajouter si la pièce a une fenetre et si elle est ouverte ou non
    
    public int ajout_objets(int y)
    {
        this.nb_objets += y;
        return this.nb_objets;
    }
    
    public int ajoutDecoFenetre(int y){
        this.fenetre.ajoutDeco(y);
        this.nb_objets += y;
        //print("nous venons d'ajouter une décoration à la fenetre donc un nouvel objet dans la pièce");
        return this.nb_objets;
    }
    
    
    
}

