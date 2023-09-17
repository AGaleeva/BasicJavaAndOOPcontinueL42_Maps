package consultation;

import java.util.Objects;
import java.util.Random;

public class CharContainer {
    private char character;

    public CharContainer(char character) {
        this.character = character;
    }

    public char getCharacter() {
        return character;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CharContainer that = (CharContainer) o;
        return character == that.character;
    }

    @Override
    public int hashCode() {
        return Objects.hash(character) * (int) (1 + Math.random() * (100 - 1));
    }
}
