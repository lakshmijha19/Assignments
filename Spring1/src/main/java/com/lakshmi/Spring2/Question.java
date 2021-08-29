package com.lakshmi.Spring2;

import java.util.Iterator;
import java.util.Map;

public class Question {
	
	private int questionID;
	private String question;
//	private List<String> answers;
//	private Set<String> answers;
	private Map<Integer,String> answers;
	
//	public Set<String> getAnswers() {
//		return answers;
//	}
//	public void setAnswers(Set<String> answers) {
//		this.answers = answers;
//	}
	
	public Map<Integer, String> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<Integer, String> answers) {
		this.answers = answers;
	}
	public int getQuestionID() {
		return questionID;
	}
	public void setQuestionID(int questionID) {
		this.questionID = questionID;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
//	public List<String> getAnswers() {
//		return answers;
//	}
//	public void setAnswers(List<String> answers) {
//		this.answers = answers;
//	}
	
	public void display()
	{
		System.out.println(getQuestionID() +" "+ getQuestion());
		System.out.println("Answers : ");
		System.out.println("--------------------");
//		Iterator<String> i =answers.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		
		for(Map.Entry<Integer, String> entry: answers.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
