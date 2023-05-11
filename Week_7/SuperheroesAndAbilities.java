abstract class Superhero {
    protected String name;
    protected String power;

    public Superhero(String name, String power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public String getPower() {
        return power;
    }

    public abstract void display();
}

class MarvelSuperhero extends Superhero {
    private String universe;

    public MarvelSuperhero(String name, String power, String universe) {
        super(name, power);
        this.universe = universe;
    }

    public String getUniverse() {
        return universe;
    }

    public void display() {
        System.out.println(name + " - " + power + " - " + universe);
    }
}

class DCComicsSuperhero extends Superhero {
    private String nemesis;

    public DCComicsSuperhero(String name, String power, String nemesis) {
        super(name, power);
        this.nemesis = nemesis;
    }

    public String getNemesis() {
        return nemesis;
    }

    public void display() {
        System.out.println(name + " - " + power + " - " + nemesis);
    }
}

class HeroTeam {
    private String name;
    private Superhero[] superheroes;
    private int numSuperheroes;

    public HeroTeam(String name) {
        this.name = name;
        this.superheroes = new Superhero[10];
        this.numSuperheroes = 0;
    }

    public void addSuperhero(Superhero superhero) {
        superheroes[numSuperheroes] = superhero;
        numSuperheroes++;
    }

    public void displaySuperheroes() {
        System.out.println("Superheroes in " + name + ":");
        for (int i = 0; i < numSuperheroes; i++) {
            superheroes[i].display();
        }
    }
}

public class SuperheroesAndAbilities {
    public static void main(String[] args) {
        HeroTeam avengers = new HeroTeam("The Avengers");
        HeroTeam justiceLeague = new HeroTeam("Justice League");

        // Create Marvel superheroes
        MarvelSuperhero ironMan = new MarvelSuperhero("Iron Man", "Powered Armor", "Marvel");
        MarvelSuperhero thor = new MarvelSuperhero("Thor", "Super Strength, Flight, and Lightning", "Marvel");
        MarvelSuperhero hulk = new Hulk("Hulk", "Super Strength and Durability", "Marvel");
        MarvelSuperhero captainAmerica = new MarvelSuperhero("Captain America", "Peak Human Strength and Agility", "Marvel");
        MarvelSuperhero blackWidow = new MarvelSuperhero("Black Widow", "Expert Martial Artist and Espionage", "Marvel");

        // Create DC Comics superheroes
        DCComicsSuperhero superman = new DCComicsSuperhero("Superman", "Super Strength, Flight, and Heat Vision", "Lex Luthor");
        DCComicsSuperhero batman = new DCComicsSuperhero("Batman", "Wealth and Gadgets", "The Joker");
        DCComicsSuperhero wonderWoman = new DCComicsSuperhero("Wonder Woman", "Super Strength, Flight, and Lasso of Truth", "Ares");
        DCComicsSuperhero flash = new DCComicsSuperhero("The Flash", "Super Speed and Time Travel", "Zoom");
        DCComicsSuperhero aquaman = new DCComicsSuperhero("Aquaman", "Super Strength, Underwater Breathing, and Telepathy", "Black Manta");

        // Add superheroes to teams
        avengers.addSuperhero(ironMan);
        avengers.addSuperhero(thor);
        avengers.addSuperhero(hulk);
        avengers.addSuperhero(captainAmerica);
        avengers.addSuperhero(blackWidow);

        justiceLeague.addSuperhero(superman);
        justiceLeague.addSuperhero(batman);
        justiceLeague.addSuperhero(wonderWoman);
        justiceLeague.addSuperhero(flash);
        justiceLeague.addSuperhero(aquaman);

        // Display superheroes in teams
        avengers.displaySuperheroes();
        justiceLeague.displaySuperheroes();
    }
}
