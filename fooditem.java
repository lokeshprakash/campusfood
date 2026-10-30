public class fooditem {
    String itemname;
    int itemprice;
    fooditem(String itemname,int itemprice){
        this.itemname=itemname;
        this.itemprice=itemprice;
    }
    void display(){
        System.out.printf("%-20s Rs. %d%n", itemname, itemprice);
        //one line display of item name and price in a formatted manner
      }
}
