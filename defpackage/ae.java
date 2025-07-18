package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ae extends lx {
    boolean b;
    boolean c;
    public final fsc e = new fsc(new ad(this));
    final za a = new za(this);
    boolean d = true;

    public ae() {
        int i = 1;
        aj().ag("android:support:lifecycle", new am(this, i));
        g(new ac(this, i));
        this.h.add(new ac(this, 0));
        w(new cl(this, i));
    }

    private static boolean k(ax axVar, yv yvVar) {
        boolean zK = false;
        for (ab abVar : axVar.c.g()) {
            if (abVar != null) {
                if (abVar.G() != null) {
                    zK |= k(abVar.A(), yvVar);
                }
                bp bpVar = abVar.Y;
                if (bpVar != null && ((za) bpVar.E()).a.a(yv.STARTED)) {
                    abVar.Y.a.e(yvVar);
                    zK = true;
                }
                if (abVar.X.a.a(yv.STARTED)) {
                    abVar.X.e(yvVar);
                    zK = true;
                }
            }
        }
        return zK;
    }

    public final ax aQ() {
        return this.e.av();
    }

    final View aR(View view, String str, Context context, AttributeSet attributeSet) {
        return ((aj) this.e.a).e.e.onCreateView(view, str, context, attributeSet);
    }

    final void c() {
        while (k(aQ(), yv.CREATED)) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation")) {
                        return;
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        return;
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        return;
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture")) {
                        return;
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill")) {
                        return;
                    }
                    break;
            }
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String strConcat = String.valueOf(str).concat("  ");
        printWriter.print(strConcat);
        printWriter.print("mCreated=");
        printWriter.print(this.b);
        printWriter.print(" mResumed=");
        printWriter.print(this.c);
        printWriter.print(" mStopped=");
        printWriter.print(this.d);
        if (getApplication() != null) {
            aak.a(this).b(strConcat, printWriter);
        }
        this.e.av().D(str, fileDescriptor, printWriter, strArr);
    }

    @Override // defpackage.lx, android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        this.e.aw();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.lx, defpackage.bz, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.d(yu.ON_CREATE);
        ((aj) this.e.a).e.q();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewAR = aR(view, str, context, attributeSet);
        return viewAR == null ? super.onCreateView(view, str, context, attributeSet) : viewAR;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ((aj) this.e.a).e.r();
        this.a.d(yu.ON_DESTROY);
    }

    @Override // defpackage.lx, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((aj) this.e.a).e.S(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.c = false;
        ((aj) this.e.a).e.x();
        this.a.d(yu.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        this.a.d(yu.ON_RESUME);
        ((aj) this.e.a).e.z();
    }

    @Override // defpackage.lx, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.e.aw();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected final void onResume() {
        this.e.aw();
        super.onResume();
        this.c = true;
        this.e.ax();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.e.aw();
        super.onStart();
        this.d = false;
        if (!this.b) {
            this.b = true;
            ((aj) this.e.a).e.o();
        }
        this.e.ax();
        this.a.d(yu.ON_START);
        ((aj) this.e.a).e.A();
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.e.aw();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.d = true;
        c();
        ((aj) this.e.a).e.C();
        this.a.d(yu.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewAR = aR(null, str, context, attributeSet);
        return viewAR == null ? super.onCreateView(str, context, attributeSet) : viewAR;
    }
}
