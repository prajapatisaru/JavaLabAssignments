package labassignment2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SimpleInterest extends JFrame implements ActionListener
{
  
 JLabel Principle = new JLabel("Principle");
 JLabel Rate = new JLabel("Rate");
 JLabel Time = new JLabel("Time");
 JLabel Result = new JLabel("Result");
   
 JTextField txtPrinciple = new JTextField();
 JTextField txtTime = new JTextField();
 JTextField txtRate = new JTextField();
 JTextField txtResult = new JTextField();
  
 SimpleInterest()
 {
  setSize(400,500);
  setTitle("Simple Intrest");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
  setLayout(null);
   
  JButton btn = new JButton("Compute");
  btn.addActionListener(this);
   
  Principle.setBounds(50,20,60,20);
  Time.setBounds(50,50,60,20);
  Rate.setBounds(50,80,60,20);
  Result.setBounds(50,110,60,20);
   
  txtPrinciple.setBounds(150,20,100,20);
  txtTime.setBounds(150,50,100,20);
  txtRate.setBounds(150,80,100,20);
  txtResult.setBounds(150,110,100,20);
   
  btn.setBounds(150,140,100,20);
   
  add(Principle);
  add(Time);
  add(Rate);
  add(Result);
   
  add(txtPrinciple);
  add(txtTime);
  add(txtRate);
  add(txtResult);
   
  add(btn);
   
  setVisible(true);
 }
  
 public void actionPerformed(ActionEvent ae)
 {
  int p,t,r;
  float res;
  p = Integer.parseInt(txtPrinciple.getText());
  t = Integer.parseInt(txtTime.getText());
  r = Integer.parseInt(txtRate.getText());
  res=(p*t*r)/100;
  txtResult.setText(String.valueOf(res));
 }
  
 public static void main(String args[])
 {
  new SimpleInterest();
 }
}
 

