public class Trie
{
    List<String> trieList;
    /** Initialize your data structure here. */
    public Trie()
    {
        trieList = new ArrayList<String>();
    }

    /** Inserts a word into the trie. */
    public void insert(String word)
    {
        trieList.add(word);
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word)
    {
        return trieList.contains(word)==true?true:false;

    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix)
    {
       return trieList.stream().filter(s -> s.startsWith(prefix)).count()!=0?true:false;

    }