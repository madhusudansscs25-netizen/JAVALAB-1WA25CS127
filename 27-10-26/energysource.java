abstract class energysource {
int id;
String name;
int energygenerated;
abstract double calculateefficiency();


public energysource(int id, String name, int energygenerated) {
    this.id = id;
    this.name = name;
    this.energygenerated = energygenerated;
}



public void display()
{

System.out.println("source id:" +id);
System.out.println("source name:" +name);
System.out.println("source energygenerated:" + energygenerated +"kwh");
System.out.println("efficiency:" + calculateefficiency());
System.out.println();

}
}






class solarenergy extends energysource {

public solarenergy(int id, String name, int energygenerated) {
super(id, name,energygenerated);
} 
double calculateefficiency() {
return (energygenerated*100.00)/5000;
}
}

class windenergy extends energysource {

public  windenergy(int id, String name, int energygenerated) {
super(id, name,energygenerated);
} 
double calculateefficiency() {
return (energygenerated * 100.0) / 8000;
}
}



class main {
    public static void main(String[] args) {
        energysource e1 = new solarenergy(101, "solar panel", 4000);
        energysource e2 = new windenergy(100, "wind turbine", 5000);

        e1.display();
        e2.display();
    }
}