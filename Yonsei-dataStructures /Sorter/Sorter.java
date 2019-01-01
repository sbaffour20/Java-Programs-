/*
 * Name:Sydney Baffour    
 * Student ID:2018843693
*/

public class Sorter
{
    public Sorter()
    {
        /*
         * Constructor for our sorter
         * In this assignment you do not have to implement anything here
         * so just leave this method blank
         */
    }
       
    public int[] ascending(int[] input)
    {
    
    if(input.length == 0 || input.length ==1){
        return input; 
    }
    else{
        int pointer = 0;
        while(pointer <= input.length-1){
            for (int i=(input.length-1);i>=pointer;i--){
                if(input[i] < input[pointer]){
                    int holder = input[pointer];
                    input[pointer]= input[i];
                    input[i]=holder;

                }
            }
            pointer ++;
        }
        return input;
    }
    }
    public int[] descending(int[] input)
    {
    if(input.length == 0 || input.length == 1){
        return input; 
    }
    else{
        int pointer = input.length -1;

        while(pointer >= 0){
            for (int i=0;i<= pointer;i++){
                if(input[i] < input[pointer]){
                    int holder = input[pointer];
                    input[pointer]=input[i];
                    input[i]=holder;

                }
            }
            pointer --;
        }
        return input;
    }
    
    }
}
