public class OperatorRunuble implements Runnable {

    private final CallQueue callQueue;
    private static final int TIME_ANSWER_CALL = 4000;

    public OperatorRunuble(CallQueue callQueue) {
        this.callQueue = callQueue;
    }

    @Override
    public void run() {
        Call call;
        if ((call = callQueue.getQueue().poll()) != null) {
            System.out.println("  оператор обработал звонок : " + call);
            try {
                Thread.sleep(TIME_ANSWER_CALL);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
