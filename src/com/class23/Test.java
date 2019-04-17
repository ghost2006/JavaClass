package com.class23;

public class Test {
	
public static void main(String[] args) {
		
	System.out.println("---Creating Employee object---");
	Employee emp=new Employee();
	emp.salary=90000;
	emp.getPaid();
	System.out.println(Employee.department);// accessing static variables through parent class name(Employee).
	Employee.work(); // using class name-preferred way!  static M is getting inherited too
	//emp.work();
	
	// private members(variables and M) can't be inherited,they stayed with a parent class
	
	// Multiple inheritance is NOT available through the classes!!!!
	
	System.out.println("---Creating ScrumTeam object---");
	ScrumTeam st =new ScrumTeam();
	ScrumTeam.work();
	st.salary=100000;
	st.getPaid();
	st.artifacts="Product Backlog, Sprint backlog, BurnDown Chart";
	st.ceremonies="Sprint Grooming, Sprint planning, Daily Standup, Sprint Demo, Sprint Retro";
	st.attendScrumMeetings();
	st.workOnArtifacts();
	
	System.out.println("---Creating Developer object---");
	Developer dev =new Developer();
	Developer.work();
	dev.salary=120000;
	dev.getPaid();
	dev.artifacts="Sprint Backlog";
	dev.ceremonies="Product Backlog, Sprint backlog, BurnDown Chart";
	dev.workOnArtifacts();
	dev.attendScrumMeetings();
	dev.code();
	
	System.out.println("---Creating Tester object---");
	Tester qa =new Tester();
	Tester.work();
	qa.salary=100000;
	qa.getPaid();
	qa.artifacts="Sprint Backlog";
	qa.ceremonies="Product Backlog, Sprint backlog, BurnDown Chart";
	qa.workOnArtifacts();
	qa.attendScrumMeetings();
	qa.test();
	
	System.out.println("---Creating Business Analyst object---");
	BusinessAnalyst ba =new BusinessAnalyst();
	ba.salary=85000;
	ba.getPaid();
	ba.artifacts="Sprint Backlog, Product backlog";
	ba.ceremonies="Product Backlog, Sprint backlog, BurnDown Chart";
	ba.workOnArtifacts();
	ba.attendScrumMeetings();
	ba.writeUserStories();
	
	System.out.println("---Creating Scrum Master object---");
	ScrumMaster sm =new ScrumMaster();
	sm.salary=90000;
	sm.getPaid();
	sm.artifacts="BurnDown Chart";
	sm.ceremonies="Product Backlog, Sprint backlog, BurnDown Chart";
	sm.workOnArtifacts();
	sm.attendScrumMeetings();
	sm.driveScrumMeetings();
	
	System.out.println("---Creating Product Owner object---");
	ProductOwner po =new ProductOwner();
	po.salary=150000;
	po.getPaid();
	po.artifacts="Sprint Backlog, Product backlog";
	po.ceremonies="Sprint Grooming, Sprint planning, Sprint Demo";
	po.workOnArtifacts();
	po.attendScrumMeetings();
	po.talkToTheClient();
	po.prioritizeBacklog();
	
	FrontEndDeveloper fed=new FrontEndDeveloper();
	fed.salary=120000;
	fed.getPaid();
	fed.artifacts="Sprint Backlog";
	fed.ceremonies="Product Backlog, Sprint backlog, BurnDown Chart";
	fed.workOnArtifacts();
	fed.attendScrumMeetings();
	fed.code();
	fed.doHtml();
	
	BackEndDeveloper bed= new BackEndDeveloper();
	bed.salary=121000;
	bed.getPaid();
	bed.artifacts="Sprint Backlog";
	bed.ceremonies="Product Backlog, Sprint backlog, BurnDown Chart";
	bed.workOnArtifacts();
	bed.attendScrumMeetings();
	bed.code();
	bed.doSql();
	
	ManualTester mt=new ManualTester();
	mt.salary=10000;
	mt.getPaid();
	mt.artifacts="Sprint Backlog";
	mt.ceremonies="Product Backlog, Sprint backlog, BurnDown Chart";
	mt.workOnArtifacts();
	mt.attendScrumMeetings();
	mt.test();
	mt.testManually();
	
	AutomationTester at=new AutomationTester();
	at.salary=100000;
	at.getPaid();
	at.artifacts="Sprint Backlog";
	at.ceremonies="Product Backlog, Sprint backlog, BurnDown Chart";
	at.workOnArtifacts();
	at.attendScrumMeetings();
	at.test();
	at.codeInJave();
}

}
