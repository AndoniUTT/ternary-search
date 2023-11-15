public class App {

    public static int ternarySearch(int[] array, int i, int k, int key){
    }


    public static void main(String[] args) throws Exception {
        int[] testArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int keyToSearch = 23; //Usaré una key predifinida para pruebas, despues se modificará para que el usario la digite

        int result = ternarySearch(testArray, 0, testArray.length - 1, keyToSearch);
    }
}
