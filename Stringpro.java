class Stringpro
{
    public static void main(String[] args)
    {
        String words[]={"Bilal","Djaghout"};
        System.out.println(String.join(" ",words));

        // Altermethod
        String join="";
        
        for(int i=0;i<words.length;i++)
        {   
            if(i>0)
            {
                join=join.concat(" ");
            }
            join=join.concat(words[i]);
            System.out.println(join);
        }
        
        
    }
}