import java.util.*;

public class StringTest {
    public static void main(String[] args) {

        String s1 = "malayalam";
        StringBuffer stringBuffer = new StringBuffer(s1);
        String s2 = stringBuffer.reverse().toString();
        System.out.println(s2);
        System.out.println("=======================================");

        if(s1.equals(s2))
            System.out.println("String is palindrome");

        String s3="hello hello word";
        System.out.println("                  ");
        System.out.println(s3);

        String [] s4=s3.split(" ");
        List l1=new ArrayList<>();

        for(int i=0;i<s4.length;i++){
            l1.add(s4[i]);
        }
        System.out.println("Removing duplicates      ");
        System.out.println(l1);


        Set obj=new LinkedHashSet();
        for (int i=0;i<l1.size();i++){
            obj.add(l1.get(i));
        }

        System.out.println(obj);
        System.out.println("=================================");
        //Reverse integer
        int i=1234;
        System.out.println("Given number  "+i);
        String str=i+"";
        String [] stringArray=str.split("");
        String s5="";
        System.out.println("After reverse   ");
        for(int j=stringArray.length-1;j>=0;j--){

            System.out.println(stringArray[j]);
        }
    }
}
