
package wordcounter;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import java.awt.Color;
import java.awt.EventQueue;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.StringTokenizer;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class Panel extends javax.swing.JFrame {
    private javax.swing.undo.UndoManager undoManager;
    
    public Panel() {
        initComponents();
        undoManager = new javax.swing.undo.UndoManager();
        textArea.getDocument().addUndoableEditListener(undoManager);
    }
    
    private void updateCounter() {
        String text = textArea.getText();
        int countLetter = text.length();

        if (countLetter == 0) {
            //JOptionPane.showMessageDialog(null, "Number of characters: 0\nNumber of words: 0", "Letter and Word Count", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        StringTokenizer tokenizer = new StringTokenizer(text);
        int countWord = tokenizer.countTokens();

        String message = "Number of characters: " + countLetter + "\nNumber of words: " + countWord;
        //JOptionPane.showMessageDialog(null, message, "Letter and Word Count", JOptionPane.INFORMATION_MESSAGE);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        File_Menu = new javax.swing.JMenu();
        File_New = new javax.swing.JMenuItem();
        File_Open = new javax.swing.JMenuItem();
        File_Save = new javax.swing.JMenuItem();
        Edit_Menu = new javax.swing.JMenu();
        Undo = new javax.swing.JMenuItem();
        Redo = new javax.swing.JMenuItem();
        Format_Menu = new javax.swing.JMenu();
        Font = new javax.swing.JMenu();
        Arial = new javax.swing.JMenuItem();
        TimesNewRoman = new javax.swing.JMenuItem();
        Calibri = new javax.swing.JMenuItem();
        SansSerif = new javax.swing.JMenuItem();
        FontSize = new javax.swing.JMenu();
        FontSize8 = new javax.swing.JMenuItem();
        FontSize10 = new javax.swing.JMenuItem();
        FontSize12 = new javax.swing.JMenuItem();
        FontSize14 = new javax.swing.JMenuItem();
        FontSize18 = new javax.swing.JMenuItem();
        FontSize24 = new javax.swing.JMenuItem();
        FontSize36 = new javax.swing.JMenuItem();
        FontSize48 = new javax.swing.JMenuItem();
        Color_Menu = new javax.swing.JMenu();
        Foreground_Color = new javax.swing.JMenuItem();
        Background_Color = new javax.swing.JMenuItem();
        Options_Menu = new javax.swing.JMenu();
        menuDarkMode = new javax.swing.JCheckBoxMenuItem();
        File_Exit = new javax.swing.JMenuItem();
        Info_Menu = new javax.swing.JMenu();
        StyleInfo = new javax.swing.JMenuItem();
        Statics = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);

        jScrollPane1.setBorder(null);

        textArea.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent arg0) {
                updateCounter();
            }

            @Override
            public void removeUpdate(DocumentEvent arg0) {
                updateCounter();
            }

            @Override
            public void insertUpdate(DocumentEvent arg0) {
                updateCounter();
            }
        });
        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textArea.setLineWrap(true);
        textArea.setRows(5);
        textArea.setWrapStyleWord(true);
        textArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 204, 204));

        File_Menu.setText("File");

        File_New.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        File_New.setText("New");
        File_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                File_NewActionPerformed(evt);
            }
        });
        File_Menu.add(File_New);

        File_Open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        File_Open.setText("Open");
        File_Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                File_OpenActionPerformed(evt);
            }
        });
        File_Menu.add(File_Open);

        File_Save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        File_Save.setText("Save");
        File_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                File_SaveActionPerformed(evt);
            }
        });
        File_Menu.add(File_Save);

        jMenuBar1.add(File_Menu);

        Edit_Menu.setText("Edit");

        Undo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Undo.setText("Undo");
        Undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UndoActionPerformed(evt);
            }
        });
        Edit_Menu.add(Undo);

        Redo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Redo.setText("Redo");
        Redo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedoActionPerformed(evt);
            }
        });
        Edit_Menu.add(Redo);

        jMenuBar1.add(Edit_Menu);

        Format_Menu.setText("Format");
        Format_Menu.setToolTipText("");

        Font.setText("Font");

        Arial.setText("Arial");
        Arial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArialActionPerformed(evt);
            }
        });
        Font.add(Arial);

        TimesNewRoman.setText("Times New Roman");
        TimesNewRoman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimesNewRomanActionPerformed(evt);
            }
        });
        Font.add(TimesNewRoman);

        Calibri.setText("Calibri");
        Calibri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalibriActionPerformed(evt);
            }
        });
        Font.add(Calibri);

        SansSerif.setText("Microsoft Sans Serif");
        SansSerif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SansSerifActionPerformed(evt);
            }
        });
        Font.add(SansSerif);

        Format_Menu.add(Font);

        FontSize.setText("Font Size");

        FontSize8.setText("8");
        FontSize8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FontSize8ActionPerformed(evt);
            }
        });
        FontSize.add(FontSize8);

        FontSize10.setText("10");
        FontSize10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FontSize10ActionPerformed(evt);
            }
        });
        FontSize.add(FontSize10);

        FontSize12.setText("12");
        FontSize12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FontSize12ActionPerformed(evt);
            }
        });
        FontSize.add(FontSize12);

        FontSize14.setText("14");
        FontSize14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FontSize14ActionPerformed(evt);
            }
        });
        FontSize.add(FontSize14);

        FontSize18.setText("18");
        FontSize18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FontSize18ActionPerformed(evt);
            }
        });
        FontSize.add(FontSize18);

        FontSize24.setText("24");
        FontSize24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FontSize24ActionPerformed(evt);
            }
        });
        FontSize.add(FontSize24);

        FontSize36.setText("36");
        FontSize36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FontSize36ActionPerformed(evt);
            }
        });
        FontSize.add(FontSize36);

        FontSize48.setText("48");
        FontSize48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FontSize48ActionPerformed(evt);
            }
        });
        FontSize.add(FontSize48);

        Format_Menu.add(FontSize);

        jMenuBar1.add(Format_Menu);

        Color_Menu.setText("Color");

        Foreground_Color.setText("Foreground Color");
        Foreground_Color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Foreground_ColorActionPerformed(evt);
            }
        });
        Color_Menu.add(Foreground_Color);

        Background_Color.setText("Background Color");
        Background_Color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Background_ColorActionPerformed(evt);
            }
        });
        Color_Menu.add(Background_Color);

        jMenuBar1.add(Color_Menu);

        Options_Menu.setText("Options");

        menuDarkMode.setText("Dark Mode");
        menuDarkMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDarkModeActionPerformed(evt);
            }
        });
        Options_Menu.add(menuDarkMode);

        File_Exit.setText("Exit");
        File_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                File_ExitActionPerformed(evt);
            }
        });
        Options_Menu.add(File_Exit);

        jMenuBar1.add(Options_Menu);

        Info_Menu.setText("Info");

        StyleInfo.setText("Style Info");
        StyleInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StyleInfoActionPerformed(evt);
            }
        });
        Info_Menu.add(StyleInfo);

        Statics.setText("Statics");
        Statics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StaticsActionPerformed(evt);
            }
        });
        Info_Menu.add(Statics);

        jMenuBar1.add(Info_Menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void File_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_File_NewActionPerformed
        textArea.setText("");
        updateCounter();
    }//GEN-LAST:event_File_NewActionPerformed

    private void File_OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_File_OpenActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            Path path = fileChooser.getSelectedFile().toPath();
            try {
                byte[] bytes = Files.readAllBytes(path);
                textArea.setText(new String(bytes));
                updateCounter();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_File_OpenActionPerformed

    private void File_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_File_SaveActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            Path path = fileChooser.getSelectedFile().toPath();
            try {
                Files.write(path, textArea.getText().getBytes());
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_File_SaveActionPerformed

    private void Foreground_ColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Foreground_ColorActionPerformed
        Color newColor = JColorChooser.showDialog(null, "Choose a color", textArea.getForeground());
        textArea.setForeground(newColor);
    }//GEN-LAST:event_Foreground_ColorActionPerformed

    private void Background_ColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Background_ColorActionPerformed
        Color nColor = JColorChooser.showDialog(null, "Choose a color",textArea.getBackground());
        textArea.setBackground(nColor);
    }//GEN-LAST:event_Background_ColorActionPerformed

    private void menuDarkModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDarkModeActionPerformed
        textArea.setBackground(null);
        if(menuDarkMode.isSelected()){
            EventQueue.invokeLater(new Runnable(){
                @Override
                public void run(){
                    FlatAnimatedLafChange.showSnapshot();
                    FlatDarculaLaf.setup();
                    FlatLaf.updateUI();
                    FlatAnimatedLafChange.hideSnapshotWithAnimation();   
                }
            });
        }else{
            EventQueue.invokeLater(new Runnable(){
                @Override
                public void run(){
                    FlatAnimatedLafChange.showSnapshot();
                    FlatIntelliJLaf.setup();
                    FlatLaf.updateUI();
                    FlatAnimatedLafChange.hideSnapshotWithAnimation();
                }
            });
        }
    }//GEN-LAST:event_menuDarkModeActionPerformed

    private void File_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_File_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_File_ExitActionPerformed

    private void FontSize48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FontSize48ActionPerformed
        textArea.setFont(new java.awt.Font(textArea.getFont().getFontName(), textArea.getFont().getStyle(), 48));
    }//GEN-LAST:event_FontSize48ActionPerformed

    private void FontSize36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FontSize36ActionPerformed
        textArea.setFont(new java.awt.Font(textArea.getFont().getFontName(), textArea.getFont().getStyle(), 36));
    }//GEN-LAST:event_FontSize36ActionPerformed

    private void FontSize24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FontSize24ActionPerformed
        textArea.setFont(new java.awt.Font(textArea.getFont().getFontName(), textArea.getFont().getStyle(), 24));
    }//GEN-LAST:event_FontSize24ActionPerformed

    private void FontSize18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FontSize18ActionPerformed
        textArea.setFont(new java.awt.Font(textArea.getFont().getFontName(), textArea.getFont().getStyle(), 18));
    }//GEN-LAST:event_FontSize18ActionPerformed

    private void FontSize14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FontSize14ActionPerformed
        textArea.setFont(new java.awt.Font(textArea.getFont().getFontName(), textArea.getFont().getStyle(), 14));
    }//GEN-LAST:event_FontSize14ActionPerformed

    private void FontSize12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FontSize12ActionPerformed
        textArea.setFont(new java.awt.Font(textArea.getFont().getFontName(), textArea.getFont().getStyle(), 12));
    }//GEN-LAST:event_FontSize12ActionPerformed

    private void FontSize10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FontSize10ActionPerformed
        textArea.setFont(new java.awt.Font(textArea.getFont().getFontName(), textArea.getFont().getStyle(), 10));
    }//GEN-LAST:event_FontSize10ActionPerformed

    private void FontSize8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FontSize8ActionPerformed
        textArea.setFont(new java.awt.Font(textArea.getFont().getFontName(), textArea.getFont().getStyle(), 8));
    }//GEN-LAST:event_FontSize8ActionPerformed

    private void SansSerifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SansSerifActionPerformed
        textArea.setFont(new java.awt.Font("SansSerif", textArea.getFont().getStyle(), textArea.getFont().getSize()));
    }//GEN-LAST:event_SansSerifActionPerformed

    private void CalibriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalibriActionPerformed
        textArea.setFont(new java.awt.Font("Calibri", textArea.getFont().getStyle(), textArea.getFont().getSize()));
    }//GEN-LAST:event_CalibriActionPerformed

    private void TimesNewRomanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimesNewRomanActionPerformed
        textArea.setFont(new java.awt.Font("Times New Roman", textArea.getFont().getStyle(), textArea.getFont().getSize()));
    }//GEN-LAST:event_TimesNewRomanActionPerformed

    private void ArialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArialActionPerformed
        textArea.setFont(new java.awt.Font("Arial", textArea.getFont().getStyle(), textArea.getFont().getSize()));
    }//GEN-LAST:event_ArialActionPerformed

    private void UndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UndoActionPerformed
        if (undoManager.canUndo()) {
            undoManager.undo();
        }
    }//GEN-LAST:event_UndoActionPerformed

    private void RedoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedoActionPerformed
        if (undoManager.canRedo()) {
            undoManager.redo();
        }
    }//GEN-LAST:event_RedoActionPerformed

    private void StyleInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StyleInfoActionPerformed
        String fontName = textArea.getFont().getFontName();
        int fontSize = textArea.getFont().getSize();
        int fontStyle = textArea.getFont().getStyle();
        String backgroundColor = String.format("#%06X", (0xFFFFFF & textArea.getBackground().getRGB()));
        String foregroundColor = String.format("#%06X", (0xFFFFFF & textArea.getForeground().getRGB()));

        String message = "1 - Font Name: " + fontName + "\n"
                + "2 - Font Size: " + fontSize + "\n"
                + "3 - Font Style: " + fontStyle + "\n"
                + "4 - Background Color: " + backgroundColor + "\n"
                + "5 - Foreground Color: " + foregroundColor;

        JOptionPane.showMessageDialog(null, message, "Font and Color Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_StyleInfoActionPerformed

    private void StaticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StaticsActionPerformed
    String text = textArea.getText();
    int countLetter = text.length();

    if (countLetter == 0) {
        JOptionPane.showMessageDialog(null, "Number of characters: 0\nNumber of words: 0", "Letter and Word Count", JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    StringTokenizer tokenizer = new StringTokenizer(text);
    int countWord = tokenizer.countTokens();

    String message = "Number of characters: " + countLetter + "\nNumber of words: " + countWord;
    JOptionPane.showMessageDialog(null, message, "Letter and Word Count", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_StaticsActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Arial;
    private javax.swing.JMenuItem Background_Color;
    private javax.swing.JMenuItem Calibri;
    private javax.swing.JMenu Color_Menu;
    private javax.swing.JMenu Edit_Menu;
    private javax.swing.JMenuItem File_Exit;
    private javax.swing.JMenu File_Menu;
    private javax.swing.JMenuItem File_New;
    private javax.swing.JMenuItem File_Open;
    private javax.swing.JMenuItem File_Save;
    private javax.swing.JMenu Font;
    private javax.swing.JMenu FontSize;
    private javax.swing.JMenuItem FontSize10;
    private javax.swing.JMenuItem FontSize12;
    private javax.swing.JMenuItem FontSize14;
    private javax.swing.JMenuItem FontSize18;
    private javax.swing.JMenuItem FontSize24;
    private javax.swing.JMenuItem FontSize36;
    private javax.swing.JMenuItem FontSize48;
    private javax.swing.JMenuItem FontSize8;
    private javax.swing.JMenuItem Foreground_Color;
    private javax.swing.JMenu Format_Menu;
    private javax.swing.JMenu Info_Menu;
    private javax.swing.JMenu Options_Menu;
    private javax.swing.JMenuItem Redo;
    private javax.swing.JMenuItem SansSerif;
    private javax.swing.JMenuItem Statics;
    private javax.swing.JMenuItem StyleInfo;
    private javax.swing.JMenuItem TimesNewRoman;
    private javax.swing.JMenuItem Undo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBoxMenuItem menuDarkMode;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
