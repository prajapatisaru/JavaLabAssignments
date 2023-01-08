package labassignment2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Multiply extends JFrame implements ActionListener  //implement listener interface
{
JLabel FirstNumber  = new JLabel("First Number");
JLabel SecondNumber = new JLabel("Second Number");
JLabel Result = new JLabel("Result");
 
JTextField txtFirstNumber = new JTextField();
JTextField txtSecondNumber = new JTextField();
JTextField txtResult = new JTextField();

Multiply()
{
setSize(400,500);
setTitle("Multiplication ");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
setLayout(null);
 
JButton btn = new JButton("Multiply");
btn.addActionListener(this);
 
FirstNumber.setBounds(50,20,100,20);
SecondNumber.setBounds(50,50,100,20);
Result.setBounds(50,80,100,20);
 
txtFirstNumber.setBounds(150,20,100,20);
txtSecondNumber.setBounds(150,50,100,20);
txtResult.setBounds(150,80,100,20);
 
btn.setBounds(150,140,100,20);
 
add(FirstNumber);
add(SecondNumber);
add(Result);
 
add(txtFirstNumber);
add(txtSecondNumber);
add(txtResult);
 
add(btn);
 
setVisible(true);
}

public void actionPerformed(ActionEvent ae)
{
int a,b,res;
a = Integer.parseInt(txtFirstNumber.getText());
b = Integer.parseInt(txtSecondNumber.getText());
res=a*b;
txtResult.setText(String.valueOf(res));
}

public static void main(String args[])
{
new Multiply();
}
}
