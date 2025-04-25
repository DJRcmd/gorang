package thread;

public class Sync {
    public static void main(String[] args) {
        ATM atm = new ATM(); // 백그라운드 thread 추가 
        Thread mom = new Thread(atm, "mom");
        Thread son = new Thread(atm, "son"); // 백그라운드 thread를 실행 요청. 적절한 시점에 run() 함수 실행
        mom.start();
        son.start();
    }

}
