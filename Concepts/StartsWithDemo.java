public class StartsWithDemo 
{
    public static void main(String[] args )
    {
        String str = "-91779";

        if(str.startsWith("-"))
        {
            System.out.println(str.substring(1));    // 91779
        }

        str = "-7793";

        if(str.startsWith("-77"))
        {
            System.out.println(str.substring(1));   // 7793
        }

        str = "-7793";

        if(str.startsWith("-779"))
        {
            System.out.println(str.substring(1));    //7793
        }

        str = "-7793";

        if(str.startsWith("-773"))
        {
            System.out.println(str.substring(1));   //(doesn't print not even space)
        }
    }

    
}


// My observation : works good and i started understanding this string manupulations...