public class Demo2 {

    static class Account {
        private int balance = 1000;
        public synchronized void withdraw(int amount, String threadName) {
          System.out.println(threadName + " is withdrawing ₹" + amount);
            balance -= amount;
           System.out.println(threadName + " completed withdrawal. Current balance: ₹" + balance);
        }

        public int getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {
        Account account = new Account();

        Thread threadA = new Thread(() -> {
          account.withdraw(800, "Thread A");
        });
        Thread threadB = new Thread(() -> {
            account.withdraw(600, "Thread B");
        });
        threadA.start();
        threadB.start();
        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final balance
        System.out.println("Final balance: ₹" + account.getBalance());
    }
}