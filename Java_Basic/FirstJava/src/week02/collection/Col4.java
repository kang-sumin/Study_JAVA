package week02.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Col4 {
    public static void main(String[] args) {
        /*Queue : FIFO 처음 들어간게 제일먼저 나온다
        * add(삽입), peek(조회), poll(꺼내기)
        * */

        Queue<Integer> intQueue = new LinkedList<Integer>();

        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);

        while(!intQueue.isEmpty()){
            System.out.println(intQueue.poll());
        }

        //추가
        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);

        //peek 조회
        System.out.println(intQueue.peek());
        System.out.println(intQueue.size());
    }
}
