import java.rmi.server.ExportException;
import java.util.*;
import java.Exception;
class voterAgeValiditionException extends Exception
{
    voterAgeValiditionException(String str)
        {
         super(str);
        }

}
public class VoterAgeException {
    static void validate(int age) throws Exception
    {
        if(age<18){
            throw new voterAgeValiditionException("Age is under 18");
        }
        else {
            System.out.println("welcome to vote");
        }
    }
    public static void main(String[] args) throws Exception{
        try{
            System.out.println("Enter age");
            Scanner sc=new Scanner(System.in);
            int age=sc.nextInt();
            validate(age);
        }
        catch(Exception e)
            {
                System.out.println("Exception: "+e);
            }
    }
}
