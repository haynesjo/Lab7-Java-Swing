import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Counter implements ActionListener{
  JLabel leftLabel = new JLabel();
  JLabel rightLabel = new JLabel();
  int leftCount;
  int rightCount;

Counter(){
JFrame frame = new JFrame("Let's Count");
frame.setLayout(new FlowLayout());
frame.setSize(200,110);
JButton left = new JButton("Left");
JButton right = new JButton("Right");
leftCount = 0;
rightCount = 0;
left.addActionListener(this);
right.addActionListener(this);
frame.add(left);
frame.add(right);
leftLabel.setText("Count:" +leftCount);
rightLabel.setText("Count:" + rightCount);
frame.add(leftLabel);
frame.add(rightLabel);
JButton reset = new JButton("Reset");
reset.addActionListener(this);
frame.add(reset);
frame.setVisible(true);
}
public void actionPerformed(ActionEvent ae){
  if(ae.getActionCommand().equals("Left")){
    leftCount++;
    leftLabel.setText("Count:" + leftCount);
  }
  else if(ae.getActionCommand().equals("Right")){
    rightCount++;
    rightLabel.setText("Count:" + rightCount);
  
  }
  else{
    leftCount = 0;
    rightCount = 0;
    leftLabel.setText("Count:" + leftCount);
    rightLabel.setText("Count:" + rightCount);
  }
}
}