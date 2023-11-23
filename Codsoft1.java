import java.util.*;

public class Main
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Random random = new Random();

    int minNum=1;
    int maxNum=100;
    int score=0;
	System.out.println("Enter a random number between 1 to 100");
	System.out.println("You'll be given a total of 10 guesses");
	
	
	  while(true){
	    int randNum=random.nextInt(maxNum-minNum+1)+minNum;
	    int attempts;
	for(attempts=1;attempts<=10;attempts++){
	    
	    System.out.println("Enter your guess: ");
	    int num=sc.nextInt();
	    
	    if(num<minNum || num>maxNum){
	        System.out.println("Give a valid number");
	        
	    }else if(num<randNum){
	        System.out.println("Too Low");
	    }else if(num>randNum){
	        System.out.println("Too High");
	    }else{  
	        System.out.println("Correct Guess!! You won!!");
	        score++;
	        break;
	    }
	    
	    if(attempts<10){
	    System.out.println("You still have " + (10 - attempts) + " guesses left");
	    }else{
	    System.out.println("Sorry!!. The correct number was"+ randNum);
	}
	}
	
	System.out.println("Want to play again?(yes/no): ");
	String playAgain = sc.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
	}
	 System.out.println("GAME OVER!!. Your final score is: " + score);
    
	}
}
