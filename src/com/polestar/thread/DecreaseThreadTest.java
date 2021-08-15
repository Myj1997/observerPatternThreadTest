package com.polestar.thread;

public class DecreaseThreadTest implements Runnable{

    private INotification iNotification;

    public DecreaseThreadTest(INotification iNotification){
        this.iNotification = iNotification;
    }

    @Override
    public void run() {

        iNotification.decreaseCall();

        System.out.println("언제 실행 될까요 ? DecreaseThreadTest - 쓰레드 종료 후");

    }

}
