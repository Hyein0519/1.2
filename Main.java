import java.util.Scanner;

  class Main{
  public static void main(String[] args) {

    Scanner input=new Scanner(System.in);
    try{
    System.out.print("Type of animal: " );
    String typeOfAnimal=input.nextLine();
    System.out.print("Amount of animals: ");
    int startingAmount=input.nextInt();
    System.out.print("Projection Year: ");
    int projectionYear=input.nextInt();
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
    catch(Exception e){
      System.out.println("Please enter the right numbers");
    }


  }
}

