package be.jevota.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import be.jevota.domain.PhotoAlbum;

public interface PhotoAlbumRepository extends JpaRepository<PhotoAlbum, Long> {

	@Query("FROM PhotoAlbum ORDER BY date DESC")
	List<PhotoAlbum> getLatest(Pageable pageable);

}
