
import java.util.Scanner;

/**
 * @author TheAndresG
 */
    public class SeatSalesSystem {

    public static void main(String args[]) {
        char seats [][]= new char[10][10];
        boolean tic = false;
        String map;
        Scanner userIn = new Scanner(System.in);
        int row,seat;
        String answer;
        
        for(int r=0;r<10;r++){
            for(int s=0;s<10;s++){
            seats[r][s]= 'L';
            }
    }
        
        System.out.println("Seat reservation system");
        
        while(tic !=true){
            
            System.out.println("Do you want to see a seating map? (Y/N)");
            map = userIn.next();
             if(map.equalsIgnoreCase("Y")||map.equalsIgnoreCase("S")||map.equalsIgnoreCase("Yes")||map.equalsIgnoreCase("Si")){
                 for(int r=0;r<10;r++){
                    for(int s=0;s<10;s++){
                        System.out.print(seats[r][s]);
                    }
                 System.out.println("");
                }
            }
            boolean ok =false;
             while(ok!=true){
             
             
            System.out.println("Select row and seat");
            System.out.println("Row(0-9)");
            row = userIn.nextInt();
            
            
            System.out.println("Seat(0-9)");
            seat = userIn.nextInt();
             if(row>=0||row<=9){
               if(row>=0||row<=9){
                       ok = true;     
               }
               else{
                   System.out.println("Invalid Seat Number (0-9).");
               }}
               else{
                       System.out.println("Invalid row Number (0-9).");
                       }
              
             }
             if(seats[row][seat]== 'L'){
                 seats[row][seat]= 'X';
                 System.out.println("The seat was reserved correctly.");   
             }
             else{
                 System.out.println("The seat is occupied.Please choose another one.");        
             }
             System.out.println("Do you want to continue with the reservation? (Y/N)");
             
            
            answer = userIn.next();
            if(answer.equalsIgnoreCase("N")){
                 tic=true;
            }
        }
        
    }
}
