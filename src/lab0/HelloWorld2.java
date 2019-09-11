package lab0;

import javax.swing.*;

public class HelloWorld2 {
    public static void main(String[] args) {
    //where the user inputs name
        String name = JOptionPane.showInputDialog("Enter Name: ");

        JOptionPane.showMessageDialog(null,name);
    }
}
