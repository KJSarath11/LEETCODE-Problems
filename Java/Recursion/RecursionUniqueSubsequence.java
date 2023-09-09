import java.util.HashSet;

public class RecursionUniqueSubsequence{
    public static void subSequence(String str,int idx,String newStr,HashSet<String>set) {
        if(idx==str.length()){
            if(set.contains(newStr)){
                return;
            }else{
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar=str.charAt(idx);

        //if the char wants to be added
        subSequence(str, idx+1,newStr+currChar,set);

        //if the char does not want to be added
        subSequence(str, idx+1, newStr,set);
    }
    public static void main(String[] args) {
        String str="aaa";
        HashSet<String>set=new HashSet<>();
        subSequence(str, 0, "",set);
    }
}