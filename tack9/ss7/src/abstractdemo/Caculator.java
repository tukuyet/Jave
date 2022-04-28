package abstractdemo;

import java.util.Locale;

public class Caculator {
    public static void main(String[] args) {
        Shape objShape;
        String shape;
        if(args.length==2) {
            shape = args[0].toLowerCase();
            switch (shape) {
                case "circle" : objShape = new Circle();
                    objShape.calculate(Float.parseFloat(args[1]));
                    break;
                case "rectangle": objShape = new Rectangle();
                    objShape.calculate(Float.parseFloat(args[1]));
                    break;
            }
        }else {
            System.out.println("Usage:java Caculator<shape-name><value>");
        }
    }
}