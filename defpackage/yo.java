package defpackage;

import androidx.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
final class yo {
    static final yo a = new yo();
    private final Map c = new HashMap();
    public final Map b = new HashMap();

    private static final void d(Map map, yn ynVar, yu yuVar, Class cls) {
        yu yuVar2 = (yu) map.get(ynVar);
        if (yuVar2 == null || yuVar == yuVar2) {
            if (yuVar2 == null) {
                map.put(ynVar, yuVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + ynVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + yuVar2 + ", new value " + yuVar);
    }

    public final ym a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null) {
            map.putAll(b(superclass).b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : b(cls2).b.entrySet()) {
                d(map, (yn) entry.getKey(), (yu) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length <= 0) {
                    i = 0;
                } else {
                    if (!yz.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                yu yuVarA = onLifecycleEvent.a();
                if (length > 1) {
                    if (!yu.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (yuVarA != yu.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                d(map, new yn(i, method), yuVarA, cls);
                z = true;
            }
        }
        ym ymVar = new ym(map);
        this.c.put(cls, ymVar);
        this.b.put(cls, Boolean.valueOf(z));
        return ymVar;
    }

    final ym b(Class cls) {
        ym ymVar = (ym) this.c.get(cls);
        return ymVar != null ? ymVar : a(cls, null);
    }

    public final Method[] c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }
}
