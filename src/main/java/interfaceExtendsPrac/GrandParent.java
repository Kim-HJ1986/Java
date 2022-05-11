package interfaceExtendsPrac;

public class GrandParent extends Human implements Walkable{
    public GrandParent(String name, int age) {
        super(name, age, 1);
    }

    @Override
    public void walk(int x, int y) {

        this.getLoc();

        System.out.println("현재 속도는 " + this.velocity);
        this.x = x;
        this.y = y;
        System.out.println("walked to " + x + ", " + y);
    }
}
