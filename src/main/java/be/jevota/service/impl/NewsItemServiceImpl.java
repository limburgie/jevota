package be.jevota.service.impl;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Transactional;

import be.jevota.domain.NewsItem;
import be.jevota.domain.PingpongPlayer;
import be.jevota.repository.NewsItemRepository;
import be.jevota.service.NewsItemService;

@Named
public class NewsItemServiceImpl implements NewsItemService {

	@Inject private NewsItemRepository repository;

	public NewsItem getItem(Long id) {
		return repository.findOne(id);
	}

	public List<NewsItem> getAllItems() {
		return repository.getAllItems();
	}
	
	public List<NewsItem> getLatestItems(int count) {
		return repository.getAllItems();
	}

	@Transactional
	public void saveItem(PingpongPlayer author, NewsItem item) {
		if(item.getId() == null) {
			item.setCreateDate(new Date());
			item.setInitialAuthor(author);
		}
		item.setLastAuthor(author);
		item.setModifiedDate(new Date());
		repository.save(item);
	}
	
}
