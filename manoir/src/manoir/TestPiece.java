package manoir;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe-test TestPiece.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document Š 2002 Robert A. Ballance intitulé
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le męme paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */
public class TestPiece
{
    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).
	private Piece chambre;
    private Piece cuisine;
    private Piece salon;

    /**
     * Constructeur de la classe-test TestPiece
     */
    public TestPiece()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
    	 // Initialisez ici vos engagements
    	 chambre = new Piece("chambre", 5);
         salon = new Piece("salon", 5);
         cuisine = new Piece("cusine", 5);
       
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }

    @Test
    public void testAjoutObjet()
    {
        //Piece chambre = new Piece("chambre", 6);
        assertEquals(10, chambre.ajout_objets(5));
        assertEquals(10, cuisine.ajout_objets(5));
    }

    @Test
    public void testObjetsEtage()
    {
        //Piece chambre = new Piece("chambre", 5);
        //Piece salon = new Piece("salon", 5);
        //Piece cuisine = new Piece("cuisine", 5);
        Etage etage2 = new Etage(chambre, salon, cuisine);
        assertEquals(15, etage2.nbObjetsEtage());
    }

    @Test
    public void testAjoutDecoFenetre()
    {
        //Piece chambre = new Piece("chambre", 5);
        assertEquals(7, chambre.ajoutDecoFenetre(2));
    }
}

