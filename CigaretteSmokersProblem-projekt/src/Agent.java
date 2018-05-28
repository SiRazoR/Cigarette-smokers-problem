class Agent extends Thread{
    private Table table;

    public Agent(Table table){
        this.table=table;
    }

    public void run(){
        while(true){
            table.put_on_the_table((int)(Math.random()*3+3));
        } //palacz losuje liczbę od 3 do 5. Możliwe kombinacje składników to 1=papier, 2=tytoń, 3=zapałki
    }     //wylosowanie 3 oznacza wylosowanie 2+1 czyli tytoniu i papieru
}         //pozostają zapałki mające wartość 3. Suma wszystkich składników daje maksymalnie liczbę 6.
          //Sprawdzenie który palacz powinien zabrać składnik polega na sprawdzeniu czy suma jest równa 6.
