package domo01;

import java.util.*;
import java.util.stream.Collectors;

public class CQueue {

    private Stack<Integer> stack  ;

    private Stack<Integer> baseStock;
    public CQueue() {
        stack=new Stack<Integer>();
        baseStock=new Stack<Integer>();
    }

    public void appendTail(int value) {
        stack.push(value);
    }

    public int deleteHead() {
        while (!stack.empty()){
            baseStock.push(stack.pop());
        }
        int i=baseStock.pop();
        while (baseStock.empty()){
            stack.push(baseStock.pop());
        }

        List<Integer > list =new ArrayList();
        list.remove(list.size()-1);
        Collections.reverse();
        return i;


        List<Integer> arr =new ArrayList();
        arr.toArray(new Integer[0]);
        arr.stream().mapToInt(Integer::valueOf).toArray();



    }
}
