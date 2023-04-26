import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Random;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.util.Scanner;
import java.util.Random;
import java.io.*;

import java.util.Arrays;

public class PokemonBattle extends JPanel {


    static String[][] pokemonPool = {{"Rattata","Normal","19","Tackle"},{"Sandshrew","Ground","27","Scratch"},{"Pidgey","Flying","16","Gust"},
                                {"Pikachu","Electric","25","Thundershock"},{"Charmander","Fire","4","Ember"},{"Squirtle","Water","7","Bubble"},
                                {"Bulbasaur","Grass","1","Vine Whip"},{"Geodude","Rock","74","Rock Throw"},{"Gastly","Ghost","92","Lick"},
                                {"Abra","Psychic","63","Teleport"},{"Drowzee","Psychic","96","Confusion"},{"Mankey","Fighting","56","Low Kick"},{"Ekans","Poison","23","Poison Sting"},
                                {"Caterpie","Bug","10","String Shot"},{"Dratini","Dragon","147","Twister"},{"Spearow","Flying","21","Peck"},
                                {"Seel","Ice","86","Icy Wind"},{"Voltorb","Electric","100","Spark"},{"Machop","Fighting","66","Karate Chop"},
                                {"Diglett","Ground","50","Magnitude"},{"Poliwag","Water","60","Water Gun"},{"Vulpix","Fire","37","Ember"},
                                {"Meowth","Normal","52","Scratch"},{"Nidoran","Poison","29","Poison Sting"},{"Bellsprout","Grass","69","Vine Whip"}};

    // Declare instance variables
    // private PokeSprite background;
    // private PokeSprite pikachuSprite;
    // private PokeSprite bulbasaurSprite;
    private BufferedImage backSprite;
    private BufferedImage frontSprite;
    private Pokemon p1;
    private Pokemon p2;
    String message;
    String extraMessage;
    private int pikachuX = 75;
    private int bulbasaurX = 425;
    private int pikachuY = 150;
    private int bulbasaurY = 150;
    private int pikachuHealth = 100;
    private int bulbasaurHealth = 100;
    private int pikachuAttack = 20;
    private int bulbasaurAttack = 15;
    private boolean isPikachuTurn = true;
    private boolean isBattleOver = false;
    private Random random = new Random();

    // Constructor
    public PokemonBattle(Pokemon p1, Pokemon p2) {
        
        backSprite = getImage(p1,true);
        this.p1 = p1;
        frontSprite = getImage(p2,false);
        this.p2 = p2;
        
        this.message = "Pokemon Battle!";
        // Set panel size
        setPreferredSize(new java.awt.Dimension(600, 400));
    }

    public void setMessage(String message) {
        if(message.contains("!") && message.indexOf("!")!=message.length()-1) {
            this.extraMessage = message.substring(message.indexOf("!")+2);
            this.message = message.substring(0,message.indexOf("!")+1);
            repaint();
            return;
        }
        this.message = message;
        this.extraMessage = null;
        repaint();
    }

    public void setP1(Pokemon p1) {
        this.p1 = p1;
        repaint();
    }

    public void setP2(Pokemon p2) {
        this.p2 = p2;
        repaint();
    }

    public BufferedImage getImage(Pokemon pokemon, boolean back) {
        
        String spriteUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/";
        BufferedImage im = null;
        if(back) {
            spriteUrl+="back/";
        }

        for(int i = 0; i < pokemonPool.length; i++) {
            if(pokemon.getName().equals(pokemonPool[i][0])) {
                spriteUrl+=pokemonPool[i][2]+".png";
                try {
                    im = ImageIO.read(new URL(spriteUrl));
                }
                catch (IOException e) {
                    System.out.println("Error retrieving Pokemon sprite: " + e.getMessage());
                } 
            }
        }

        if(im == null) {
            spriteUrl+="1.png";
            try {
                im = ImageIO.read(new URL(spriteUrl));
            }
            catch (IOException e) {
                System.out.println("Error retrieving Pokemon sprite: " + e.getMessage());
            } 
        }

        return im;
    }

    // Draw method
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        

        Graphics2D g2d = (Graphics2D) g.create();
        backSprite = getImage(p1,true);
        g2d.drawImage(backSprite, 0, 150, getWidth()/2, getHeight()/2, this);
        frontSprite = getImage(p2,false);
        g2d.drawImage(frontSprite, 300, 0, getWidth()/2, getHeight()/2, this);
        g2d.dispose();
        
