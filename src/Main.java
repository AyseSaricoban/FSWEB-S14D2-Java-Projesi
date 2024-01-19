import home.Bedroom;
import enums.LampType;
import enums.PaintColor;
import home.*;

public class Main {
    public static void main(String[] args) {

        Lamp lamp1 = new Lamp(LampType.Neon, true, 100);
        lamp1.turnOn();

        Ceilling ceiling = new Ceilling(3, PaintColor.Black);
        ceiling.create();

        Bed bed = new Bed("Double", 2, 2, 2, 2);
        System.out.println(bed.toString());




    }}
