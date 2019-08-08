public class StringOperation {

    public static int removeElement(String str[], int size) {
        String temp[] = new String[size];
        int j = 0;
        if (size == 0 || size == 1) {
            return size;
        }
        for (int i = 0; i < size - 1; i++) {

            if (str[i].equals(str[i + 1])) {
                temp[j++] = str[i];

            }

        }
        temp[j++] = str[size - 1];
        for (int i = 0; i < j; i++) {
            str[i] = temp[i];

        }
        return j;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str[] = { "vineet", "kumar", "vineet", "kumar", "gupta" };
        int size = str.length;

        size = removeElement(str, size);
        for (int i = 0; i < size; i++) {
            System.out.print(str[i] + "");
        }

    }
}
