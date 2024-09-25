public class Main {

    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);

    }

    private static void printFactors(int number) {
            if (number < 0) {

        for(int i = 1; i <= number; i++){
            System.out.println("Invalid number:" + number);
        return;
        }

        System.out.println("Factor of " + number + "are:");

        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                System.out.println(1 + " ");
            }
        }

        }


    }

}