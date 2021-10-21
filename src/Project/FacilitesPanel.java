package Project;

import javax.swing.*;
import java.awt.*;

public class FacilitesPanel extends JPanel {

    JLabel label;
    Image image = (new ImageIcon(ProjectMembers.class.getResource("/resources/pic2.jpg"))).getImage();


    public FacilitesPanel() {

    }

    @Override
    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);
        g.drawImage(image, 0, 0, getSize().width, getSize().height, this);
    }
}
