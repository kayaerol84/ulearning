package com.ulearning.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Ranking")
// @Inheritance(strategy=InheritanceType.JOINED)
//@XmlRootElement(name = "Ranking")
public class Ranking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	// ranked user
	// ranked by user
	// ranked as a teacher or learner
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ranked_user_id")
	private User rankedUser;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ranked_by_user_id")
	private User rankedByUser;

	@Enumerated(EnumType.STRING)
	private RankingType rankType;

	// it might be out of 5, 10 or 100
	@Column(precision=3, scale=5)
	private Float score;

	public Ranking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getRankedUser() {
		return rankedUser;
	}

	public void setRankedUser(User rankedUser) {
		this.rankedUser = rankedUser;
	}

	public User getRankedByUser() {
		return rankedByUser;
	}

	public void setRankedByUser(User rankedByUser) {
		this.rankedByUser = rankedByUser;
	}

	public RankingType getRankType() {
		return rankType;
	}

	public void setRankType(RankingType rankType) {
		this.rankType = rankType;
	}

	public Float getScore() {
		return score;
	}

	public void setScore(Float score) {
		this.score = score;
	}
	
	

}
