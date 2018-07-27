import java.util.InputMismatchException;
import java.util.Scanner;

  public class Main2 {
	  static boolean gameactive=true;
    public static void main(String args[]) {
    startNode();
    }


public static void startNode(){	//START
    Scanner keyboard = new Scanner(System.in);
    System.out.println("You will be playing as tortoise and will be racing against a hare. Press 1 to continue");
    try{
    int userInput=keyboard.nextInt();
    
    
    if(userInput==1){
          
        tortoise();
        
        
        somenew();
        somenews();
        death();
    }
    }catch(InputMismatchException e){
    	System.out.println("option not available");
    }
    
}
    
    public static void tortoise(){ //P2
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("You have to get ready for the race, how do you want to do to prepare.");
    System.out.println("1) Do a normal workout");
    System.out.println("2) Take steroids");    
    //keyboard.nextInt();    
    int userInput=keyboard.nextInt();
        if(userInput==1){
    System.out.print("Did a normal work out, you survived. / ");
    System.out.println("Now decide where you want to start the race.");
    System.out.println("1) The starting line");
    System.out.println("2) Cheat and start in the middle of the road");
    something();
        }
        else {
        System.out.print("died from taking steroids. Restart");
        System.exit(0);
    }
       
  }
    public static void something(){ //p3
    Scanner keyboard = new Scanner(System.in);
    int userInput=keyboard.nextInt();
          
        if(userInput==1){
    System.out.print("You did not cheat and no negative repercussions occured. /");
    System.out.println(" What do you want to do during the race.");
    System.out.println("1) Cheat and stab the hare.");
    System.out.print("2) Give up");    
    some();
        } else if (userInput==2){
    System.out.print("you got lost and died. Restart");
        System.exit(0);
    keyboard.nextInt();
    
        } else {
    }
  }

    public static void some(){ //P4
    Scanner keyboard = new Scanner(System.in);
    int userInput=keyboard.nextInt();
       
        if(userInput==1){
    System.out.print("You took the lead. /");    
    System.out.println("To win the race, what are you going to do."); 
    System.out.println("1) setup bear traps and kill the hare");
    System.out.print("2) Do not cheat the rest of the races");    somenew();
        } else if (userInput==2){
    System.out.print("Giving up is never the right way. Restart");
        System.exit(0);
        }
    if(userInput==1){

    
        } else {
        }
        }
    public static void somenew(){ //p5
    Scanner keyboard = new Scanner(System.in);
    int userInput=keyboard.nextInt();       
        if(userInput==1){
    System.out.print(" You gotta do what you gotta do./ ");    
    System.out.println("Where do you go after winning.");
    System.out.println("1) Go home");
    System.out.print("2) Go to the streets, due to the fact that you just killed your best friends");somenews();
        } else if (userInput==2){
    System.out.print(" due to exhaustion, you suffer a heart attack. Restart");
    System.exit(0);
    keyboard.nextInt();
    if(userInput==1){

    
        } else {
        }
        }
    }
    public static void somenews(){ //P6
    Scanner keyboard = new Scanner(System.in);
    int userInput=keyboard.nextInt();        
        if(userInput==1){
    System.out.print(" You get over your friends death, then turn to a life of entrepreneurship and become the next zucc."); death();    
        } else if (userInput==2){
    System.out.print("Turn to a life of crime, go to prison, get shanked and die"); death();
        } else {
        	
        }
        }
   
  public static void death(){
  	Scanner keyboard = new Scanner(System.in);
      System.out.println(" Game Over.");
      
      boolean end = false;
      System.out.println("Play Again? y/n");
      String input = keyboard.nextLine();
      if(input.equals("n")){
           end = true;
           System.out.println("Thanks for playing!");
           System.exit(0);
      }
      if(input.equals("y")){
          end = true;
          startNode();
          }
  }  
      

}


  