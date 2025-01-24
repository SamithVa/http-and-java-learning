public class Main {
    public static void main(String[] args) {
        // 第四节 面向对象

        Dog dog = new Dog("Lookie");
        Cat cat = new Cat("Sambat");

        // 调用每个对象的方法
        dog.say();
        dog.run();
        dog.sleep();

        cat.say();
        cat.run();
        cat.sleep();

        // 调用静态方法
        say(dog);
        runAndSleep(dog);
        say(cat);
        runAndSleep(cat);

    }

    // 静态方法 say
    public static void say(Animal animal) {
        animal.say();
    }

    // 静态方法 runAndSleep
    public static void runAndSleep(Behavior behavior) {
        behavior.run();
        behavior.sleep();
    }

}

// 父类 Animal
class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println(name + " is saying");
    }
}

// 接口 Behavior
interface Behavior {
    public void run();
    public void sleep();
}

// Dog 类继承 Animal 类并实现 Behavior 接口
class Dog extends Animal implements Behavior {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println(name); // 只输出名字
    }

    @Override
    public void run() {
        System.out.println(name + " is running");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}

// Cat 类继承 Animal 类并实现 Behavior 接口
class Cat extends Animal implements Behavior {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println(name); // 只输出名字
    }

    @Override
    public void run() {
        System.out.println(name + " is running");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}


