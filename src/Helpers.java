import javax.swing.*;

public class Helpers {
    public double readDouble(String message){
        return Double.parseDouble(JOptionPane.showInputDialog(message));
    }
    public int readInt(String message){
        return Integer.parseInt(JOptionPane.showInputDialog(message));
    }
    public String readText(String message){
        return JOptionPane.showInputDialog(message);
    }
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
