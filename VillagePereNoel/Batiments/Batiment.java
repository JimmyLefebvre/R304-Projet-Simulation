package TD_PERE_NOEL.Batiments;

import java.util.ArrayList;

import TD_PERE_NOEL.Personnages.Personnage;

public abstract class Batiment {

    private enum Proprete {mauvais, correct, bon} ;

    private String nomBat ;
    private int superficie ; 
    private int capaciteAccueil ;
    private Proprete niveauProprete ;
    private int nbPersoPresent ;
    private ArrayList<Personnage> personnagesPresent ;

    public String getNomBat() {

        return nomBat;
    }

    public void setNomBat(String nomBat) {

        this.nomBat = nomBat;
    }

    public int getSuperficie() {

        return superficie;
    }

    public void setSuperficie(int superficie) {

        this.superficie = superficie;

    }

    public int getCapaciteAccueil() {

        return capaciteAccueil;

    }

    public void setCapaciteAccueil(int capaciteAccueil) {

        this.capaciteAccueil = capaciteAccueil;

    }

    public Proprete getNiveauProprete() {

        return niveauProprete;

    }

    public void setNiveauProprete(Proprete niveauProprete) {
    
        this.niveauProprete = niveauProprete;
    
    }
    
    public int getNbPersoPresent() {
    
        return nbPersoPresent;
    
    }
    
    public void setNbPersoPresent(int nbPersoPresent) {
    
        this.nbPersoPresent = nbPersoPresent;
    
    }
    
    public ArrayList<Personnage> getPersonnagesPresent() {
    
        return personnagesPresent;
    
    }
    
    public void setPersonnagesPresent(ArrayList<Personnage> personnagesPresent) {
    
        this.personnagesPresent = personnagesPresent;
    
    }

    @Override
    
    public String toString() {
    
        return "Batiment [nomBat=" + nomBat + ", superficie=" + superficie + ", capaciteAccueil=" + capaciteAccueil
                + ", niveauProprete=" + niveauProprete + ", nbPersoPresent=" + nbPersoPresent + ", personnagesPresent="
                + personnagesPresent + "]";
    
    }

    public boolean accueillir(Personnage personnage){

        if (nbPersoPresent < capaciteAccueil) {

            personnagesPresent.add(personnage) ;
            nbPersoPresent += 1 ;

            return true ;
            
        } else {

            System.out.println("Le bâtiment a atteint sa capacité maximale d'accueil");
            
            return false ;
            
        }

    }

    public void entretenir(){

        if(nbPersoPresent == 0 && niveauProprete == Proprete.mauvais){

            this.setNiveauProprete(Proprete.bon);

        } else {

            System.out.println("Le batiment doit être vide et sale pour être entretenu");

        }

    }
    


    
}
