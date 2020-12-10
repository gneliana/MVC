package Controller;

import Model.CourseClass;
import Model.StudentClass;
import View.RosterClass;

public class RosterController {
	private CourseClass model;
	private StudentClass model1;
	private RosterClass view;
	
	public RosterController(CourseClass model, StudentClass model1, RosterClass view) {
		this.model = model;
		this.model1 = model1;
		this.view = view;
	}

	public void setCourseTitle(String title) {
		model.setCourseTitle(title);
		
	}
	public String getCourseTitle(String title) {
		return model.getCourseTitle();
	}
	public void setCourseId(String cid) {
		model.setCourseTitle(cid);
		
	}
	public String getCourseId(String cid) {
		return model.getCourseId();
	}
	public void setStudentName(String name) {
		model1.setStudentName(name);
		
	}
	public String getStudentName(String name) {
		return model1.getStudentName();
	}
	public void setStudentId(String sid) {
		model1.setStudentId(sid);
		
	}
	public String getStudentId(String id) {
		return model1.getStudentId();
	}
	public void updateView() {
		view.printStudentDetails(model1.getStudentName(), model1.getStudentId(), model.getCourseTitle(), model.getCourseId());
	}
}
