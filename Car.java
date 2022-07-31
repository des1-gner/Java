
public class Car {

private String make;
private String model;
private Integer year;

public Car() {}

public Car(String make,String model,int year) { // parameterized constructor

this.make=make;
this.model=model;
this.year=year;
	
}

public String getMake()
{
    return make;
}

public void setMake(String make)
{
    this.make=make;
}

public String getModel()
{
	return model;
}

public void setModel(String model)
{
	this.model=model;
}

public Integer getYear()
{
	return year;
}

public void setYear(Integer year)
{
	this.year=year;
}

public String toString()
{
    return "make of the Car : " +make+ "\n"+
            "year of the Car : "  +year+ "\n"+
            "model        : " +model+ "\n"+
            " \n ######################";
}
}
