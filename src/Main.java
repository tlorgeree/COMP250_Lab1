import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MessageQueue queue = new MessageQueue();//1. Initialize queue
        System.out.println(queue.getStatus(0));//2. Print status of new queue

        System.out.println("Please enter your message:\n>>>");
        String message = new Scanner(System.in).nextLine(); //3. Store user input message
        queue.enqueue(message, "From [Sender] to [Recipient]."); //4. call enqueue()
        System.out.println(queue.getStatus(0));//5. Print new status
        if (queue.size >0) {//in case the use passed an empty message earlier
            System.out.println(queue.head.letter);//6.Print the first and last letter of the queue
            while (queue.size > 0) {
                MessageFragment curr_char = queue.poll();
                if (queue.size == 0) System.out.println(curr_char.letter);
            }
        }else System.out.println("The queue is empty, no characters to return.");

    }
}
