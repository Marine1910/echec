/*
 * Created by JFormDesigner on Wed Jan 17 12:30:38 CET 2018
 */

package ui.panel;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Greg Daure
 */
public class PanelMenu extends JPanel {
    public PanelMenu() {
        initComponents();
    }

    private void btnJouerActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        btnJouer = new JButton();
        titre = new JLabel();

        //======== this ========

        //---- btnJouer ----
        btnJouer.setText("Jouer !");
        btnJouer.addActionListener(e -> btnJouerActionPerformed(e));

        //---- titre ----
        titre.setText("JEU D'ECHEC");

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(157, Short.MAX_VALUE)
                    .addComponent(titre)
                    .addContainerGap(158, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(134, 134, 134)
                    .addComponent(btnJouer, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(94, Short.MAX_VALUE)
                    .addComponent(titre)
                    .addGap(46, 46, 46)
                    .addComponent(btnJouer, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
                    .addGap(77, 77, 77))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    private JButton btnJouer;
    private JLabel titre;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
