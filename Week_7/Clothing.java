public class Clothing {
    private String name;
    private String material;
    private double price;

    public Clothing(String name, String material, double price) {
        this.name = name;
        this.material = material;
        this.price = price;
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

public class Shirt extends Clothing {
    private String size;
    private String color;

    public Shirt(String name, String material, double price, String size, String color) {
        super(name, material, price);
        this.size = size;
        this.color = color;
    }

    // getters and setters

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

public class Pants extends Clothing {
    private String size;
    private boolean hasPockets;

    public Pants(String name, String material, double price, String size, boolean hasPockets) {
        super(name, material, price);
        this.size = size;
        this.hasPockets = hasPockets;
    }

    // getters and setters

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean hasPockets() {
        return hasPockets;
    }

    public void setHasPockets(boolean hasPockets) {
        this.hasPockets = hasPockets;
    }
}

public class Wardrobe {
    private Clothing[] clothes;

    public Wardrobe(int size) {
        clothes = new Clothing[size];
    }

    public void addClothing(Clothing clothing, int index) {
        clothes[index] = clothing;
    }

    public void removeClothing(int index) {
        clothes[index] = null;
    }

    public void display() {
        for (int i = 0; i < clothes.length; i++) {
            if (clothes[i] != null) {
                System.out.println(clothes[i].getName());
            }
        }
    }
}
