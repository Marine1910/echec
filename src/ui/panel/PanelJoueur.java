/*
 * Created by JFormDesigner on Wed Jan 17 12:30:50 CET 2018
 */

package ui.panel;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;

/**
 * @author Greg Daure
 */
public class PanelJoueur extends JPanel {
    public PanelJoueur() {
        initComponents();
    }

    private void btn_lancer_partieActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        txt_joueur1 = new JLabel();
        txt_joueur2 = new JLabel();
        txf_joueur1 = new JTextField();
        txf_joueur2 = new JTextField();
        btn_lancer_partie = new JButton();

        //======== this ========

        //---- txt_joueur1 ----
        txt_joueur1.setText("Nom joueur 1 ");

        //---- txt_joueur2 ----
        txt_joueur2.setText("Nom joueur 2");

        //---- btn_lancer_partie ----
        btn_lancer_partie.setText("Commencer une partie ");
        btn_lancer_partie.addActionListener(e -> btn_lancer_partieActionPerformed(e));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(txf_joueur2, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_joueur2)
                        .addComponent(txt_joueur1)
                        .addComponent(txf_joueur1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_lancer_partie, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(152, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(69, 69, 69)
                    .addComponent(txt_joueur1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txf_joueur1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(txt_joueur2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txf_joueur2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btn_lancer_partie, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(39, Short.MAX_VALUE))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    private JLabel txt_joueur1;
    private JLabel txt_joueur2;
    private JTextField txf_joueur1;
    private JTextField txf_joueur2;
    private JButton btn_lancer_partie;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
