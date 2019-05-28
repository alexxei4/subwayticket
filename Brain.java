public class Brain {
    private double credit1 = 0;
    private String Route1 = "";
    private String Route2 = "";
    private double credit2 = 0;
    private double adultnum = 0;
    private double childnum = 0;
    private double adultnum2 = 0;
    private double childnum2 = 0;
    private double adultcounter;
    private double adultcounter2;
    private double childcounter;
    private double childcounter2;
    private double adultremover;
    private double adultremover2;
    private double childremover;
    private double childremover2;
    private double quarter = 0.25;
    private double loonie = 1.00;
    private double toonie = 2.00;
    private boolean ticketcounter1;
    private boolean ticketcounter2;
    private double total1;
    private double total2;

    public void setRoute1(String Route1) {
        this.Route1 = Route1;
    }
    public void total1(double total1){
        this.total1 = (adultnum * 5)+(childnum * 2.50);
    }
    public void total2(double total2){
        this.total2 = (adultnum2 * 6.25)+(childnum2 * 3.75);
    }
    public void adultcounter(double adultcounter){
        this.adultcounter = adultnum ++;
    }
    public void adultcounter2(double adultcounter2){
        this.adultcounter2 = adultnum2 ++;
    }
    public void childcounter(double childcounter){
        this.childcounter = childnum ++;
    }
    public void childcounter2(double childcounter2){
        this.childcounter2 = childnum2 ++;
    }
    public void adultremover(double adultremover){
        this.adultremover = adultnum --;
    }
    public void adultremover2(double adultremover2){
        this.adultremover2 = adultnum2 --;
    }
    public void childremover(double childremover){
        this.childremover = childnum --;
    }
    public void childremover2(double childremover2){
        this.childremover2 = childnum2 --;
    }
    public void ticketcounter1(boolean ticketcounter1){
        if (credit1 > total1){
            ticketcounter1 = true;
        }
        else {
            ticketcounter1 = false;
        }
    }
    public void ticketcounter2(boolean ticketcounter2){
        if (credit2 > total2){
            ticketcounter2 = true;
        }
        else {
            ticketcounter2= false;
        }
    }
    public void quarter1(double quarter1){
        this.credit1+= quarter;
    }

    public void quarter2(double quarter2){
        this.credit2 += quarter;
    }
    public void loonie1(double loonie1){
        this.credit1+= loonie;
    }
    public void loonie2(double loonie2){
        this.credit2 += loonie;
    }
    public void toonie1(double toonie1){
        this.credit1+= toonie;
    }
    public void toonie2(double toonie2){
        this.credit2 += toonie;
    }
    public String getRoute1() {
        return this.Route1;
    }

    public void setRoute2(String Route2) {
        this.Route2 = Route2;
    }

    public String getRoute2() {
        return this.Route2;
    }

    public void setcredit1(double credit1) {
        this.credit1 = credit1;
    }

    public double getcredit1() {
        return this.credit1;
    }

    public void setcredit2(double credit2) {
        this.credit2 = credit2;
    }

    public double getcredit2() {
        return this.credit2;
    }
    public void setadultnum(double adultnum) {
        this.adultnum = adultnum;
    }

    public double getadultnum() {
        return this.adultnum;
    }

    public void setchildnum(double childnum) {
        this.childnum = childnum;
    }

    public double getchildnum() {
        return this.childnum;
    }
    public void setadultnum2(double adultnum2) {
        this.adultnum2 = adultnum2;
    }

    public double getadultnum2() {
        return this.adultnum2;
    }

    public void setchildnum2(double childnum2) {
        this.childnum2 = childnum2;
    }

    public double getchildnum2() {
        return this.childnum2;
    }
}

