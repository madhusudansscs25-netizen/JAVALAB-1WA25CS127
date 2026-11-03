interface parkingcharge {
void calculatecharge();
void displayparkingdetails();
}
class vechileparking {
int vn;
string ph;
int vt;


vechileparking(int vn, string ph, int vt) {
this.vn = vn;
this.ph = ph;
this.vt = vt;
}
class tw extends vechileparking implements parkingcharge 
{
int charge;
tw(int vn, string ph, int vt) {
super(vn,ph,vt);
}
void calculatecharge()
{
if (ph <= 2)
{
charge = ph*20;
} else {
charge = (40 + (ph- 2)* 10);
}
}
void displayparkingdetails() 
{
system.out.println("vechile number:" + vn);
system.out.println("vechile type:" + vt);
system.out.println("parking hour:" + ph);
system.out.println("charge:" + charge);
}
}
class fw extends vechileparking implements parkingcharge 
{
int charge;
fw(int vn, string ph, int vt) {
super(vn,ph,vt);
}
void calculatecharge()
{
if (ph <= 2)
{
charge = ph*50;
} else {
charge = (100 + (ph- 2)* 30);
}
}
void displayparkingdetails() 
{
system.out.println("vechile number:" + vn);
system.out.println("vechile type:" + vt);
system.out.println("parking hour:" + ph);
system.out.println("charge:" + charge);
}
} 
class main {
public static void main(string[] args)
{
tw  tw1 = new tw(12,2,"bike");
tw1.calculatecharge();
tw1.displayparkingdetails();
fw fw1 = new fw(12, 5, "car");
fw1.calculatecharge();
fw1.displayparkingdetails();
}};
