import java.awt.*; //This imports everything needed, works well in Java.
import javax.swing.*;

public class MyJPanel extends JPanel {
    JButton okButton = new JButton("Ok");
    JButton cancelButton = new JButton("Cancel");

    public MyJPanel() {
        super();
        setLayout(new BorderLayout());
        okButton.addActionListener(new MyOkButtonHandler());
        cancelButton.addActionListener(e -> System.exit(0)); //this is a lambdas (?)
        add(okButton, BorderLayout.CENTER);
        add(cancelButton, BorderLayout.SOUTH);

    }
    public void PrintButtonClick() {
        System.out.println("Cancel");
    }

    @Override
    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);
        g.drawString("Hello World", 20, 30);
    }
}
