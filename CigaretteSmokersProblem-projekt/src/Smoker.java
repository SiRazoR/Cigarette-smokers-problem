class Smoker extends Thread{
    private int smoker_ingredient; //składnik w postaci liczby
    private Table table;

    public Smoker(int smoker_ingredient, Table table){
        this.smoker_ingredient=smoker_ingredient;
        this.table=table;
    }

    public void run(){
        while(true){
            table.take_of_the_table(smoker_ingredient);
        }
    }
}