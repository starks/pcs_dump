package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class h implements Animation.AnimationListener {
    public static final /* synthetic */ int e = 0;
    final /* synthetic */ bw a;
    final /* synthetic */ ViewGroup b;
    final /* synthetic */ View c;
    final /* synthetic */ i d;

    public h(bw bwVar, ViewGroup viewGroup, View view, i iVar) {
        this.a = bwVar;
        this.b = viewGroup;
        this.c = view;
        this.d = iVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        ViewGroup viewGroup = this.b;
        viewGroup.post(new n(viewGroup, this.c, this.d, 1, (byte[]) null));
        if (ax.X(2)) {
            Objects.toString(this.a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        if (ax.X(2)) {
            Objects.toString(this.a);
        }
    }
}
