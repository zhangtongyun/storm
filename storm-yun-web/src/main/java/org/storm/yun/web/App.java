package org.storm.yun.web;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] is = {1,3,5,7,9,11,13,15};
        
        for(int i:is){
        	for(int j:is){
        		for(int k:is){
                	if(i+j+k == 30){
                		System.out.println(i+","+j+","+k);
                	}
                	
                }
            }
        }
        System.out.println(100);
    }
}
