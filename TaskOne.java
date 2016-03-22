/**
 Дано текст из 3-х слов “word1 word2 word3”. Поменять 1-е
 и 3-е слова местами и вывести на экран результат
 */
public class TaskOne {
    public static void main(String[] args){
        StringBuilder res = new StringBuilder("barakuda my heaven");   // comment to change result
        //StringBuilder res = new StringBuilder("word1 word2 word3");  // uncomment to change result
        int start = 0;
        int end = 0;
        int lastpos = 0;

        for (int i = res.length()-1; i > -1; i--){
            if ( (res.charAt(i) == ' ') && (end == 0) ){
                end = i+1;
                lastpos = i+1;
            } else if ( ((res.charAt(i) == ' ') || (i == 0) ) && (start == 0) ){
                start = i;
                res.append(res, start, end);
                start = 0;
                end = i;
            }
        }

        res.delete(0, lastpos);
        res.trimToSize();

        System.out.print(res);
    }
}
