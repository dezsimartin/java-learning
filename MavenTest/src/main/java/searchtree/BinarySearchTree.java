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

    public Node deleteRecord(Node root, int key){
        if(root == null) return root;                   //Ha nem találtuk meg a keresett elemet.
        if(key < root.key) {                            //Ha a keresett elem a bal részfában lehet, keressük tovább.
            root.left = deleteRecord(root.left, key);
        } else if(key > root.key) {                     //Ha a keresett elem a jobb részfában..
            root.right = deleteRecord(root.right, key);
        } else {                                       //Megtaláltuk a törlendő elemet
        if(root.left == null) {
            return root.right;                          //Mindenképpen a right csúcsot adjuk vissza. (ha null akkor is)
        } else if(root.right == null) {
            return root.left;
        }
        root.key = successor(root.right);                       // Successor - kicseréljük a sor rákövetkező elemével, ha van két gyereke
        root.right = deleteRecord(root.right, root.key);        //Töröljük a rákövetkező elemet a régi helyéről
        }
        return  root;
    }

    private int successor(Node root){
        int min = root.key;
        while(root.left != null){
            min = root.left.key;
            root = root.left;
        }
        return min;
    }

}
