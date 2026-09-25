class MinHeap{
    int[] heap;
    int size;
    int capacity;

    MinHeap(int capacity){
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    void insert(int value){
        if(size >= capacity){
            System.out.println("MinHeap is full!");
            return;
        }

        heap[size] = value;
        int current = size;
        size++;

        shiftUp(current);
    }

    void shiftUp(int index){
        int current = index;

        while(current > 0){
            int parent = (current - 1)/ 2;

            if(heap[current] < heap[parent]){
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
            System.out.print(heap[i] + " ");
        }
    }
}