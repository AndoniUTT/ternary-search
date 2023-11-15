public class App {

    public static int ternarySearch(int[] array, int i, int k, int key){
        while (k >= i) {
            int mid1 = i + (k - i) / 3;
            int mid2 = k - (k - i) / 3;

            if (array[mid1] == key) {
                return mid1;
            }

            if (array[mid2] == key) {
                return mid2;
            }

            if (key < array[mid1]) {
                k = mid1 - 1;
            } else if (key > array[mid2]) {   
                i = mid2 + 1;
            } else {
                i = mid1 + 1;
                k = mid2 - 1;
            }
        }
        return -1;  // regresamos una sentencia negativa si la clave no se encuentra en el arreglo
    }


    public static void main(String[] args) throws Exception {
        int[] testArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int keyToSearch = 23; //Usaré una key predifinida para pruebas, despues se modificará para que el usario la digite

        int result = ternarySearch(testArray, 0, testArray.length - 1, keyToSearch);
    }
}
