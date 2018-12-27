//You have two numbers represented by a linked list, where each node contains a sin- gle digit.
// The digits are stored in reverse order, such that the 1’s digit is at the head of the list. Write a function that adds the two numbers and returns the sum as a linked list.
//
//        EXAMPLE
//        Input: (3 -> 1 -> 5), (5 -> 9 -> 2) Output: 8 -> 0 -> 8

//public class addLists {
//
//    public LinkedList addList (LinkedList l1 , LinkedList l2 , int carry){
//        if(l1 == null || l2 == null ){
//            return null;
//        }
//        LinkedList result = new LinkedList( null ,null , null , null, carry);
//        int value = carry;
//        if (l1 != null){
//            value += l1.getData();
//
//        }
//        if(l2 != null){
//            value += l2.getData();
//        }
//        result.data= value %10;
//    }
//    LinkedList more = new LinkedList(l1 == null ? null : l1.next)
//            result.setNext(more);
//return result;
//}
