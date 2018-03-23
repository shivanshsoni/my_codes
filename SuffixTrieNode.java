import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;
class SuffixTrieNode {
 
    final static int MAX_CHAR = 14;
 
    SuffixTrieNode[] children = new SuffixTrieNode[MAX_CHAR];
    List<Integer> indexes;
 
    SuffixTrieNode() // Constructor
    {
        // Create an empty linked list for indexes of
        // suffixes starting from this node
        indexes = new LinkedList<Integer>();
 
        // Initialize all child pointers as NULL
        for (int i = 0; i < MAX_CHAR; i++)
            children[i] = null;
    }
 
    // A recursive function to insert a suffix of 
    // the text in subtree rooted with this node
    void insertSuffix(String s, int index) {
         
        // Store index in linked list
        indexes.add(index);
 
        // If string has more characters
        if (s.length() > 0) {
         
            // Find the first character
            char cIndex = s.charAt(0);
 
            // If there is no edge for this character,
            // add a new edge
            if (children[cIndex] == null)
                children[cIndex] = new SuffixTrieNode();
 
            // Recur for next suffix
            children[cIndex].insertSuffix(s.substring(1),
                                              index + 1);
        }
    }
 
    // A function to search a pattern in subtree rooted
    // with this node.The function returns pointer to a 
    // linked list containing all indexes where pattern  
    // is present. The returned indexes are indexes of  
    // last characters of matched text.
    List<Integer> search(String s) {
         
        // If all characters of pattern have been 
        // processed,
        if (s.length() == 0)
            return indexes;
 
        // if there is an edge from the current node of
        // suffix tree, follow the edge.
        if (children[s.charAt(0)] != null)
            return (children[s.charAt(0)]).search(s.substring(1));
 
        // If there is no edge, pattern doesnt exist in 
        // text
        else
            return null;
    }
}
 
// A Trie of all suffixes
class Suffix_tree{
 
    SuffixTrieNode root = new SuffixTrieNode();
 
    // Constructor (Builds a trie of suffies of the
    // given text)
    Suffix_tree(String txt) {
     
        // Consider all suffixes of given string and
        // insert them into the Suffix Trie using 
        // recursive function insertSuffix() in 
        // SuffixTrieNode class
        for (int i = 0; i < txt.length(); i++)
            root.insertSuffix(txt.substring(i), i);
    }
 
    /* Prints all occurrences of pat in the Suffix Trie S
    (built for text) */
    boolean search_tree(String pat) {
     
        // Let us call recursive search function for 
        // root of Trie.
        // We get a list of all indexes (where pat is 
        // present in text) in variable 'result'
        boolean res=false;
        List<Integer> result = root.search(pat);
 
        // Check if the list of indexes is empty or not
        if (result == null)
            return false;
        else {
 
            int patLen = pat.length();
 
            for (Integer i : result)
                res=true;
        }
        return res;
    }
 
    // driver program to test above functions
    public static void main(String args[]) {
         Scanner scan=new Scanner(System.in);
         int t=scan.nextInt();
         int i,j,k,l;
         String ptr[]=new String[t];
         int p=0;
         for(i=0;i<t;i++)
         {

            String str=scan.next();
            if(str.equals("add"))
            {
                String mtr = scan.next();
                ptr[p]=mtr;
                p++;
            }
            else
            {
                int m=0;
                String mtr=scan.next();
                for(int g=0;g<p;g++)
                {
                    Suffix_tree S = new Suffix_tree(ptr[g]);
                    if(S.search_tree(ptr[g]))
                    {
                        m++;
                    }
                }
                System.out.println(m);
            }
        }
    }
}