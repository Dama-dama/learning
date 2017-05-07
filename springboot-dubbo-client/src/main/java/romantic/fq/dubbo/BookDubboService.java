package romantic.fq.dubbo;

import romantic.fq.model.Book;

/**
 * Created by fengqing on 2017/5/7.
 */
public interface BookDubboService {
    void insertBook(Book book);
    Book getBookById(Long id);
    Book queryBookByName(String bookName);
}
