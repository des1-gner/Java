
public class Character {	
		
	private String Name;  
	
	private String Type;
	
	private Integer HP;
	
	private Integer Mana;
	
	private Integer Attack;
	
	private Integer Speed;
	
	private Boolean Evil; 
	
	static Integer Index;
	
	public Character() {
		Index = Index++;
	}
	
	public Character(String Name, String Type, Integer HP, Integer Mana, Integer Attack, Integer Speed, Boolean Evil) {
		this.Name = Name;
		this.Type = Type;
		this.HP = HP;
		this.Mana = Mana;
		this.Attack = Attack;
		this.Speed = Speed;
		this.Evil = Evil;
	
	}
	
	// Getters
	
	public String getName() {
		return Name;
	}
	
	public String getType() {
		return Type;
	}
	
	public Integer getHP() {
		return HP;
	}
	
	public Integer getMana() {
		return Mana;
	}
	
	public Integer getAttack() {
		return Attack;
	}
	
	public Integer getSpeed() {
		return Speed;
	}
	
	public Boolean getEvil() {
		return Evil;
	}
	
	// Setters
	
	public String setName() {
		return Name;
	}
	
	public String setType() {
		return Type;
	}
	
	public Integer setHP() {
		return HP;
	}
	
	public Integer setMana() {
		return Mana;
	}
	
	public Integer setAttack() {
		return Attack;
	}
	
	public Integer setSpeed() {
		return Speed;
	}
	
	public Boolean setEvil() {
		return Evil;
	}
	
	// toString Character Output
	
	public String toString() {
		return "I am " + Name + "The " + Type + ". I have " + HP + "HP, " + Mana + "Mana, " + Attack + "Attack, " + Speed + "Speed. Am I Evil?: " + Evil; 
	}
}
