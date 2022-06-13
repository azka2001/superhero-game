package assignmentlab;
import java.util.*;
import java.lang.String;

public abstract class Superhero {
	String Hero_Name;
	String Real_Name;
	String Occupation;
	String Hero_Description;
	int Age;
	int potion_number;
	boolean Can_Fly;
	String attack_name;
	abstract void attack(String attack_name);		
	abstract void rest();
	abstract void attack(String attack_name, int attack_power);
	abstract void rest(int strength_increase);
	Superhero(String Hero_Name, String Real_Name, String Occupation, String Hero_Description, int Age, boolean Can_Fly, String attack_name){
		this.Hero_Name = Hero_Name;
		this.Real_Name = Real_Name;
		this.Occupation = Occupation;
		this.Hero_Description = Hero_Description;
		this.Age = Age;
		this.Can_Fly = Can_Fly;
		this.attack_name = attack_name;
	}
	Superhero(){
		Hero_Name = "not defined";
		Real_Name = "not defined";
		Occupation = "not defined";
		Hero_Description = "not defined";
		Age = 0;
		Can_Fly = false;
		attack_name = "not defined";
	}
}

class PhysicalHero extends Superhero{
	int Physical_strength;
	PhysicalHero(String Hero_Name, String Real_Name, String Occupation, String Hero_Description, int Age, boolean Can_Fly, String attack_name, int Physical_strength){
		super(Hero_Name, Real_Name, Occupation, Hero_Description, Age, Can_Fly, attack_name);
		this.Physical_strength = Physical_strength;
	}
	PhysicalHero(){
		super();
		Physical_strength = 0;
	}
	void attack(String attack_name) {
		this.attack_name = attack_name;
		System.out.println(Hero_Name + " used " + attack_name + "!");
		int temp;
		temp = Physical_strength - 25;
		if (temp <= 0) {
			System.out.println(Hero_Name + "'s Physical Strength is empty, rest required for recharge.");
		}
		else {
			System.out.println("25 joules energy used! Physical Strength left = " + temp + " joules");
		}
	}
	void attack(String attack_name, int attack_power) {
		int temporary = Physical_strength + attack_power;
		System.out.println("BONUS MOVE!");
		System.out.println(Hero_Name + " rushed at the villain with " + attack_name + " at " + Physical_strength + " Joules");
		Physical_strength = temporary;
		potion_number++;
		System.out.println("You have " + potion_number + " potions");
	}
	void rest(int potion_number) {
		this.potion_number = potion_number;
		if(potion_number==0) {
			System.out.println("Bonus Potions not available");
		}
		int tem = 250 + Physical_strength;
		System.out.println("You chose to use the rest potion, Physical Strength has increased to " + tem + " Joules");
		Physical_strength = tem;
	}
	void rest() {
		int tempo = Physical_strength + 50;
		System.out.println(Hero_Name + " has rested! Physical strength increased to: " + tempo + " joules.");
		Physical_strength = tempo;
	}
	public String toString() {
		return "Hero Name: " + this.Hero_Name + "\r\n" + 
			   "Real Name: " + this.Real_Name + "\r\n" + 
			   "Occupation: " + this.Occupation + "\r\n" + 
			   "Hero Description: " + this.Hero_Description + "\r\n" + 
			   "Age: " + this.Age + "\r\n" + 
			   "Can they fly?: " + this.Can_Fly + "\r\n" + 
			   "Physical Strength value: " + this.Physical_strength + " joules" +
			   "\r\nAttack Name: " + this.attack_name;
	}
}

