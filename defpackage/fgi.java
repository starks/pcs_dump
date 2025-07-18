package defpackage;

import java.util.AbstractSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fgi extends AbstractSet implements Set {
    protected fgi() {
    }

    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return a();
    }
}
