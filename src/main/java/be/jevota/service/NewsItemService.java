package be.jevota.service;

import java.util.List;

import be.jevota.domain.NewsItem;
import be.jevota.domain.PingpongPlayer;

public interface NewsItemService {

	NewsItem getItem(Long valueOf);

	List<NewsItem> getAllItems();

	void saveItem(PingpongPlayer author, NewsItem item);

	List<NewsItem> getLatestItems(int count);

}
