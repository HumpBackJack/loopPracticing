public class example1 {
    public static void main(String[]args){
        System.out.println(countFactors(5));
        System.out.println(isPrime(4));
        System.out.println(countPrimes(1000));
    }
    public static int countFactors(int num){
        int count = 0;
        int i = 1;
        while(i<=num){
            if (num%i == 0)
            count++;
            i++;
        }
        return count;
    }
    public static boolean isPrime(int j){
        return (countFactors(j) == 2);
    }
    public static int countPrimes(int u){
        int count2 = 0;
        int o = 2;
        while(o<u){
            if(isPrime(o)){
                count2++;
            }
            o++;
        }
        return count2;
    }
}