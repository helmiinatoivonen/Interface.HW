package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) throws IOException {
        /*
       Ex. 1

           1.2: it provides a possibility for peripheral communication and
                overall security of the computer system.
           1.3: to have software applications and GUI already provided by the OS,
                so that you don't have to implement these applications and elements
                yourself, you can just state their existence.
           1.4: logical memory is the address space, assigned to a logical partition,
                that the operating system perceives as its main storage.
           1.5: virtual memory is a section of volatile memory created temporarily
                on the storage drive. It is created when a computer is running many
                processes at once and RAM is running low.
           1.6: As the number of bits composing a string increases, the number of
                possible 0 and 1 combinations increases exponentially, so 6 bits
                can represent 2^6 = 64
                Or, 2^n where n is the number of bits used.
          1.7: a system call is a request from computer software to an operating
                system's kernel. The kernel is a computer program at the core of
                a computer's operating system and has complete control over
                everything in the system.

        Ex. 2

         A = 10, B = 11, C = 12, D = 13, E = 14, F = 15

            2.1: 1100110 base 2 is 102 in decimal
            2.2: 1100110 base 2 is 66 in hexadecimal
            2.3: 8C2A base 16 is 1000110000101010 in binary
            2.4: 12B3 base 16 is 0001001010110011 in decimal

        Ex. 3

            3.1: a byte is 8 bits, and a byte can only take 256 values
            3.2: 9 bits / 512 values
            3.3: 2 bytes

        Ex. 4

        GregorianCalendar cal = new GregorianCalendar ();
        System.out.println("current time: " + cal.getTime());

        Ex. 5

        FileWriter writer = new FileWriter ("15ints.txt");
        writer.write ("integers");

        //an object to hold the file
        File file = new File("15ints.txt");

        //file read
        BufferedReader reader = new BufferedReader (new FileReader(file));

        // keep track of current line
        String st;

        Integer sum = 0;

        try {
            // go through each line of the file and sum up the numbers
            while ((st = reader.readLine()) != null) {
                sum += Integer.parseInt (st);
                System.out.println (st); // printing each line read from file
            }

            System.out.println ("the sum of all numbers in text file: "  + sum);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


        Ex. 6 */

        if (args.length < 2)
        {
            System.out.println ("too few arguments");
        }

        try (Scanner input = new Scanner(new File(args [1])))

        {
            while (input.hasNext())
                System.out.println (input.next().length());
        }
        catch (Exception e)
        {
            System.out.println ("got exception: " + e);
            System.exit (1);
        }
    }
}
