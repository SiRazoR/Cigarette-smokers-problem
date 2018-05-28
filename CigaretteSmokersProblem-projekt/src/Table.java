import javax.swing.*;

class Table{
    private int agent_ingredients;
    private boolean table_empty=true;

    synchronized public void put_on_the_table(int agent_ingredients){
        ImageIcon trump,grandpa;
        if(table_empty){
            this.agent_ingredients=agent_ingredients;
            //------ Składnik wylosowany, ustaw obrazek trumpa i odpowiedniego dziadka ktory zabiera skladnik ---------
            switch(agent_ingredients){
                case 3: //Agent polozyl na stole tyton i papier
                    trump = new ImageIcon(getClass().getResource("/img/Stol/3.jpg"));
                    CigaretteSmokerGUI.label4.setIcon(trump);

                    grandpa = new ImageIcon(getClass().getResource("/img/Dziadek3/dziadek_skladniki.jpg"));
                    CigaretteSmokerGUI.label3.setIcon(grandpa);
                    break;
                case 4: //Agent polozyl na stole tyton i zapalki
                    trump = new ImageIcon(getClass().getResource("/img/Stol/4.jpg"));
                    CigaretteSmokerGUI.label4.setIcon(trump);

                    grandpa = new ImageIcon(getClass().getResource("/img/Dziadek1/dziadek_skladniki.jpg"));
                    CigaretteSmokerGUI.label1.setIcon(grandpa);
                    break;
                case 5://Agent polozyl na stole papier i zapalki"
                    trump = new ImageIcon(getClass().getResource("/img/Stol/5.jpg"));
                    CigaretteSmokerGUI.label4.setIcon(trump);

                    grandpa = new ImageIcon(getClass().getResource("/img/Dziadek2/dziadek_skladniki.jpg"));
                    CigaretteSmokerGUI.label2.setIcon(grandpa);
                    break;
            }
            //Palacz posiadajacy brakujący skladnik skreca blanta, trzeba dac mu czas
            try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}

            table_empty=false;
            notify();
        }
    }

    synchronized public void take_of_the_table(int smoker_ingredient){
        ImageIcon grandpa;
        if(!table_empty){
            if((smoker_ingredient+agent_ingredients) == 6){ //jeżeli suma skladnikow rowna 6

                if(smoker_ingredient==1) { //osoba posiadająca papier zabiera się za skręcanie i wypalania blanta
                    grandpa = new ImageIcon(getClass().getResource("/img/Dziadek2/dziadek_skreca.jpg"));
                    CigaretteSmokerGUI.label2.setIcon(grandpa);
                    try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
                    grandpa = new ImageIcon(getClass().getResource("/img/Dziadek2/dziadek_pali.gif"));
                    CigaretteSmokerGUI.label2.setIcon(grandpa);
                    try {Thread.sleep(4500);} catch (InterruptedException e) {e.printStackTrace();}
                    grandpa = new ImageIcon(getClass().getResource("/img/Dziadek2/dziadek2_spoczynek.jpg"));
                    CigaretteSmokerGUI.label2.setIcon(grandpa);
                }

                else if(smoker_ingredient==2) { //osoba posiadająca tytoń zabiera się za skręcanie i wypalania blanta
                    grandpa = new ImageIcon(getClass().getResource("/img/Dziadek1/dziadek_skreca.jpg"));
                    CigaretteSmokerGUI.label1.setIcon(grandpa);
                    try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
                    grandpa = new ImageIcon(getClass().getResource("/img/Dziadek1/dziadek_pali.gif"));
                    CigaretteSmokerGUI.label1.setIcon(grandpa);
                    try {Thread.sleep(4500);} catch (InterruptedException e) {e.printStackTrace();}
                    grandpa = new ImageIcon(getClass().getResource("/img/Dziadek1/dziadek1_spoczynek.jpg"));
                    CigaretteSmokerGUI.label1.setIcon(grandpa);
                }

                else if(smoker_ingredient==3) {//osoba posiadająca zapałkę zabiera się za skręcanie i wypalania blanta
                    grandpa = new ImageIcon(getClass().getResource("/img/Dziadek3/dziadek_skreca.jpg"));
                    CigaretteSmokerGUI.label3.setIcon(grandpa);
                    try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
                    grandpa = new ImageIcon(getClass().getResource("/img/Dziadek3/dziadek_pali.gif"));
                    CigaretteSmokerGUI.label3.setIcon(grandpa);
                    try {Thread.sleep(4500);} catch (InterruptedException e) {e.printStackTrace();}
                    grandpa = new ImageIcon(getClass().getResource("/img/Dziadek3/dziadek3_spoczynek.jpg"));
                    CigaretteSmokerGUI.label3.setIcon(grandpa);
                }

                //----------------------- Papieros wypalony, agent moze dzialac dalej -----------------------------
                table_empty = true;
                //------------------------------------- Agent losuje ----------------------------------------------
                ImageIcon trump = new ImageIcon(getClass().getResource("/img/Stol/losuje.jpg"));
                CigaretteSmokerGUI.label4.setIcon(trump);
                try {Thread.sleep(5000);} catch (InterruptedException e) {e.printStackTrace();}
                try {wait();} catch (InterruptedException e) {e.printStackTrace();}
            }
        }
    }
}