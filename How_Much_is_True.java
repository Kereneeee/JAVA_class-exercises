public class How_Much_is_True {

    public static void main(String[]args){
        System.out.println(countTrue(new boolean[]{true,false,true,true}));
        System.out.println(countTrue(new boolean[]{true,true,false}));
        System.out.println(countTrue(new boolean[]{}));
    }
    public static int countTrue(boolean[] Li){
        int count = 0;
        for(boolean i :Li){
            if (i){count++;}
        }
        return count;
    }
}
