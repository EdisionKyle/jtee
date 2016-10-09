package com.loner.pattern.observer;

public class HuangPuCitizen extends Citizen {

	public HuangPuCitizen(Policeman pol) {
		setPolicemen();
		register(pol);
	}

	public void sendMessage(String help) {
		setHelp(help);
		for (int i = 0; i < pols.size(); i++) {
			Policeman pol = (Policeman)pols.get(i);
			pol.action(this);
		}
	}

}