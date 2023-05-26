import fri.shapesge.Obrazok;

/**
 * Predstavuje obejkt dom, obrazky, ludi
 * takze vsetko okrem ducha
 */
public class Mapa {
    private Dom dom;
    private Obrazok pozadie;
    private Obrazok obrazokDomu;
    private Obrazok zemina;
    private Obrazok zemina1;
    private Obrazok zemina2;

    /**
     * Inicilaizacia
     */
    public Mapa() {
        this.pozadie = new Obrazok("Pictures/Mapa/Pozadicko.png", -350, -1000);
        this.pozadie.zobraz();
        this.obrazokDomu = new Obrazok("Pictures/Mapa/Domcek.png", -350, -1000);
        this.obrazokDomu.zobraz();
        this.zemina = new Obrazok("Pictures/Mapa/Zemina.png", -350, 1380);
        this.zemina.zobraz();
        this.zemina1 = new Obrazok("Pictures/Mapa/Zemina.png", 930, 1380);
        this.zemina1.zobraz();
        this.zemina2 = new Obrazok("Pictures/Mapa/Zemina.png",1510, 1380);
        this.zemina2.zobraz();
        this.dom = new Dom(-350, -1000);

    }

    /**
     * Posunieme vsetky prvky o udaj v parametri
     * @param rychlostOvladania
     */


    public void posunMapuX(int rychlostOvladania) {
        this.dom.posunVsetkoX(rychlostOvladania);
        this.zemina.posunVodorovne(rychlostOvladania);
        this.zemina1.posunVodorovne(rychlostOvladania);
        this.zemina2.posunVodorovne(rychlostOvladania);
        this.obrazokDomu.posunVodorovne(rychlostOvladania);
    }

    /**
     * Posunieme vsetky prvky o udaj v parametri
     * @param rychlostOvladania
     */

    public void posunMapuY(int rychlostOvladanie) {
        this.dom.posunVsetkoY(rychlostOvladanie);
        this.zemina.posunZvisle(rychlostOvladanie);
        this.zemina1.posunZvisle(rychlostOvladanie);
        this.zemina2.posunZvisle(rychlostOvladanie);
        this.obrazokDomu.posunZvisle(rychlostOvladanie);
    }

    /**
     * vrati objekt dom
     * @return
     */

    public Dom getDom() {
        return this.dom;
    }

    /**
     * ludia v dome sa zacnu hybat
     */

    public void zapniLudi() {
        this.dom.zapniLudi();
    }
}
