/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch.hslu.sw01;

/**
 *
 * @author flaviowaser
 */
public class AhaBeispiel {
    
    public static int task(final int n, boolean sleep){

        int countTask1 = 0;
        int countTask2 = 0;
        int countTask3 = 0;

        task1(sleep);
        task1(sleep);
        task1(sleep);
        task1(sleep);

        countTask1 += 4;
        
        for (int i = 0; i < n; i++){
            task2(sleep);
            task2(sleep);
            task2(sleep);
            countTask2 += 3;
            
            for (int j = 0; j < n; j++){
                task3(sleep);
                task3(sleep);
                countTask3 += 2;
            }     
        }
        long timerStart = 0;
        
        long timerStop = System.currentTimeMillis() - timerStart;

        int countAllTask = countTask1 + countTask2 + countTask3;
        System.out.println("n: " + n);
        System.out.println("Anzahl aller Tasks: " + countAllTask);
        System.out.println("Beanspruchte Zeit in Milisekunden " + timerStop);

        return countAllTask;        

    }
    

    private static void task1(boolean sleep){
        if (sleep) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    private static void task2(boolean sleep){
        if (sleep) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    private static void task3(boolean sleep){
        if (sleep) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    
}
