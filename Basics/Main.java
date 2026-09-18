public class Main
{
    public static void main(String args[])
    {
        //This is a single line Comment

        /*
        this is a
        multi line
        comment
        */

        System.out.print("I like Pizza!\n");
        System.out.println("Its really good!");
        System.out.println("Buy me a pizza!");
        
        int age = 20;
        double price = 12.4;
        char currency = '$';
        boolean isStudent = true;
        String country = "IN";

        System.out.println("My age is" + age);
        System.out.println("The price of the chocolate is: " + price);
        System.out.println("The currency of my Contry is: " + currency);
        if(isStudent)
        {
            System.out.println("You are  a student");
        }
        else{
            System.out.println("You are not a student");
        }

        System.out.println("Hello I am from " + country);
    }
}
