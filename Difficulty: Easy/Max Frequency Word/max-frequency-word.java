class Solution {
    public String maximumFrequency(String s) {
        // Code here
        String[] words=s.split(" ");
        HashMap<String,Integer> hm=new HashMap<>();
        for(String word:words){
            hm.put(word,hm.getOrDefault(word,0)+1);
        }
        String result="";
        int max=0;
        for(String word:words){
            if(hm.get(word)>max){
                max=hm.get(word);
                result=word;
            }
        }
        return result+" "+max;
    }
}