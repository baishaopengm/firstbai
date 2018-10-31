package com.soft.Study;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PrictiseThread extends Thread{

    public void run(){

    }
      public static void main(){
       List<Object> mylist = new ArrayList<>();
      }
      public List<String> getNamed(String  name){
          List<String>  list = new LinkedList<String>();
          list.add("name1");
          list.add("name2");
          list.add("name3");
          list.add(4,"name4");
          list.size();
          String str  = ((LinkedList<String>) list).peek();
          list.clear();
//          ((LinkedList<String>) list).pop()
          return  list;
      }
}
