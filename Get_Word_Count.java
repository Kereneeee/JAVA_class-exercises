public class Get_Word_Count {
    public static void main(String[]args){
        System.out.println(countlen("Just an example here move along"));
        System.out.println(countlen("What an easy task, right"));
    }

    public static int countlen(String S){
        String[] word = S.trim().split("\\s+");
        return word.length;
    }
}
