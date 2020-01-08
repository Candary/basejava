/*не забывай нажимать перед каждым коммитом для каждого класса, где были внесены изменения, Ctrl + Alt + L (это автоматическое форматирование кода)
        в save удали index. Так и используй size, как есть
        в get обращайся к size напрямую, а не через size()
        i < size()-1
        а зачем в методе get - 1?
        в delete, если удалять нечего, то эти строки
        storage[index] = null;        size--;
        все равно выполняться. А так быть не должно*/

public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    int size = 0;

    void clear() {
        for (int i = 0; i < size; i++) {
            storage[i] = null;
        }
        size = 0;
    }

    void save(Resume r) {
        if (size < storage.length) {
            storage[size] = r;
            size++;
        }
    }

    Resume get(String uuid) {
        for (int i = 0; i < size(); i++) {
            if (storage[i].uuid.equals(uuid)) {
                return storage[i];
            }
        }
        return null;
    }

    void delete(String uuid) {
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (storage[i].uuid.equals(uuid)) {
                index = i;
                break;
            }
        }

        while (index != size - 1) {
            storage[index] = storage[index + 1];
            index++;
        }

        storage[index] = null;
        size--;

    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        Resume[] resumes = new Resume[size];
        for (int i = 0; i < size; i++) {
            resumes[i] = storage[i];
        }
        return resumes;
    }

    int size() {
        return size;
    }
}