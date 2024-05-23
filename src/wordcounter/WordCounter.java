
package wordcounter;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;

public class WordCounter {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Panel panel = new Panel();
        panel.setVisible(true);
    }
}

