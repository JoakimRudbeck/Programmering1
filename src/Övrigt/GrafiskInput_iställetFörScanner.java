package Övrigt;

import javax.swing.*;

public class GrafiskInput_iställetFörScanner {

    public static void main(String[] args) {
        String namn = JOptionPane.showInputDialog(null, "Namn?");
        int ålder = Integer.valueOf(JOptionPane.showInputDialog(null, "Ålder?"));
        String beskrivning = "Hej " + namn + ", " + ålder + " år.";
        JOptionPane.showMessageDialog(null, beskrivning);
    }
}
