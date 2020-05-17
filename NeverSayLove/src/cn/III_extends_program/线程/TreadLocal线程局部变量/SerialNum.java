package cn.III_extends_program.线程.TreadLocal线程局部变量;

/**
 * 在关联数据类中创建private static ThreadLocal
 * 在下面的类中，私有静态 ThreadLocal 实例（serialNum）为调用该类的静态 SerialNum.get() 方法的每个
 * 线程维护了一个“序列号”，该方法将返回当前线程的序列号。（线程的序列号是在第一次调用 SerialNum.get() 时
 * 分配的，并在后续调用中不会更改
 */
public class SerialNum {
    // The next serial number to be assigned
    private static int nextSerialNum = 0;

    private static ThreadLocal serialNum = new ThreadLocal() {
        protected synchronized Object initialValue() {
            return new Integer(nextSerialNum++);
        }
    };

    public static int getNum() {

        return ((Integer) (serialNum.get())).intValue();
    }
}
