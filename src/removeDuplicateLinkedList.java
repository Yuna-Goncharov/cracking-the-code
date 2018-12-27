////Write code to remove duplicates from an unsorted linked list. FOLLOW UP
////How would you solve this problem if a temporary buffer is not allowed?
//
//
//import java.util.Hashtable;
//
//public class removeDuplicateLinkedList {
//
//    public static void removeDuplicate(LinkedList n){
//        Hashtable  table = new Hashtable();
//        // while linkedlist not empyu
//
//        while(n != null){
//            //using contiains
//            if(table.containsKey(n.getData())){
//                perv.next = n.getNext();
//            }
//            else{
//                table.put(n.data, true);
//            }
//            n = n.next;
//            }
//        }
//    }
//
//
