public class NewNode {
    private NewNode head ;
    private  NewNode tail;
    private String data;


    public  NewNode(NewNode head, NewNode tail, String data){
        this.data = data;
        this.head = head;
        this.tail = tail ;


    }
    public String getDate(){
        return data;
    }

    public void setData(String data){
        this.data = data;
    }
}
