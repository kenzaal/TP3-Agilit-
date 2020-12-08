package manoir;

/**
 * Décrivez votre classe Etage ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Etage
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
        //private int nbPieces;
        private Piece p1;
        private Piece p2;
        private Piece p3;

    /**
     * Constructeur d'objets de classe Etage
     */
    public Etage(Piece p1, Piece p2, Piece p3)
    {
        // initialisation des variables d'instance
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    
    public int nbObjetsEtage(){
    	return p1.get_nb_objets()+ p2.get_nb_objets()+ p3.get_nb_objets();
        
    }
    
    
    
    /*public int getObjetsPieces() {
    	return p1.get_nb_objets()+ p2.get_nb_objets()+ p3.get_nb_objets();
    }*/
    
    
    
    
    
  

}
