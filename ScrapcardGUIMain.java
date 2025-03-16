package GroupProject;

import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import static java.awt.Color.white;

//page to play the quiz
public class ScrapcardGUIMain implements ActionListener{

    // initializing all the elements of the panel
    private static JButton answerButton;
    private static ImageIcon wrongIcon;
    private static JLabel wrongLabel;
    private static JButton wrongButton;
    private static ImageIcon rightIcon;
    private static JLabel rightLabel;
    private static JButton rightButton;
    private static JButton homeButton;
    private static JPanel mainPanel4;
    //private static JTextArea showCard;
    private static JLabel rightText;
    private static JLabel wrongText;

    //to change the value of card number constantly, static
    private static JLabel cardNumberLabel;
    private static JLabel showCardNumber;
    private static int cardNumberLabelIs = 1;
    static int cardNumberNow = cardNumberLabelIs -1;

    //numbers that are right and wrong
    public static JLabel numCorrectLabel;
    public static int numCorrect;
    public static JLabel numWrongLabel;
    public static int numWrong;
    public static JFrame mainFrame;
    public static JLabel cardQuestionText = new JLabel("Create a deck to see something");;
    public static JLabel cardAnswerText = new JLabel("Nothing to see here~");;

    
    //beginning of page constructor
    public ScrapcardGUIMain() {

        mainFrame = new JFrame();
        JPanel mainPanel = new JPanel();
        JPanel mainPanel2 = new JPanel();
        JPanel mainPanel3 = new JPanel();
        JPanel mainPanel4 = new JPanel();
       

        // This frame is the same size as the starting frame and put in middle
        //creating frame and panel
        mainFrame.setLayout(null);
        mainFrame.setSize(1100, 700);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setTitle("Scrap Cards");
        
        mainPanel.setLayout(null);
        mainPanel.setSize(1100, 700);
        mainPanel.setBackground(new Color(246, 97, 244));
        mainFrame.add(mainPanel);

        
        //creating answer button
        answerButton = new JButton();
        answerButton.setBounds(500, 520, 150, 100);
        answerButton.setText("Answer");
        answerButton.setBackground(new Color(251, 207, 231));
        answerButton.setFont(new Font("Sefif", Font.BOLD, 30));
        mainPanel.add(answerButton);
        answerButton.addActionListener(this);

        //creating buttons and adding images on them
        //this was one of the difficulties, align button with the image, rescaled too
        wrongIcon = new ImageIcon("C:\\Users\\chentx06\\IdeaProjects\\ImageTry\\src\\wrong.png");
        Image image = wrongIcon.getImage();
        Image newing = image.getScaledInstance(900,700,java.awt.Image.SCALE_SMOOTH);
        wrongIcon = new ImageIcon(newing);
        wrongLabel = new JLabel(wrongIcon);
        wrongLabel.setBounds(-50, 165, 900, 700);
        mainPanel.add(wrongLabel);
        //initially set the wrong label invisible and show it when answer is pressed (user looks at answer)
        wrongLabel.setVisible(false);

        wrongButton = new JButton();
        wrongButton.setBounds(50, 200, 100, 200);
        wrongButton.setFont(new Font("Sefif",Font.BOLD,60));
        mainPanel.add(wrongButton);
        wrongButton.addActionListener(this);
        wrongButton.setOpaque(false);
        wrongButton.setBorderPainted(false);
        wrongButton.setContentAreaFilled(false);

        rightIcon = new ImageIcon("C:\\Users\\chentx06\\IdeaProjects\\ImageTry\\src\\right.png");
        Image image2 = rightIcon.getImage();
        Image newing2 = image2.getScaledInstance(900,700,java.awt.Image.SCALE_SMOOTH);
        rightIcon = new ImageIcon(newing2);
        rightLabel = new JLabel(rightIcon);
        rightLabel.setBounds(685, 165, 900, 700);
        mainPanel.add(rightLabel);
        //the same thing with the right label, set invisible first
        rightLabel.setVisible(false);

        rightButton = new JButton();
        rightButton.setBounds(940, 200, 100, 200);
        rightButton.setFont(new Font("Sefif",Font.BOLD,60));
        mainPanel.add(rightButton);
        rightButton.addActionListener(this);
        rightButton.setOpaque(false);
        rightButton.setBorderPainted(false);
        rightButton.setContentAreaFilled(false);

        //button to move back to the choosing deck pages
        homeButton = new JButton();
        homeButton.setBounds(40, 20, 110, 100);
        homeButton.setText("🔙");
        homeButton.setBackground(new Color(251, 207, 231));
        homeButton.setFont(new Font("SansSerif Bold", Font.BOLD, 70));
        mainPanel.add(homeButton);
        homeButton.addActionListener(this);

        // adding a new panel to add the labels on it, and placing it on top on panel 1(the panel same size as frame)
        mainPanel2.setLayout(null);
        mainPanel2.setBounds(40, 500, 180, 130);
        mainPanel2.setBackground(new Color(255, 255, 255));
        mainPanel.add(mainPanel2);

        // adding right and wrong labels
        rightText = new JLabel("Correct ✓:");
        rightText.setBounds(10, 10, 200, 40);
        rightText.setFont(new Font("Serif", Font.PLAIN, 20));
        mainPanel2.add(rightText);

        //this is important if you want to change the label text according to values
        numCorrectLabel = new JLabel(String.valueOf(numCorrect));
        numCorrectLabel.setBounds(120, 10, 200, 40);
        numCorrectLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        mainPanel2.add(numCorrectLabel);

        wrongText = new JLabel("Wrong ✗:");
        wrongText.setBounds(10, 70, 200, 40);
        wrongText.setFont(new Font("Serif", Font.PLAIN, 20));
        mainPanel2.add(wrongText);

        numWrongLabel = new JLabel(String.valueOf(numWrong));
        numWrongLabel.setBounds(120, 70, 200, 40);
        numWrongLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        mainPanel2.add(numWrongLabel);

        //Creating new panels for putting on the numbers correct
        mainPanel3.setLayout(null);
        mainPanel3.setBounds(850, 25, 180, 70);
        mainPanel3.setBackground(new Color(255, 255, 255));
        mainPanel.add(mainPanel3);

        mainPanel4.setLayout(null);
        mainPanel4.setBounds(200, 130, 700, 350);
        mainPanel4.setBackground(new Color(255, 255, 255));
        mainPanel.add(mainPanel4);

        // adding the number of the card we're on depending on clicks on the buttons
        // right/wrong
        // setting it in the middle no matter what number of card
        cardNumberLabel = new JLabel();
        cardNumberLabel.setBounds(0, 0, 180, 70);
        cardNumberLabel.setText("/12");
        cardNumberLabel.setVerticalAlignment(SwingConstants.CENTER);
        cardNumberLabel.setHorizontalAlignment(SwingConstants.CENTER);
        cardNumberLabel.setBackground(new Color(255, 255, 255));
        cardNumberLabel.setFont(new Font("SansSerif Bold", Font.BOLD, 40));
        mainPanel3.add(cardNumberLabel);

        showCardNumber = new JLabel();
        showCardNumber.setBounds(-50, 0, 180, 70);
        showCardNumber.setText(String.valueOf(cardNumberLabelIs));
        showCardNumber.setVerticalAlignment(SwingConstants.CENTER);
        showCardNumber.setHorizontalAlignment(SwingConstants.CENTER);
        showCardNumber.setBackground(new Color(255, 255, 255));
        showCardNumber.setFont(new Font("SansSerif Bold", Font.BOLD, 40));
        mainPanel3.add(showCardNumber);

        
        //putting 2 different JLabel, one for answer text, one for question text
        cardQuestionText.setBounds(0, 0, 700, 350);
        cardQuestionText.setVisible(true);
        cardQuestionText.setForeground(Color.BLACK);
        cardQuestionText.setFont(new Font("Serif",Font.BOLD,40)); //font type, style, size
        mainPanel4.add(cardQuestionText);

        //setting answer invisible first
        cardAnswerText.setBounds(0, 0, 700, 350);
        cardAnswerText.setVisible(false);
        cardAnswerText.setForeground(Color.BLACK);
        cardAnswerText.setFont(new Font("Serif",Font.BOLD,40)); //font type, style, size
        cardAnswerText.setBorder(BorderFactory.createBevelBorder(1));
        mainPanel4.add(cardAnswerText);

        mainPanel2.setVisible(true);
        mainPanel.setVisible(true);
        mainFrame.setVisible(true);

    }//end of page constructor

    
    public void actionPerformed(ActionEvent e) {
    	
    	//if the home button is clicked, go back to the choosing deck page, resetting everything else
        if (e.getSource() == homeButton) {
            mainFrame.setVisible(false);
            ScrapcardGUIMenu.frame.setVisible(true);
            // resetting all the values
            numWrong = 0;
            numCorrect = 0;
            cardNumberLabelIs = 1;
            cardNumberNow = cardNumberLabelIs - 1;
            numWrongLabel.setText(String.valueOf(numWrong));
            numCorrectLabel.setText(String.valueOf(numCorrect));
            showCardNumber.setText(String.valueOf(cardNumberLabelIs));
        }
        
        // if answer button is clicked, we show the ANSWER and make the buttons visible
        if (e.getSource() == answerButton) {
            // if we're not at card number 12 yet, we'll allow the user to continue using the buttons
            if (numWrong + numCorrect < 12) {
                cardAnswerText.setVisible(false);
                wrongLabel.setVisible(true);
                rightLabel.setVisible(true);
                rightButton.setVisible(true);
                wrongButton.setVisible(true);
                // Show the answer text
                cardAnswerText.setVisible(true);
                cardQuestionText.setVisible(false);
            }
        }
        
        // if wrong button is pressed, add 1 to wrong, and then go to the next QUESTION
        if (e.getSource() == wrongButton) {
            numWrong++;
            numWrongLabel.setText(String.valueOf(numWrong));
            wrongLabel.setVisible(false);
            rightLabel.setVisible(false);
            rightButton.setVisible(false);
            wrongButton.setVisible(false);
            cardQuestionText.setVisible(true);
            cardAnswerText.setVisible(false);
            // Hide answer text
            if (cardNumberLabelIs < 12) {
                cardNumberLabelIs++;
                cardNumberNow = cardNumberLabelIs - 1;
            }
            showCardNumber.setText(String.valueOf(cardNumberLabelIs));
        }
        //if the right button is clicked, add 1 to right, and go to next question
        if (e.getSource() == rightButton) {
            numCorrect++;
            numCorrectLabel.setText(String.valueOf(numCorrect));
            rightLabel.setVisible(false);
            wrongLabel.setVisible(false);
            rightButton.setVisible(false);
            wrongButton.setVisible(false);
            cardAnswerText.setVisible(false);
            cardQuestionText.setVisible(true);
            
            // Hide answer text
            if (cardNumberLabelIs < 12) {
                cardNumberLabelIs++;
                cardNumberNow = cardNumberLabelIs - 1;
            }
            showCardNumber.setText(String.valueOf(cardNumberLabelIs));
        }
    }
}