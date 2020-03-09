package creational;

import java.io.*;
import java.util.Scanner;
abstract class typeOfPlan{
	abstract void calcRate();
    protected double cost;
    public void calculateBill(int units){
        System.out.println(units*cost);
    }
}
class Households extends typeOfPlan {
    public void calcRate(){
        cost = 2.50;
    }
}
class Industry extends typeOfPlan {
    public void calcRate() {
        cost = 6.50;
    }
}

class Schools extends typeOfPlan {
        public void calcRate() {
            cost = 4.00;
        }
    }
class GetPlanFactory {
    public typeOfPlan getPlan(String planType){
        if(planType == null){
            return null;
        }
        if(planType.equalsIgnoreCase("HOUSEHOLDS")) {
            return new Households();
        } else if(planType.equalsIgnoreCase("INDUSTRY")){
            return new Industry();
        }
        else if(planType.equalsIgnoreCase("SCHOOLS")) {
            return new Schools();
        }
        return null;
    }
}
class GenerateBill {
    public static void main(String args[])throws IOException{
        GetPlanFactory planFactory = new GetPlanFactory();
        System.out.print("Enter the name of plan for which the bill will be generated: ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String planName=br.readLine();
        System.out.print("Enter the number of units for bill will be calculated: ");
        int units=Integer.parseInt(br.readLine());
        typeOfPlan p = planFactory.getPlan(planName);
        System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");
        p.calcRate();
        p.calculateBill(units);
    }
}