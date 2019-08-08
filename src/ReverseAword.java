
public class ReverseAword {
    /*
     * Reverse Sentence
     */
    public void ReverseSentence(String str[]) {

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "My name is Anju";
        int size = str.length();
        String Words[] = str.split("\\s");
        int size1 = Words.length;
        String ReverseSentence = "";
        String Reverseword = "";
        for (int i = size1 - 1; i >= 0; i--) {
            String word = Words[i];
            int size2 = word.length();
            // ReverseSentence = ReverseSentence + Words[i] + " ";
            for (int j = size2 - 1; j >= 0; j--) {
                Reverseword = Reverseword + word.charAt(j);
            }
            ReverseSentence = ReverseSentence + Reverseword + " ";
        }
        System.out.println("");
        System.out.println("Reverse Sentence is : " + ReverseSentence);
    }

}
