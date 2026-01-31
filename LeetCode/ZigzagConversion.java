package LeetCode;

import java.util.ArrayList;

public class ZigzagConversion {
          /*
        Authour: Ahmed Hussein
        Judge: LeetCode
        Link: https://leetcode.com/problems/zigzag-conversion/description/?envType=problem-list-v2&envId=vnwjj2jj

     */
          public static String convert(String s, int numRows) {

              ArrayList<String> a =  new ArrayList<>(numRows);
              for(int i = 0; i < numRows; i++) {
                  a.add(i, "");
              }
              int count =0;
              boolean flag = true;
              for (int i = 0; i < s.length(); ) {

                  if(count>=0 && count<numRows){

                      String temp = a.get(count);
                      temp += s.charAt(i);
                      a.set(count, temp);
                      if(flag){
                          count++;
                      }
                      else{
                          count--;
                      }
                      i++;
                  }
                  else{
                      if(count < 0 ){
                          count+=2;
                          flag = true;
                      }
                      else if(count == numRows){
                          count-=2;
                          flag = false;
                      }
                      if(count<0){
                          count = 0;
                      }
                  }
              }
              String res = "";
              for(int i = 0 ; i < numRows; i++){
                  res += a.get(i);
              }

              return res ;
          }
          public static void main(String[] args) {
              String s = "A";
              int  numRows = 1;
              System.out.println(convert(s,numRows));
          }
}
