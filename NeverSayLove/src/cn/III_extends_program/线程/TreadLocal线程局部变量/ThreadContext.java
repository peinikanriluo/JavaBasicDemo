package cn.III_extends_program.线程.TreadLocal线程局部变量;

public class ThreadContext {
    private String userId;
    private Long transactionId;
    private static ThreadLocal threadLocal = new ThreadLocal() {
        @Override
        protected ThreadContext initialValue() {
            return new ThreadContext();
        }
    };

    public static ThreadContext get() {
        return (ThreadContext) threadLocal.get();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }
}