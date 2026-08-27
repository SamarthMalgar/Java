package Methods;

public class passingString {
    public static String change(String x) {
        x = "Sam";
        return x;
    }
    public static void main(String[] args) {
        String x = "Samarth";
        for(int i = 0; i<=x.length(); i++){
            for(int j = 0; j<=x.length()-i; j++){
                System.out.print(x.substring(i, i+j)+ " ");
            }
        System.out.println();
        }
    }
}
