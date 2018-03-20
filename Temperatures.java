package com.company;
import static java.lang.System.out;

public class Temperatures {

    public static void showData(String[] times, int[][] tempData)
    {
        for (int row = 0; row < tempData.length; row++)
        {
            out.print(times[row] + ":");
            for (int column = 0; column < tempData[0].length; column++)
            {
                if (column == tempData[0].length - 1)
                {
                    out.print(" " + tempData[row][column]);
                }
                else
                {
                    out.print(" " + tempData[row][column] + ",");
                }
            }
            out.println();
        }
    }

    public static void rowAverage(String[] times, int[][] tempData)
    {
        int total;
        int avg;
        for (int row = 0; row < tempData.length; row++)
        {
            total = 0;
            for (int column = 0; column < tempData[0].length; column++)
            {
                total += tempData[row][column];
            }
            avg = total/tempData[0].length;
            out.println(times[row] + ": " + avg);
        }
    }

    public static void columnAverage(String[] days, int[][] tempData)
    {
        int total;
        int avg;
        for (int column = 0; column < tempData[0].length; column++)
        {
            total = 0;
            for (int row = 0; row < tempData.length; row++)
            {
                total += tempData[row][column];
            }
            avg = total/tempData.length;
            out.println(days[column] + ": " + avg);
        }
    }

    public static void totalAverage(int[][] tempData)
    {
        int total = 0;
        int avg;
        for (int row = 0; row < tempData.length; row++)
        {
            for (int column = 0; column < tempData[0].length; column++)
            {
                total += tempData[row][column];
            }
        }
        avg = total/(tempData[0].length * tempData.length);
        out.println("The final average temperature for the week was:");
        out.println();
        out.println("Overall: " + avg);
    }

    public static void main(String[] args) {

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String[] times = {"7 AM", "3 PM", "7 PM", "3 AM"};
        int tempData [][] = {{68,70,76,70,68,71,75}, {76,76,87,84,82,75,83}, {73,72,81,78,76,73,77}, {64,65,69,68,70,74,72}};

        out.println("Temperature Calculator");
        out.println();
        out.println("The data provided are:");
        showData(times, tempData);
        out.println();
        out.println("Based on that data, the following are the average temperatures for the week.");
        out.println();

        columnAverage(days, tempData);
        out.println();
        rowAverage(times, tempData);
        out.println();
        totalAverage(tempData);


    }
}