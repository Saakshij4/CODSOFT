import java.util.*;

public class Main{

	public static float calculatingAverage(int marks[], int numberOfSubjects) {
		
		int totalMarks=0;
		for(int i=0;i<numberOfSubjects;i++){
		    totalMarks+=marks[i];
		}
		    float avgPrecentage=totalMarks/numberOfSubjects;
		    return avgPrecentage;
		
	}
		
		public static char calculateGrade(float avgPrecentage){
		    if (averagePercentage >= 90) 
            return 'A';
    
        else if (75 <= averagePercentage && averagePercentage < 90) 
            return 'B';
        
        else if (60 <= averagePercentage && averagePercentage < 75) 
            return 'C';
        
        else if (45 <= averagePercentage && averagePercentage < 60) 
            return 'D';
        
        else 
            return 'E';
		
		    
		}
		
		public static void main(String [] args){
		    Scanner sc=new Scanner(System.in);
		    System.out.print("Enter number of subjects: ");
            int numberOfSubjects = sc.nextInt();
            
		    int marks[]=new int [numberOfSubjects];
		    System.out.println("Enter the marks of each subject out of 100: ");
		    for(int i=1;i<numberOfSubjects;i++){
		        System.out.println("The mark of subject "+i+" : ");
		        int mark=sc.nextInt();
		        if(0 <= mark && mark <= 100){
		        marks[i]=mark;
		        }
		        else{
                System.out.println("Please enter marks in range 0 to 100!");
                System.exit(0);
            }    
            System.out.println();
        }

        float averagePercentage = calculatingAverage(marks, numberOfSubjects);

        System.out.println("\nThe Average Percentage is: " + averagePercentage);
        System.out.println("The Grade obtained is: " + calculateGrade(averagePercentage));
		        
		    }
		}
	
