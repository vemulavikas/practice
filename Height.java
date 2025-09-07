class Tree{
    int val;
  Tree l,r;
  Tree(int val){
    this.val=val;
  } 
}
public class Height {
    public static int h(Tree root){
        if(root==null)
        return 0;
        else{
            return 1+Math.max(h(root.l),h(root.r));
        }
    }
    public static void main(String[] args) {
        Tree root=new Tree(1);
        root.l=new Tree(2);
        root.r=new Tree(3);
        System.out.println(h(root));
    }

}