        g.setColor(Color.BLACK);
        g.setFont(new Font("Courier New", Font.BOLD, 16));
        g.drawString(p1.getName(), 380, 210);
        g.setFont(new Font("Courier New", Font.BOLD, 16));
        g.drawString(p2.getName(), 60, 60);
        g.setColor(Color.WHITE);
        g.fillRect(420, 230, 150, 15);
        g.fillRect(100, 80, 150, 15);
        g.setColor(Color.GREEN);
        g.fillRect(420, 230, p1.getHP() * 150 / 100, 15);
        g.fillRect(100, 80, p2.getHP() * 150 / 100, 15);
        // Draw attack message
        g.setColor(Color.BLUE);
        g.fillRect(10, 310, 580, 80);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Courier New", Font.BOLD, 16));
        g.drawString(message, 20, 330);
        if(extraMessage!=null) {
            g.setColor(Color.WHITE);
            g.setFont(new Font("Courier New", Font.BOLD, 16));
            g.drawString(extraMessage, 20, 350);
        }
        
    }

    public static String getInfo(Pokemon pokemon, int ind) {
        for(int i = 0; i < pokemonPool.length; i++) {
            if(pokemonPool[i][0].equals(pokemon.getName())) {
                return pokemonPool[i][ind];
            }
        }
        return "NA";
    }

    
        // Main method
