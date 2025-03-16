package GroupProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//choosing deck page
public class ScrapcardGUIMenu extends JFrame implements ActionListener {
    
	//declaring variables associated with deck logic
	public static int frameNum;
    static int addButtonStay1;
    static int addButtonStay2;
    static int addButtonStay3;
    boolean deckCreated1 = false;
    boolean deckCreated2 = false;
    boolean deckCreated3 = false;
    
    //declaring all elements to the GUI
    static JFrame frame;
    JPanel panel;
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JPanel panel4;
    JPanel panel5;
    JPanel panelStart1;
    JPanel panelStart2;
    JPanel panelStart3;
    JPanel panelAdd1;
    JPanel panelAdd2;
    JPanel panelAdd3;
    JLabel label;
    JLabel showPanel;
    JLabel showPanel1;
    JLabel showPanel2;
    JButton delete1;
    JButton delete2;
    JButton delete3;
    JButton edit1;
    JButton edit2;
    JButton edit3;
    JButton start1;
    JButton start2;
    JButton start3;
    JButton buttonAdd1;
    JButton buttonAdd2;
    JButton buttonAdd3;


    //beginning of page constructor
    public ScrapcardGUIMenu()
    {
    	//initializing addButtonStay var
        addButtonStay1 = 0;
        addButtonStay2 = 0;
        addButtonStay3 = 0;
        //Display Panel
        panel = new JPanel();
        frame = new JFrame();

        
        panel.setBounds(50,100,300,450);
        ImageIcon iconPanel = new ImageIcon("C:\\Users\\chentx06\\IdeaProjects\\FileIO\\src\\442461740_460994936434820_8578355825170675507_n (1).png");
        Image panelImage = iconPanel.getImage();
        Image imagePanelS = panelImage.getScaledInstance(300, 450, java.awt.Image.SCALE_SMOOTH);
        iconPanel = new ImageIcon(imagePanelS);
        showPanel = new JLabel(iconPanel);
        showPanel.setOpaque(true);
        showPanel.setBounds(0, 0, 300, 450);
        panel.add(showPanel);
       
        // showPanel.setVisible(true);
       /* label = new JLabel();
        label.setLayout(null);
        label.setForeground(Color.YELLOW);
        // label.setText(toString());
         * panel.add(label);*/


        //Event Panel/User
        panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(400,100,300,450);
        
        
        //adding images 
        ImageIcon iconPanel1 = new ImageIcon("C:\\Users\\chentx06\\IdeaProjects\\FileIO\\src\\442461740_460994936434820_8578355825170675507_n (1).png");
        Image panel1Image = iconPanel1.getImage();
        Image imagePanel1S = panel1Image.getScaledInstance(300, 450, java.awt.Image.SCALE_SMOOTH);
        iconPanel1 = new ImageIcon(imagePanel1S);
        JLabel showPanel1 = new JLabel(iconPanel1);
        showPanel1.setBounds(0, 0, 300, 450);
        panel1.add(showPanel1);

        panel2 = new JPanel();
        panel2.setBounds(750,100,300,450);
        ImageIcon iconPanel2 = new ImageIcon("C:\\Users\\chentx06\\IdeaProjects\\FileIO\\src\\442461740_460994936434820_8578355825170675507_n (1).png");
        Image panel2Image = iconPanel2.getImage();
        Image imagePanel2S = panel2Image.getScaledInstance(300, 450, java.awt.Image.SCALE_SMOOTH);
        iconPanel2 = new ImageIcon(imagePanel2S);
        JLabel showPanel2 = new JLabel(iconPanel2);
        showPanel2.setBounds(0, 0, 300, 450);
        panel2.add(showPanel2); 
       
        
        //creating panel for delete & edit buttons
        panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setBounds(150,25,100,60);

        panel4 = new JPanel();
        panel4.setLayout(null);
        panel4.setBounds(500,25,100,60);


        panel5 = new JPanel();
        panel5.setLayout(null);
        panel5.setBounds(850,25,100,60);
        
        
        //panels for start buttons
        panelStart1 = new JPanel();
        panelStart1.setLayout(null);
        panelStart1.setBounds(150,575,100,60);

        panelStart2 = new JPanel();
        panelStart2.setLayout(null);
        panelStart2.setBounds(500,575,100,60);


        panelStart3 = new JPanel();
        panelStart3.setLayout(null);
        panelStart3.setBounds(850,575,100,60);
        
        //panels for add buttons
        panelAdd1 = new JPanel();
        panelAdd1.setLayout(null);
        panelAdd1.setBounds(150,300,100,60);

        panelAdd2 = new JPanel();
        panelAdd2.setLayout(null);
        panelAdd2.setBounds(500,300,100,60);

        panelAdd3 = new JPanel();
        panelAdd3.setLayout(null);
        panelAdd3.setBounds(850,300,100,60);

        
        //creating start buttons and adding images on
        start1 = new JButton();
        start1.setBounds(0,0,100,60);
        start1.setText("START");
        start1.addActionListener(this);
        start1.setContentAreaFilled(false);
        start1.setBorderPainted(false);
        start1.setOpaque(false);

       ImageIcon iconStart1 = new ImageIcon("C:\\Users\\chentx06\\IdeaProjects\\FileIO\\src\\startButton.png");
       Image imageStart1 = iconStart1.getImage();
       Image imageStart1S = imageStart1.getScaledInstance(100, 60, java.awt.Image.SCALE_SMOOTH);
       iconStart1 = new ImageIcon(imageStart1S);
       JLabel showStartButton1 = new JLabel(iconStart1);
       showStartButton1.setBounds(0, 0, 100, 60);
       panelStart1.add(showStartButton1);

        start2 = new JButton();
        start2.setBounds(0,0,100,60);
        start2.setText("START");
        start2.addActionListener(this);
        start2.setContentAreaFilled(false);
        start2.setBorderPainted(false);
        start2.setOpaque(false);

       ImageIcon iconStart2 = new ImageIcon("C:\\Users\\chentx06\\IdeaProjects\\FileIO\\src\\startButton.png");
       Image imageStart2 = iconStart2.getImage();
       Image imageStart2S = imageStart2.getScaledInstance(100, 60, java.awt.Image.SCALE_SMOOTH);
       iconStart2 = new ImageIcon(imageStart2S);
       JLabel showStartButton2 = new JLabel(iconStart2);
       showStartButton2.setBounds(0, 0, 100, 60);
       panelStart2.add(showStartButton2);

        start3 = new JButton();
        start3.setBounds(0,0,100,60);
        start3.setText("START");
        start3.addActionListener(this);
        start3.setContentAreaFilled(false);
        start3.setBorderPainted(false);
        start3.setOpaque(false);

       ImageIcon iconStart3 = new ImageIcon("C:\\Users\\chentx06\\IdeaProjects\\FileIO\\src\\startButton.png");
       Image imageStart3 = iconStart3.getImage();
       Image imageStart3S = imageStart3.getScaledInstance(100, 60, java.awt.Image.SCALE_SMOOTH);
       iconStart3 = new ImageIcon(imageStart3S);
       JLabel showStartButton3 = new JLabel(iconStart3);
       showStartButton3.setBounds(0, 0, 100, 60);
       panelStart3.add(showStartButton3);


        //delete buttons
        ImageIcon deleteIcon1 = new ImageIcon("C:\\Users\\chentx06\\IdeaProjects\\FileIO\\src\\deleteButton.png");
        Image image1 = deleteIcon1.getImage();
        Image imageDelete1 = image1.getScaledInstance(50,60, java.awt.Image.SCALE_SMOOTH);
        deleteIcon1 = new ImageIcon(imageDelete1);
        JLabel showButton = new JLabel(deleteIcon1);
        showButton.setBounds(50,0,50,60);
        panel3.add(showButton);


        //creating delete button and adding the images
        delete1 = new JButton();
        delete1.setBounds(50,0,50,60);
        delete1.setText("D");
        delete1.addActionListener(this);
        delete1.setContentAreaFilled(false);
        delete1.setBorderPainted(false);
        delete1.setOpaque(false);

        ImageIcon deleteIcon2 = new ImageIcon("C:\\Users\\chentx06\\IdeaProjects\\FileIO\\src\\deleteButton.png");
        Image image2 = deleteIcon2.getImage();
        Image imageDelete2 = image1.getScaledInstance(50,60, java.awt.Image.SCALE_SMOOTH);
        deleteIcon2 = new ImageIcon(imageDelete2);
        JLabel showButton2 = new JLabel(deleteIcon2);
        showButton2.setBounds(50,0,50,60);
        panel4.add(showButton2);
        
        delete2 = new JButton();
        delete2.setBounds(50,0,50,60);
        delete2.setText("D");
        delete2.addActionListener(this);
        delete2.setContentAreaFilled(false);
        delete2.setBorderPainted(false);
        delete2.setOpaque(false);

        ImageIcon deleteIcon3 = new ImageIcon("C:\\Users\\chentx06\\IdeaProjects\\FileIO\\src\\deleteButton.png");
        Image image3 = deleteIcon3.getImage();
        Image imageDelete3 = image1.getScaledInstance(50,60, java.awt.Image.SCALE_SMOOTH);
        deleteIcon3 = new ImageIcon(imageDelete3);
        JLabel showButton3 = new JLabel(deleteIcon3);
        showButton3.setBounds(50,0,50,60);
        panel5.add(showButton3);

        delete3 = new JButton();
        delete3.setBounds(50,0,50,60);
        delete3.setText("D");
        delete3.addActionListener(this);
        delete3.setContentAreaFilled(false);
        delete3.setBorderPainted(false);
        delete3.setOpaque(false);
        
        //creating edit buttons and adding images on
        ImageIcon iconEdit = new ImageIcon("C:\\Users\\chentx06\\IdeaProjects\\FileIO\\src\\addButton.png");
        Image imageEdit = iconEdit.getImage();
        Image imageEditS = imageEdit.getScaledInstance(50, 60, java.awt.Image.SCALE_SMOOTH);
        iconEdit = new ImageIcon(imageEditS);
        JLabel showEditButton = new JLabel(iconEdit);
        showEditButton.setBounds(0, 0, 50, 60);
        panel3.add(showEditButton);
        
        edit1 = new JButton();
        edit1.setBounds(0,0,50,60);
        edit1.setText("E");
        edit1.addActionListener(this);
        edit1.setContentAreaFilled(false);
        edit1.setBorderPainted(false);
        edit1.setOpaque(false);
        
        buttonAdd1 = new JButton();
        buttonAdd1.setBounds(0,0,100,60);
        buttonAdd1.setText("+");
        buttonAdd1.addActionListener(this);
        buttonAdd1.setContentAreaFilled(false);
        buttonAdd1.setBorderPainted(false);
        if (addButtonStay1 == 1){
            edit1.setOpaque(false);
        }

        ImageIcon iconEdit2 = new ImageIcon("C:\\Users\\chentx06\\IdeaProjects\\FileIO\\src\\addButton.png");
        Image imageEdit2 = iconEdit2.getImage();
        Image imageEdit2S = imageEdit2.getScaledInstance(50, 60, java.awt.Image.SCALE_SMOOTH);
        iconEdit2 = new ImageIcon(imageEdit2S);
        JLabel showEditButton2 = new JLabel(iconEdit2);
        showEditButton2.setBounds(0, 0, 50, 60);
        panel4.add(showEditButton2);

        edit2 = new JButton();
        edit2.setBounds(0,0,50,60);
        edit2.setText("E");
        edit2.addActionListener(this);
        edit2.setContentAreaFilled(false);
        edit2.setBorderPainted(false);
        edit2.setOpaque(false);
        buttonAdd2 = new JButton();
        buttonAdd2.setBounds(0,0,100,60);
        buttonAdd2.setText("+");
        buttonAdd2.addActionListener(this);
        buttonAdd2.setContentAreaFilled(false);
        buttonAdd2.setBorderPainted(false);
        if (addButtonStay2 == 1){
            edit2.setOpaque(false);
        }

        ImageIcon iconEdit3 = new ImageIcon("C:\\Users\\chentx06\\IdeaProjects\\FileIO\\src\\addButton.png");
        Image imageEdit3 = iconEdit3.getImage();
        Image imageEdit3S = imageEdit3.getScaledInstance(50, 60, java.awt.Image.SCALE_SMOOTH);
        iconEdit3 = new ImageIcon(imageEdit3S);
        JLabel showEditButton3 = new JLabel(iconEdit3);
        showEditButton3.setBounds(0, 0, 50, 60);
        panel5.add(showEditButton3);
        edit3 = new JButton();
        edit3.setBounds(0,0,50,60);
        edit3.setText("E");
        edit3.addActionListener(this);
        edit3.setContentAreaFilled(false);
        edit3.setBorderPainted(false);
        edit3.setOpaque(false);
        buttonAdd3 = new JButton();
        buttonAdd3.setBounds(0,0,100,60);
        buttonAdd3.setText("+");
        buttonAdd3.addActionListener(this);
        buttonAdd3.setContentAreaFilled(false);
        buttonAdd3.setBorderPainted(false);
        if (addButtonStay3 == 1){
            edit3.setOpaque(false);
        }

        //Adding buttons on the panels and panels on frames
        panel3.add(delete1);
        panel4.add(delete2);
        panel5.add(delete3);

        panel3.add(edit1);
        panel4.add(edit2);
        panel5.add(edit3);
        panelStart1.add(start1);
        panelStart2.add(start2);
        panelStart3.add(start3);
        panelAdd1.add(buttonAdd1);
        panelAdd2.add(buttonAdd2);
        panelAdd3.add(buttonAdd3);

        frame.setLayout(null);
        frame.setSize(1100,700);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Welcome to Scrap Cards!");

        frame.setVisible(true);
        frame.add(panel);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel5);
        frame.add(panelStart1);
        frame.add(panelStart2);
        frame.add(panelStart3);
        frame.add(panelAdd1);
        frame.add(panelAdd2);
        frame.add(panelAdd3);

