package com.mrtrying.queue;

public class TestCircularQueue {
    public static void main(String[] args) {
        MyCircularQueue circularQueue = new MyCircularQueue(6);
        System.out.println(circularQueue.enQueue(6)); // 返回 true
        System.out.println(circularQueue.Rear());//返回6
        System.out.println(circularQueue.Rear());//返回6
        System.out.println(circularQueue.deQueue()); // 返回 true
        System.out.println(circularQueue.enQueue(5)); // 返回 true
        System.out.println(circularQueue.Rear()); // 返回 5
        System.out.println(circularQueue.deQueue()); // 返回 true
        System.out.println(circularQueue.Front()); // 返回 -1
        System.out.println(circularQueue.deQueue()); // 返回 false
        System.out.println(circularQueue.deQueue()); // 返回 false
        System.out.println(circularQueue.deQueue()); // 返回 false
    }

    /**
     * Your MyCircularQueue object will be instantiated and called as such:
     * MyCircularQueue obj = new MyCircularQueue(k);
     * boolean param_1 = obj.enQueue(value);
     * boolean param_2 = obj.deQueue();
     * int param_3 = obj.Front();
     * int param_4 = obj.Rear();
     * boolean param_5 = obj.isEmpty();
     * boolean param_6 = obj.isFull();
     */
    static class MyCircularQueue {
        int head = -1;
        int tail = -1;
        int max;
        int arr[];


        public MyCircularQueue(int k) {
            this.max = k;
            this.arr = new int[max];
            for (int i = 0; i < this.arr.length; i++) {
                arr[i] = -1;
            }
        }

        public boolean enQueue(int value) {
            if (isFull()) {
                return false;
            }
            if(head == -1){
                head = 0;
            }
            tail = ++tail % max;
            this.arr[tail] = value;
            return true;
        }

        public boolean deQueue() {
            if(isEmpty()){
                return false;
            }
            this.arr[head] = -1;
            if(head == tail){
                head = -1;
                tail = -1;
                return true;
            }
            head = ++head % max;
            return true;
        }

        public int Front() {
            if(isEmpty()){
                return -1;
            }
            return this.arr[head];
        }

        public int Rear() {
            if(isEmpty()){
                return -1;
            }
            return this.arr[tail];
        }

        public boolean isEmpty() {
            return head == -1 && tail == -1;
        }

        public boolean isFull() {
            return (this.head == 0 && this.tail == this.max - 1)
                    || (this.head - this.tail == 1);
        }
    }


}

