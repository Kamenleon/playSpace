import java.util.Random;

public class RandomJapaneseCharacter {
    public static void main(String[] args) {
        // 日本語の文字列を定義します
        String japaneseCharacters = "あいうえおかきくけこさしすせそたちつてとなにぬねのはひふへほらりるれろやゆよわん";

        // ランダムオブジェクトを作成
        Random random = new Random();

        for (int j=0; j<10; j++) {
            // 結果を格納するためのStringBuilder
            StringBuilder result = new StringBuilder();

            // 4回繰り返してランダムに1文字ずつ選びます
            for (int i = 0; i < 4; i++) {
                int index = random.nextInt(japaneseCharacters.length());
                char selectedChar = japaneseCharacters.charAt(index);
                result.append(selectedChar);
            }
                // 結果を出力します
            System.out.println("生成された4文字の文字列: " + result.toString());
        }
    }
}

