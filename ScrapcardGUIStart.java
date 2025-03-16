package GroupProject;

//importing the GUI elements
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

//starting page
public class ScrapcardGUIStart implements ActionListener{

    //declaring the elements I need
    private static JFrame startFrame;
    private static JPanel startPanel;

    private JLabel projectName;
    private static JButton startButton;

    //this is for the image, temporarily, graphical, element
    private static JLabel showTitle;
    private static ImageIcon titlePic;
    private static JLabel showButton;
    private static ImageIcon buttonPic;
    
    //this is for adding the music
    public static File file;
	public static AudioInputStream wakeUp;
	public static Clip newClip;

    //this is the constructor for the first window
    ScrapcardGUIStart()
    {
        startFrame = new JFrame();
        startPanel = new JPanel();

        //customizing the frame
        //https://photokit.com/colors/color-picker/
        //Fixed size
        startFrame.setLayout(null);
        startFrame.setSize(1100,700);
        startFrame.setResizable(false);
        startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startFrame.setLocationRelativeTo(null);
        startFrame.setTitle("Welcome to Scrap Cards!");

        
        //calls method for the sound, with error catching
        //closes the music if the window is closed
        try {
            CreateMakeSound();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }

        startFrame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                newClip.stop();
            }
        });
        
        //customizing the panel and putting it on the frame
        startPanel.setLayout(null);
        startPanel.setSize(1100,700);
        startPanel.setBackground(new Color(239,206,239));
        startFrame.add(startPanel);

        //putting image on the frame, rescaled
        titlePic = new ImageIcon("C:\\Users\\chentx06\\IdeaProjects\\ImageTry\\src\\436685518_804013261398171_7459875754986143550_n.png");
        Image image = titlePic.getImage();
        Image newimg = image.getScaledInstance(850,600,java.awt.Image.SCALE_SMOOTH);
        titlePic = new ImageIcon(newimg);
        projectName = new JLabel(titlePic);
        projectName.setBounds(180,-50,800,600);
        startPanel.add(projectName);
		
        
        //3 choices to put image on button:
        //put image on label, then put button on image and make it invisible or
        //image, placed in same location as button
        //button.seticon works as well
        
        //creating the button picture
        buttonPic = new ImageIcon("C:\\Users\\chentx06\\IdeaProjects\\ImageTry\\src\\442461735_361351543627975_8346379528111505647_n.png");
        Image image2 = buttonPic.getImage();
        Image newing2 = image2.getScaledInstance(500,450,java.awt.Image.SCALE_SMOOTH);
        buttonPic = new ImageIcon(newing2);
        showButton = new JLabel(buttonPic);
        showButton.setBounds(310,300,500,450);
        startPanel.add(showButton);

        //creating and adding the button on the picture
        startButton = new JButton();
        startButton.setBounds(425,440,250,120);
        //startButton.setBorder(new RoundedBorder(20));
        //startButton.setText("Start");
        //startButton.setForeground(new Color(Color.OPAQUE));S
        //startButton.setBackground(new Color(239,206,239));
        startButton.setFont(new Font("Sefif",Font.BOLD,60));
        startPanel.add(startButton);
        startButton.addActionListener(this);

        //make button invisible
        startButton.setOpaque(false);
        startButton.setContentAreaFilled(false);
        //***THIS IS IMPORTANT FOR SEEING WHERE BORDER IS
        startButton.setBorderPainted(false);

        //frame visible
        startFrame.setVisible(true);
        
        
    }//end of page constructor


    //linking start button to the menu
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == startButton) {

          ScrapcardGUIMenu menuNow = new ScrapcardGUIMenu();
            startFrame.setVisible(false);
        }
    }
    
    //constructor for playing looping music, when called, plays music
	public void CreateMakeSound() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
			
			file = new File("C:\\\\Users\\\\chentx06\\\\IdeaProjects\\\\FileIO\\\\src\\\\Sakura-Girl-Wake-Up-chosic.com_.wav");
			wakeUp = AudioSystem.getAudioInputStream(file);
			newClip = AudioSystem.getClip();
			
			newClip.open(wakeUp);
			newClip.loop(Clip.LOOP_CONTINUOUSLY);
			newClip.start();
	}

}

