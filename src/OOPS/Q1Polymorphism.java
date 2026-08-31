package OOPS;

public class Q1Polymorphism {
    public static class Cat{
        void sound(){
            System.out.println("Meow meow");
        }
    }
    public static class Cow{
        void sound(){
            System.out.println("Moo Moo");
        }
    }
    public static class Lion{
        void sound(){
            System.out.println("Roaaarrrrr");
        }
    }
    public static class Pikachu{
        void sound(){
            System.out.println("Pika pika pi");
        }

    }

    public static void main(String[] args) {
        Cat c = new Cat();
        Cow w = new Cow();
        Lion l = new Lion();
        Pikachu p = new Pikachu();

        c.sound();
        w.sound();
        l.sound();
        p.sound();
    }
}
