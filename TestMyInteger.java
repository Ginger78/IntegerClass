
public class TestMyInteger {

   public static void main(String[] args) {
      MyInteger integer1 = new MyInteger(23);
      MyInteger integer2 = new MyInteger(26);
      MyInteger integer3 = new MyInteger(54);
      
      char[] charArray = { '8', '7', '4', '5'};
      String myString = "1234";
      
      System.out.println("The value of integer1 is: " + integer1.getValue());
      System.out.println("The value of integer2 is: " + integer2.getValue());
      
      System.out.println("is integer1 an even number? : " + integer1.isEven());
      System.out.println("is integer1 an odd number? : " + integer1.isOdd());
      System.out.println("is integer1 a prime number? : " + integer1.isPrime());
      
      System.out.println("Is integer2 an even number? : " + MyInteger.isEven(integer2));
      System.out.println("Is integer2 an odd number? : " + MyInteger.isOdd(integer2));
      System.out.println("Is integer2 a prime number? : " + MyInteger.isPrime(integer2));
      
      System.out.println("Is integer3 an even number? : " + MyInteger.isEven(integer3.getValue()));
      System.out.println("Is integer3 an odd number? : " + MyInteger.isOdd(integer3.getValue()));
      System.out.println("Is integer3 a prime number? : " + MyInteger.isPrime(integer3.getValue()));
      
      System.out.println("Is integer1 and integer2 equal to each other? : " + integer1.equals(integer2));
      
      System.out.println("Is integer1 and 25 equal to each other? : " + integer1.equals(25));
      
      System.out.println(MyInteger.parseInt(charArray));
      System.out.println(MyInteger.parseInt(myString));
   }

}