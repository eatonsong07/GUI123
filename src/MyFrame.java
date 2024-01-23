import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
public class MyFrame extends JFrame implements ActionListener {
    private JButton play;
    private boolean ifNext;
    private JPanel first = new JPanel();;
    private JLabel secondLabel;
    private JPanel second;
    private JButton next = new JButton();
    private ImageIcon secondImage;
    private JLabel firstLabel=new JLabel();
    MyFrame(){
        setLayout(null);


        //start button
        ImageIcon start=new ImageIcon("src/start.png"); //start button
        ImageIcon firstImage=new ImageIcon("src/first.png"); //first panel image
        secondImage=new ImageIcon("src/instructions.png"); //second panel image background
        ImageIcon nextImage=new ImageIcon("src/next.png"); //second next image

        Image image = firstImage.getImage(); // transform it
        Image newing = image.getScaledInstance(1920, 1080,  java.awt.Image.SCALE_SMOOTH);
        firstImage =new ImageIcon(newing);

        Image image1 = secondImage.getImage(); // transform it
        Image newing1 = image1.getScaledInstance(1920, 1080,  java.awt.Image.SCALE_SMOOTH);
        secondImage =new ImageIcon(newing1);



        JButton play=new JButton();
        play.setBounds(525,670, 920,363);
        play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == play) {
                    System.out.println("Hey");
                    secondLabel();
                    secondPanel();
                    play.setEnabled(false);
                    ifNext=true;

                    //button.setEnabled("false); makes it so the button could only be used once
                    //label.setVisible(true); could make a label appear true;
                }
            }

        } );
        play.setFocusable(false);
        play.setIcon(start);
        play.setBorder(BorderFactory.createEtchedBorder());
        play.setVisible(true);


        //first jlabel for background of first jpanel

        firstLabel.setIcon(firstImage);
        firstLabel.setBounds(0,0,1920,1080);
        firstLabel.setVisible(true);
        firstLabel.setLayout(null);
        firstLabel.add(play);




        //next jbutton
        next=new JButton();
        next.setIcon(nextImage);
        next.setBounds(1100,800, 1300,200);
        next.addActionListener(e->dispose());

        //second jlabel for second jpanel




        //first jpanel

        first.setBounds(0,0,1920,1080); //sets the size
        first.setVisible(true);
        first.add(firstLabel);


        //second Jpanel



        this.add(first);



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(1920,1080);
        this.setVisible(true);
        this.show();


    }
    public void secondPanel()
    {
        second = new JPanel();
        second.setBounds(0,0,1920,1080);
        second.add(secondLabel); //use the label as a background
        second.setVisible(true);
        this.add(second);
        first.setVisible(false);

    }
    public void secondLabel()
    {
        secondLabel=new JLabel();
        secondLabel.setIcon(secondImage);
        secondLabel.setBounds(0,0,1920,1080);
        secondLabel.setLayout(null);
        secondLabel.add(next);
        firstLabel.setVisible(false);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == play) {
            System.out.println("Hey");
            secondLabel();
            secondPanel();
            play.setEnabled(false);
            ifNext=true;

            //button.setEnabled("false); makes it so the button could only be used once
            //label.setVisible(true); could make a label appear true;
        }

    }

}

