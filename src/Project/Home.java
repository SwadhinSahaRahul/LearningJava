package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Home extends JFrame implements ActionListener {

    JButton aboutHealthCare, mts, ultraSound, xRay, bioChemical, register, drugStore, lumberRoom, wards, other, exit;
    JLabel juHc, homePage, image;
    BackgroundContainer backgroundContainer;

    public Home() {

        backgroundContainer = new BackgroundContainer();
        backgroundContainer.setLayout(null);
        add(backgroundContainer);
        //setLayout(null);
        setTitle("Home Page");
        setResizable(false);

        setBounds(200, 10, 1020, 725);
        //setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(1020, 725));
        //panel.setBackground(Color.green);

        juHc = new JLabel("JU Medical Center");
        juHc.setFont(new Font("arial", Font.BOLD, 45));
        juHc.setForeground(Color.gray);
        juHc.setHorizontalAlignment(SwingConstants.CENTER);
        juHc.setBounds(120, 20, 780, 70);
        //panel.add(juHc);
        backgroundContainer.add(juHc);

        homePage = new JLabel("Home Page");
        homePage.setFont(new Font("Arial Narrow", Font.BOLD, 35));
        homePage.setForeground(Color.red);
        homePage.setHorizontalAlignment(SwingConstants.CENTER);
        homePage.setBounds(400, 100, 250, 50);
        backgroundContainer.add(homePage);
        //panel.add(homePage);

        image = new JLabel("");
        image.setFont(new Font("arial narrow", Font.BOLD, 35));
        image.setForeground(Color.BLUE);
        image.setHorizontalAlignment(SwingConstants.CENTER);
        image.setIcon(new ImageIcon("/resources/4.jpg"));
        image.setBounds(150, 170, 900, 500);
        backgroundContainer.add(image);
        //panel.add(image);

        //setContentPane(new JLabel(new ImageIcon("C:\\Users\\PC\\workspace\\4.jpg")));


        /*aboutHealthCare = new JButton("About");
        aboutHealthCare.setFont(new Font("Arail Narrow", Font.ITALIC, 22));
        aboutHealthCare.setBackground(Color.gray);
        aboutHealthCare.setForeground(Color.green);
        aboutHealthCare.setBounds(20, 190, 170, 40);
        aboutHealthCare.setMnemonic(KeyEvent.VK_A);
        aboutHealthCare.setToolTipText("Press it to know about JU medical center");
        aboutHealthCare.addActionListener(this);
        backgroundContainer.add(aboutHealthCare);*/
        //panel.add(aboutHealthCare);

        mts = new JButton("Case Records");
        mts.setFont(new Font("arail", Font.ITALIC, 20));
        mts.setBounds(20, 440, 170, 40);
        mts.setBackground(Color.gray);
        mts.setForeground(Color.green);
        mts.setMnemonic(KeyEvent.VK_R);
        mts.setToolTipText("press it to know about the service");
        mts.addActionListener(this);
        backgroundContainer.add(mts);
        //panel.add(mts);


        register = new JButton("Registration");
        register.setBackground(Color.gray);
        register.setFont(new Font("arail narrow", Font.ITALIC, 22));
        register.setForeground(Color.green);
        register.setBounds(20, 280, 170, 40);
        register.setMnemonic(KeyEvent.VK_O);
        register.addActionListener(this);
        backgroundContainer.add(register);

        drugStore = new JButton("Drug Store");
        drugStore.setBackground(Color.gray);
        drugStore.setFont(new Font("arail narrow", Font.ITALIC, 22));
        drugStore.setForeground(Color.green);
        drugStore.setMnemonic(KeyEvent.VK_S);
        drugStore.setBounds(20, 360, 170, 40);
        drugStore.addActionListener(this);
        backgroundContainer.add(drugStore);


        other = new JButton("Services");
        other.setBackground(Color.gray);
        other.setFont(new Font("arail narrow", Font.ITALIC, 20));
        other.setForeground(Color.green);
        other.setMnemonic(KeyEvent.VK_E);
        other.setBounds(20, 520, 170, 40);
        other.addActionListener(this);
        backgroundContainer.add(other);

        exit = new JButton("Exit");
        exit.setBackground(Color.gray);
        exit.setFont(new Font("arail narrow", Font.ITALIC, 22));
        exit.setForeground(Color.green);
        exit.setMnemonic(KeyEvent.VK_E);
        exit.setBounds(20, 600, 170, 40);
        exit.addActionListener(this);
        exit.setToolTipText("Press it to exit");
        backgroundContainer.add(exit);
        setVisible(true);
    }

    public static void main(String[] args) {
        Home home = new Home();
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        // TODO Auto-generated method stub
        if (event.getActionCommand().equals("Exit")) {
            dispose();
        } /*else if (event.getActionCommand().equals("About")) {

            KuetHome home = new KuetHome(this);
        }*/ else if (event.getActionCommand().equals("Registration")) {

            RegisterHome registerHome = new RegisterHome();

        } else if (event.getActionCommand().equals("Case Records")) {

            CaseRecord caseRecord = new CaseRecord();

        } else if (event.getActionCommand().equals("Drug Store")) {

            DrugStore dg = new DrugStore();

        } else if (event.getActionCommand().equals("Services")) {
            Services services = new Services();

        }

    }

    class BackgroundContainer extends JPanel {

        private final Image image;

        public BackgroundContainer() {
            image = (new ImageIcon(Home.class.getResource("/resources/image2.jpg"))).getImage();
        }

        @Override
        protected void paintComponent(Graphics arg0) {
            // TODO Auto-generated method stub
            super.paintComponent(arg0);
            arg0.drawImage(image, 0, 0, getSize().width, getSize().height, this);
        }
    }
}