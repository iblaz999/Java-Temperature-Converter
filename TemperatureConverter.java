import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



class TemperatureConverter {


    //Declare GUI Elements
    public static JFrame frmMain;
    public static JLabel lblCelsius;
    public static JTextField textCelsius;
    public static JLabel lblFahrenheit;
    public static JTextField textFahrenheit;
    public static JButton btnCalculateCtoF;
    public static JButton getBtnCalculateFtoC;


    public static void main(String [] args){
    // Set up the frame
        frmMain = new JFrame("Temperature Conventer by @IvoBlažević");
        frmMain.setSize(170,250);
        frmMain.setLayout(new FlowLayout());


        //Create GUI Elements
        lblCelsius = new JLabel("Celsius:");
        textCelsius = new JTextField(10);

        lblFahrenheit = new JLabel("Fahrenheit:");
        textFahrenheit = new JTextField(10);

        btnCalculateCtoF = new JButton("Convert C to F;");
        getBtnCalculateFtoC = new JButton("Convert F to C:");


        //Add ActionListener
        btnCalculateCtoF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            //C to F
                String cText = textCelsius.getText();
                double c = Double.parseDouble(cText);
                double f = (c * 9/5 + 32);
                textFahrenheit.setText(String.valueOf(f));
            }
        }) ;


        getBtnCalculateFtoC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Convert F to C
                String ftext = textFahrenheit.getText();
                double f = Double.parseDouble(ftext);
                double c = (f - 32) * 5/9;
                textCelsius.setText(String.valueOf(c));
            }
        });



        // Add the GUI Elements to the frame
        frmMain.add(lblCelsius);
        frmMain.add(textCelsius);
        frmMain.add(lblFahrenheit);
        frmMain.add(textFahrenheit);
        frmMain.add(btnCalculateCtoF);
        frmMain.add(getBtnCalculateFtoC);



        // Make the frame visible
        frmMain.setVisible(true);
    }

}
