package be.jevota.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import be.jevota.domain.Photo;

public interface PhotoRepository extends JpaRepository<Photo, Long> {

}
