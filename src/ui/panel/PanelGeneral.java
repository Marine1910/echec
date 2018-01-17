/*
 * Created by JFormDesigner on Wed Jan 17 12:03:06 CET 2018
 */

package ui.panel;

import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Marine CHAUVET
 */
public class PanelGeneral extends JPanel {
    public PanelGeneral() {
        initComponents();
    }

    private void initComponents() {
        //======== this ========

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGap(0, 300, Short.MAX_VALUE)
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
}
