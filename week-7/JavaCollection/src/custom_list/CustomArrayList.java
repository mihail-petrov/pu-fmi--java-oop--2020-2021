package custom_list;

public class CustomArrayList<T> {

    private int placeholderPointer = 0;
    private Object[] collection;

    public CustomArrayList() {
        this.collection = new Object[5];
    }

    public void add(Object element) {
        
        if(this.placeholderPointer == this.collection.length) {
            extendListCollection();    
        }
        
        this.collection[this.placeholderPointer++] = element;
    }

    private void extendListCollection() {

        // 1. Създаваме нов масив който има размерност
        // поне 2 пъти по голяма от съществуващата
        Object[] extendedCollection = new Object[this.collection.length * 2];

        // 2. Прехвърляме всички елементи от съществуващата
        // колекция в новата, последователно
        for(int i = 0; i < this.collection.length; i++) {
            extendedCollection[i] = this.collection[i];
        }

        // 3. присвояваме новата колекция към указателя
        // на класа (this.collection)
        this.collection = extendedCollection;
    }

    public T get(int index) {
        return (T)this.collection[index];
    }
}
