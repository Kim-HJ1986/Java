package interfaceExtendsPrac;

public class Main {
    public static void main(String[] args) {
        Human Grandpa = new GrandParent("할부지", 80);
        Human Father = new Parent("아부지", 40);
        Human Son = new Child("아덜", 19);

        Human[] humans = {Grandpa, Father, Son};

        for (Human human : humans){
            System.out.println(human.whoAmI());
            System.out.println("이동 시작!");

            if ( human instanceof Walkable){
                ((Walkable)human).walk(1,1);
                System.out.println("= == = = = = = = = = = ");
            }
            if ( human instanceof Runnable){
                ((Runnable)human).run(2,2);
                System.out.println("= == = = = = = = = = = ");
            }
            if ( human instanceof Swimmable){
                ((Swimmable)human).swim(3,-1);
                System.out.println("= == = = = = = = = = = ");
            }
        }
    }
}