package Com.Main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Com.Answer.Answer;
import Com.Question.Question;


public class Main {
	public static void main(String[] args) {
		
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		//creating question
		Question q1=new Question();

		q1.setQuestionId(121);
		q1.setQuestion("what is java?");
		
		//creating answer
		
		Answer a1=new Answer();
		a1.setAnswerId(131);
		a1.setAnswer("java is programming language");
		
		q1.setAnswer(a1);
		
		
		//creating question
				Question q2=new Question();

				q2.setQuestionId(122);
				q2.setQuestion("what is API?");
				
				//creating answer
				
				Answer a2=new Answer();
				a2.setAnswerId(132);
				a2.setAnswer("application programming interface");
				
				q2.setAnswer(a2);

		
		//session
		
		Session s=factory.openSession();
		org.hibernate.Transaction tx=s.beginTransaction();
		
		//save
		s.save(q1);
		s.save(q2);
		tx.commit();
		s.close();
		
		

	}

}
