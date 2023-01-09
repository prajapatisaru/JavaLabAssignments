package labassignment2;

import javax.swing.*;
import java.awt.*;

public class TicTacToe extends JFrame{
    public static void main(String[] args){
        TicTacToe frame = new TicTacToe();
        frame.setBounds(250,150,250,250);
        frame.setVisible(true);
    }
    public TicTacToe(){
        JButton[] JButtonArray = new JButton[9];
        setLayout(new GridLayout(3,3));
        for (int i=0; i<9; i++){
            JButtonArray[i] = new JButton();
            add(JButtonArray[i]);
        }
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}