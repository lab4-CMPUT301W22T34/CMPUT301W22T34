public abstract class Shape{
    private int y;
    private int x;
    String color = "$PUT_YOUR_CHOICE_OF_COLOR";
   
    public Shape(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
}
