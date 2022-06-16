package web.DAO;

import java.util.List;

public interface DAO<T> {
    List<T> getItemsByCount(int count);
    List<T> getAllItems();
}
