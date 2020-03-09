package creational;

import java.util.HashMap;

import java.util.Map;
abstract class Color implements Cloneable {
    protected String color;
    abstract void add();
    public Object clone()   {
        Object clone = null;
        try {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

class yellowColor extends Color {
    public yellowColor() {
        this.color = "yellow";
    }
    @Override
    void add() {
        System.out.println("Yellow color added successfully!");
    }
}

class pinkColor extends Color{
    public pinkColor()  {
        this.color = "black";
    }
    @Override
    void add() {
        System.out.println("Pink color added succesfully!");
    }
}

class blackColor extends Color{
    public blackColor()  {
        this.color = "black";
    }
    @Override
    void add() {
        System.out.println("Black color added succesfully!");
    }
}

class whiteColor extends Color{
    public whiteColor()  {
        this.color = "white";
    }
    @Override
    void add() {
        System.out.println("White color added succesfully!");
    }
}

class ColorsStore {
    private static Map<String, Color> colorMap = new HashMap<String, Color>();
    static {
        colorMap.put("yellow", new yellowColor());
        colorMap.put("pink", new pinkColor());
        colorMap.put("black", new blackColor());
        colorMap.put("white", new whiteColor());
    }
    public static Color getColor(String colorName) {
        return (Color) colorMap.get(colorName).clone();
    }
}
class prototypeMethod {
    public static void main (String[] args) {
        ColorsStore.getColor("black").add();
        ColorsStore.getColor("white").add();
        ColorsStore.getColor("yellow").add();
        ColorsStore.getColor("pink").add();
    }
}
