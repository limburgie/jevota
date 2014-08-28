package be.jevota.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class NewsItem {

	@Id @GeneratedValue private Long id;

	private String title;

	@Lob private String body;

	private Date createDate;
	private Date modifiedDate;

	private String imageUrl;

	@OneToOne
	private PingpongPlayer initialAuthor;

	@OneToOne
	private PingpongPlayer lastAuthor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public PingpongPlayer getInitialAuthor() {
		return initialAuthor;
	}

	public void setInitialAuthor(PingpongPlayer initialAuthor) {
		this.initialAuthor = initialAuthor;
	}

	public PingpongPlayer getLastAuthor() {
		return lastAuthor;
	}

	public void setLastAuthor(PingpongPlayer lastAuthor) {
		this.lastAuthor = lastAuthor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NewsItem other = (NewsItem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
