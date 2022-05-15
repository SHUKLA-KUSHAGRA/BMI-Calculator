package bmi.calculator;
/**
 *
 * @author KUSHAGRA SHUKLA
 */
import java.awt.event.*;
import javax.swing.*;
public class BMICalculator extends JFrame {
    BMICalculator(){
        JFrame f = new JFrame();
        
        JLabel height = new JLabel("Height(meters):");
        height.setBounds(20, 20, 100, 40);
        f.add(height);
        
        JLabel weight = new JLabel("Weight(kgs):");
        weight.setBounds(20, 60, 100, 40);
        f.add(weight);
        
        JLabel result = new JLabel("");
        result.setBounds(20, 100, 300, 40);
        f.add(result);
        
        JTextField Height = new JTextField("");
        Height.setBounds(120, 20, 200, 40);
        f.add(Height);

        JTextField Weight = new JTextField("");
        Weight.setBounds(120, 60, 200, 40);
        f.add(Weight);
        
        JButton btn = new JButton("CALCULATE");
        btn.setBounds(20, 130, 300, 40);
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                double x=Double.parseDouble(Weight.getText());
                double y=Double.parseDouble(Height.getText());
                double bmi = x/Math.pow(y, 2);
                 if (bmi < 18.5) {
                    result.setText("underweight - BMI : "+bmi);
                 } else if (bmi < 25) {
                    result.setText("normal - BMI : "+bmi);
                 } else if (bmi < 30) {
                    result.setText("overweight - BMI : "+bmi);
                 } else {
                    result.setText("obese - BMI : "+bmi);
                 }
            }
        }
        );
        f.add(btn);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        }
    public static void main(String[] args) {
        new BMICalculator();
    }
}