package utilizedhashmap;

import java.util.HashMap;
import java.util.stream.Stream;

public class WordFrequencyCounter {

    public static void main(String[] args) {
//        문제 설명: 주어진 텍스트에서 각 단어의 빈도수를 계산하는 프로그램을 작성하세요.
        String customerText = "Once upon a time in a faraway land, there lived a kind and wise king. The king had a beautiful garden where all kinds of flowers bloomed. Every morning, the king would walk through the garden and admire the vibrant colors and the sweet fragrance of the flowers. The people of the land loved the king and his garden, as it brought joy and peace to everyone.";
        String[] words = customerText.split("[\\s,.]+");
        HashMap<String, Integer> wordFrequencies = new HashMap<>();

        for (String word : words) {
            if (wordFrequencies.containsKey(word)) {
                wordFrequencies.replace(word, wordFrequencies.get(word) + 1);
            } else {
                wordFrequencies.put(word, 1);
            }
        }

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]+"'s count: "+wordFrequencies.get(words[i]));
        }
    }
}
