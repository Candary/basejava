import java.util.Arrays;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    int size;

    void clear() {
        Arrays.fill(storage, 0, size, null);
    }

    void save(Resume r) {
        this.storage[size] = r;
        size++;
    }

    String get(String uuid) {
        return uuid;
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
        return storage;
    }

    int size() {
        return storage.length;
    }
}
