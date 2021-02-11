public class Practice {
    static boolean isprimeNumber(int n) {
        if (n < 2)
            return false;
        else if (n == 2)
            return true;
        else if (n % 2 == 0)
            return false;
        double sprtNum = Math.sqrt(n);
        for (int i = 3; i <= sprtNum; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
            return true;
        
    }

    public static void main(String[] args) {
        for(int i =1; i <= 15; i++){
            System.out.print(i);
            System.out.println(isprimeNumber(i));
        }
    }
}