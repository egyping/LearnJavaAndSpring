public class ATM{
  // Static variables fixed in each instance 
  // Initial value fixed for each instance 
  public static int totalMoney = 0;
  public static int numATMs = 0;

  // Instance variables which changed per instance
  // non static variable
  public int money;

  // constructor
  public ATM(int inputMoney){
    this.money = inputMoney;
    // every instance increase the nmber of ATMs by one
    numATMs += 1;
    // every instance add money to the total
    totalMoney += inputMoney;
  }


  public void withdrawMoney(int amountToWithdraw){
    if(amountToWithdraw <= this.money){
      this.money -= amountToWithdraw;
      totalMoney -= amountToWithdraw;
    }
  }

  // Write your averageMoney() method here
  // static method
  public static void averageMoney(){
    System.out.println(totalMoney / numATMs);
    // this will cause error since money is non static variable 
   //System.out.println(this.money);
  }

  public static void main(String[] args){

    System.out.println("Total number of ATMs: " + ATM.numATMs); 
    ATM firstATM = new ATM(1000);
    ATM secondATM = new ATM(500);
    System.out.println("Total number of ATMs: " + ATM.numATMs); 

    System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);  
    firstATM.withdrawMoney(500);
    secondATM.withdrawMoney(200);
    System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);    

    // calling the static method
    ATM.averageMoney();

  }

}
