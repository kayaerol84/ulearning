package com.ulearning.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Bookmarks of a user
 * @author e1070269
 *
 */
@Entity
@Table
public class LearnerList {

	private User user;
	/*
	 * bir kullanicinin teacher ya da learner i listeye eklemesine gerek yok
	 * follow etmesi yeterli
	 * bir ogrenci bir training save/bookmark edebilir. 
	 */
	private List<Training> savedTrainings;

}
