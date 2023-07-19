import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import CustomerInformation.*; //Sử dụng lại các gói đã tạo
import ProductInformation.*; // .* là sử dụng lại toàn bộ class trong gói 
public class Main {
    static Scanner sc = new Scanner(System.in); // static cho biết được sử dụng ở lớp này
    static Customer customer = new Customer();
    static ArrayList<String> InformationName =  new ArrayList<String>();
    // static Random generator = new Random();
    public static void main(String[] args){   
        System.out.println("Enter number of information you want");
        int number = sc.nextInt();
        for(int i=0; i<number; i++){ss
            System.out.println("Enter Customer name "+(i+1));
            String customerName = sc.nextLine();
            customer.setCustomerName(customerName);
            InformationName.add(customer.getCustomerName());
            System.out.println("---------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Enter information of customer: ");
            System.out.println("Enter the age of customer");
            int age = sc.nextInt();
            customer.

        }
    }
}
