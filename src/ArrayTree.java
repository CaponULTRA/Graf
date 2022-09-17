public class ArrayTree {
    private int[] tree = new int[14];
    public ArrayTree(){

    }
    public void ad(int i){
        int j = 0;
        while (j<14){
            if (i > tree[j]){
                if (tree[j]==0) {
                    tree[j]=i;
                    return;
                }
                j = 2*j+1;
            }
            if (i < tree[j]){
                if (tree[j]==0) {
                    tree[j]=1;
                    return;
                }
                j = 2*j+2;

            }

    }}

}
