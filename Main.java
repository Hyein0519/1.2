import java.util.Scanner;

  class Main{
  public static void main(String[] args) {

    Scanner input=new Scanner(System.in);
    String typeOfAnimal;
    int startingAmount;
    int projectionYear;

/////input screen
    System.out.println("Please enter in the following information for a conservation area: ");
    System.out.println("------------------------");
    System.out.print("Type of animal: " );
    typeOfAnimal=input.nextLine();
    System.out.print("Amount of animals: ");
    startingAmount=input.nextInt();
    System.out.print("Projection Year: ");
    projectionYear=input.nextInt();
    System.out.println("------------------------");

////process section 
int x=projectionYear;
int y=startingAmount;
int projectedPopulation= (x-2019)*y;

/////output screen
    System.out.println("Here'a conservation area: ");
    System.out.println("------------------------");
    System.out.println("Type of aniaml: " + typeOfAnimal);
    System.out.println("Amount of animals: " + startingAmount);
    System.out.println("Current year: 2020");
    System.out.println("Projection year: " + projectionYear);
    System.out.println("Projected population: " + projectedPopulation);
    System.out.println("------------------------");

  }
}

