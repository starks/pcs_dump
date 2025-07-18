package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dc {
    final int a;
    int b;
    int c;
    int d;
    ViewGroup e;
    View f;
    View g;
    public ff h;
    fb i;
    Context j;
    boolean k;
    boolean l;
    boolean m;
    public boolean n;
    boolean o = false;
    boolean p;
    Bundle q;

    public dc(int i) {
        this.a = i;
    }

    final void a(ff ffVar) {
        fb fbVar;
        ff ffVar2 = this.h;
        if (ffVar == ffVar2) {
            return;
        }
        if (ffVar2 != null) {
            ffVar2.m(this.i);
        }
        this.h = ffVar;
        if (ffVar == null || (fbVar = this.i) == null) {
            return;
        }
        ffVar.g(fbVar);
    }
}
