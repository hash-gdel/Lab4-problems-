package problem2;

public class IntegerList
{
    int[] list;
    int count;
    int size;

    public IntegerList(int size) {
        if (size < 1) {
            size = 1;
        }
        this.size = size;
        list = new int[size];
        count = size;
    }

    public void randomize() {
        for (int i = 0; i < count; i++) {
            list[i] = (int) (Math.random() * 100) + 1;
        }
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(i + ":\t" + list[i]);
        }
    }

    public void increaseSize() {
        int[] bigger = new int[size * 2];
        for (int i = 0; i < count; i++) {
            bigger[i] = list[i];
        }
        list = bigger;
        size = size * 2;
    }

    public void addElement(int newVal) {
        if (count == size) {
            increaseSize();
        }
        list[count] = newVal;
        count++;
    }

    public void removeFirst(int newVal) {
        for (int i = 0; i < count; i++) {
            if (list[i] == newVal) {
                for (int j = i; j < count - 1; j++) {
                    list[j] = list[j + 1];
                }
                count--;
                return;
            }
        }
    }

    public void removeAll(int newVal) {
        for (int i = 0; i < count; i++) {
            if (list[i] == newVal) {
                removeFirst(newVal);
                i--;
            }
        }
    }
}