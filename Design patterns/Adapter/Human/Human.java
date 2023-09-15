package Adapter.human;

/*Create class Human */

public class Human{
    protected String name;

    Human(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println("Walking Smoothly...");
    }

    public void saySomething() {
        System.out.println("Hello There!");
    }

    public void passCaptchaTest() {
        System.out.println("just pass!");
    }

    public void whoAreYou() {
        System.out.println("I am " + name);
    }
}