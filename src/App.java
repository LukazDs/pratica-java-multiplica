public class App {
    public static void main(String[] args) throws Exception {
        int numberInformed = 10;

        System.out.println("Tabela de multiplicação de " + numberInformed);

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " x " + numberInformed + " = " + i * numberInformed);
        }
    }
}
