package interfaceExtendsPrac;

public class Human {
    String name;
    int age;
    int velocity;
    int x,y;

    public Human(String name, int age, int velocity, int x, int y) {
        this.name = name;
        this.age = age;
        this.velocity = velocity;
        this.x = x;
        this.y = y;
    }

    public Human(String name, int age, int velocity){
        this(name, age, velocity,0 ,0);
    }

    public void getLoc(int x, int y){
        System.out.println("현재 위치는 " + x + ", " + y + "입니다.");
    }

    public String whoAmI() {
        return "interfaceExtendsPrac.Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", velocity=" + velocity +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
