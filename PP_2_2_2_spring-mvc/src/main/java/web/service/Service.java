package web.service;

import java.util.List;

public interface Service<T> {
    List<T> getItemsByCount(String count);
    List<T> getAllItems();
}
