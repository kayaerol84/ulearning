package com.ulearning.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ulearning.controller.FeedbackController;
import com.ulearning.controller.FollowerController;
import com.ulearning.controller.LearnerController;
import com.ulearning.controller.LearningSessionController;
import com.ulearning.controller.LoginController;
import com.ulearning.controller.PaymentController;
import com.ulearning.controller.RequestController;
import com.ulearning.controller.TeacherController;
import com.ulearning.controller.TrainingController;
import com.ulearning.controller.UserController;

@Component
public class MainBean {
	
	private LearnerController learnerController;
	private PaymentController paymentController;
	private TeacherController teacherController;
	private UserController userController;
	private FollowerController followerController;
	private TrainingController trainingController;
	private LearningSessionController learningSessionController;
	private RequestController requestController;
	private LoginController loginController;
	private FeedbackController feedbackController;
	
	public LearnerController getLearnerController() {
		return learnerController;
	}
	@Autowired
	public void setLearnerController(LearnerController learnerController) {
		this.learnerController = learnerController;
	}
	
	public TeacherController getTeacherController() {
		return teacherController;
	}
	@Autowired
	public void setTeacherController(TeacherController teacherController) {
		this.teacherController = teacherController;
	}
	public UserController getUserController() {
		return userController;
	}
	@Autowired
	public void setUserController(UserController userController) {
		this.userController = userController;
	}
	public FollowerController getFollowerController() {
		return followerController;
	}
	@Autowired
	public void setFollowerController(FollowerController followerController) {
		this.followerController = followerController;
	}
	public TrainingController getTrainingController() {
		return trainingController;
	}
	@Autowired
	public void setTrainingController(TrainingController trainingController) {
		this.trainingController = trainingController;
	}
	public LearningSessionController getLearningSessionController() {
		return learningSessionController;
	}
	@Autowired
	public void setLearningSessionController(LearningSessionController learningSessionController) {
		this.learningSessionController = learningSessionController;
	}
	public PaymentController getPaymentController() {
		return paymentController;
	}
	@Autowired
	public void setPaymentController(PaymentController paymentController) {
		this.paymentController = paymentController;
	}
	public RequestController getRequestController() {
		return requestController;
	}
	@Autowired
	public void setRequestController(RequestController requestController) {
		this.requestController = requestController;
	}
	public LoginController getLoginController() {
		return loginController;
	}
	@Autowired
	public void setLoginController(LoginController loginController) {
		this.loginController = loginController;
	}
	public FeedbackController getFeedbackController() {
		return feedbackController;
	}
	@Autowired
	public void setFeedbackController(FeedbackController feedbackController) {
		this.feedbackController = feedbackController;
	}
}
