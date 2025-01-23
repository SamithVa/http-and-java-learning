public class Animal {
    public String name;
    public Animal(String name) {
        this.name = name;
    }
    public void say(){
        System.out.println(this.name + " is saying");
    }
}

interface Behavior{
    public void run();
    public void sleep();
}
