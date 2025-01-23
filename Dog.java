class Dog extends Animal implements Behavior {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println(this.name);
    }

    @Override
    public void run() {
        System.out.println(this.name + " is running");
    }

    @Override
    public void sleep() {
        System.out.println(this.name + " is sleeping");
    }
}