/**
 Дано текст и определенное слово. Посчитать сколько раз
 заданное слово встречается в тексте
 */
public class TaskTwo {
    public static void main(String[] args){
        StringBuilder text = new StringBuilder("what is life, and what is happiness, and what am i supposed to do");
        String word1 = new String("what");
        String word2 = new String("is");
        boolean exitflag = true;
        int result = 0;

        while (exitflag){
            int tempindex = text.lastIndexOf(word1);  //change to word2 for different results
            if (tempindex != -1){
                result++;
                text.delete(tempindex, text.length());
            } else {
                exitflag = false;
            }
        }

        System.out.println(result);
    }
}
