package searchtree;

public class BinarySearchTree {

    public Node root;

    public BinarySearchTree(){
        root = null;
    }

    public void insertNode(int key){
        root = insertRec(root, key);
    }

    public Node search(Node root, int key){
        if(root == null || root.key == key) {           //Ha nincs ilyen csúcs, vagy megtaláltuk
            return root;
        }
        if(root.key > key){
            return search(root.left, key);              //Ha a keresett elem kisebb, balra megyünk a részfában.
        }
        return search(root.right, key);                 //Ha egyik sem akkor jobbra megyünk
    }

    public Node insertRec(Node root, int key){
        if(root == null){                               //Ha leértünk a fa aljára
            root = new Node(key);
            return root;
        }
        if(root.key > key){                             //Ha a bal részfába megyünk, a bal gyereket frissítjük
            root.left = insertRec(root.left, key);
        } else if (root.key < key){                     //jobb részfa
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    public void inorderTreeWalk(Node root){
        if(root != null){
            inorderTreeWalk(root.left);
            System.out.print(root.key + " ");
            inorderTreeWalk(root.right);
        }
    }


}