class MageHero extends Superhero{
	int Mana;
	MageHero(String Hero_Name, String Real_Name, String Occupation, String Hero_Description, int Age, boolean Can_Fly, String attack_name, int Mana){
		super(Hero_Name, Real_Name, Occupation, Hero_Description, Age, Can_Fly, attack_name);
		this.Mana = Mana;
	}
	MageHero(){
		super();
		Mana = 0;
	}
	void attack(String attack_name) {
		this.attack_name = attack_name;
		System.out.println(Hero_Name + " used " + attack_name + "!");
		int temp;
		temp = Mana - 25;
		if (temp <= 0) {
			System.out.println(Hero_Name + "'s Mana is empty, rest required for recharge.");
		}
		else {
			System.out.println("25 Mana used! Mana left = " + temp);
		}
	}
	void attack(String attack_name, int attack_power) {
		int temporary = Mana + attack_power;
		System.out.println("BONUS MOVE!");
		System.out.println(Hero_Name + " rushed at the villain with " + attack_name + " at " + Mana + " Magiks.");
		Mana = temporary;
		potion_number++;
		System.out.println("You have " + potion_number + " potions");
	}
	void rest(int potion_number) {
		this.potion_number = potion_number;
		if(potion_number==0) {
			System.out.println("Bonus Potions not available");
		}
		int tem = 1000 + Mana;
		System.out.println("You chose to use the rest potion, Mana has increased to " + tem + " Magiks.");
		Mana = tem;
	}
	void rest() {
		int tempo = Mana + 50;
		System.out.println(Hero_Name + " has rested! Mana increased to: " + tempo + " Magiks.");
		Mana = tempo;
	}
	void spells(String s) {
		StringBuffer spell = new StringBuffer(s);
		spell.reverse();
		System.out.println(Hero_Name + " casted the spell: " + spell);
	}
	public String toString() {
		return "Villain name: " + this.Hero_Name + "\r\n" + 
				"Real name: " + this.Real_Name + "\r\n" + 
				"Occupation: " + this.Occupation + "\r\n" + 
				"Motives: " + this.Hero_Description + "\r\n" + 
				"Age: " + this.Age + "\r\n" + 
				"Can they fly? " + this.Can_Fly + "\r\n" + 
				"Mana value: " + this.Mana + " Magiks" + "\r\n" + 
				"Attack Name: " + this.attack_name;
	}
}

class Vigilante extends Superhero{
	String weapon;
	int weapon_strength;
	Vigilante(String Hero_Name, String Real_Name, String Occupation, String Hero_Description, int Age, boolean Can_Fly, String attack_name, String weapon, int weapon_strength){
		super(Hero_Name, Real_Name, Occupation, Hero_Description, Age, Can_Fly, attack_name);
		this.weapon = weapon;
		this.weapon_strength = weapon_strength;
	}
	Vigilante(){
		super();
		weapon = "undefined";
	}
	void attack(String attack_name) {
		this.attack_name = attack_name;
		System.out.println(Hero_Name + " used " + attack_name + "!");
		int temp;
		temp = weapon_strength - 25;
		if (temp <= 0) {
			System.out.println(weapon + " has broken. New weapon required for battle.");
		}
		else {
			System.out.println(weapon + " used for " + attack_name + ". Weapon strength left = " + temp);
		}
	}
	void attack(String attack_name, int attack_power) {
		int temporary = weapon_strength + attack_power;
		System.out.println("BONUS MOVE!");
		System.out.println(Hero_Name + " rushed at the villain with " + weapon + " to do " + attack_name + " at strength " + weapon_strength);
		weapon_strength = temporary;
		potion_number++;
		System.out.println("You have " + potion_number + " potions");
	}
	void rest(int potion_number) {
		this.potion_number = potion_number;
		if(potion_number==0) {
			System.out.println("Bonus Potions not available");
		}
		int tem = 500 + weapon_strength;
		System.out.println("You chose to use the rest potion, weapon is recharged to " + tem);
		weapon_strength = tem;
	}
	void rest() {
		int tempo = weapon_strength + 50;
		System.out.println(Hero_Name + " has acquired new weapon! Weapon strength is: " + tempo);
		weapon_strength = tempo;
	}
	public String toString() {
		return "Villain name: " + this.Hero_Name + "\r\n" + 
				"Real name: " + this.Real_Name + "\r\n" + 
				"Occupation: " + this.Occupation + "\r\n" + 
				"Motives: " + this.Hero_Description + "\r\n" + 
				"Age: " + this.Age + "\r\n" + 
				"Can they fly? " + this.Can_Fly + "\r\n" + 
				"Weapon name: " + this.weapon + "\r\n" + 
				"Weapon strength: " + this.weapon_strength + " Nanorectors" + "\r\n" +
				"Attack Name: " + this.attack_name;
		}
}

