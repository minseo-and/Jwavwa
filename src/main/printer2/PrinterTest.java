package main.printer2;

class Printer {

    private int numOfPapers;

    public Printer(int n){
        numOfPapers = n;
    }

    void Print(int amount) {
        if (numOfPapers>=amount) System.out.println(amount+"장 출력했습니다. 현재 "+(numOfPapers-=amount)+"장 남아 있습니다.");
        else if(numOfPapers<=0) System.out.println("용지가 없습니다.");
        else if(numOfPapers < amount) {
            System.out.println("모두 출력하려면 용지가 "+(amount-numOfPapers)+"장 부족합니다. "+numOfPapers+"장만 출력합니다.");
            numOfPapers-=numOfPapers;
        }


    }


}
public class PrinterTest{
    public static void main(String[] args) {
        Printer p = new Printer(10);
        p.Print(2);
        p.Print(20);
        p.Print(10);
    }
}
