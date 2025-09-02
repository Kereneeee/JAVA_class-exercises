public class Triangular_Number_Sequence {
    public static void main(String[]args){
        System.out.println(count(215));
    }

    public static int count(int n){
        int d = 1;
        int an = 0;
        for (int i=0 ; i<n ;i++){
            an += d;
            d ++;
        }
        return an;
    }
}