        //setting panel as so adding button works
        panel.setVisible(false);
        panel1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(false);
        panelStart1.setVisible(false);
        panelStart2.setVisible(false);
        panelStart3.setVisible(false);

    }//end of page constructor

    //if this buttons is clicked,
    public void actionPerformed(ActionEvent actionEvent)
    {
    	//if add button is clicked, show the corresponding deck
        if (actionEvent.getSource() == buttonAdd1){
            panel.setVisible(true);
            panel3.setVisible(true);
            panelAdd1.setVisible(false);
            panelStart1.setVisible(true);
            addButtonStay1 =1;
        }

        if (actionEvent.getSource() == buttonAdd2){
            panel4.setVisible(true);
            panel1.setVisible(true);
            panelAdd2.setVisible(false);
            panelStart2.setVisible(true);
            addButtonStay2 =1;
        }

        if (actionEvent.getSource() == buttonAdd3){
            panel5.setVisible(true);
            panel2.setVisible(true);
            panelAdd3.setVisible(false);
            panelStart3.setVisible(true);
            addButtonStay3 =1;
        }
        
        //if the delete button is clicked, hide the corresponding deck
        if (actionEvent.getSource() == delete1){
            panel.setVisible(false);
            panel3.setVisible(false);
            panelStart1.setVisible(false);
            panelAdd1.setVisible(true);
            deckCreated1 = false;

            addButtonStay1 = 0;
        }

        if (actionEvent.getSource() == delete2){
            panel1.setVisible(false);
            panel4.setVisible(false);
            panelStart2.setVisible(false);
            panelAdd2.setVisible(true);
            addButtonStay2 = 0;
            deckCreated2=false;

        }
        if (actionEvent.getSource() == delete3){
            panel2.setVisible(false);
            panel5.setVisible(false);
            panelStart3.setVisible(false);
            panelAdd3.setVisible(true);
            deckCreated3 = false;
            addButtonStay3 = 0;
        }
        
        //if the start button is clicked, go to the right deck to play
        if (actionEvent.getSource() == start1){
            if(deckCreated1==true)
            {
                frame.setVisible(false);
                ScrapcardGUIMain.mainFrame.setVisible(true);
                frameNum=1;
            }
            else {
                frameNum = 1;
                ScrapcardGUIMain a = new ScrapcardGUIMain();
                frame.setVisible(false);
                //deckCreated1=true;
            }
            
        }

        if (actionEvent.getSource() == start2){
            if(deckCreated2==true)
            {
                frame.setVisible(false);
                ScrapcardGUIMain.mainFrame.setVisible(true);
                frameNum=2;
            }
            else {
                frameNum = 2;
                ScrapcardGUIMain b = new ScrapcardGUIMain();
                frame.setVisible(false);
            }
        }

        if (actionEvent.getSource() == start3){
            if(deckCreated3==true)
            {
                frame.setVisible(false);
                ScrapcardGUIMain.mainFrame.setVisible(true);
                frameNum=3;
            }
            else {
                frameNum = 3;
                ScrapcardGUIMain c = new ScrapcardGUIMain();
                frame.setVisible(false);
                //deckCreated1=true;
            }

        }
        
        //if the edit button is clicked, the file to save to is indicated and we go to the frame
        if (actionEvent.getSource() == edit1){
            if(deckCreated1==true)
            {
                frame.setVisible(false);
                EditDeckGUI.edit.setVisible(true);
                frameNum=1;
            }
            else {
                frameNum = 1;
                EditDeckGUI deck1 = new EditDeckGUI();
                frame.setVisible(false);
            }
        }

        if (actionEvent.getSource() == edit2){
            if(deckCreated2==true)
            {
                frame.setVisible(false);
                EditDeckGUI.edit.setVisible(true);
                frameNum=2;
            }
            else {
                EditDeckGUI deck2 = new EditDeckGUI();
                frame.setVisible(false);
                deckCreated2=true;
                frameNum = 2;
            }
        }

        if (actionEvent.getSource() == edit3){
            //create sally object here
            if(deckCreated3==true)
            {
                frame.setVisible(false);
                EditDeckGUI.edit.setVisible(true);
                frameNum=2;
            }
            else {
                EditDeckGUI deck3 = new EditDeckGUI();
                frame.setVisible(false);
                deckCreated2=true;
                frameNum = 3;
            }
        }

    }


}
