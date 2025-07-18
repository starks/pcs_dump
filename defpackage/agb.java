package defpackage;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.aicore.aidl.AIFeature;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agb implements Animation.AnimationListener {
    final /* synthetic */ SwipeRefreshLayout a;
    private final /* synthetic */ int b;

    public agb(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.b = i;
        this.a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        awz awzVar;
        if (this.b == 0) {
            this.a.k(null);
            return;
        }
        SwipeRefreshLayout swipeRefreshLayout = this.a;
        if (!swipeRefreshLayout.a) {
            swipeRefreshLayout.b();
            return;
        }
        swipeRefreshLayout.g.setAlpha(AIFeature.Id.ROSIE_ROBOT_TRANSLATE);
        this.a.g.start();
        SwipeRefreshLayout swipeRefreshLayout2 = this.a;
        if (swipeRefreshLayout2.h && (awzVar = swipeRefreshLayout2.j) != null && awzVar.c.a.a() != null) {
            ((czl) ((czl) awz.a.b()).i("com/google/android/apps/miphone/astrea/networkusage/ui/user/NetworkUsageLogFragment", "onRefresh", 70, "NetworkUsageLogFragment.java")).p("Refreshing entity list");
            awzVar.al((List) awzVar.c.a.a());
        }
        SwipeRefreshLayout swipeRefreshLayout3 = this.a;
        swipeRefreshLayout3.b = swipeRefreshLayout3.c.getTop();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
