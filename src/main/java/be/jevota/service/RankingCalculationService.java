package be.jevota.service;

import be.jevota.domain.rankingcalc.RankingScoreList;
import be.jevota.domain.type.Ranking;

public interface RankingCalculationService {

	Ranking calculateNewRanking(RankingScoreList rankingScoreList);
	
}
