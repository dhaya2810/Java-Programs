package com.dhaya;
import java.util.*;

class plans{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plan A:\n100min Free for Daytime\nDaytime : 25p/min\nEveningtime : 15p/min\nNighttime : 20p/min");
        System.out.println("Plan B:\n250min Free for Daytime\nDaytime : 45p/min\nEveningtime : 35p/min\nNighttime : 25p/min");
        System.out.print("Your Daytime Min : ");
        int a=sc.nextInt();
        System.out.print("Your Eveningtime Min : ");
        int b=sc.nextInt();
        System.out.print("Your Nighttime Min : ");
        int c=sc.nextInt();
        float cost1=planA(a,b,c);
        float cost2=planB(a,b,c);
        if(cost1<cost2){
            System.out.print("Plan A is Best");
        }else if(cost1==cost2){
            System.out.print("Both are Best");
        }else{
            System.out.print("Plan B is Best");
        }
      sc.close();
    }
    static float planA(int a,int b,int c)
    {
        float cost1=0f;
        if(a<=100){
            cost1=0;
        }
        else{
            a=a-100;
            a=a*25;
            a=a/100;
        }
        b=b*15;
        b=b/100;
        c=c*20;
        c=c/100;
        cost1=a+b+c;
        System.out.println("Plan A cost : Rs."+cost1);
                return cost1;
        
    }
    static float planB(int a,int b,int c)
    {
        float cost2=0f;
        if(a<=250){
            cost2=0;
        }
        else{
            a=a-250;
            a=a*45;
            a=a/100;
        }
        b=b*35;
        b=b/100;
        c=c*25;
        c=c/100;
        cost2=a+b+c;
        System.out.println("Plan B cost : Rs."+cost2);
                return cost2;
        
    }
    

    
}