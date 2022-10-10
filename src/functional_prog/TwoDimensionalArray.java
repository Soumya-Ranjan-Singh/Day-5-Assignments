//This program is to read and print a 2D array.

package functional_prog;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Type of Inputs: \n 1:Integer \n 2:Double \n 3:Boolean");
        int choice = scan.nextInt();
        System.out.println("Enter Number of Rows: ");
        int row = scan.nextInt();
        System.out.println("Enter Number of Columns: ");
        int column = scan.nextInt();

        String[][] numbers = new String[row][column];
        addAndGetArray(choice,row,column,scan,numbers);
        scan.close();
    }

    public static void addAndGetArray(int choice, int row, int column, Scanner sc, String[][] numbers)
    {
        switch (choice)
        {
            case 1:
                System.out.println("Enter Integer Values: ");
                for (int i = 0; i < row; i++)
                {
                    for (int j = 0; j < column; j++)
                    {
                        numbers[i][j] = sc.next();
                    }
                }
                System.out.println("Integer array is: \t");
                for (int i = 0; i < row; i++)
                {
                    for (int j = 0; j < column; j++)
                    {
                        System.out.print(numbers[i][j] + "  ");
                    }
                    System.out.println(" \n ");
                }
                break;
            case 2:
                System.out.println("Enter Double Values: ");
                for (int i = 0; i < row; i++)
                {
                    for (int j = 0; j < column; j++)
                    {
                        numbers[i][j] = sc.next();
                    }
                }
                System.out.println("Double array is: \t");
                for (int i = 0; i < row; i++)
                {
                    for (int j = 0; j < column; j++)
                    {
                        System.out.print(numbers[i][j] + "  ");
                    }
                    System.out.println(" \n ");
                }
                break;
            case 3:
                System.out.println("Enter Boolean Values: ");
                for (int i = 0; i < row; i++)
                {
                    for (int j = 0; j < column; j++)
                    {
                        numbers[i][j] = sc.next();
                    }
                }
                System.out.println("Boolean array is: \t");
                for (int i = 0; i < row; i++)
                {
                    for (int j = 0; j < column; j++)
                    {
                        System.out.print(numbers[i][j] + "  ");
                    }
                    System.out.println(" \n ");
                }
                break;
            default:
                System.out.println("Invalid Choice: Try Again!!!!");
        }
    }
}
