public class Lessens3 {
    public static void main(String[] args)  throws java.io.IOException {
            char ch;
            int i;

            for (i = 0;;) {
                do {
                    ch = (char) System.in.read();
                    if (ch >= 'a' & ch <= 'z') {
                        ch -= 32;
                        i++;
                        System.out.print(ch);
                    }
                    else if (ch >= 'A' & ch <= 'Z') {
                        ch += 32;
                        i++;
                        System.out.print(ch);
                    }

                } while (ch != '.');
                System.out.println("\n" + i + " chenges");
            }
    }
}

