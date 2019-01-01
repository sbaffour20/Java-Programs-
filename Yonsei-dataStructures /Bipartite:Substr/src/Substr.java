/*
* Name: Sydney Baffour
* Student ID#: 2018843693
*/

/* DO NOT IMPORT ANYTHING */

public class Substr
{
    public String str; 
    public int strLength;

    public Substr(String str)
    {
        
        strLength = str.length();
        this.str = str;
       
            
    }
    
    public int countPattern(String pat)
     
        { 
            int result =0;
            int patLength = pat.length(); 
            int strLength = str.length();
            int j = 0; 
            int lps[] = new int[patLength]; 
         
            computeLPSArray(pat, patLength, lps); 
      
            int i = 0; 
            while (i < strLength) { 
                if (pat.charAt(j) == str.charAt(i)) { 
                    i++; 
                    j++; 
            
                } 
                if (j == patLength) { 
                    result ++; 
                    j = lps[j - 1]; 
                } 
      
     
                else if (i < strLength && pat.charAt(j) != str.charAt(i)) { 
                    
                    if (j != 0) 
                        j = lps[j - 1]; 
                    else
                        i = i + 1; 
                } 
            } 
            return result;
        }
        
      
        void computeLPSArray(String pat, int patLength, int lps[]) 
        { 
            
            int len = 0; 
            int i = 1; 
            lps[0] = 0; 
      
            
            while (i < patLength) { 
                if (pat.charAt(i) == pat.charAt(len)) { 
                    len++; 
                    lps[i] = len; 
                    i++; 
                } 
                else 
                { 
                    if (len != 0) { 
                        len =  lps[len - 1]; 
                    } 
                    else 
                    { 
                        lps[i] = len; 
                        i++; 
                    } 
                } 
            } 
        }
    } 