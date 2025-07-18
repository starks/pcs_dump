package defpackage;

import android.os.IBinder;
import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpe extends akh implements bpf {
    private final Object a;

    public bpe() {
        super("com.google.android.gms.dynamic.IObjectWrapper");
    }

    public static Object a(bpf bpfVar) {
        if (bpfVar instanceof bpe) {
            return ((bpe) bpfVar).a;
        }
        IBinder iBinderAsBinder = bpfVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        aso.F(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }

    public bpe(Object obj) {
        this();
        this.a = obj;
    }
}
