package adi;

import java.util.Date;

public class ainvayi
{
    public static void main(String args[])
    {
        Date[] d=new Date[10];
        d[0]=new Date(2019-1900,2-1,13);

        for(int i=0;i<10;i++)
        {
            d[i]=new Date(2005-1900,11,i+1);
            }
        for (Date date : d) {
            System.out.println(date);

        }

    }
}