import java.util.Scanner;

class Arrays
{
    public static void main(String args[])
        {
            //direct intialization of array
        String[] cars = {"BMW", "Volvo", "Tesla", "Hyudai"};

            cars[0] = "Mustang";

            System.out.println(cars[0] + "\n");

            //Well a structure declaration of array
            String[] cars1 = new String[4]; //4 is len of array
            cars1[0] = "BMW";
            cars1[1] = "Volvo"; 
            cars1[2] = "Tesla";
            cars1[3] = "Hyundai";

            System.out.println(cars1[0]);
            System.out.println(cars1[1]);
            System.out.println(cars1[2]);
            System.out.println(cars1[3]);

            System.out.println("\n For loop to print the array elements");
            for(int i = 0; i < cars1.length; i++) //take only less than else we get error as array starts from 0
            {
                System.out.print(cars1[i] + "  ");
            }
            System.out.println("For each loop");
            for(String car: cars) //(datatype variable name : array name)
            {
                System.out.println(car);
            }

            System.out.println("User input into an array:");

            //String[] foods = {}; not possible

            String[] foods;
            int size;

            Scanner sc = new Scanner(System.in);
            size = sc.nextInt();
            sc.nextLine();

            foods = new String[size];

            System.out.print("What # of food do you want?: ");
            for(int i = 0; i < size; i += 1)
            {
                foods[i] = sc.nextLine();
            }

            for(String s: foods)
            {
                System.out.println(s);
            }

            int[] numbers = {1, 9, 2, 8, 3, 5, 4};
            int target = 2;
            boolean isFound = false;

            for(int i = 0; i < numbers.length; i += 1)
            {
                if(target == numbers[i])  //for strings we use fruits[i].equals(target)
                {
                    System.out.println("Element found at index: " + i + 1);
                    isFound = true;
                    break;
                }
            }

            if(!isFound)
            {
                System.out.println("Element not found in array!");
            }
            else
            {
                System.out.println("Element is found!");
            }
            sc.close(); 

            System.out.println(add(1,2,3,4));
        }
        static int add(int... numbers)
            {
                int sum = 0;
                for(int num: numbers)
                {
                    sum += num;
                }
                return sum;
            }
}