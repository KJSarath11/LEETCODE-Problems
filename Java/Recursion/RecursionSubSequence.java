public class RecursionSubSequence {
    public static void subSequence(String str,int idx,String newStr) {
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);

        //if the char wants to be added
        subSequence(str, idx+1,newStr+currChar);

        //if the char does not want to be added
        subSequence(str, idx+1, newStr);
    }
    public static void main(String[] args) {
        String str="cat";
        subSequence(str, 0, "");
    }
}
