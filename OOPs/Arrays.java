class Arrays
{
    public static void main(String args[])
        {
            //direct intialization of array
            String[] cars = {"BMW", "Volvo", "Tesla", "Hyudai"};

            cars[0] = "Mustang";

            System.out.println(cars[0] + "\n");

            //Well a structured declaration of array
            String[] cars1 = new String[4];
            cars1[0] = "BMW";
            cars1[1] = "Volvo"; 
            cars1[2] = "Tesla";
            cars1[3] = "Hyundai";

            System.out.println(cars1[0]);
            System.out.println(cars1[1]);
            System.out.println(cars1[2]);
            System.out.println(cars1[3]);

            System.out.println("\n For loop to print the array elements");
            for(int i = 0; i < cars1.length; i++)
            {
                System.out.print(cars1[i] + "  ");
            }
        }
}