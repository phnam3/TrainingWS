package dictionary;

public class DictionaryWord implements Comparable<DictionaryWord> {
    private String word;
    private String meanings;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeanings() {
        return meanings;
    }

    public void setMeanings(String meanings) {
        this.meanings = meanings;
    }

    public DictionaryWord(String word, String meanings) {
        this.word = word;
        this.meanings = meanings;
    }

    @Override
    public int compareTo(DictionaryWord dictionaryWord) {
        if(word.equals(dictionaryWord.getWord())){
            return 0;
        } else if(word.compareTo(dictionaryWord.getWord()) < 0) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        String res = "";
        res += word + "\r\n" + meanings;
        return res;
    }

}
