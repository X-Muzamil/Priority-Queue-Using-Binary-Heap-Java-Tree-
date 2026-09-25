class MaxHeap{
    int[] heap;
    int size;
    int capacity;

    MaxHeap(int capacity){
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    void insert(int value){
        if(size == capacity){
            System.out.println("Heap is full");
            return;
        }

        heap[size] = value;
        int current = size;
        size++;
        shiftup(current);
    }

    void shiftup(int index){
        int current = index;

        while(current > 0){
            int parent = (current - 1) / 2;
            if(heap[current] > heap[parent]){
                int temp = heap[current];
                heap[current] = heap[parent];
                heap[parent] = temp;

                current = parent;
            }
            else{
                break;
            }
        }
    }

    void display(){
        for(int i = 0; i < size; i++){
            System.out.println(heap[i] + " ");
        }
        System.out.println();
    }
}