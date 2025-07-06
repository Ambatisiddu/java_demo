public class nested_for_loop
{
    public static void main(String args[])
    {
        System.out.println("working hours in first five days:");
        for (int i=1; i<=5;i++)
        {
            System.out.println("Day "+ i);
            for (int j=9;j<=17;j++)
            {
                System.out.println(" "+ (j) +" - "+ (j+1));
            }
        }
    }
}
