public abstract class Instrument {
    private String name;
    private String type;
    
    public Instrument(String name, String type) {
        this.name = name;
        this.type = type;
    }
    
    public String getName() {
        return name;
    }
    
    public String getType() {
        return type;
    }
    
    public abstract void play();
}

public class StringedInstrument extends Instrument {
    private int numStrings;
    
    public StringedInstrument(String name, int numStrings) {
        super(name, "Stringed");
        this.numStrings = numStrings;
    }
    
    public int getNumStrings() {
        return numStrings;
    }
    
    public void play() {
        System.out.println("Playing " + getName() + ", a " + getType() + " instrument with " + getNumStrings() + " strings.");
    }
}

public class WindInstrument extends Instrument {
    private String material;
    
    public WindInstrument(String name, String material) {
        super(name, "Wind");
        this.material = material;
    }
    
    public String getMaterial() {
        return material;
    }
    
    public void play() {
        System.out.println("Playing " + getName() + ", a " + getType() + " instrument made of " + getMaterial() + ".");
    }
}

public class PercussionInstrument extends Instrument {
    private String sound;
    
    public PercussionInstrument(String name, String sound) {
        super(name, "Percussion");
        this.sound = sound;
    }
    
    public String getSound() {
        return sound;
    }
    
    public void play() {
        System.out.println("Playing " + getName() + ", a " + getType() + " instrument that makes a " + getSound() + " sound.");
    }
}
