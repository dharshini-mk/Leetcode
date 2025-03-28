class Solution {
    public String[] findWords(String[] words) {
        List<String> l=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            String s=words[i].toLowerCase();
            int flag=0;
            for(int j=0;j<s.length();j++)
            {
                if((s.charAt(j)=='q'||s.charAt(j)=='w'||s.charAt(j)=='e'||s.charAt(j)=='r'||s.charAt(j)=='t'||s.charAt(j)=='y'||s.charAt(j)=='u'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='p')&&(flag==0||flag==1))
                {
                    flag=1;
                }
                else if((s.charAt(j)=='a'||s.charAt(j)=='s'||s.charAt(j)=='d'||s.charAt(j)=='f'||s.charAt(j)=='g'||s.charAt(j)=='h'||s.charAt(j)=='j'||s.charAt(j)=='k'||s.charAt(j)=='l')&&(flag==0||flag==2))
                {
                    flag=2;
                }
                else if((s.charAt(j)=='z'|| s.charAt(j)=='x'|| s.charAt(j)=='c'|| s.charAt(j)=='v'|| s.charAt(j)=='b'|| s.charAt(j)=='n'|| s.charAt(j)=='m')&&(flag==0||flag==3))
                {
                    flag=3;
                }
                else 
                {
                    flag=4;
                    break;
                }
            }
            if(flag!=4)
                l.add(words[i]);
        }
        String[] a = new String[l.size()];
        for (int i=0;i<l.size();i++)
            a[i]=l.get(i);
        return a;
    }
}