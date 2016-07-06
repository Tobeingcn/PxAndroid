package cn.tobeing.pxandroidtest.invoke;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import javax.security.auth.Subject;

import cn.tobeing.pxandroid.MyLog;

/**
 * Created by sunzheng on 16/6/28.
 */
public class TestProxy implements InvocationHandler {
    private Object subject;

    public TestProxy(Object subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MyLog.d("suntest", "TestProxy.before.invoke." + method.getName());
        Object object = method.invoke(subject, args);
        MyLog.d("suntest", "TestProxy.after.invoke");
        return object;
    }
}
