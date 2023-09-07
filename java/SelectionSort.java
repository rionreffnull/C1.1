// Youtube Video
// https://www.youtube.com/watch?v=w-09HDGAiTA

class SelectionSort {
    public static void main(String[] args) {
        int[] data = { 10, 83, 52, 77, 29, 41, 3 };
        int K = 0;
        int L = data.length - 1;
        
        while(K != L) {
            int min_index = K;

            // Mencari index Nilai yang terkecil
            for(int i=K; i<=L; i++) {
                if(data[i] < data[min_index]) {
                    min_index = i;
                }
            }
            
            // Menukar nilai
            int temp = data[K];
            data[K] = data[min_index];
            data[min_index] = temp;
            
            K += 1;
        }
        
        for(int i=0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
