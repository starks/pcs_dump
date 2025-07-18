package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.air;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(air airVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) airVar.C(remoteActionCompat.a);
        remoteActionCompat.b = airVar.d(remoteActionCompat.b, 2);
        remoteActionCompat.c = airVar.d(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent) airVar.b(remoteActionCompat.d, 4);
        remoteActionCompat.e = airVar.l(remoteActionCompat.e, 5);
        remoteActionCompat.f = airVar.l(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, air airVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        airVar.D(remoteActionCompat.a);
        airVar.g(remoteActionCompat.b, 2);
        airVar.g(remoteActionCompat.c, 3);
        airVar.i(remoteActionCompat.d, 4);
        airVar.f(remoteActionCompat.e, 5);
        airVar.f(remoteActionCompat.f, 6);
    }
}
