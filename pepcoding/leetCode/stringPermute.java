class Solution {
    public void permutation(String str,String parm,int idx,ArrayList<String> arrl){
        if(str.length()==0){
            arrl.add(parm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            permutation(newStr,parm+curr,idx+1,arrl);
        }
    }
    public boolean checkInclusion(String s1, String s2) {
        ArrayList<String> arrl=new ArrayList<>();
        permutation(s1,"",0,arrl);
        for(String ele:arrl){
            if(s2.contains(ele)){
                return true;
            }
        }
        return false;
    }
}