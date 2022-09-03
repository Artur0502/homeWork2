public class Main {
        public static void main(String[] args) {

            System.out.println(wolk(20, 45));
            System.out.println(wolk(25, 39));
            System.out.println(wolk (27, 38));
            System.out.println(wolk (22, 40));
            System.out.println(wolk (24, 0));

            System.out.println(wolk (generateRandomAge(),10));
        }
      public static String wolk (int age, int temper) {
        String by = "можно идти гулять";
        String aa = "остовайтесь дома";
        if (age >= 20 && age <= 45 && temper >= -20 && temper <= 35) {
            return by;
        } else if (age < 20 && temper >= 0 && temper <= 28) {
            return by;
        } else if (age > 45 && temper >= -10 && temper <= 25) {
            return by;
        } else {
            return aa;
        }
    }public static int generateRandomAge(){
        int a  =0 +(int)(Math.random()*100);
        return a;
    }
}
