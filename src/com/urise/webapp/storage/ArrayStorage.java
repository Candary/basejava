package com.urise.webapp.storage;
/*не забывай нажимать перед каждым коммитом для каждого класса, где были внесены изменения, Ctrl + Alt + L (это автоматическое форматирование кода)
        в save удали index. Так и используй size, как есть
        в get обращайся к size напрямую, а не через size()
        i < size()-1
        а зачем в методе get - 1?
        в delete, если удалять нечего, то эти строки
        storage[index] = null;        size--;
        все равно выполняться. А так быть не должно*/

import com.urise.webapp.model.Resume;

public class ArrayStorage {
    private Resume[] storage = new Resume[10000];
    private int size = 0;

    public void clear() {
        for (int i = 0; i < size; i++) {
            storage[i] = null;
        }
        size = 0;
    }

    public void save(Resume r) {
        if (size < storage.length) {
            storage[size] = r;
            size++;
        }
    }

    public Resume get(String uuid) {
        for (int i = 0; i < size(); i++) {
            if (uuid == storage[i].getUuid()) {
                return storage[i];
            }
        }
        return null;
    }

/*
    if(index != -1) {
        storage[index] = null;
        size--;
    }
*/

    public void delete(String uuid) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (storage[i].getUuid().equals(uuid)) {
                index = i;
                break;
            }
        }

        while (index != size - 1) {
            storage[index] = storage[index + 1];
            index++;
        }

        if(index != -1) {
            storage[index] = null;
            size--;
        }

    }

    void update (Resume resume) {
        ///
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    public Resume[] getAll() {
        Resume[] resumes = new Resume[size];
        for (int i = 0; i < size; i++) {
            resumes[i] = storage[i];
        }
        return resumes;
    }

    public int size() {
        return size;
    }
}