
public class MyInteger {

   private int value;
   
   public MyInteger(int newValue) {
      this.value = newValue;
   }
   
   public int getValue() {
      return value;
   }
   
   public boolean isEven() {
      if (0 == value % 2)
         return true;
         
      return false;   
   }
   
   public boolean isOdd() {
      if (0 != value % 2)
         return true;
         
      return false;
   }
   
   public boolean isPrime() {
      if (value <= 1)
         return false;
         
      for (int i = 2; i < value; i++)
         if (value % i == 0)
            return false;
      
      return true;
   }
   
   public static boolean isEven(int value) {
      if (0 == value % 2)
         return true;
         
      return false;   
   }  
   
   public static boolean isOdd(int value) {
      if (0 != value % 2)
         return true;
         
      return false;
   }
   
   public static boolean isPrime(int value) {
      if (value <= 1)
         return false;
      
      for (int i = 2; i < value; i++)
         if (value % i == 0)
            return false;
            
      return true;
   }
   
   public static boolean isEven(MyInteger obj) {
      if (0 == obj.value % 2)
         return true;
         
      return false;
   }
   
   public static boolean isOdd(MyInteger obj) {
      if (0 != obj.value % 2)
         return true;
         
      return false;
   }
   
   public static boolean isPrime(MyInteger obj) {
      if (obj.value <= 1)
         return false;
         
      for (int i = 2; i < obj.value; i++) 
         if (obj.value % i == 0)
            return false;
      
      return true;       
   }
   
   public boolean equals(int testValue) {
      if (testValue == value)
         return true;
      
      return false;
   }
   
   public boolean equals(MyInteger obj) {
      if (obj.value == this.value)
         return true;
      
      return false;
   }
   
   public static int parseInt(char[] arr) {
      int sum = 0;
      for (int i = 0; i < arr.length; i++)
         sum += Character.getNumericValue(arr[i]);
         
      return sum;
   }
    
   public static int parseInt(String myString) {
      int i = Integer.parseInt(myString);
      return i;
   }
    
}