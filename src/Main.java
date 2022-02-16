import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MessageQueue queue = new MessageQueue();
        System.out.println(queue.getStatus(0));

        System.out.println("Please enter your message:\n>>>");
        String message = new Scanner(System.in).nextLine();
        queue.enqueue(message,"From [Sender] to [Recipient].");
        System.out.println(queue.getStatus(0));
        System.out.println(queue.head.letter);
        while(queue.size > 0){
            MessageFragment curr_char = queue.poll();
           if (queue.size ==0) System.out.println(curr_char.letter);
        }

    }
}
