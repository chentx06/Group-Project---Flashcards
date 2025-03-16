package GroupProject;

import java.io.*;

import static java.lang.System.console;
import java.util.Arrays;
import java.util.Scanner;
/**
 */
public class Main extends ScrapcardGUIStart{
	
	//declaring arrays for reading
    static String[]localQuestion1=new String[12];
    static String[]localAnswer1=new String[12];

    static String[]localQuestion2=new String[12];
    static String[]localAnswer2=new String[12];
    static String[]localQuestion3=new String[12];
    static String[]localAnswer3=new String[12];

    static String[] deckONEQuestions = new String[12];
    static String[] deckONEAnswer = new String[12];


    
    public static void main(String[] args) {
    	
        new ScrapcardGUIStart();

        String[] DeckTWOQuestions = new String[12];
        String[] DeckTWOAnswer = new String[12];

        String[] DeckTHREEQuestions = new String[12];
        String[] DeckTHREEAnswers = new String[12];


        //avoids the code ending with array repeating
        while(true)
        {
            if (ScrapcardGUIMenu.frameNum == 1) {
                int cardNum = EditDeckGUI.cardNumber;
                switch (cardNum) {
                    case 0 -> {
                        deckONEQuestions[0] = EditDeckGUI.questionStored1[0];
                        deckONEAnswer[0] = EditDeckGUI.answerStored1[0];
                    }
                    case 1 -> {
                        deckONEQuestions[1] = EditDeckGUI.questionStored1[1];
                        deckONEAnswer[1] = EditDeckGUI.answerStored1[1];
                    }
                    case 2 -> {
                        deckONEQuestions[2] = EditDeckGUI.questionStored1[2];
                        deckONEAnswer[2] = EditDeckGUI.answerStored1[2];
                    }
                    case 3 -> {
                        deckONEQuestions[3] = EditDeckGUI.questionStored1[3];
                        deckONEAnswer[3] = EditDeckGUI.answerStored1[3];
                    }
                    case 4 -> {
                        deckONEQuestions[4] = EditDeckGUI.questionStored1[4];
                        deckONEAnswer[4] = EditDeckGUI.answerStored1[4];
                    }
                    case 5 -> {
                        deckONEQuestions[5] = EditDeckGUI.questionStored1[5];
                        deckONEAnswer[5] = EditDeckGUI.answerStored1[5];
                    }
                    case 6 -> {
                        deckONEQuestions[6] = EditDeckGUI.questionStored1[6];
                        deckONEAnswer[6] = EditDeckGUI.answerStored1[6];
                    }
                    case 7 -> {
                        deckONEQuestions[7] = EditDeckGUI.questionStored1[7];
                        deckONEAnswer[7] = EditDeckGUI.answerStored1[7];
                    }
                    case 8 -> {
                        deckONEQuestions[8] = EditDeckGUI.questionStored1[8];
                        deckONEAnswer[8] = EditDeckGUI.answerStored1[8];
                    }
                    case 9 -> {
                        deckONEQuestions[9] = EditDeckGUI.questionStored1[9];
                        deckONEAnswer[9] = EditDeckGUI.answerStored1[9];
                    }
                    case 10 -> {
                        deckONEQuestions[10] = EditDeckGUI.questionStored1[10];
                        deckONEAnswer[10] = EditDeckGUI.answerStored1[10];
                    }
                    case 11 -> {
                        deckONEQuestions[11] = EditDeckGUI.questionStored1[11];
                        deckONEAnswer[11] = EditDeckGUI.answerStored1[11];
                    }
                }
                try {
                    FileWriter fw = new FileWriter("C:\\Users\\chentx06\\Desktop\\JavaFile\\Deck1.txt");
                    PrintWriter pw = new PrintWriter(fw);
                    for (int i = 0;i<deckONEQuestions.length;i++) {

                        pw.println(deckONEQuestions[i]+","+deckONEAnswer[i]);
                    }

                    pw.close();
                } catch (IOException e) {
                    System.err.println("Error: " + e);
                }
                try {
                    FileReader fr = new FileReader("C:\\Users\\chentx06\\Desktop\\JavaFile\\Deck1.txt");
                    BufferedReader br = new BufferedReader(fr);
                    String line;
                    for (int index = 0; index < 12; index ++)
                    {
                        line = br.readLine();
                        String[] output = line.split(",");
                        localQuestion1[index] = Arrays.toString(new String[]{output[0]});
                        localAnswer1[index] = Arrays.toString(new String[]{output[1]});
                    }
                    br.close();

                } catch (IOException e) {
                    System.err.println("Error: " + e);
                }

        }
        //End of File I/O Deck 1 (Answers and Questions)


        if (ScrapcardGUIMenu.frameNum == 2) {
            int cardNum = EditDeckGUI.cardNumber2;

            switch (cardNum) {
                case 0 -> {
                    DeckTWOQuestions[0] = EditDeckGUI.questionStored2[0];
                    DeckTWOAnswer[0] = EditDeckGUI.answerStored2[0];
                }
                case 1 -> {
                    DeckTWOQuestions[1] = EditDeckGUI.questionStored2[1];
                    DeckTWOAnswer[1] = EditDeckGUI.answerStored2[1];
                }
                case 2 -> {
                    DeckTWOQuestions[2] = EditDeckGUI.questionStored2[2];
                    DeckTWOAnswer[2] = EditDeckGUI.answerStored2[2];
                }
                case 3 -> {
                    DeckTWOQuestions[3] = EditDeckGUI.questionStored2[3];
                    DeckTWOAnswer[3] = EditDeckGUI.answerStored2[3];
                }
                case 4 -> {
                    DeckTWOQuestions[4] = EditDeckGUI.questionStored2[4];
                    DeckTWOAnswer[4] = EditDeckGUI.answerStored2[4];
                }
                case 5 -> {
                    DeckTWOQuestions[5] = EditDeckGUI.questionStored2[5];
                    DeckTWOAnswer[5] = EditDeckGUI.answerStored2[5];
                }
                case 6 -> {
                    DeckTWOQuestions[6] = EditDeckGUI.questionStored2[6];
                    DeckTWOAnswer[6] = EditDeckGUI.answerStored2[6];
                }
                case 7 -> {
                    DeckTWOQuestions[7] = EditDeckGUI.questionStored2[7];
                    DeckTWOAnswer[7] = EditDeckGUI.answerStored2[7];
                }
                case 8 -> {
                    DeckTWOQuestions[8] = EditDeckGUI.questionStored2[8];
                    DeckTWOAnswer[8] = EditDeckGUI.answerStored2[8];
                }
                case 9 -> {
                    DeckTWOQuestions[9] = EditDeckGUI.questionStored2[9];
                    DeckTWOAnswer[9] = EditDeckGUI.answerStored2[9];
                }
                case 10 -> {
                    DeckTWOQuestions[10] = EditDeckGUI.questionStored2[10];
                    DeckTWOAnswer[10] = EditDeckGUI.answerStored2[10];
                }
                case 11 -> {
                    DeckTWOQuestions[11] = EditDeckGUI.questionStored2[11];
                    DeckTWOAnswer[11] = EditDeckGUI.answerStored2[11];
                }
            }
        }


        //File I/O Deck 2 (Answers and Questions)
        try {

            FileWriter fw = new FileWriter("C:\\Users\\chentx06\\Desktop\\JavaFile\\Deck2.txt");
            PrintWriter pw = new PrintWriter(fw);
            for (int i = 0;i<12;i++) {

                pw.println(DeckTWOQuestions[i]+","+DeckTWOAnswer[i]);
            }
            pw.close();
        } catch (IOException e) {
            System.err.println("Error: " + e);
        }
        try {
            FileReader fr = new FileReader("C:\\Users\\chentx06\\Desktop\\JavaFile\\Deck2.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            for (int index = 0; index < 12; index ++)
            {
                line = br.readLine();
                String[] output = line.split(",");
                localQuestion2[index] = Arrays.toString(new String[]{output[0]});
                localAnswer2[index] = Arrays.toString(new String[]{output[1]});
            }

        } catch (IOException e) {
            System.err.println("Error: " + e);
        }


        //End of File I/O Deck 2 (Answers and Questions)

        if (ScrapcardGUIMenu.frameNum == 3) {
            int cardNum = EditDeckGUI.cardNumber3;
            switch (cardNum) {
                case 0 -> {
                    DeckTHREEQuestions[0] = EditDeckGUI.questionStored3[0];
                    DeckTHREEAnswers[0] = EditDeckGUI.answerStored3[0];
                }
                case 1 -> {
                    DeckTHREEQuestions[1] = EditDeckGUI.questionStored3[1];
                    DeckTHREEAnswers[1] = EditDeckGUI.answerStored3[1];
                }
                case 2 -> {
                    DeckTHREEQuestions[2] = EditDeckGUI.questionStored3[2];
                    DeckTHREEAnswers[2] = EditDeckGUI.answerStored3[2];
                }
                case 3 -> {
                    DeckTHREEQuestions[3] = EditDeckGUI.questionStored3[3];
                    DeckTHREEAnswers[3] = EditDeckGUI.answerStored3[3];
                }
                case 4 -> {
                    DeckTHREEQuestions[4] = EditDeckGUI.questionStored3[4];
                    DeckTHREEAnswers[4] = EditDeckGUI.answerStored3[4];
                }
                case 5 -> {
                    DeckTHREEQuestions[5] = EditDeckGUI.questionStored3[5];
                    DeckTHREEAnswers[5] = EditDeckGUI.answerStored3[5];
                }
                case 6 -> {
                    DeckTHREEQuestions[6] = EditDeckGUI.questionStored3[6];
                    DeckTHREEAnswers[6] = EditDeckGUI.answerStored3[6];
                }
                case 7 -> {
                    DeckTHREEQuestions[7] = EditDeckGUI.questionStored3[37];
                    DeckTHREEAnswers[7] = EditDeckGUI.answerStored3[7];
                }
                case 8 -> {
                    DeckTHREEQuestions[8] = EditDeckGUI.questionStored3[8];
                    DeckTHREEAnswers[8] = EditDeckGUI.answerStored3[8];
                }
                case 9 -> {
                    DeckTHREEQuestions[9] = EditDeckGUI.questionStored3[9];
                    DeckTHREEAnswers[9] = EditDeckGUI.answerStored3[9];
                }
                case 10 -> {
                    DeckTHREEQuestions[10] = EditDeckGUI.questionStored3[10];
                    DeckTHREEAnswers[10] = EditDeckGUI.answerStored3[10];
                }
                case 11 -> {
                    DeckTHREEQuestions[11] = EditDeckGUI.questionStored3[11];
                    DeckTHREEAnswers[11] = EditDeckGUI.answerStored3[11];
                }
            }
        }

        //File I/O Deck 3 (Answers and Questions)
        try {

            FileWriter fw = new FileWriter("C:\\Users\\chentx06\\Desktop\\JavaFile\\Deck3.txt");
            PrintWriter pw = new PrintWriter(fw);
            for (int i = 0; i < 12; i++) {
                pw.println(DeckTHREEQuestions[i]+","+DeckTHREEAnswers[i]);
            }
            pw.close();
        } catch (IOException e) {
            System.err.println("Error: " + e);
        }
        try {
            FileReader fr = new FileReader("C:\\Users\\chentx06\\Desktop\\JavaFile\\Deck3.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
           // while((line=br.readLine())!=null)
            for (int index = 0; index < 12; index ++)
            {
                line = br.readLine();
                String[] output = line.split(",");
                localQuestion3[index] = Arrays.toString(new String[]{output[0]});
                localAnswer3[index] = Arrays.toString(new String[]{output[1]});
            }
            br.close();
        } catch (IOException e) {
            System.err.println("Error: " + e);
        }
        //allows everything to be updated
        if(EditDeckGUI.questionLabel!=null&&EditDeckGUI.answerLabel!=null&&ScrapcardGUIMain.cardAnswerText!=null&&ScrapcardGUIMain.cardAnswerText!=null)
        {
                EditDeckGUI.show();
                EditDeckGUI.show();
        }
    }

//End of File I/O Deck 3 (Answers and Questions)
    }

    
    public static String toString(String[]deck,int cardNumber)
    {
        return deck[cardNumber];
    }
}