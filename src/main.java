import computer.Computer;
import computer.ComputerComum;
import computer.ComputerGamer;

public class main {
    public static void main(String[] args) {
        Computer computer = new ComputerGamer().create();
        Computer computer2 = new ComputerComum().create();
        System.out.println(computer);
        System.out.println(computer2);
    }
}
