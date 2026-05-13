import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class Student implements Comparable<Student>{
	private String name;
	private int age;
	private String studentNumber;

	public Student(String name, int age, String studentNumber){
		this.name = name;
		this.age = age;
		this.studentNumber = studentNumber;
	}

	public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;
	}

	public String getStudentNumber(){
		return this.studentNumber;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public void setStudentNumber(String studentNumber){
		this.studentNumber = studentNumber;
	}

	@Override
	public int compareTo(Student s){
		return Integer.valueOf(this.studentNumber) - Integer.valueOf(s.getStudentNumber()); 
	}

	@Override
	public String toString(){
		return "N:" + this.name + " A:" + this.age + " SN:" + this.studentNumber;
	}

}

class Card implements Comparable<Card>{
	String name;
	String suit;

	public String getName(){
		return this.name;
	}

	public String getSuit(){
		return this.suit;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setSuit(String suit){
		this.suit = suit;
	}

	public Card(String name, String suit){
		this.name = name;
		this.suit = suit;
	}

	@Override
	public String toString(){
		return this.name + " of " + this.suit;
	}

	private ArrayList<String> deckOrder = new ArrayList<>(Arrays.asList(new String[]{"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}));
	private ArrayList<String> suitOrder = new ArrayList<>(Arrays.asList(new String[]{"Hearts", "Clubs", "Diamonds", "Spades"}));
	
	@Override 
	public int compareTo(Card c){
		int out = deckOrder.indexOf(this.name) - deckOrder.indexOf(c.getName());
		if(out == 0){
			return suitOrder.indexOf(this.suit) - suitOrder.indexOf(c.getSuit());
		}

		return out;
	}
}