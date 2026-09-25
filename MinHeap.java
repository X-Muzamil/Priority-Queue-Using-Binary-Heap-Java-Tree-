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

    int deleteMin(){
        if(size == 0){
            System.out.println("The heap is empty");
            return -1;
        }

        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        shiftDown(0);  
        return min; 
    }

    void shiftDown(int index){
        while(true){
            int smallest = index;
            int left = (2 * index + 1);
            int right = (2 * index + 2);

            if(left < size && heap[left] < heap[smallest])
                smallest = left;
            if(right < size && heap[right] < heap[smallest])
                smallest = right;

            if(smallest != index){
                int temp = heap[index];
                heap[index] = heap[smallest];
                heap[smallest] = temp;

                index = smallest;
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