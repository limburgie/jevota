package be.jevota.faces.bean;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import be.jevota.domain.NewsItem;
import be.jevota.faces.FacesUtil;
import be.jevota.service.NewsItemService;

@Named @Scope("view")
public class NewsBean implements Serializable {

	private static final int NB_LATEST_ITEMS = 3;
	private static final long serialVersionUID = 1L;
	
	@Inject private NewsItemService newsService;
	@Inject private LoginBean loginBean;
	@Inject private AccountBean accountBean;
	
	private NewsItem item;
	private List<NewsItem> items;
	private List<NewsItem> latestItems;
	private String redirect;

	@PostConstruct
	public void init() {
		String itemId = FacesUtil.getRequestParam("itemId");
		redirect = FacesUtil.getRequestParam("redirect");
		if(redirect == null) {
			redirect = "/pages/news.xhtml?faces-redirect=true";
		}
		if (itemId != null) {
			item = newsService.getItem(Long.valueOf(itemId));
		} else {
			item = new NewsItem();
		}
	}
	
	public boolean isNewItem() {
		return item.getId() == null;
	}
	
	public List<NewsItem> getItems() {
		if(!isNewItem()) {
			return Collections.singletonList(item);
		}
		if(items == null) {
			items = newsService.getAllItems();
		}
		return items;
	}
	
	public List<NewsItem> getLatestItems() {
		if(latestItems == null) {
			latestItems = newsService.getLatestItems(NB_LATEST_ITEMS);
		}
		return latestItems;
	}
	
	public void toItem() {
		FacesUtil.redirect("/pages/news.jsf?itemId="+item.getId());
	}
	
	public String save() {
		if(!accountBean.isNewsMgr()) {
			return FacesUtil.unauthorizedError();
		}
		newsService.saveItem(loginBean.getPlayer(), item);
		FacesUtil.info("Nieuws werd succesvol opgeslagen!");
		return redirect;
	}
	
	public NewsItem getItem() {
		return item;
	}

	public void setItem(NewsItem item) {
		this.item = item;
	}

}
