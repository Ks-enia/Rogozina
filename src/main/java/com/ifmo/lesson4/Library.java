package com.ifmo.lesson4;

import java.util.HashMap;
import java.util.Map;

/**
 * Библиотека помогает вести учет книг: какие книги и сколько в ней хранятся.
 * Библиотека ограничена по числу типов книг, это ограничение задается аргументом
 * конструктора maxBookKinds. Например, если библиотека ограничена числом 10,
 * то это означает, что она может хранить 10 разных книг, но любое их количество.
 * <p>
 * Если из библиотеки убираются все книги одного типа, то освобождается место,
 * на которое можно добавить книгу другого типа.
 * Например:
 * <pre>
 *     Library library = new Library(2);
 *     library.put(new Book("Stephen King", "Shining"), 2); // return true
 *     library.put(new Book("Stephen King", "Dark Tower"), 3); // return true
 *
 *     // Эту книгу добавить не можем, т.к. лимит 2
 *     library.put(new Book("Tolstoy", "War and peace"), 6); // return false
 *
 *     // Забираем все книги Тёмной башни, чтобы освободить место.
 *     library.take(new Book("Stephen King", "Dark Tower"), 3) // return 3
 *
 *     // Теперь мы можем успешно добавить "Войну и мир".
 *     library.put(new Book("Tolstoy", "War and peace"), 6); // return true
 * </pre>
 * <p>
 * Если попытаться взять из библиотеки больше книг, чем у нее есть, то она
 * должна вернуть только число книг, которые в ней находились и освободить место.
 * Например:
 *
 * <pre>
 *     Library library = new Library(2);
 *     library.put(new Book("Stephen King", "Shining"), 2); // return true
 *
 *     // Все равно вернет 2, т.к. больше нет.
 *     library.take(new Book("Stephen King", "Shining"), 10) // return 2
 * </pre>
 */
public class Library {
    private final int maxBookKinds;
    private final Map<Book, Integer> books = new HashMap<>();

    public Library(int maxBookKinds) {
        this.maxBookKinds = maxBookKinds;
    }

    /**
     * Add books to library.
     *
     * @param book     Book to add.
     * @param quantity How many books to add.
     * @return {@code True} if book successfully added, {@code false} otherwise.
     */
    public boolean put(Book book, int quantity) {
        Integer bookCount = books.get(book);
        if (bookCount != null) {
            // такая книга уже есть. увеличим их кол-во
            bookCount = bookCount + quantity;
            books.put(book, bookCount);
            return true;
        } else {
            // такой книги еще не было
            if (books.size() < maxBookKinds) {
                // есть место
                books.put(book, quantity);
                return true;
            }
        }
        return false;
    }

    /**
     * Take books from library.
     *
     * @param book     Book to take.
     * @param quantity How many books to take.
     * @return Actual number of books taken.
     */
    public int take(Book book, int quantity) {
        if (quantity > 0) {
            Integer bookCount = books.get(book);
            if (bookCount != null) {
                // такая книга есть
                int newBookCount = bookCount - quantity;
                if (newBookCount <= 0) {
                    books.remove(book);
                    return bookCount;
                } else {
                    books.put(book, newBookCount);
                    return quantity;
                }
            }
        }
        return 0;
    }
}
