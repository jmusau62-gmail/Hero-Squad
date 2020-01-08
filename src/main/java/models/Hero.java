package models;

import java.util.ArrayList;

public class Hero {
    private String heroName;
    private static ArrayList<Hero>allHero= new ArrayList<>();
    private int age;
    private ArrayList<Squad>heroSquad;
    public Hero(String heroName){
        this.heroName=heroName;
        allHero.add(this);
        this.age = allHero.size();
    this.heroSquad=new ArrayList<Squad>();}
    public String getHeroName() {return heroName;}
   public int getAge() {return age;}
public static Hero findHero(int age) {return allHero.get(age-1);}
public void addSquadToHero(Squad newSquad){heroSquad.add(newSquad);}
public ArrayList<Squad>getAllThisHeroSquads(){return heroSquad;}
public static ArrayList<Hero> getAllHeroes(){return allHero;}}