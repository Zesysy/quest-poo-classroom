package fr.wildcodeschool.idetest;

public class Classroom {

	public static void main(String[] args) {
		
		Wilder xabi = new Wilder("Xabi");
		System.out.println("1. " + xabi.whoAmI());
		
		Wilder perrine = new Wilder("Perrine");
		perrine.setAware(true);
		System.out.println("2. " + perrine.whoAmI());
		
		Wilder sebastien = new Wilder("Sébastien");
		sebastien.setAware(true);
		System.out.println("1. " + sebastien.whoAmI());

	}

}
