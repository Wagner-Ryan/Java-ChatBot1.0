import java.util.Scanner;
/**
 * Ryan Wagner
 * 02/05/2021
 * Chatbot runner
 */

public class MagpieRunner2
{

    /**
     * Create a Magpie, give it user input, and print its replies.
     */
    public static void main(String[] args)
    {
        Magpie2 maggie = new Magpie2();

        System.out.println (maggie.getGreeting());
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();

        while (!statement.equals("Bye"))
        {
            System.out.println (maggie.getResponse(statement));
            statement = in.nextLine();
        }
    }

}
