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

    int deleteMax(){
        if(size == 0){
            System.out.println("Heap is Empty");
            return -1;
        }
        int max = heap[0];
        heap[0] = heap[size - 1];
        shiftdown(0);
        return max;
    }

    void shiftdown(int index){
        while (true) {
            int largest = index;
            int left = 2 * index + 1;
            int right = 2 * index + 2;

            if(left < size && heap[left] > heap[largest])
                largest = left;
            if(right < size && heap[right] > heap[largest])
                largest = right;
            if(largest != index){
                int temp = heap[index];
                heap[index] = heap[largest];
                heap[largest] = temp;
                index = largest;
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