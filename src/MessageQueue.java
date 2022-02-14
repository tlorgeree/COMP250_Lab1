public class MessageQueue {
    boolean inUse = false;
    int size = 0;
    MessageFragment head = null;
    MessageFragment tail = null;
    String sendReceive;//names od sender and recipient

    public void clear(){
        size = 0;
        head = null;
        tail = null;
    }

    public String getStatus(int num){
        if (inUse) return "Queue #"+ num
        +": Available";
        else return "Queue #"+ num
                +": Unavailable.\n" + size
                + " characters remaining.";
    }

    public MessageFragment poll(){
        MessageFragment currHead = null;
        if (size == 0){
            System.out.println("Queue is empty");
        }else{
            currHead = head;
            head = head.nextFragment;
            --size;
        }
        return currHead;
    }



}
