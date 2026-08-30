package OOPS;

public class PassingObjectToMethods {  //it is a class itself
    public static class Car{
        int seats;  //Attributes
        String name;
        double length;
        String type;

        //Creating method inside the class
        void print(){   // no need of 'public static' bcoz we r already inside public static
            System.out.println(seats+ " " +name+ " " +length+ " " +type);
        }
    }

    public static void main(String[] args) {
         Car c = new Car();
         c.length = 3.99;
         c.name = "Kia Sonet";
         c.seats = 5;
         c.type = "SUV";

         change(c);

        System.out.println(c.seats);
        c.print();
    }
    private static void change(Car x){  // no new object is formed changes are done in the same car object
        x.seats = 4;
    }
}

