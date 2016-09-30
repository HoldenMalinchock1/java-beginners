public class App
{
     //A class designed to show the basics of Arrays and how to create them.  It also shows basic ways to optimize printing the elements
    public static void main(String[] args) {
         //creating a value
        int value = 7;
         //Creating an Array named Values and instantiating it to hold 3 values
        int[] values;
        values = new int[3];
         //Printing the first value to the consol
        System.out.println(values[0]);
         //Declaring what the 3 elements in values[] are actaully equal to
        values[0] = 10;
        values[1] = 20;
        values[2] = 30;
         //Printing all three of the elements in the Array
        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);
         //A loop occuring 3 times that prints the three elements,  The loop is made to show a different way of printing the elements
        for(int i=0; i < values.length; i++) {
            System.out.println(values[i]);
        }
         //Creating a new Array named numbers and instantiating with 3 values; 5, 6, 7
        int[] numbers = {5, 6, 7};
         //Another loop print all the elements in the numbers[] Array
        for(int i=0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
     
}