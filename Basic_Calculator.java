public class Basic_Calculator {
    public static void main(String[]args){
        System.out.println(count(2, "+", 2));
    }

    public static int count(int a , String opp , int b){
        int ans = 0;
        if (opp.equals("+")){ans = a+b;}
        else if(opp.equals("-")){ans = a-b;}
        else if(opp.equals("*")){ans = a*b;}
        else if(opp.equals("/")){ans = a/b;}
        return ans;
    }
}
