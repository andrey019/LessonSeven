/**
 Дано текст из 3-х слов “word1 word2 word3”. Поменять 1-е
 и 3-е слова местами и вывести на экран результат
 */
public class TaskOneProper {
    public static void main(String[] args){
        String text = new String("barakuda my heaven");
        String result = new String();

        String[] temptext = text.split(" ");
        for (int i = temptext.length - 1; i > -1; i--){
            result += temptext[i] + " ";
        }

        System.out.print(result);
    }
}
