package GroupProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class EditDeckGUI implements ActionListener
{
    public static int cardNumber = 0;
    public static int cardNumber2 = 0;
    public static int cardNumber3 = 0;
    
    //arrays for easy access and storing
    public static String[] questionStored1=new String[12];
    static String[] answerStored1=new String[12];

    public static String[] questionStored2=new String[12];
    static String[] answerStored2=new String[12];

    public static String[] questionStored3=new String[12];
    static String[] answerStored3=new String[12];


    static String nameStored;
    static String deckTypeStored;
    static JFrame edit;

    static JLabel questionLabel;
    static JLabel answerLabel = new JLabel();;
    JPanel buttonPanel;
    JPanel titlePanel;
    JPanel displayPanel;

        //panel on display Panel
        JPanel questionDisplay;
        static JPanel qDisplay;
        JPanel answerDisplay;
        static JPanel aDisplay;

    //Button under title Panel
    JButton cardNumBefore;
    JButton deckNumAfter;
    JButton backToDeck;

    //Button under buttonPanel
    JButton editQuestionButton;
    JButton editAnswerButton;
    JButton editDeckInfoButton;

    //Button under displayPanel

    //JTextField
    JTextField questionInput;
    JTextField answerInput;

    //image
    ImageIcon deleteButtonImage;
    JLabel deleteButtonLabel;
    JLabel deleteButtonLabel2;

    public EditDeckGUI()
    {
        //Images
        deleteButtonImage = new ImageIcon("s4kjv1nd.png");
        Image image = deleteButtonImage.getImage();
        Image newimg = image.getScaledInstance(50,50,java.awt.Image.SCALE_SMOOTH);
        deleteButtonImage = new ImageIcon(newimg);
        //labels that uses this image
        deleteButtonLabel = new JLabel(deleteButtonImage);
        deleteButtonLabel2 = new JLabel(deleteButtonImage);

        //Create JPanel
        titlePanel = new JPanel();
        titlePanel.setLayout(null);
        titlePanel.setBounds(0,0,1100,200);
        Color blue = new Color(0xFF6481BE, true);
        titlePanel.setBackground(blue);

        buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        buttonPanel.setBounds(0,200,450,500);
        Color darkRed = new Color(0xFFAF629D, true);
        buttonPanel.setBackground(darkRed);


        displayPanel = new JPanel();
        displayPanel.setLayout(null);
        displayPanel.setBounds(450,200,650,500);
        displayPanel.setBackground(Color.WHITE);

        //panel on displayPanel
        questionDisplay = new JPanel();
        questionDisplay.setLayout(null);
        questionDisplay.setBounds(155,40,370,150);
        Color pinkShade = new Color(0xFFD2A9C2, true);
        questionDisplay.setBackground(pinkShade);
        displayPanel.add(questionDisplay);




        answerDisplay = new JPanel();
        answerDisplay.setLayout(null);
        answerDisplay.setBounds(155,250,370,150);
        answerDisplay.setBackground(pinkShade);
        displayPanel.add(answerDisplay);




        //Q letter print
        qDisplay = new JPanel();
        qDisplay.setLayout(null);
        qDisplay.setBounds(20,40,120,150);
        Color redShade2 = new Color(0xFFF3A6E0, true);
        qDisplay.setBackground(redShade2);

        JLabel q = new JLabel(" Q");
        q.setForeground(Color.BLACK);
        q.setFont(new Font("Impact", Font.BOLD,  100));
        q.setBounds(20, 40, 80, 80);
        q.setVisible(true);

        qDisplay.add(q);
        displayPanel.add(qDisplay);

        //A letter print
        aDisplay = new JPanel();
        aDisplay.setLayout(null);
        aDisplay.setBounds(20,250,120,150);
        aDisplay.setBackground(redShade2);

        JLabel a = new JLabel("A");
        a.setForeground(Color.BLACK);
        a.setFont(new Font("Impact",Font.PLAIN, 145));
        a.setBounds(20, 40, 80, 80);
        a.setVisible(true);

        aDisplay.add(a);
        displayPanel.add(aDisplay);

        questionLabel = new JLabel("null");
        questionLabel.setBounds(0,0,370,150);
        questionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        questionLabel.setForeground(Color.WHITE);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 18));
        questionDisplay.add(questionLabel);


        answerLabel = new JLabel("null");
        answerLabel.setBounds(0,0,370,150);
        answerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        answerLabel.setForeground(Color.WHITE);
        answerLabel.setFont(new Font("Arial", Font.BOLD, 18));
        answerDisplay.add(answerLabel);

        //JButtons

        //JButton for Title Panel
        cardNumBefore = new JButton("BACK");
        cardNumBefore.setBounds(20,110,90,70);
        titlePanel.add(cardNumBefore);
        cardNumBefore.addActionListener(this);

        deckNumAfter = new JButton("NEXT");
        deckNumAfter.setBounds(120,110,90,70);
        titlePanel.add(deckNumAfter);
        deckNumAfter.addActionListener(this);

        backToDeck = new JButton("HOME");
        backToDeck.setBounds(1005,20,50,50);
        titlePanel.add(backToDeck);
        backToDeck.addActionListener(this);


        //JButton for Button Panel
        editQuestionButton = new JButton("EDIT QUESTION");
        editQuestionButton.setBounds(20,70,400,100);
        buttonPanel.add(editQuestionButton);
        editQuestionButton.addActionListener(this);

        editAnswerButton = new JButton("EDIT ANSWER");
        editAnswerButton.setBounds(20,270,400,100);
        buttonPanel.add(editAnswerButton);
        editAnswerButton.addActionListener(this);


        //Create JFrame
        edit = new JFrame();
        edit.setLayout(null);
        edit.setSize(new Dimension(1100, 700));
        edit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        edit.setLocationRelativeTo(null);
        edit.setResizable(false);
        edit.setVisible(true);

        edit.add(buttonPanel);
        edit.add(titlePanel);
        edit.add(displayPanel);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        if (actionEvent.getSource() == editQuestionButton)
        {
            JFrame questionFrame = new JFrame();
            questionFrame.setTitle("Please input your question:");
            questionFrame.setLayout(null);
            questionFrame.setLocation(450,250);
            questionFrame.setSize(new Dimension(350, 200));
            questionFrame.setResizable(false);
            questionFrame.setVisible(true);

            questionInput = new JTextField();
            questionInput.setBounds(30, 20, 200, 50);

            JButton newButton = new JButton("✔");
            newButton.setBounds(250, 20, 50, 50);
            questionFrame.add(newButton);
            questionFrame.add(questionInput);
            questionFrame.add(newButton);

            newButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    int cardN = 0;
                    if (ScrapcardGUIMenu.frameNum == 1) {
                        cardN = cardNumber;
                    }
                    if (ScrapcardGUIMenu.frameNum == 2) {
                        cardN = cardNumber2;
                    }
                    if (ScrapcardGUIMenu.frameNum == 3) {
                        cardN = cardNumber3;

                    }

                    if (ScrapcardGUIMenu.frameNum == 1)
                        switch (cardN) {
                            case 0 -> questionStored1[0] = questionInput.getText();
                            case 1 -> questionStored1[1] = questionInput.getText();
                            case 2 -> questionStored1[2] = questionInput.getText();
                            case 3 -> questionStored1[3] = questionInput.getText();
                            case 4 -> questionStored1[4] = questionInput.getText();
                            case 5 -> questionStored1[5] = questionInput.getText();
                            case 6 -> questionStored1[6] = questionInput.getText();
                            case 7 -> questionStored1[7] = questionInput.getText();
                            case 8 -> questionStored1[8] = questionInput.getText();
                            case 9 -> questionStored1[9] = questionInput.getText();
                            case 10 -> questionStored1[10] = questionInput.getText();
                            case 11 -> questionStored1[11] = questionInput.getText();
                        }
                    if (ScrapcardGUIMenu.frameNum == 2) {
                        switch (cardN) {
                            case 0 -> questionStored2[0] = questionInput.getText();
                            case 1 -> questionStored2[1] = questionInput.getText();
                            case 2 -> questionStored2[2] = questionInput.getText();
                            case 3 -> questionStored2[3] = questionInput.getText();
                            case 4 -> questionStored2[4] = questionInput.getText();
                            case 5 -> questionStored2[5] = questionInput.getText();
                            case 6 -> questionStored2[6] = questionInput.getText();
                            case 7 -> questionStored2[7] = questionInput.getText();
                            case 8 -> questionStored2[8] = questionInput.getText();
                            case 9 -> questionStored2[9] = questionInput.getText();
                            case 10 -> questionStored2[10] = questionInput.getText();
                            case 11 -> questionStored2[11] = questionInput.getText();
                        }
                    }
                    if (ScrapcardGUIMenu.frameNum == 3) {
                        switch (cardN) {
                            case 0 -> questionStored3[0] = questionInput.getText();
                            case 1 -> questionStored3[1] = questionInput.getText();
                            case 2 -> questionStored3[2] = questionInput.getText();
                            case 3 -> questionStored3[3] = questionInput.getText();
                            case 4 -> questionStored3[4] = questionInput.getText();
                            case 5 -> questionStored3[5] = questionInput.getText();
                            case 6 -> questionStored3[6] = questionInput.getText();
                            case 7 -> questionStored3[7] = questionInput.getText();
                            case 8 -> questionStored3[8] = questionInput.getText();
                            case 9 -> questionStored3[9] = questionInput.getText();
                            case 10 -> questionStored3[10] = questionInput.getText();
                            case 11 -> questionStored3[11] = questionInput.getText();
                        }
                    }
                    questionFrame.setVisible(false);
                }
            });
        }
        if (actionEvent.getSource() == editAnswerButton) {
            JFrame answerFrame = new JFrame();
            answerFrame.setTitle("Please input your answer:");
            answerFrame.setLayout(null);
            answerFrame.setLocation(450,250);
            answerFrame.setSize(new Dimension(350, 200));
            answerFrame.setResizable(false);
            answerFrame.setVisible(true);

            answerInput = new JTextField();
            answerInput.setBounds(30, 20, 200, 50);

            JButton newButton = new JButton("✔");
            newButton.setBounds(250, 20, 50, 50);
            answerFrame.add(newButton);
            answerFrame.add(answerInput);

            newButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    int cardN = 0;

                    if (ScrapcardGUIMenu.frameNum==1)
                    {
                        cardN = cardNumber;
                    }
                    if (ScrapcardGUIMenu.frameNum==2)
                    {
                        cardN = cardNumber2;
                    }
                    if (ScrapcardGUIMenu.frameNum==3)
                    {
                        cardN = cardNumber3;

                    }
                    if(ScrapcardGUIMenu.frameNum==1) {
                        switch (cardN) {
                            case 0 -> answerStored1[0] = answerInput.getText();
                            case 1 -> answerStored1[1] = answerInput.getText();
                            case 2 -> answerStored1[2] = answerInput.getText();
                            case 3 -> answerStored1[3] = answerInput.getText();
                            case 4 -> answerStored1[4] = answerInput.getText();
                            case 5 -> answerStored1[5] = answerInput.getText();
                            case 6 -> answerStored1[6] = answerInput.getText();
                            case 7 -> answerStored1[7] = answerInput.getText();
                            case 8 -> answerStored1[8] = answerInput.getText();
                            case 9 -> answerStored1[9] = answerInput.getText();
                            case 10 -> answerStored1[10] = answerInput.getText();
                            case 11 -> answerStored1[11] = answerInput.getText();
                        }
                    }
                    if(ScrapcardGUIMenu.frameNum==2) {
                        switch (cardN) {
                            case 0 -> answerStored2[0] = answerInput.getText();
                            case 1 -> answerStored2[1] = answerInput.getText();
                            case 2 -> answerStored2[2] = answerInput.getText();
                            case 3 -> answerStored2[3] = answerInput.getText();
                            case 4 -> answerStored2[4] = answerInput.getText();
                            case 5 -> answerStored2[5] = answerInput.getText();
                            case 6 -> answerStored2[6] = answerInput.getText();
                            case 7 -> answerStored2[7] = answerInput.getText();
                            case 8 -> answerStored2[8] = answerInput.getText();
                            case 9 -> answerStored2[9] = answerInput.getText();
                            case 10 -> answerStored2[10] = answerInput.getText();
                            case 11 -> answerStored2[11] = answerInput.getText();
                        }
                    }
                    if(ScrapcardGUIMenu.frameNum==3) {
                        switch (cardN) {
                            case 0 -> answerStored3[0] = answerInput.getText();
                            case 1 -> answerStored3[1] = answerInput.getText();
                            case 2 -> answerStored3[2] = answerInput.getText();
                            case 3 -> answerStored3[3] = answerInput.getText();
                            case 4 -> answerStored3[4] = answerInput.getText();
                            case 5 -> answerStored3[5] = answerInput.getText();
                            case 6 -> answerStored3[6] = answerInput.getText();
                            case 7 -> answerStored3[7] = answerInput.getText();
                            case 8 -> answerStored3[8] = answerInput.getText();
                            case 9 -> answerStored3[9] = answerInput.getText();
                            case 10 -> answerStored3[10] = answerInput.getText();
                            case 11 -> answerStored3[11] = answerInput.getText();
                        }
                    }
                    answerFrame.setVisible(false);
                }
            });
        }
        
        if(actionEvent.getSource()== cardNumBefore)
        {
            switch(ScrapcardGUIMenu.frameNum) {

                case 1 -> {
                    if(cardNumber>=0&&cardNumber<12)
                    {
                        if(cardNumber!=0) {
                            cardNumber--;
                        }

                    }
                }
                case 2 ->{
                    if(cardNumber2 >= 0 && cardNumber2 < 12) {
                        if (cardNumber2 != 0) {
                            cardNumber2--;
                        }

                        System.out.println(cardNumber2);
                    }
                }
                case 3 ->{
                    if(cardNumber3 >= 0 && cardNumber3 < 12) {
                        if (cardNumber3 != 0) {
                            cardNumber3--;
                        }

                        System.out.println(cardNumber3);
                    }
                }
            }

        }
        if(actionEvent.getSource()==deckNumAfter) {
            switch (ScrapcardGUIMenu.frameNum) {
                case 1 -> {

                    if (cardNumber >= 0 && cardNumber < 12) {
                        if (cardNumber != 11) {
                            cardNumber++;
                        }
                        System.out.println(cardNumber);
                    }
                }
                case 2 -> {
                    if (cardNumber2 >= 0 && cardNumber2 < 12) {
                        if (cardNumber2 != 11) {
                            cardNumber2++;
                        }
                        System.out.println(cardNumber2);
                    }
                }
                case 3 -> {
                    if (cardNumber3 >= 0 && cardNumber3 < 12) {
                        if (cardNumber3 != 11) {
                            cardNumber3++;
                        }
                        System.out.println(cardNumber3);
                    }
                }
            }
        }
        if(actionEvent.getSource()==backToDeck) {
            edit.setVisible(false);
            ScrapcardGUIMenu.frameNum = 0;
            ScrapcardGUIMenu.frame.setVisible(true);
        }

    }

    //calls toString in the main, allows labels to get updated text from file
    public static void show()
    {
        if (ScrapcardGUIMenu.frameNum==1) {
            questionLabel.setText(Main.toString(Main.localQuestion1, cardNumber));
            answerLabel.setText(Main.toString(Main.localAnswer1, cardNumber));
            ScrapcardGUIMain.cardQuestionText.setText(Main.toString(Main.localQuestion1, ScrapcardGUIMain.cardNumberNow));
            ScrapcardGUIMain.cardAnswerText.setText(Main.toString(Main.localAnswer1, ScrapcardGUIMain.cardNumberNow));
        }
        if (ScrapcardGUIMenu.frameNum==2) {
            questionLabel.setText(Main.toString(Main.localQuestion2,  cardNumber2));
            answerLabel.setText(Main.toString( Main.localAnswer2, cardNumber2));
            ScrapcardGUIMain.cardQuestionText.setText(Main.toString(Main.localQuestion2, ScrapcardGUIMain.cardNumberNow));
            ScrapcardGUIMain.cardAnswerText.setText(Main.toString(Main.localAnswer2, ScrapcardGUIMain.cardNumberNow));
        }
        if  (ScrapcardGUIMenu.frameNum == 3) {
            questionLabel.setText(Main.toString(Main.localQuestion3, cardNumber3));
            answerLabel.setText(Main.toString(Main.localAnswer3, cardNumber3));
            ScrapcardGUIMain.cardQuestionText.setText(Main.toString(Main.localQuestion3, ScrapcardGUIMain.cardNumberNow));
            ScrapcardGUIMain.cardAnswerText.setText(Main.toString(Main.localAnswer3, ScrapcardGUIMain.cardNumberNow));
        }
    }
}