package interfaceExtendsPrac;

public class Child extends Human implements Swimmable, Runnable, Walkable{
    public Child(String name, int age) {
        super(name, age, 5);
    }
    @Override
    public void swim(int x, int y) {

        this.getLoc();


        System.out.println("현재 속도는 " + (velocity+1));
        this.x = x;
        this.y = y;
        System.out.println("swam to " + x + ", " + y);
    }

    @Override
    public void run(int x, int y) {

        this.getLoc();

        this.getLoc(x, y);

        System.out.println("현재 속도는 " + (velocity+2));
        this.x = x;
        this.y = y;
        System.out.println("ran to " + x + ", " + y);
    }

    @Override
    public void walk(int x, int y) {

        this.getLoc();

        this.getLoc(x, y);

        System.out.println("현재 속도는 " + this.velocity);
        this.x = x;
        this.y = y;
        System.out.println("walked to " + x + ", " + y);
    }
}
