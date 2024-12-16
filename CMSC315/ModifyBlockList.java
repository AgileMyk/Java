import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ModifyBlockList {

        public static void main(String[] args) throws IOException {
            if (args.length < 1) {
                System.out.println("A minimum of one files are required: a source file to be edited, resulting in destination file");
                System.exit(0);
            }
            File destFile = new File("hosts_block.txt");

            try (
                    Scanner sc1 = new Scanner(args[0]);
                    PrintWriter pw = new PrintWriter(destFile)
            ) {
                String currentLine = sc1.nextLine();
            }
        }

}
