package main.printer3;

class Printer {
    private int numOfPapers;
    private boolean duplex;

    public Printer(int numOfPapers, boolean duplex){
        this.numOfPapers = numOfPapers;
        this.duplex = duplex;
    }

    void print(int amount){
        if (numOfPapers<=0){
            System.out.println("용지가 없습니다.");
        }
        else {
            if (duplex) {
                if (amount%2==1){
                    amount=(amount+1)/2;
                } else amount/=2;
                if (numOfPapers>=amount) System.out.println("양면으로 "+(amount)+"장 출력했습니다. 현재 "+(numOfPapers-=amount)+"장 남아 있습니다.");
                else {
                    System.out.println("양면으로 모두 출력하려면 용지가 "+(amount-numOfPapers)+"매 부족합니다. "+numOfPapers+"장만 출력합니다.");
                    numOfPapers-=numOfPapers;
                }
            }else {
                if (numOfPapers>=amount) System.out.println("단면으로 "+(numOfPapers-=amount)+"장 출력했습니다. 현재 "+numOfPapers+"장 남아 있습니다.");
                else {
                    System.out.println("단면으로 모두 출력하려면 용지가 "+(amount-numOfPapers)+"매 부족합니다. "+numOfPapers+"장만 출력합니다.");
                    numOfPapers-=numOfPapers;
                }
            }
        }
    }

    public boolean getDuplex(){
        return duplex;
    }

    public void setDuplex(Boolean duplex){
        this.duplex = duplex;
    }

}

public class PrinterTest {
    public static void main(String[] args) {
        Printer p = new Printer(20, true);
        p.print(25);
        p.setDuplex(false);
        p.print(10);
    }
}
