public class Printer {
    private int sheets;
    private int toner;

    public Printer(int sheets, int toner){
        this.sheets = sheets;
        this.toner = toner;
    }

    public int getSheets() {
        return this.sheets;
    }

    public void print(int copies, int pages) {
        int total = copies * pages;
        if (this.sheets >= total && this.toner >= total){
            this.sheets -= total;
            this.toner -= total;
        }

    }

    public void refillPages() {
        this.sheets = 200;
    }

    public int getToner() {
        return this.toner;
    }
}
