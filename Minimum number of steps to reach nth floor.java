// { Driver Code Starts
//Initial Template for Java
import java.lang.*;
import java.io.*;
import java.util.*;


class SolutionMain 
{
    public static int calculate(int floor,int[] dp)
    {
        if(floor<0)
        {
            return 0;
        }
        
        if(dp[floor] != -1)
        {
            return dp[floor];
        }
        else
        {
            int temp=Math.min(calculate(floor -1,dp),Math.min(calculate(floor -2,dp),calculate(floor -3,dp))) + 1;// +1 because uss floor pe aane ka bhi ek step lagega
            dp[floor]=temp;
            return temp;
        }
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int[] dp=new int[a+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        dp[3]=1;
        int c=calculate(a,dp);
        System.out.println(c);
    }
  

}
