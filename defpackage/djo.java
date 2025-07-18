package defpackage;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class djo implements djn {
    public static final djo a;
    public static final Set b;
    private static final /* synthetic */ djo[] c;

    static {
        djo djoVar = new djo();
        a = djoVar;
        c = new djo[]{djoVar};
        b = new CopyOnWriteArraySet();
    }

    private djo() {
    }

    public static djo[] values() {
        return (djo[]) c.clone();
    }
}
