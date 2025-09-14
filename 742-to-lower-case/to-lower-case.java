class Solution {
    public String toLowerCase(String s) {
        StringBuilder k=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char l=s.charAt(i);
            if(l>='A' && l<='Z')
            l=(char)(l+32);
            k.append(l);
        }
        return k.toString();
    }
}