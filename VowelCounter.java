import java.util.*;
public class VowelCounter {
    public static void main(String[] args){
        String input="Hello java Leraners!";
        int count = 0;
        for (int i=0;i<input.length();i++){
            char ch = Character.toLowerCase(input.charAt(i));
            if(ch=='a'|| ch=='e'|| ch=='i'||ch=='0' || ch=='u'){
                count++;
            }
        }
        System.out.println("Number of Vowels in\""+input+"\"="+count);
            }
        }
    
