//Jack G
//10/27/25
public class example1{
    public static void main(String[] args) {
    countFactors(24);
    isPrime(3);
    countPrimes(3);
    }
        public static int countFactors (int num){
        int count = 0;
        int answer = -1;
        while(count!=num){
        count++;
        answer = num%count;
        if(answer == 0){
            System.out.print(count +",");
        }
        }
        return answer;
    }
       public static boolean isPrime(int num2){
        int count = 1;
        boolean result = true;
        boolean end = false;
        while(count<num2-1&& end == false){
          count ++;
          if (num2%count == 0){
            result = false;
            System.out.println("it is not a prime number");
            end = true;
          }
        }
        System.out.println("it is a prime number");
        return result;
       }
       public static boolean isPrimei(int num2){
        int count = 1;
        boolean result = true;
        boolean end = false;
        while(count<num2-1&& end == false){
          count ++;
          if (num2%count == 0){
            result = false;
            end = true;
          }
        }
        return result;
       }
           public static int countPrimes(int n) {
        int count = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrimei(i)) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}