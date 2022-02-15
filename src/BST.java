import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
public class BST {

        static class Node
        {
            int data;
            Node left, right;

            public Node(int d)
            {
                data = d;
                left = right = null;
            }
        }


            static Node buildTree(String str)
            {
                // Corner Case
                if(str.length() == 0)
                    return null;
                String[] s = str.split(" ");

                Node root = new Node(Integer.parseInt(s[0]));
                Queue <Node> q = new LinkedList<>();
                q.add(root);

                // Starting from the second element
                int i = 1;
                while(!q.isEmpty() && i < s.length)
                {
                    // Get and remove the front of the queue
                    Node currNode = q.remove();

                    // Get the current node's value from the string
                    String currVal = s[i];

                    // If the left child is not null
                    if(!currVal.equals("N"))
                    {

                        // Create the left child for the current node
                        currNode.left = new Node(Integer.parseInt(currVal));

                        // Push it to the queue
                        q.add(currNode.left);
                    }

                    // For the right child
                    i++;
                    if(i >= s.length)
                        break;
                    currVal = s[i];

                    // If the right child is not null
                    if(!currVal.equals("N"))
                    {

                        // Create the right child for the current node
                        currNode.right = new Node(Integer.parseInt(currVal));

                        // Push it to the queue
                        q.add(currNode.right);
                    }

                    i++;
                }

                return root;
            }

            public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int t = Integer.parseInt(br.readLine().trim());
                while(t>0)
                {
                    String s = br.readLine();
                    Node root = buildTree(s);

                    Solution T = new Solution();
                    root = T.modify(root);
                    inorder(root);
                    System.out.println();
                    t--;
                }
            }

            static void inorder(Node root)
            {
                if(root==null)  return;

                inorder(root.left);
                System.out.print(root.data + " ");
                inorder(root.right);
            }

// Solution starts from here 

        static class Solution{

            // modify the BST and return its root
            public static class Sum {
                int sum =0;
            }
            public Node modify(Node root)
            {
                //Write your code here
                Sum s = new Sum();
                
                reverseOrder(root,s);
                return root;


            }
            public void reverseOrder(Node root,Sum s){

                if ( root == null) {
                    return;
                }
                reverseOrder(root.right,s);
                s.sum+= root.data;
                root.data = s.sum;
                reverseOrder(root.left,s);


            }

        }
}
