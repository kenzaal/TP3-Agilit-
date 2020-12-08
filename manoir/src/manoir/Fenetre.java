package manoir;
/**
 * Décrivez votre classe Fenetre ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Fenetre
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private boolean fermé;
    private int nbDeco;
    

    /**
     * Constructeur d'objets de classe Fenetre
     */
    public Fenetre()
    {
        // initialisation des variables d'instance
        this.fermé=false;
        this.nbDeco =0;
    }
    
    public boolean getEtatFenetre(){
        return this.fermé;
    }
    
    public String etat(){
        if (this.fermé) return "ouverte";
        
        return "fermée";
    }
    
    
    public int getnbDeco(){
        return nbDeco;
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de y
     */
    public void ouvrirFenetre()
    {
        // Insérez votre code ici
        this.fermé= true;
    }
    
    public void fermerFenetre()
    {
        // Insérez votre code ici
        this.fermé= false;
    }
    
    public void ajoutDeco(int y){
        this.nbDeco += y;
    }
    
    
    

    
    
    
}

