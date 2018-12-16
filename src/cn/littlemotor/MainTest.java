package cn.littlemotor;

import cn.littlemotor.LinkedList.MiddleOfTheLinkedList876;
import cn.littlemotor.LinkedList.MiddleOfTheLinkedList876.ListNode;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
  public  static void main(String[] args){
      List<Integer> list = new ArrayList<Integer>(10);
      int i = 0;
      while(i < 10){
          list.add(i);
          i++;
      }
      System.out.println(list.size());
      System.out.println(list);
      System.out.println(list.get(5));
  }
}
