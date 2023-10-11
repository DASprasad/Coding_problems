package progarm;
import java.util.*;
public class _127_Word_Ladder {
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> start=new HashSet();
        HashSet<String> end  = new HashSet();
        HashSet<String> map = new HashSet();
        HashSet<String>remove=new HashSet();
        int steps=1;
        start.add(beginWord);
        end.add(endWord);
        for(int i=0;i<wordList.size();i++) {
        	map.add(wordList.get(i));
        }
        if(!map.contains(endWord)) {
        	return 0;
        }
        
        while(start.size()!=0) {
           for(String temp:start) {
        	   if(remove.contains(temp)) {
        		   continue;
        	   }
        	  char[] ch=temp.toCharArray();
        	  for(int i=0;i<ch.length;i++) {
        		  char prev=ch[i];
        		  for(int j=0;j<=25;j++) {
        			  ch[i]=(char)('a'+j);
        			  String str=String.valueOf(ch);
        			  
        			  if(map.contains(str)) {
        				  start.add(str);
        			  }
        			  if(end.contains(str)) {
        				  return steps+1;
        			  }
        		  }
        		  ch[i]=prev;
        		  remove.add(temp); //the words that are visited no need to check again thats why this hash set is there
        	  }
           }
          
           HashSet<String>t=new HashSet();
           t=start;
           start=end;
           end=t;
           steps++;
        }
        return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_127_Word_Ladder ob=new _127_Word_Ladder();
		List<String> wordList=new ArrayList();
		String[] s= {"ymann","yycrj","oecij","ymcnj","yzcrj","yycij","xecij","yecij","ymanj","yzcnj","ymain"};
		for(int i=0;i<s.length;i++) {
			wordList.add(s[i]);
		}
		String beginWord="ymain";
		String endWord="oecij";
		System.out.println(ob.ladderLength(beginWord, endWord, wordList));
		
	}

}
