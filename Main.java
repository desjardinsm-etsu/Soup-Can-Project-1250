public class Main
{

    public static void main(String[] args)
    {
        String[] ing = {"CHicken", "Water", "Salt", "Grease", "Hydrojkfdsayuifewqjhklvcxuiojhklfewqxcjhkfdsa"};

        SoupCan can = new SoupCan(10, 2, "Campbells", 110, 24, 6, ing);

        can.Open();
        
        if(can.isOpen())
        {
            System.out.println("The can is open!");
        }
        else
        {
            System.out.println("The can is closed!");
        }

        can.Close();

        if(can.isOpen())
        {
            System.out.println("The can is open!");
        }
        else
        {
            System.out.println("The can is closed!");
        }

    }
}
