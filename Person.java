
public class Person {

private String name;
private String occupation;
private Integer age;
private String city;

public Person() {}

public Person(String name,String occupation,int age,String city) { // parameterized constructor

this.name=name;
this.occupation=occupation;
this.age=age;
this.city=city;
	
}

public String getName()
{
    return name;
}

public void setName(String name)
{
    this.name=name;
}

public String getOccupation()
{
	return occupation;
}

public void setOccupation(String occupation)
{
	this.occupation=occupation;
}

public Integer getAge()
{
	return age;
}

public void setAge(Integer age)
{
	this.age=age;
}

public String getCity()
{
	return city;
}

public void setCity(String city)
{
	this.city=city;
}

public String toString()
{
    return "name of the Person : " +name+ "\n"+
            "age of the Person : "  +age+ "\n"+
            "Occupation        : " +occupation+ "\n"+
            "city              : " +city+
            " \n ######################";
}
}
