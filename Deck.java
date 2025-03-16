package GroupProject;

public class Deck{
    private String question;
    private String answer;
    private boolean exist = false;
    private final int DECK_ID;
    private static int numDecks = 0;

    public Deck(String ques, String ans, boolean ex){
      question.equals(ques);
      answer.equals(ans);
      exist = ex;
      numDecks++;
      DECK_ID = numDecks;
    }

    public Deck(){
      this("question","answer", false);
    }

    public String getQuestion(){
      return question;
    }

    public String getAnswer(){
      return answer;
    }

    public Boolean getExist(){
      return exist;
    }

    public int getDECK_ID(){
      return DECK_ID;
    }

    public static int getNumDeck(){
      return numDecks;
    }
}