/*
Given a string, if one or both of the first 2 chars is 'x', return the string 
without those 'x' chars, and otherwise return the string unchanged. 
This is a little harder than it looks.
withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
 */
package codingbatstrings;

public class CodingBatStrings {

    public static String withoutX2(String str) {
        String res="";
        for (int i=0; i<str.length();i++){
            if (i==0 && str.charAt(i) != 'x'){       
                //System.out.println(str.charAt(i)+ " | ");
                res += str.charAt(i);
            }
            else if (i==1 && str.charAt(i) != 'x'){       
            //System.out.println(str.charAt(i)+ " | ");
                res += str.charAt(i);
            }
            else if (i>1){
                res+=str.charAt(i);
            }
        }
        return res;
}
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(withoutX2("xHi"));
        System.out.println(withoutX2("Hxi"));
        System.out.println(withoutX2("Hix"));
        System.out.println(withoutX2("xaxb"));
    }
    
}
