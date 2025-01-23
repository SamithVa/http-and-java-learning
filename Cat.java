class Cat extends Animal implements Behavior {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println(this.name + " is meowing");
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