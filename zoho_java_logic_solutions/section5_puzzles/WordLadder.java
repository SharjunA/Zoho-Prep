import java.util.*;
public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict = new HashSet<>(wordList);
        if (!dict.contains(endWord)) return 0;
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        int level = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String word = q.poll();
                if (word.equals(endWord)) return level;
                char[] arr = word.toCharArray();
                for (int j = 0; j < arr.length; j++) {
                    char orig = arr[j];
                    for (char c = 'a'; c <= 'z'; c++) {
                        arr[j] = c;
                        String newWord = new String(arr);
                        if (dict.remove(newWord)) q.add(newWord);
                    }
                    arr[j] = orig;
                }
            }
            level++;
        }
        return 0;
    }
}