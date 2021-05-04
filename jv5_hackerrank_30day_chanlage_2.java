import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class jv5_hackerrank_30day_chanlage_2 {

    public static void main(String[] args) {
        double meal_cost=10.25;
        int tip_percent=17;
        int tax_percent=5;
        double calculating_tip_percent = (tip_percent/100.00000000)*(meal_cost);
        double calculating_tax_percent = (tax_percent/100.00000000)*(meal_cost);
        double calculating_meal_cost = calculating_tax_percent + calculating_tip_percent + meal_cost ;
        // double tip_cost = ((tip_percent.00/100.00)*(meal_cost));
        double answer = calculating_meal_cost;
        System.out.print(Math.round(answer) +"\n");

    }
}
