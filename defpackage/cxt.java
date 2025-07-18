package defpackage;

import j$.util.SortedSet;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Comparator;
import java.util.NavigableSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cxt extends cxo implements NavigableSet, SortedSet, cza {
    private static final long serialVersionUID = 912559;
    final transient Comparator a;
    transient cxt b;

    public cxt(Comparator comparator) {
        this.a = comparator;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    static cyw x(Comparator comparator) {
        if (cyi.a.equals(comparator)) {
            return cyw.c;
        }
        int i = cxc.d;
        return new cyw(cyp.a, comparator);
    }

    @Deprecated
    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        return dcr.C(tailSet(obj, true));
    }

    @Override // java.util.SortedSet, defpackage.cza
    public final Comparator comparator() {
        return this.a;
    }

    @Override // java.util.NavigableSet
    public final /* bridge */ /* synthetic */ NavigableSet descendingSet() {
        cxt cxtVar = this.b;
        if (cxtVar != null) {
            return cxtVar;
        }
        cxt cxtVarQ = q();
        this.b = cxtVarQ;
        cxtVarQ.b = this;
        return cxtVarQ;
    }

    @Override // defpackage.cxo, defpackage.cwu, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public abstract czc listIterator();

    @Override // java.util.SortedSet
    public Object first() {
        return listIterator().next();
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        return dcr.y(headSet(obj, true).descendingIterator());
    }

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    final int h(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        return dcr.C(tailSet(obj, false));
    }

    @Override // java.util.SortedSet
    public Object last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        return dcr.y(headSet(obj, false).descendingIterator());
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public abstract cxt q();

    @Override // java.util.NavigableSet
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final cxt headSet(Object obj, boolean z) {
        obj.getClass();
        return s(obj, z);
    }

    @Deprecated
    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    public abstract cxt s(Object obj, boolean z);

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final cxt subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        clq.v(this.a.compare(obj, obj2) <= 0);
        return u(obj, z, obj2, z2);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    public abstract cxt u(Object obj, boolean z, Object obj2, boolean z2);

    @Override // java.util.NavigableSet
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final cxt tailSet(Object obj, boolean z) {
        obj.getClass();
        return w(obj, z);
    }

    public abstract cxt w(Object obj, boolean z);

    @Override // defpackage.cxo, defpackage.cwu
    public Object writeReplace() {
        return new cxs(this.a, toArray());
    }

    @Override // java.util.NavigableSet
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public abstract czc descendingIterator();
}
