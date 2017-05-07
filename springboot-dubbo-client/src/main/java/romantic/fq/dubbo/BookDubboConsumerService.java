package romantic.fq.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import romantic.fq.model.Book;

/**
 * Created by fengqing on 2017/5/7.
 */
@Component
public class BookDubboConsumerService {
    @Reference(version = "1.0.1")
    BookDubboService bookDubboService;

    public void testBookDubboConsumerService(){
        /*Long id = 1L;
        Book book = bookDubboService.getBookById(id);
        System.out.println("书名是："+book==null?"":book.getBookName());*/
        System.out.println("hhhhhhhhhhh");
    }

}
