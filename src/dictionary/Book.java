package dictionary;

import java.util.*;

public class Book{
    private List<DictionaryWord> dictionaryWordList = new ArrayList<DictionaryWord>();
    private Set<DictionaryWord> dictionaryWordSet = new TreeSet<DictionaryWord>();

    public List<DictionaryWord> getDictionaryWordList() {
        return dictionaryWordList;
    }

    public void setDictionaryWordList(List<DictionaryWord> dictionaryWordList) {
        this.dictionaryWordList = dictionaryWordList;
    }

    public void addToBook(DictionaryWord dictionaryWord){
        for(DictionaryWord dw : dictionaryWordList){
            if(dw.compareTo(dictionaryWord) == 0){
                return;
            }
        }
        dictionaryWordList.add(dictionaryWord);
    }

    public void addToBookSet(DictionaryWord dictionaryWord){
        dictionaryWordSet.add(dictionaryWord);
    }

    public void sort(){
        Collections.sort(dictionaryWordList);
    }

    public String toString(){
        int count = 0;
        String res = "";
        for(DictionaryWord dw : dictionaryWordList){
            res += Integer.toString(++count) + ". " + dw.getWord() + "\r\n" + dw.getMeanings() + "\r\n";
        }
        return res;
    }

    public String toStringSet(){
        int count = 0;
        String res = "";
        for(DictionaryWord dw : dictionaryWordSet){
            res += Integer.toString(++count) + ". " + dw.getWord() + "\r\n" + dw.getMeanings() + "\r\n";
        }
        return res;
    }

}
