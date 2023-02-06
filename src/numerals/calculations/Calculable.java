package numerals.calculations;

public interface Calculable {

    enum Numerals {
        ARABIC, ROMAN
    }

    Numerals getNumeralType();
}
