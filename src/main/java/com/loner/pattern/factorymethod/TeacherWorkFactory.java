package com.loner.pattern.factorymethod;

//ConcreteCreator 

public class TeacherWorkFactory implements IWorkFactory {

	public Work getWork() {
		return new TeacherWork();
	}

}
