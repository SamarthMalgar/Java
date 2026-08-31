package OOPS;

class Students{
    String name; //null
    private int rno; //0
    double cgpa; //0.0
    private void print(){
        System.out.println(name+ " " +rno+ " " +cgpa);
    }
     int getRno(){
        return rno;
    }
    void setRno(int x){
        rno = x;
    }
//    public void p(){
//        print();
//    }

}
public class Q2PrivateKeyword {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "Samar";
        s1.cgpa = 5.7;
       // s1.rno = 46; can not access due to private
        s1.setRno(56); //sets the rno value
        System.out.println(s1.getRno()); // get the rno value but cannot change.



    }
}
