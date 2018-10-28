import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        //główna ramka
        JFrame frame = new JFrame("Tetris!");
        //przyciski
        JButton btnExit = new JButton("Zakończ grę");
        btnExit.setBounds(400,700,150,20);
        
        
        //przycisk wyjścia z gry, zrobiony na stałe, nie jako obiekt
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.add(btnExit);
        frame.setSize(600, 800);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
