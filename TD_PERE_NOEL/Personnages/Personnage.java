package TD_PERE_NOEL.Personnages;

import TD_PERE_NOEL.Nourriture;
import TD_PERE_NOEL.Batiments.Batiment;

public abstract class Personnage {

    protected enum Genre {Femme, Homme};

    private String nom ;
    private Genre genre ;
    private int age ;
    private int statutFatigue ;
    private boolean enRepos ;
    private int statutFaim ;
    private int statutMagieNoel ;
    private Batiment position ;

    public Personnage (String nom, Genre genre, int age){

        this.nom = nom ;
        this.genre = genre ;
        this.age = age ;
        this.enRepos = false ;
        this.statutFatigue = 100 ;
        this.statutFaim = 100 ;
        this.statutMagieNoel = 100 ; 

    } ;
    public abstract void emettreSon(String son) ;
    public void seDeplacer(Batiment destination){

        if (destination.accueillir(this)) {

            this.position = destination ;
            
        }
        if (!destination.accueillir(this)) {

            System.out.println("Le batiment est plein.");
            
        }
        else {

            System.out.println("Ce n'est pas une destination valide.");

        }

    } ;
    public void seRestaurer(Nourriture nourriture){

        if(this.getStatutFaim() < 100){

            this.setStatutFaim(this.getStatutFaim() + nourriture.getValeurNutritive());
        }

    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public Genre getGenre() {
        return genre;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getStatutFatigue() {
        return statutFatigue;
    }
    public void setStatutFatigue(int statutFatigue) {
        this.statutFatigue = statutFatigue;
    }
    public boolean isEnRepos() {
        return enRepos;
    }
    public void setEnRepos(boolean enRepos) {
        this.enRepos = enRepos;
    }

    public int getStatutFaim() {
        return statutFaim;
    }
    public void setStatutFaim(int statutFaim) {
        this.statutFaim = statutFaim;
    }
    public int getStatutMagieNoel() {
        return statutMagieNoel;
    }
    public void setStatutMagieNoel(int statutMagieNoel) {
        this.statutMagieNoel = statutMagieNoel;
    } ;

    public abstract String toString();
    
}
