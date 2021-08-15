package com.polestar.thread;

public class ThreadRun implements INotification{

    public ThreadRun() {


        Thread decreaseThread1 = new Thread(new IncreaseThreadTest(this));
        Thread increaseThread2 = new Thread(new DecreaseThreadTest(this));

        decreaseThread1.start();
        increaseThread2.start();

    }



    @Override
    public void decreaseCall() {
        System.out.println("ThreadRun.decreaseCall 하락 스레드 호출됨");
        for (int i = 0; i < 20; i++){
            try {
                System.out.println("UP 상승합니다 : " + i);
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void IncreaseCall() {
        System.out.println("ThreadRun.IncreaseCall 상승 스레드 호출됨");
        for (int i = 20; i >= 0; i--){
            try {
                System.out.println("DOWN 하락합니다 : " + i);
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
