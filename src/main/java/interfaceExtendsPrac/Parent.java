package interfaceExtendsPrac;

public class Parent extends Human implements Runnable, Walkable{
    public Parent(String name, int age) {
        super(name, age, 3);
    }

    @Override
    public void run(int x, int y) {
        this.getLoc(x, y);
        System.out.println("현재 속도는 " + (velocity+2));
        this.x = x;
        this.y = y;
        System.out.println("ran to " + x + ", " + y);
    }

    @Override
    public void walk(int x, int y) {
        this.getLoc(x, y);
        System.out.println("현재 속도는 " + this.velocity);
        this.x = x;
        this.y = y;
        System.out.println("walked to " + x + ", " + y);
    }
}
