package defpackage;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeu implements yx {
    private final aey a;

    public aeu(aey aeyVar) {
        this.a = aeyVar;
    }

    @Override // defpackage.yx
    public final void g(yz yzVar, yu yuVar) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ArrayList<String> stringArrayList;
        if (yuVar != yu.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        yzVar.E().c(this);
        Bundle bundleAf = this.a.aj().af("androidx.savedstate.Restarter");
        if (bundleAf == null) {
            return;
        }
        if (!bundleAf.containsKey("classes_to_restore") || (stringArrayList = bundleAf.getStringArrayList("classes_to_restore")) == null) {
            throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, aeu.class.getClassLoader()).asSubclass(aev.class);
                clsAsSubclass.getClass();
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        objNewInstance.getClass();
                        ((aev) objNewInstance).a();
                    } catch (Exception e) {
                        throw new RuntimeException("Failed to instantiate ".concat(String.valueOf(str)), e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(a.z(str, "Class ", " wasn't found"), e3);
            }
        }
    }
}
