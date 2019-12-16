import java.util.Arrays;

/**
 * Array based storage for Resumes
 */


//        • Resume get
//        метод должен вернуть Resume, а не uuid
//        • метод size() должен возвращать количество резюме в массиве
//        • метод getAll() должен возвращать все резюме, безе null
//        ты ничего по сути не реализовал в этом дз

public class ArrayStorage {
    Resume[] storage = new Resume[5];
    int size;

    void clear() {
        Arrays.fill(storage, 0, size, null);
    }

    void save(Resume r) {
        this.storage[size] = r;
        size++;
    }

    Resume get(String uuid) {
        return null;
    }

    void delete(String uuid) {
        int removeIndex = Arrays.toString(storage).indexOf(uuid);

        for(int i = removeIndex; i < storage.length - 1; i++){
            storage[i] = storage[i + 1];
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        int k=0;
        String result="";
        for(int i=0; i < storage.length; i++) {
            if(storage[i]!=null) {
                if(k > 0)
                    result=", ";
                result+=(storage[i]);
                k++;
            }
        }
        return Arrays.
    }

    int size() {
        return storage.length;
    }
}
