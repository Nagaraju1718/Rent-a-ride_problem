
public class Rent {
	final String[] availcars={"Sedan","HatchBack","5 Seater","Sedan","HatchBack"};
    final String[] drivers={"A","B","C","D","E"};
    final int[] dfc={500,1,200,700,430};
    final int cpkm=8;
    final String[] rating={"4","4.3","4.8","4.1","4.7"};
    int min=9999,pos;
    public void sedan(double dist){
        for(int i=0;i<availcars.length;i++){
            if(availcars[i]=="Sedan"){
                if(dfc[i]<min){
                    min=dfc[i];
                    pos=i;
                }
            }
        }
        System.out.println("Driver "+drivers[pos]+" with rating ("+rating[pos]+"), will get you to the destination.Your charge will be Rs"+dist*cpkm);
    }
    public void hatchback(double dist){
        for(int i=0;i<availcars.length;i++){
            if(availcars[i]=="HatchBack"){
                if(dfc[i]<min){
                    min=dfc[i];
                    pos=i;
                }
            }
        }
        System.out.println("Driver "+drivers[pos]+" with rating("+rating[pos]+"), will get you to the destination.Your charge will be Rs"+dist*cpkm);
    }
    public void seater(double dist){
        for(int i=0;i<availcars.length;i++){
            if(availcars[i]=="5 seater"){
                if(dfc[i]<min){
                    min=dfc[i];
                    pos=i;
                }
            }
        }
        System.out.println("Driver "+drivers[pos]+" with rating("+rating[pos]+"), will get you to the destination.Your charge will be Rs"+(dist*cpkm));
    }
}
