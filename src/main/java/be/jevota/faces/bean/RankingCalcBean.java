package be.jevota.faces.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import be.jevota.domain.rankingcalc.RankingScoreList;
import be.jevota.domain.type.Ranking;
import be.jevota.service.RankingCalculationService;

@Named @Scope("view")
public class RankingCalcBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject private RankingCalculationService calculationService;
	@Inject private LoginBean loginBean;
	
	private Ranking newRanking;
	private RankingScoreList scoreList;
	
	@PostConstruct
	public void init() {
		scoreList = new RankingScoreList();
		if(loginBean.isLoggedIn()) {
			scoreList.setCurrent(loginBean.getPlayer().getRanking());
		}
	}
	
	public RankingScoreList getScoreList() {
		return scoreList;
	}
	
	public void calculate() {
		newRanking = calculationService.calculateNewRanking(scoreList);
	}
	
	public void reset() {
		newRanking = null;
		scoreList.reset();
	}
	
	public Ranking getNewRanking() {
		return newRanking;
	}

}
