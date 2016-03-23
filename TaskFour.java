/**
 Дано текст. Убрать лишние пробелы, расставить знаки
 препинания. Пример: «Я длинное предложение Я
 второе предложение.» -> «Я длинное предложение. Я
 второе предложение.»
 */
public class TaskFour {
    public static void main(String[] args){
        String text = "Я  длинное предложение Я  второе  предложение  А я  третье Может  хватит  уже?";

        System.out.println(text);

        text = text.replaceAll("  ", " ");
        StringBuilder result = new StringBuilder(text);
        text = text.toUpperCase();

        int addindex = 0;
        for (int i = 1; i < text.length() - 1; i++){
            if ( (text.charAt(i) == result.charAt(i + addindex)) && (text.charAt(i) != ' ') ){
                result.insert(i - 1 + addindex, '.');
                addindex++;
            }
        }

        System.out.println(result);
    }
}
