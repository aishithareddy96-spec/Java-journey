public class Arrays2{
    public static void main(String[] args) {
        /*String[] fruits = {"Apple", "Orange", "Banana"};
        String[] vegetables = {"Potato", "Onion", "Carrot"};
        String[] meat = {"Chicken", "Fish"};

        String[][] groceries = {fruits, vegetables, meat};

        for(String[] g: groceries) //groceries[0] = fruits and from fruits we print apple,orange, banana similar for others
        {
            for(String s: g)
            {
                System.out.println(s);
            }
        }*/

        // can be written as

        String[][] groceries = { {"Apple", "Orange", "Banana"},{"Potato", "Onion", "Carrot"},{"Chicken", "Fish"}};

        for(String[] g: groceries)
        {
            for(String s: g)
            {
                System.out.print(s + " ");
            }
            System.out.println();
        }
        
        //char storing
        System.out.println("Char storing:");
        char[][] phone = {{'1','2','3'},{'4','5','6'},{'7','8','9'},{'#','0','*'}};

        for(char[] row: phone)
        {
            for(char num: row)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
} 