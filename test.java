
public class test {
        public static void main(String[]args){
        int[] li = {5,6,7,9};
        int maxx = li[0];
        int minn = li[0];

        for(int i:li){
            if (i<minn){
                minn = i;
            }
            else if (i>maxx){
                maxx = i;
            }
        }
        System.out.println("Min:"+minn+" Max:"+maxx);
    }
}
