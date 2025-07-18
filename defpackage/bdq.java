package defpackage;

import android.graphics.Typeface;
import android.os.Parcel;
import android.text.Layout;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.as.oss.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bdq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public bdq(TextView textView, Typeface typeface, int i, int i2) {
        this.d = i2;
        this.b = textView;
        this.c = typeface;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        if (i == 0) {
            Layout layout = ((TextView) ((cm) this.b).findViewById(R.id.license_activity_textview)).getLayout();
            if (layout != null) {
                ((ScrollView) this.c).scrollTo(0, layout.getLineTop(layout.getLineForOffset(this.a)));
                return;
            }
            return;
        }
        if (i == 1) {
            hu.b((TextView) this.b, (Typeface) this.c, this.a);
            return;
        }
        if (i == 2) {
            ((BottomSheetBehavior) this.b).K((View) this.c, this.a, false);
            return;
        }
        if (i != 3) {
            try {
                int i2 = ffg.a;
                ((esu) this.c).a.c(this.a);
                return;
            } catch (Throwable th) {
                ((esu) this.c).q(th);
                return;
            }
        }
        Object obj = this.c;
        try {
            if (((esh) this.b).b(this.a, (Parcel) obj)) {
                return;
            }
            esh.a.logp(Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "transact", "A oneway transaction was not understood - ignoring");
        } catch (Exception e) {
            esh.a.logp(Level.FINEST, "io.grpc.binder.internal.OneWayBinderProxy$InProcessImpl", "transact", "A oneway transaction threw - ignoring", (Throwable) e);
        }
    }

    public bdq(BottomSheetBehavior bottomSheetBehavior, View view, int i, int i2) {
        this.d = i2;
        this.c = view;
        this.a = i;
        this.b = bottomSheetBehavior;
    }

    public bdq(esu esuVar, ffh ffhVar, int i, int i2) {
        this.d = i2;
        this.b = ffhVar;
        this.a = i;
        this.c = esuVar;
    }

    public /* synthetic */ bdq(Object obj, int i, Object obj2, int i2) {
        this.d = i2;
        this.b = obj;
        this.a = i;
        this.c = obj2;
    }
}
