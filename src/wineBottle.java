import javax.swing.*;

public class wineBottle {
    public int wineAge() {
        wineAge[] ageWine = new wineAge[256];

        for (int i = 0; i <= ageWine.length; i++) {

            JOptionPane.showInputDialog("Please enter a brand name: " + ageWine);
            JOptionPane.showConfirmDialog(null, "Objects entered: " + ageWine[i], "Objects", JOptionPane.INFORMATION_MESSAGE);
        }
        return wineAge();
    }

    public int OlderThanTen() {
        int age = 0;

        while (age > 10) {
            JTextArea textArea = new JTextArea(Integer.toString(age));
            textArea.setColumns(30);
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
            textArea.append(Integer.toString(age));
            textArea.append(Integer.toString(age));
            textArea.append(Integer.toString(age));
            textArea.append(Integer.toString(age));
            textArea.append(Integer.toString(age));
            textArea.setSize(textArea.getPreferredSize().width, 1);
            JOptionPane.showMessageDialog(null, Integer.toString(age));

        }
        return OlderThanTen();
    }

    public void twoOldest(int[] ages) {
        int i = 0;
        int oldest = ages[0];
        int secondOldest = ages[1];
        int thirdOldest = ages[3];
        for (i = 0; i < ages.length; i++) {
            if (ages[i] > oldest && secondOldest < oldest && secondOldest > thirdOldest) {
                oldest = ages[i];
            }

        }

    }


}


