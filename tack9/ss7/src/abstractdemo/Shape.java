package abstractdemo;

abstract class Shape {
    private final float PI = 3.14F;

    public float getPI() {
        return PI;
    }
    abstract void calculate(float rad);
}