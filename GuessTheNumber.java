import java.util.*;
class Game{
    public int number;
    public int noOfGuess;
    public int inputNumber;
    static Scanner sc=new Scanner(System.in);
    
    public void setNoOfGuess( int noOfGuess){
        this.noOfGuess=noOfGuess;
    }
    public int getNoofGuess(){
        return noOfGuess;
    }
    
    public Game(){
        Random random=new Random();
        this.number =random.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Enter your Number:");
         inputNumber=sc.nextInt();   
    }
    boolean isCorrectNumber(){
        noOfGuess++;
        if(inputNumber==number){
                    System.out.format("win! Your Value %d is same as Computer Value that is %d \n",inputNumber,number);
                    System.out.println("your attempt is :"+noOfGuess);
                    return true;
                }
                else if(inputNumber>number){
                    System.out.println(" oops!Your Value is greater than Computer Value");
                }
                else if(inputNumber<number){
                    System.out.println("OOPs! Your value is less than computer value");
                }
        return false;
    }
}

public class GuessTheNumber {
    public static void main(String arg[]){        
        Game g=new Game();
        boolean b=false;
        while(!b){
        g.takeUserInput();
        b=g.isCorrectNumber();
        }
        
       
    }
    
}

