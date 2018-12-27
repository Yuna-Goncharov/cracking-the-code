//Implement an algorithm to find the nth to last element of a singly linked list.

//public class findNth {
//
//    public LinkedList findNthToLast(LinkedList head , int n ) {
//
//        //if only 1 node or nothing
//        if (head == null || n < 1) {
//            return null;
//        }
//        //setting 2 pointers to find the nth
//        LinkedList p1 = head;
//        LinkedList p2 = head;
//
//        for (int i = 0; i < n - 1; i++) {
//            if (p2 == null) {
//                return null;
//            }
//            p2 = p2.getNext(Node);
//        }
//        while (p2.getNext() != null) {
//            p1 = p1.next;
//            p2 = p2.next;
//        }
//
//        return p1;
//    }
//}
