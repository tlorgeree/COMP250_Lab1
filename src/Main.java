import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MessageQueue queue = new MessageQueue();//1. Initialize queue
        System.out.println(queue.getStatus(0));//2. Print status of new queue

        System.out.println("Please enter your message:\n>>>");
        String message = new Scanner(System.in).nextLine(); //3. Store user input message
        while(message.length() == 0){//Don't accept empty message
            System.out.println("Message was empty. Please enter your message.");
            message = new Scanner(System.in).nextLine(); //3. Store user input message
        }
        System.out.println("Please enter the name of the Sender:\n>>>");
        String sender = new Scanner(System.in).nextLine();
        while(sender.length() == 0){//Don't accept empty Sender
            System.out.println("Sender must be declared. Please enter the Sender.");
            sender = new Scanner(System.in).nextLine(); //3. Store user input message
        }
        System.out.println("Please enter the name of the Recipient:\n>>>");
        String recipient = new Scanner(System.in).nextLine();
        while(recipient.length() == 0){//Don't accept empty Recipient
            System.out.println("Recipient must be declared. Please enter the Sender.");
            recipient = new Scanner(System.in).nextLine(); //3. Store user input message
        }
        queue.enqueue(message, "From " + sender + " to "+recipient+"."); //4. call enqueue()
        System.out.println(queue.getStatus(0));//5. Print new status

        System.out.println(queue.head.letter);//6.Print the first and last letter of the queue
        while (queue.size > 0) {
            MessageFragment curr_char = queue.poll();
            if (queue.size == 0) System.out.println(curr_char.letter);
        }
        System.out.println("Message sent from " + sender + " to "+recipient+".");


    }
}
