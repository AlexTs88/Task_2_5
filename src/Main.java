public class Main {

    public static void main(String[] args) {
	    // 5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
        String str = "Подсчитать, сколько раз среди символов заданной строки встречается буква “а”";
        int counter = 0;
        for (int i = 0; i < str.length(); i ++) {
            if (str.charAt(i) == 'а') counter ++;
        }
        System.out.println(counter);
    }
}
