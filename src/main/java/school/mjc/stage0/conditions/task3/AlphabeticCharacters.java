package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        switch (character) {
            case 'A': case 'a': case 'E': case 'e': case 'I': case 'i': case 'O': case 'o': case 'U': case 'u':
                System.out.println("Vowel"); break;
            case 'B': case 'b': case 'C': case 'c': case 'D': case 'd': case 'F': case 'f': case 'G': case 'g':
            case 'H': case 'h': case 'J': case 'j': case 'K': case 'k': case 'L': case 'l': case 'M': case 'm':
            case 'N': case 'n': case 'P': case 'p': case 'Q': case 'q': case 'R': case 'r': case 'S': case 's':
            case 'T': case 't': case 'V': case 'v': case 'W': case 'w': case 'X': case 'x': case 'Y': case 'y':
            case 'Z': case 'z':
                System.out.println("Consonant"); break;
            default:
                System.out.println("wrong alphabet!");
        }
    }
}
