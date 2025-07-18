package defpackage;

import android.database.Observable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class js extends Observable {
    public final void a() {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((a) this.mObservers.get(size)).n();
            }
        }
    }

    public final void b(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((a) this.mObservers.get(size)).r(i, i2);
            }
        }
    }

    public final void c(int i, int i2, Object obj) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((a) this.mObservers.get(size)).o(i, i2, obj);
            }
        }
    }

    public final void d(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((a) this.mObservers.get(size)).p(i, i2);
            }
        }
    }

    public final void e(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((a) this.mObservers.get(size)).q(i, i2);
            }
        }
    }

    public final boolean f() {
        return !this.mObservers.isEmpty();
    }
}
