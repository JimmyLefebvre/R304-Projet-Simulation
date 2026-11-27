package VillagePereNoel.Batiments;

import java.util.ArrayList;

import VillagePereNoel.Characters.Character;

public abstract class Batiment {

    private enum Cleanliness {bad, correct, good} ;

    private String name ;
    private int surface ; 
    private int welcomingCapacity ;
    private Cleanliness clealinessLevel ;
    private int nbPresentCharacters ;
    private ArrayList<Character> presentCharacters ;

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSurface() {
        return surface;
    }

    public void setSurface(int surface) {
        this.surface = surface;
    }

    public int getWelcomingCapacity() {
        return welcomingCapacity;
    }

    public void setWelcomingCapacity(int welcomingCapacity) {
        this.welcomingCapacity = welcomingCapacity;
    }

    public Cleanliness getClealinessLevel() {
        return clealinessLevel;
    }

    public void setClealinessLevel(Cleanliness clealinessLevel) {
        this.clealinessLevel = clealinessLevel;
    }

    public int getNbPresentCharacters() {
        return nbPresentCharacters;
    }

    public void setNbPresentCharacters(int nbPresentCharacters) {
        this.nbPresentCharacters = nbPresentCharacters;
    }

    public ArrayList<Character> getPresentCharacters() {
        return presentCharacters;
    }

    public void setPresentCharacters(ArrayList<Character> presentCharacters) {
        this.presentCharacters = presentCharacters;
    }

    @Override
    public String toString() {
        return "Batiment [name=" + name + ", surface=" + surface + ", welcomingCapacity=" + welcomingCapacity
                + ", clealinessLevel=" + clealinessLevel + ", nbPresentCharacters=" + nbPresentCharacters
                + ", presentCharacters=" + presentCharacters + "]";
    }

    public boolean welcome(Character character){

        if (nbPresentCharacters < welcomingCapacity) {

            this.presentCharacters.add(character) ;
            nbPresentCharacters += 1 ;

            return true ;
            
        } else {

            System.out.println("Le bâtiment a atteint sa capacité maximale d'accueil");
            
            return false ;
            
        }

    }

    public void clean(){

        if(nbPresentCharacters == 0 && clealinessLevel == Cleanliness.bad){

            this.setClealinessLevel(Cleanliness.good);

        } else {

            System.out.println("Le batiment doit être vide et sale pour être entretenu");

        }

    }
    


    
}