public static void main(String[] args) {

    PokemonTeam yourTeam = new PokemonTeam();
    PokemonTeam enemyTeam = new PokemonTeam();
    

    int i = 0, index = 0;
    Pokemon pokemonWithType;
    Random rand1 = new Random(), rand2 = new Random();
    boolean[] used = new boolean[pokemonPool.length];
    Scanner scan = new Scanner(System.in);

    while(i < 6) {
        do { index = rand1.nextInt(pokemonPool.length); } while(used[index]); used[index] = true;
        pokemonWithType = new PokemonWithType(pokemonPool[index][0],pokemonPool[index][1]);
        yourTeam.addPokemon(pokemonWithType);

        do { index = rand2.nextInt(pokemonPool.length); } while(used[index]); used[index] = true;
        pokemonWithType = new PokemonWithType(pokemonPool[index][0],pokemonPool[index][1]);
        enemyTeam.addPokemon(pokemonWithType);

        i++;
    }

    System.out.println("Your team has:");
    System.out.println(yourTeam);

    // Create a new instance of the PokemonBattle class
    PokemonBattle pokemonBattle = new PokemonBattle(yourTeam.currentPokemon,enemyTeam.currentPokemon);

    // Create a new JFrame and add the PokemonBattle panel to it
    JFrame frame = new JFrame("Pokemon Battle");
    frame.getContentPane().add(pokemonBattle);

    // Set the JFrame properties
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(baos);
    // IMPORTANT: Save the old System.out!
    PrintStream old = System.out;
    // Tell Java to use your special stream
    // System.setOut(ps);

    // Game loop
    // while (!pokemonBattle.isBattleOver) {
    //     // Simulate a turn
    //     pokemonBattle.takeTurn();

    //     // Pause for a short time before simulating the next turn
    //     try {
    //         Thread.sleep(1000);
    //     } catch (InterruptedException e) {
    //         e.printStackTrace();
    //     }
    // }





    
    pokemonBattle.setMessage("RIVAL Blue\nwould like to battle!");
    System.out.println("RIVAL Blue");
    System.out.print("would like to battle!");
    scan.nextLine();
    System.out.println();

    pokemonBattle.setMessage("RIVAL Blue sent\nout "+enemyTeam.currentPokemon.getName());
    System.out.println("RIVAL Blue sent");
    System.out.print("out "+enemyTeam.currentPokemon.getName());
    scan.nextLine();
    System.out.println();
    pokemonBattle.setMessage("Go! "+yourTeam.currentPokemon.getName()+"!");
    System.out.println("Go! "+yourTeam.currentPokemon.getName()+"!");

    while(!yourTeam.wipedOut() && !enemyTeam.wipedOut()) {
        if(enemyTeam.currentPokemon.hasFainted()) {
            pokemonBattle.setMessage(enemyTeam.currentPokemon.getName()+" has\nFAINTED!");
            System.out.println(enemyTeam.currentPokemon.getName()+" has");
            System.out.println("FAINTED!");
            scan.nextLine();
            System.out.println();
            String temp = enemyTeam.currentPokemon.getName();
            //pokemonBattle.setMessage(enemyTeam.currentPokemon.getName()+" was swapped with \n");
            enemyTeam.autoSwapPokemon();
            pokemonBattle.setP2(enemyTeam.currentPokemon);
            pokemonBattle.setMessage(temp+" was swapped with \n"+enemyTeam.currentPokemon.getName()+"!");
            scan.nextLine();
            System.out.println();
        }
        if(yourTeam.currentPokemon.hasFainted()) {
            pokemonBattle.setMessage(yourTeam.currentPokemon.getName()+" has\nFAINTED!");
            System.out.println(yourTeam.currentPokemon.getName()+" has");
            System.out.println("FAINTED!");
            scan.nextLine();
            System.out.println();
            pokemonBattle.setMessage("Choose a POKEMON.");
            System.out.println("Choose a POKEMON.");
            System.out.println(yourTeam);
            String temp = yourTeam.currentPokemon.getName();
            pokemonBattle.setMessage(temp+", good!\nCome back!");
            while(!yourTeam.swapPokemon(scan.nextInt()));
            pokemonBattle.setMessage("Go! "+yourTeam.currentPokemon.getName()+"!");
            pokemonBattle.setP1(yourTeam.currentPokemon);
            scan.nextLine();
            System.out.println();
        }
        
        pokemonBattle.setMessage("What will\n"+yourTeam.currentPokemon.getName()+" do?\n1. Fight\n2. Pokemon");
        System.out.println("What will");
        System.out.println(yourTeam.currentPokemon.getName()+" do?");
        System.out.println("1. Fight");
        System.out.println("2. Pokemon");

        switch(scan.nextInt()) {
            case 1 : System.out.println();
                        pokemonBattle.setMessage(yourTeam.currentPokemon.getName()+" used "+getInfo(yourTeam.currentPokemon,3)+"!");
                        System.out.println(yourTeam.currentPokemon.getName()+" used");
                        System.out.print(getInfo(yourTeam.currentPokemon,3)+"!");
                        scan.nextLine();
                        System.out.println();
                        ps.flush();
                        baos.reset();
                        System.setOut(ps);
                        yourTeam.currentPokemon.attack(enemyTeam.currentPokemon);                        
                        System.out.flush();
                        System.setOut(old);
                        pokemonBattle.setMessage(baos.toString());
                        baos.reset();
                        break;
            case 2 : System.out.println();
                        pokemonBattle.setMessage("Choose a POKEMON.");
                        System.out.println("Choose a POKEMON.");
                        System.out.println(yourTeam);
                        pokemonBattle.setMessage(yourTeam.currentPokemon.getName()+", good!\nCome back!");
                        while(!yourTeam.swapPokemon(scan.nextInt()));
                        pokemonBattle.setMessage("Go! "+yourTeam.currentPokemon.getName()+"!");
                        pokemonBattle.setP1(yourTeam.currentPokemon);
                        break;
            default :   pokemonBattle.setMessage("You cannot do that!");
                        System.out.print("You cannot do that!");
                        scan.nextLine();
                        break;

        }
        scan.nextLine();
        System.out.println();
        if(enemyTeam.currentPokemon.hasFainted()) { 
            continue;
        }
        pokemonBattle.setMessage(enemyTeam.currentPokemon.getName()+" used "+getInfo(enemyTeam.currentPokemon,3)+"!");
        System.out.println(enemyTeam.currentPokemon.getName()+" used");
        System.out.print(getInfo(enemyTeam.currentPokemon,3)+"!");
        scan.nextLine();
        ps.flush();
        baos.reset();
        System.setOut(ps);
        enemyTeam.currentPokemon.attack(yourTeam.currentPokemon);
        System.out.flush();
        System.setOut(old);
        pokemonBattle.setMessage(baos.toString());
        baos.reset();
        scan.nextLine();
        System.out.println();
        System.out.println(enemyTeam.currentPokemon);
        System.out.println(yourTeam.currentPokemon);
        System.out.println();
        scan.nextLine();
    }

    if(enemyTeam.wipedOut()) {
        pokemonBattle.setMessage(enemyTeam.currentPokemon.getName()+" has\nFAINTED!");
        System.out.println(enemyTeam.currentPokemon.getName()+" has");
        System.out.println("FAINTED!");
        scan.nextLine();
        System.out.println();
        pokemonBattle.setMessage("You defeated RIVAL Blue!");
        System.out.println("You defeated RIVAL Blue!");
    } else {
        pokemonBattle.setMessage(yourTeam.currentPokemon.getName()+" has\nFAINTED!");
        System.out.println(yourTeam.currentPokemon.getName()+" has");
        System.out.println("FAINTED!");
        scan.nextLine();
        System.out.println();
        pokemonBattle.setMessage("You were defeated RIVAL Blue!");
        System.out.println("You were defeated by RIVAL Blue!");
    }



}
}
