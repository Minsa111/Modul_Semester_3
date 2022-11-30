import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;


public class HuffmanSorting {

        public static void printRoot(HuffmanNode root, String s)
        {

            if (root.left == null && root.right == null && Character.isLetter(root.c)) {

                System.out.println(root.c + ":" + s);

                return;
            }


            printRoot(root.left, s + "0");
            printRoot(root.right, s + "1");
        }

        // main function
        public static void main(String[] args)
        {

            Scanner s = new Scanner(System.in);

            int n = 6;
            char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' };
            int[] charfreq = { 5, 89, 12, 13, 16, 45 };

            PriorityQueue<HuffmanNode> q = new PriorityQueue<HuffmanNode>(n, new MyComparator());

            for (int i = 0; i < n; i++) {

                HuffmanNode node = new HuffmanNode();

                node.c = charArray[i];
                node.num = charfreq[i];

                node.left = null;
                node.right = null;


                q.add(node);
                System.out.println(node.num);
            }

            HuffmanNode root = null;

            while (q.size() > 1) {

                HuffmanNode x = q.peek();
                q.poll();

                HuffmanNode y = q.peek();
                q.poll();

                HuffmanNode f = new HuffmanNode();


                f.num = x.num + y.num;
                f.c = '-';

                f.left = x;

                f.right = y;

                root = f;

                q.add(f);
            }

            printRoot(root, "");

        }
    }


    class HuffmanNode {

        int num;
        char c;

        HuffmanNode left;
        HuffmanNode right;
    }


    class MyComparator implements Comparator<HuffmanNode> {
        public int compare(HuffmanNode x, HuffmanNode y)
        {
            return x.num - y.num;
        }

}
/*Contributed by:
    - Aminudin Muhibbullah      / 465
    - Bahrul Ulum Fadlurrahman  / 462
    - Muhammad Gusnadir         / 481
*/
