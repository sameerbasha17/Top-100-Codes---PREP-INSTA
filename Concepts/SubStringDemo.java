public class SubStringDemo 
{
    public static void main (String [] args )
    {
        String str = "sameer";
        str = str.substring(1,2);   // a         => The substring doesnot take index upto 2, it takes 2-1 as the end index here.
        System.out.println(str);

        str = "sameer";
        str = str.substring(0,2);    // sa
        System.out.println(str);

        str = "sameer";
        str = str.substring(3,5);    // ee
        System.out.println(str);

        str = "sameer";
        str = str.substring(0,0);     //            
        System.out.println(str);

        str = "sameer";
        str = str.substring(0,6);      // sameer       => valid because length of str is 6 , if you give (0,7) it throws exception.
        System.out.println(str);


        str = "sameer";
        str = str.substring(2);                 // meer
        System.out.println(str);

        str = "sameer";
        str = str.substring(0);                 // sameer
        System.out.println(str);


        str = "sameer";
        str = str.substring(3);                 // eer
        System.out.println(str);


    }
}

// My Observation : I understood the substring concept and i think it is useful when it comes to String manupulations...
