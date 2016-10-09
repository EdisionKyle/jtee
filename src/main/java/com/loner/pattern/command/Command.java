package com.loner.pattern.command;

public abstract class Command {

	protected Receiver receiver;

	public Command(Receiver receiver) {
		this.receiver = receiver;
	}

	public abstract void execute();

}
