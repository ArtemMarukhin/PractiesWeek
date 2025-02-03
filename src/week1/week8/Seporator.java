package week1.week8;

public class Seporator {
    int array[];

    public Seporator(int[] array) {
        this.array = array;
    }

    int[] even(){
        int k = 0, now = 0;
        for (int i : array) {
            if(i % 2 == 0){
                k++;
            }
        }
        int[] evens = new int[k];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                evens[now] = array[i];
                now += 1;
            }
        }

        return evens;
    }

    int odd(){
        int k = 0, now =0;
        for (int i : array) {
            if (i%2 != 0){
                k++;
            }
        }
        int[] odd = new int[k];
        for (int i = 0; i < array.length; i ++) {
            if (array[i] % 2 != 0){
                odd[now] = array[i];
                now += 1;
            }
        }
        return odd();
    }
}
