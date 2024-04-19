public class Main {
    public static void main(String[] args) {
        System.out.println("Star(*) pattern problems:");
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern3_M2(5);
        pattern4(5);
        pattern5(5);
        pattern6();
        pattern7(5);
        pattern8(5);
        pattern9(5);
        pattern10(5);
        pattern11(5);
    }

    //Pattern 1
    static void pattern1(int n) {
        System.out.println("Pattern 1:");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    //Pattern 2
    static void pattern2(int n) {
        System.out.println("Pattern 2:");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    //Pattern 3
    static void pattern3(int n) {
        System.out.println("Pattern 3:");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    //Pattern3 another method
    static void pattern3_M2(int n){
        System.out.println("Pattern3  Method 2:");
        for(int i=n; i>=1; i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    //Pattern 4
    static void pattern4(int n) {
        System.out.println("Pattern 4:");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();

        }
    }

    //pattern 5
    static void pattern5(int n) {
        System.out.println("Pattern 5:");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row ; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    //Pattern 6
    static void pattern6(){
        System.out.println("Pattern 6:");
        int n = 4;
        int m = 5;
        for(int i=1;i<=n;i++){
            for(int j = 1; j<=m; j++){
                if(i == 1 || j == 1 || i == n || j ==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //Pattern 7
    static void pattern7(int n){
        System.out.println("Pattern 7:");
        for(int i = 1;i<=n;i++){
            for(int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
    //Pattern 8
    static void pattern8(int n){
        System.out.println("Pattern 8:");
        for(int i = 1;i<=n;i++){
            for(int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
    //Pattern 9 Reverse number triangle
    static void pattern9(int n){
        System.out.println("Pattern 9:");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    //pattern 10
    static void pattern10(int n){
        System.out.println("Pattern 10:");
        int iteration = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1;j<=i;j++){
                System.out.print(iteration + " ");
                iteration++;
            }
            System.out.println();
        }
    }
    //pattern11 Binary triangle
    static void pattern11(int n){
        System.out.println("Pattern 11:");
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= i; j++){
                int sum = i+j;
                if(sum%2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
