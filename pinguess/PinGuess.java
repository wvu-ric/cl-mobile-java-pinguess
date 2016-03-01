public class PinGuess {
    
    //Variable Declaration
    
    //Method Declaration
  
      public String leftPad(Int number, Int targetLength) {
        Int output = number + '';
        while (output.length < targetLength) {
            output = '0' + output;
        }
        return output;
    }
      
    //main is the function that runs first and starts the lifecycle

      
    public static void main(String[] args) {
       Boolean found = false;
       Int count = 0;
       String pinNumber = "5412";

         while(!found && count < 10000){
           if(check(count)){
           found = true;
            }
           else count++
        }
         
         
         If (found){
         System.out.print("Your PIN is: " + pin);
         }
    }
    
    
    public Boolean check(combo){
      Int pinCode = Integer.parseInt(pinNumber);
      String pinChecked = leftPad(pinCode, 4);
      
      Int num = Integer.parseInt(pinChecked);
      
      if (num == pinCode){
      return true;
      }
      else return false;
         }
      
     
        
    
    
}