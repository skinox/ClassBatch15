package day59;

public class Animal_Creation {
    public static void main(String[] args) {
        for (int i = 0; i <100000 ; i++) {
            System.out.println("I love Aigerim");

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hoho");

        }

    }
}
