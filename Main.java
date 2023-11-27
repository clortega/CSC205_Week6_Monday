import javax.swing.JFrame;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        JFrame window2 = new JFrame("GUI test");

        window2.setContentPane(new MyJPanel());
        window2.setLocation(300, 50);
        window2.setSize(900, 900);
        window2.setVisible(true);

        TicTacToe window = new TicTacToe();
    }

}