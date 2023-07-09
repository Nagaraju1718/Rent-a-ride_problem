import java.util.Scanner;
public class CarsList extends Rent 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,car;
        double dist;
        String[] carsavail={"Sedan","HatchBack","5 Seater"};
        for(i=0;i<carsavail.length;i++){
            System.out.println((i+1)+" "+carsavail[i]);
        }
        System.out.println("Select a car to ride");
        car=sc.nextInt();
        CarsList obj=new CarsList();
        switch(car){
            case 1:
            System.out.print("Enter Ride Distance :");
            dist = sc.nextDouble();
            obj.sedan(dist);
            break;
            case 2:
            System.out.print("Enter Ride Distance :");
            dist = sc.nextDouble();
            obj.hatchback(dist);
            break;
            case 3:
            System.out.print("Enter Ride Distance :");
            dist = sc.nextDouble();
            obj.seater(dist);
            break;
        }
        sc.close();
    }
}