class villain extends Superhero{
	String ultimate_weapon;
	int weapon_strength;
	villain(String Hero_Name, String Real_Name, String Occupation, String Hero_Description, int Age,
			boolean Can_Fly, String attack_name, String ultimate_weapon, int weapon_strength)
	{
		super(Hero_Name, Real_Name, Occupation, Hero_Description, Age, Can_Fly, attack_name);
		this.ultimate_weapon = ultimate_weapon;
		this.weapon_strength = weapon_strength;
	}
	villain(){
		super();
		ultimate_weapon = "undefined";
		weapon_strength = 0;
	}
	void attack(String attack_name) {
		this.attack_name = attack_name;
		System.out.println(Hero_Name + " used " + attack_name + "!");
		int temp;
		temp = weapon_strength - 25;
		if (temp <= 0) {
			System.out.println(ultimate_weapon + " has broken." + Hero_Name + " has been defeated.");
		}
		else {
			System.out.println(ultimate_weapon + " used for " + attack_name + ". Weapon strength left = " + temp);
		}
		weapon_strength = temp;
	}
	void attack(String attack_name, int attack_power) {
		int temp = attack_power + weapon_strength;
		System.out.println("BONUS MOVE!");
		System.out.println(Hero_Name + " pulled a dummy with " + attack_name + "! His weapon strength increased to " + temp);
		weapon_strength = temp;
		potion_number++;
	}
	void rest(int potion_number) {
		this.potion_number = potion_number;
		if(potion_number==0) {
			System.out.println("Bonus Potions not available");
		}
		int tem = 100 + weapon_strength;
		System.out.println(Hero_Name + " used their signature move, their weapon strength has increased to  " + tem);
		weapon_strength = tem;
	}
	void rest() {
		int tempo = weapon_strength + 50;
		System.out.println(Hero_Name + " has salvaged the ultimate weapon! Weapon strength is: " + tempo);
		weapon_strength = tempo;
	}
	void suffer() {
		int str = weapon_strength - 100;
		System.out.println(Hero_Name + " has been hit, their weapon status is now: " + str);
		weapon_strength = str;
	}
	public String toString() {
		return "Villain name: " + this.Hero_Name + "\r\n" + 
				"Real name: " + this.Real_Name + "\r\n" + 
				"Occupation: " + this.Occupation + "\r\n" + 
				"Motives: " + this.Hero_Description + "\r\n" + 
				"Age: " + this.Age + "\r\n" + 
				"Can they fly? " + this.Can_Fly + "\r\n" + 
				"Weapon name: " + this.ultimate_weapon + "\r\n" + 
				"Weapon strength: " + this.weapon_strength + " Nanorectors" + "\r\n" +
				"Attack Name: " + this.attack_name;
	}
}

class Speedster extends PhysicalHero{
	int speed;
	int calorie;
	Speedster(String Hero_Name, String Real_Name, String Occupation, String Hero_Description, 
			int Age, boolean Can_Fly, String attack_name, int Physical_strength, int speed, int calorie)
	{
		super(Hero_Name, Real_Name, Occupation, Hero_Description, Age, Can_Fly, attack_name, Physical_strength);
		this.speed = speed;
		this.calorie = calorie;
	}
	Speedster(){
		super();
		speed = 0;
		calorie = 0;
	}
	public String toString() {
		return "Hero Name: " + this.Hero_Name + "\r\n" + 
			   "Real Name: " + this.Real_Name + "\r\n" + 
			   "Occupation: " + this.Occupation + "\r\n" + 
			   "Hero Description: " + this.Hero_Description + "\r\n" + 
			   "Age: " + this.Age + "\r\n" + 
			   "Can they fly?: " + this.Can_Fly + "\r\n" + 
			   "Physical Strength value: " + this.Physical_strength + " joules" +
			   "\r\nAttack Name: " + this.attack_name + "\r\n" +
			   "Speed: " + this.speed + "\r\n" +
			   "Calorie amount: " + this.calorie + " Kilo Joules";
	}
	void attack(String attack_name) {
		this.attack_name = attack_name;
		System.out.println(Hero_Name + " used " + attack_name + "!");
		int temp;
		temp = calorie - 25;
		if (temp <= 0) {
			System.out.println(Hero_Name + "'s calories are empty, rest required for recharge.");
		}
		else {
			System.out.println("50 Kilo joules calories used! Calories left = " + temp + " Kilo joules");
		}
		calorie = temp;
	}
	void attack(String attack_name, int attack_power) {
		int tempor = attack_power + speed;
		System.out.println("BONUS MOVE!");
		System.out.println(Hero_Name + " outwitted the villain with a speed of " + tempor);
		potion_number++;
	}
	void rest(int potion_number) {
		this.potion_number = potion_number;
		if(potion_number==0) {
			System.out.println("Bonus Potions not available");
		}
		int tem = 500 + calorie;
		System.out.println("You chose to use the rest potion, calories have increased to " + tem + " Kilo Joules");
		calorie = tem;
	}
	void rest() {
		int tempo = calorie + 50;
		System.out.println(Hero_Name + " has rested! Physical strength increased to: " + tempo + " Kilo joules.");
		calorie = tempo;
	}
}

