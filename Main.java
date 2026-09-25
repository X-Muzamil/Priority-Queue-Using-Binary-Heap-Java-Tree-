class Main{

    public static void main(String args[]){
    MaxHeap mx = new MaxHeap(10);

    mx.insert(4);
    mx.insert(77);
    mx.insert(33);
    mx.insert(5);
    mx.insert(1);
    mx.insert(22);
    mx.insert(8);
    mx.insert(66);
    mx.insert(121);
    mx.insert(222);
    mx.display();
    System.out.println();
    System.out.println("Delete max " + mx.deleteMax());
    mx.display();
    System.out.println();
    System.out.println("Delete max " + mx.deleteMax());
    mx.display();

    System.out.println();
    System.out.println("Find index  " + mx.findIndex(5));
    System.out.println("Get max " + mx.getMax());
    mx.display();
    

    MinHeap mh = new MinHeap(6);

        mh.insert(33);
        mh.insert(99);
        mh.insert(44);
        mh.insert(55);
        mh.insert(1);
        mh.insert(2);

        mh.display();
    }

}
