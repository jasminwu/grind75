package w3;

import java.util.HashMap;

class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> mag = new HashMap<>();

        magazine.chars().forEach(c -> mag.put((char) c, mag.getOrDefault((char) c, 0) + 1));

        return ransomNote.chars()
                .allMatch(c -> mag.getOrDefault((char) c, 0) > 0 && mag.put((char) c, mag.get((char) c) - 1) > 0);
    }
}
