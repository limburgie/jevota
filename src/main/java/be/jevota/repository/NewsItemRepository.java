package be.jevota.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import be.jevota.domain.NewsItem;

public interface NewsItemRepository extends JpaRepository<NewsItem, Long> {

//	@Query("FROM NewsItem ORDER BY createDate DESC LIMIT :limit")
//	List<NewsItem> getLatestItems(@Query("limit") int count);

	@Query("FROM NewsItem ORDER BY createDate DESC")
	List<NewsItem> getAllItems();
	
}
