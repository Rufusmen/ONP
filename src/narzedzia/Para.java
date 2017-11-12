package narzedzia;

/**
 * Para
 * @param <Key> identyfikator
 * @param <Value> vartość
 */
public class Para<Key, Value> {
    private final Key key;
    private Value value;

    public Para(Key key,Value value){
        this.key=key;
        this.value=value;
    }

    /**
     * @param o Objekt do porównania
     * @return true Jeśli o jest parą i klucze obu sie zgadzają
     */
    @Override
    public boolean equals(Object o) {
        if(o instanceof Para)
            return (((Para)o).getKey().equals(key));
        return false;
    }

    public Key getKey() {
        return key;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
