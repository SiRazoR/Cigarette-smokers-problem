import javax.swing.*;

//Tworzenie GUI
public class Main {
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> new CigaretteSmokerGUI("CigaretteSmokerProblem"));
    }
}