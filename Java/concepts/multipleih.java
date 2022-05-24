package concepts;
interface no1 {
    void statement1();
}
interface no2 {
    void statement2();
}
interface no3 extends no1, no2 {
    void statement1();

    void statement2();

    void statement3();

    void third();

    void first();

    void second();
}
public class multipleih implements no3 {

    @Override
    public void statement1() {
        System.out.println("Multiple Inheritance is a kind of Inheritance with more parents for one child");
        
    }

    @Override
    public void statement2() {
        System.out.println("There will be One child");
        
    }

    @Override
    public void statement3() {
        System.out.println("There will be more than parents");
        
    }

    @Override
    public void third() {

    }

    public static void main(String[] args) {
        multipleih obj=new multipleih();
        obj.statement1();
        obj.statement2();
        obj.statement3();
        animal obj1 = new animal();
        no3 e = obj1.sleep();
        System.out.println(e);
    }

    @Override
    public void first() {

    }

    @Override
    public void second() {

    }
}
