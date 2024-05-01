import java.util.*;
public class CharacterAFollowsB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=sc.next();
        System.out.println("Enter Two Characters: ");
        char c1=sc.next().charAt(0),c2=sc.next().charAt(0);
        int count=0;
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length-1;i++)
        {
            if(ch[i]==c1 && ch[i+1]==c2)
            {
                count++;
            }
        }
        System.out.println("Count is: "+count);
    }
}
/*
Input:
Enter a String: 
engine
Enter Two Characters: 
e n
output:
Count is: 1
*/
