package task1;

public class task1 {
   //1 задание
    private static float one (int a, int b, int c, int d)
    {

     float x= (float)c/(float)d;
        float y = (float)b+x;
        float z = (float)a*y;
        return z;
    }
    //2 задание
    private static boolean two (int v1, int v2)
    {
        int ch1=10;
        int ch2=20;
        int sum = v1+v2;
        boolean l = (ch1<=sum && sum<=ch2);
        return l;
    }
    //3 задание
    private static boolean three (int v3)
    {
     boolean l3= (0<=v3);
     return l3;
    }
    //4 задание
    private static String four (String n)
    {
        String welcome = ("Привет, " + n);
        return welcome;
    }
     //5 задание
    private static boolean five (int year)
        {
            boolean b1;
                if (year%4!=0)
        {
            b1=false;
        }
       if (year%4==0&&year%100!=0 || year%4==0&&year%100==0&&year%400==0)
        {
            b1=true;
        }
       else
       {
           b1=false;
       }

        return b1;
    }
    public static void main(String[] args)
    {
        float result = one(8, 12,33,46);
        System.out.println(result);
        boolean result2 = two(9,12);
        System.out.println(result2);
        boolean r4=three(100);
        String s,g;
        if (r4==true)
        {
            s = "число положительное";
        }
        else
        {
           s = "число отрицательное";
        }
        System.out.println(s);
        String nm=four("Имя_Любимое_Моё!");
        System.out.println(nm);
        boolean god=five(1998);
        if (god==true)
        {
          g = "Год високосный";
        }
        else
            {
            g = "Год невисокосный";
        }
    System.out.println(g);
    }


}
