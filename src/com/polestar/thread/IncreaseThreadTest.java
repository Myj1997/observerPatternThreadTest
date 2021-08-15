package com.polestar.thread;

public class IncreaseThreadTest implements Runnable{

    private INotification iNotification;

    public IncreaseThreadTest(INotification iNotification){
        this.iNotification = iNotification;
    }

    @Override
    public void run() {
        iNotification.IncreaseCall();

        System.out.println("언제 실행 될까요 ? IncreaseThreadTest - 쓰레드 종료 후");
    }
}
