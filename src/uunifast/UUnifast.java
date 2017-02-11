/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uunifast;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ismail
 */
public class UUnifast {

    private void writeTs(FileWriter fw) throws IOException {
        for(Task t:ts.getTaskSet())
        {
            fw.write(t.getC()+" "+t.getD()+" "+t.getT()+"\n");
        }
    }
    TaskSet ts;
    double uTotal,tHarmonic;
    int n;
    boolean isHarmonic;

    public UUnifast(double uTotal, double tHarmonic, int n, boolean isHarmonic,boolean isSchedulable) {
        this.uTotal = uTotal;
        this.tHarmonic = tHarmonic;
        this.n = n;
        this.isHarmonic = isHarmonic;
        ArrayList<Task> tasks=new ArrayList<>();
        do
        {
            tasks = generateTasks();
            ts = new TaskSet(tasks);
            if(!isSchedulable)
                break;
        }while(!ts.worstCaseResp() || ts.processUtil() > (uTotal+0.1));
    }   
    private ArrayList<Task> generateTasks() {
        ArrayList<Task> tasks=new ArrayList<>();
        double sum=uTotal,nextSum;
        double sumU=0;
        int j=0;
        if(isHarmonic)
        {
            double uTask;
            nextSum= sum * Math.pow(Math.random(), 1.0/(n));
            uTask = sum - nextSum;
            Task t = getTask(uTask, (int) tHarmonic, 1);
            tasks.add(t);
            sum = nextSum;
            j = 1;
        }
        int i;
        for(i=j;i<n-1;i++)
        {
            double uTask;
            do
            {
                nextSum= sum * Math.pow(Math.random(), 1.0/(n-i));
                uTask = sum - nextSum;
            }while(uTask == 0 || nextSum == 0);
            int tTask = getPeriod();
            Task t = getTask(uTask,tTask,i+1);
            sum = nextSum;
            tasks.add(t);
        }
        
        double uTask = sum;
        
        int tTask = getPeriod();
        Task t = getTask(uTask, tTask, i+1);
        tasks.add(t);
        
        return tasks;
    }
    public void saveTaskSet(String path){
        try {
            FileWriter fw = new FileWriter(new File(path));
            writeTs(fw);
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(UUnifast.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        double Utotal=0.5;
        double Tharmonic=10;
        int n=10;
        new UUnifast(Utotal, Tharmonic, n, true,false);

    }
    private int getPeriod() {
        if(isHarmonic)
            return (int) (Math.floor(Math.random()*100)*tHarmonic+tHarmonic);
        
        return (int) (Math.floor(Math.random()*1000))+10;
    }
    private Task getTask(double uTask, int tTask,int id) {
        int cTask = (int) Math.ceil(tTask * uTask);
        double pourcentage = 50 + (int)(Math.random()*10000) % 26 ;
        int dTask = (int) (tTask * pourcentage / 100);
        return new Task(id, cTask, dTask, tTask);
    }
    
}
