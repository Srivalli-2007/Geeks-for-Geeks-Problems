class Solution {
    public ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        TreeSet<Integer> ts=new TreeSet<>();
        for(int i=0;i<a.length;i++){
            ts.add(a[i]);
        }
        for(int j=0;j<b.length;j++){
            ts.add(b[j]);
        }
        for(int x:ts){
            res.add(x);
        }
        return res;
    }
};